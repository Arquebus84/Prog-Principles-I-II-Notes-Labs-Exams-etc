package DefaultNotes;

import javafx.application.Application;
import javafx.geometry.Pos;
//import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.event.*;

public class TextFieldAndCalculator extends Application{

	//For this one, it will copy what you put in the textField and display it in the Console
	@SuppressWarnings("exports")
	public void start(Stage stage) {
		Button registerButton = new Button("Register Number");
		TextField typeSpace = new TextField();
		
		//Event Handle button:
		registerButton.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				System.out.println(typeSpace.getText());
				
				/**NOTE: In order to convert a TextField into a number, keep the parseNumber method inside 
				 * 			the event handler (or lambda expression) in order to stop the compiler from bitching*/
				//double num = Double.parseDouble(typeSpace.getText());		//This is hollowed out; moved into try-catch block
				
				try {
					double num = Double.parseDouble(typeSpace.getText());
					calculateNumber(num);
				}catch(NumberFormatException ex) {
					System.out.println("Not a number");
				}
				
			}
		});
		
		GridPane pane = new GridPane();
		pane.add(registerButton, 0, 1);
		pane.add(typeSpace, 0, 0);
		
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane, 400, 200);
		stage.setScene(scene);
		stage.show();
	}
	
	public void calculateNumber(double n) throws NumberFormatException{
		//If the user enters a string, then throw an exception
		System.out.println(n);
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
