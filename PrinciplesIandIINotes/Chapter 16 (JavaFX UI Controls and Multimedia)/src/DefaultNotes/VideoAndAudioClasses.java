package DefaultNotes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;

import javafx.scene.media.*;	//Main package for video and audio
import javafx.scene.text.*;
import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class VideoAndAudioClasses extends Application{
	
	//You can use the Media class to obtain the source from the media; the MediaPlayer class to play and control the media; and
	//	the MediaView class to display the video
	
	//Media class represents a media source such as an audio or a video
	/**
			javafx.scene.media.Media
		-duration: ReadOnlyObjectProperty
		-width: ReadOnlyIntegerProperty
		-height: ReadOnlyIntegerProperty
		+Media(source: String)
	 */
	
	//MediaPlayer plays and controls the media
	/**
			javafx.scene.media.MediaPlayer
		-autoPlay: BooleanProperty
		-currentCount: ReadOnlyIntegerProperty
		-cycleCount: IntegerProperty
		-mute: BooleanProperty
		-volume: DoubleProperty
		-totalDuration: ReadOnlyObjectProperty<Duration>
		+MediaPlayer(media: Media)
		+play(): void
		+pause(): void
		+seek(): void				//Seeks the MediaPlayer to a new playback time 
	 */
	
	//MediaView displays the media (subclass of Node)
	/**
			javafx.scene.media.MediaView
		-x: DoubleProperty
		-y: DoubleProperty
		-mediaPlayer: ObjectProperty<MediaPlayer>
		-fitWidth: DoubleProperty
		-fitHeight: DoubleProperty
		+MediaView()
		+MediaView(mediaPlayer: MediaPlayer)
	 */
	
	//**Aggregation relationship:
	
	//The media represents the source, the media player controls the playing, and media view displays the video
	/**
			[media: Media]------------◇[mediaPlayer: MediaPlayer]------------◇[mediaView: MediaView]
	 */	
		
	//NOTES:
	/*
	 Media:
	 	* Media(String): Is used to create a Media from a URL source
	 	* duration: Represents the source media's duration in seconds
 
	MediaPlayer:
	 	* mute: Specifies whether the audio is muted
	 	* play(): Plays the media
	 	* autoPlay: Specifies whether the playing should start automatically
	 	* pause(): Pauses the media
	 	* seek(): Seeks the player to a new playback time
	 	* cycleCount: Specifies the number of time the media will be played
	 	* currentCount: Is the number of completed playback cycles
	 	* volume: Specifies the volume for the audio
	 	* MediaPlayer(media): Creates a player for specified media of type Media
	 	* totalDuration: Specifies the amount of time to play the media from start to finish

 	MediaView:
 		* x & y: Specify the current x or y coordinate of the media view (separate)
 		* fitWidth & fitHeight: Specify the width or height of the view for the media to fit (separate)
	 */
	
	/**
	 		* A MediaPlayer can be shared by multiple MediaView
	 		* A Media object can be shared by multiple MediaPlayer
	 		* A Media can be downloaded from a URL
	 		* A MediaView cannot be placed into multiple Pane object
	 */
	
	Media media;
	MediaPlayer mediaPlayer;
	MediaView mediaView;
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) throws Exception{
		
		BorderPane bPane = new BorderPane();	//Border Pane will be the main pane for organizing everything:
												//	(center: media, bottom: timeLine and volume)
		
		//Take the media from a file:
		File videoFile = new File("C:\\Users\\matte\\Videos\\Screen Recordings\\ComeAndSeeScene.mp4");
				
		try {
			//String videoLink = videoFile.toURI().toURL().toString(); //The method (start) will throw an exception in case this file is not found
			media = new Media(videoFile.toURI().toURL().toString());	//Media will store the source of the file
		}catch(Exception ex) {
			System.out.println("File not found!");
		}		
		
		mediaPlayer = new MediaPlayer(media);
		mediaView = new MediaView(mediaPlayer);
		
		mediaView.setVisible(true);
		
		//Get the total duration of the video
		Duration totalDuration = mediaPlayer.getTotalDuration();
		
		//Add a button to control when the video can play or pause
		Button playButton = new Button(">");
		
		playButton.setOnAction(e ->{
			if(playButton.getText() == ">") {
				mediaPlayer.play();
				playButton.setText("||");
			}else if (playButton.getText() == "||") {
				mediaPlayer.pause();
				playButton.setText(">");
			}
		});
		
		//Add a button for reseting the video
		Button replayButton = new Button("<<");
		replayButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
						
		//Set the size of the mediaView
		mediaView.setFitWidth(800);
		//mediaView.maxWidth(Region.USE_PREF_SIZE);	//Set the maximum width
		//mediaView.minWidth(50);	//Set the minimum width
		
		//Add a volume slider for the audio
		Text volumeText = new Text("Volume");
		Slider volumeSlider = new Slider();
		volumeSlider.setPrefWidth(100);
		
		/**Volume Function*/
		//Set the volumeProperty of the video to the volumeSlider
		mediaPlayer.volumeProperty().bind(volumeSlider.valueProperty().divide(100)); 
		volumeSlider.setValue(50);	//By default set it to 50%
		
		
		/**Time frame Function**/
		//Add a slider for the video
		Slider timeLine = new Slider(); //Time frame must be horizontal
		timeLine.setPrefWidth(500);		
		//Set the mediaPlayer's time
		mediaPlayer.currentTimeProperty().addListener((observableValue, oldValue, newValue)-> {
			timeLine.setValue(newValue.toSeconds());
		});
		//Set the timeLine to the mediaPlayer's totalDuration
		mediaPlayer.setOnReady(()->{
			timeLine.setValue(totalDuration.toSeconds());
		});
		//When the mouse uses the timeLine slider, set the mediaPlayer's playback time to the value of the timeLine slider
		timeLine.setOnMousePressed(event1->{
			mediaPlayer.seek(Duration.seconds(timeLine.getValue()));
		});
				
		//	Create the panes and organize them
		HBox hBox1 = new HBox();//HBox for the timeLine and playButton
		hBox1.getChildren().addAll(playButton, timeLine);
		hBox1.setSpacing(15);
		hBox1.setAlignment(Pos.CENTER);
		
		HBox hBox2 = new HBox(); // HBox for volumeText and volume
		hBox2.getChildren().addAll(replayButton, volumeText, volumeSlider);
		hBox2.setSpacing(15);
		hBox2.setAlignment(Pos.CENTER);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(hBox1, hBox2);
		vBox.setAlignment(Pos.CENTER);
		
		
		bPane.setCenter(mediaView);
		bPane.setBottom(vBox);
		
		//	place the border pane into the scene
		Scene scene = new Scene(bPane, 800, 500);
		
		stage.setScene(scene);
		stage.setTitle("Media_ComeAndSee");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
