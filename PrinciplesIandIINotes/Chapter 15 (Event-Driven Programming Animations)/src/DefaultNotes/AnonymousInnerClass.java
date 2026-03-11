package DefaultNotes;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AnonymousInnerClass extends Application{

	//An anonymous inner class is an inner class without a name. It combines defining an inner class and 
	//	creating an instance of that class
	
	/**
	 * Use Inner class:
		public class ControlCircle extends Application{
		
			@Override
			public void start(Stage stage){
				Button b1 = new Button("Enlarge");
			
				b1.setOnAction(new EnlargeHandler());
			}
		
			class EnlargeHandler implements EventHandler<ActionEvent>{
				@Override
				public void handle(ActionEvent e){
					circlePane.enlarge();
				}
			}		
		}
		
	* Use Anonymous Inner class: (Everything is in the start method**)
		public class ControlCircle extends Application{
		
			@Override
			public void start(Stage stage){
				b1.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent e) {
						circlePane.enlarge();
					}
				});
							
			}			
		}


	*/
	
	
	//Example
	@SuppressWarnings("exports")
	@Override 
	public void start(Stage primaryStage) {
		Button btOK = new Button("OK");

		btOK.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("The OK button is clicked");
			}
		});

		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
