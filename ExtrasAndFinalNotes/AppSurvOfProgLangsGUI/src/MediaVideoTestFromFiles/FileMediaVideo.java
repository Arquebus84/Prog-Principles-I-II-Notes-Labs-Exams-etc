package MediaVideoTestFromFiles;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.media.*;

public class FileMediaVideo extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	static final int HEIGHT = 450;
	static final int WIDTH = 600;
	
	Media media;
	MediaPlayer mediaPlayer;
	MediaView mediaView;
	
	@Override
	public void start(Stage stage) {
		HBox HPane = new HBox();
		BorderPane pane = new BorderPane();
		
		//Add Video From File
//		String filePath = C:\\Users\\matte\\Videos\\Screen Recordings\NodeGraphTest.mp4"
		/**
		 * C:\\Users\\matte\\Videos\\Screen Recordings\\DigitalHand1972.mp4
		 * C:\\Users\\matte\\Videos\\Screen Recordings\\FPSTest.mp4
		 * C:\\Users\\matte\\Videos\\Screen Recordings\\NodeGraphTest.mp4
		 */
		
		//TextField to enter for the computer
		TextField field = new TextField();
		Button addB = new Button("Add");
		//field.setPrefWidth(200);
		
		HPane.getChildren().addAll(field, addB);
		HPane.setAlignment(Pos.CENTER);
		
		addB.setOnAction(e->{
			StartVideo(pane, field);
		});
					
		pane.setTop(HPane);
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public void StartVideo(BorderPane pane, TextField field) {
				
		try {
			File file = new File(field.getCharacters().toString());
			
			media = new Media(file.toURI().toURL().toString());
			mediaPlayer = new MediaPlayer(media);
			mediaView = new MediaView(mediaPlayer);
			mediaView.setFitHeight(HEIGHT);
			mediaView.setFitWidth(WIDTH);
			
			mediaPlayer.setAutoPlay(true);
			//pane.getChildren().add(mediaView);
			pane.setBottom(mediaView);
			
		}catch(Exception ex) {
			System.out.println("File Not Found:" + field.getCharacters().toString());
//			for(int i = 0; i < field.getLength(); i++) {
//				if(field.getCharacters().charAt(i) == '\\') {
//					System.out.println("Add an extra \\");
//				}
//			}
		}
	}

}
