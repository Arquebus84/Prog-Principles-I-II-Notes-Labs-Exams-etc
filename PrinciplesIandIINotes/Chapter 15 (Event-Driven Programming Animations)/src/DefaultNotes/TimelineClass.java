package DefaultNotes;

import javafx.animation.*;
import javafx.application.Application;

import javafx.event.*;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineClass extends Application{
	/*PathTransition and FadeTransition define specialized animations. 
	 
	 Timeline class can be used to program any animation using one or more KeyFrames:
	 	* Each KeyFrame is executed sequentially at a specific time interval.
	 	* Timeline inherits from Animation
	 	* Construct Timeline using 
			new Timeline(keyFrame...keyframes)
	 */
	
	/***		Construct KeyFrames using:
			new KeyFrame(Duration duration, EventHandler<ActionEvent> onFinished)
			
			//**The Handler onFinished is called when the duration for the key frame is elapsed
	 	
	 */
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		VBox pane = new VBox();
		
		Font font = new Font("Times New Roman", 15);
		
		Button b1 = new Button("Turn Invisible");
		Text text = new Text("This message will disappear.");
		
		b1.setFont(font);
		text.setFont(font);
		
		
		EventHandler<ActionEvent> eventHandler = e ->{
			if (text.getText().length() != 0) {
				text.setText("");
		    }else {
		    	text.setText("This message will disappear.");
		    }
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		animation.play();
		
		b1.setOnAction(eventHandler);
		
		pane.getChildren().add(text);
		pane.getChildren().add(b1);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(25);
		
		Scene scene = new Scene(pane, 300, 200);
		stage.setTitle("TimeLine_Test");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
