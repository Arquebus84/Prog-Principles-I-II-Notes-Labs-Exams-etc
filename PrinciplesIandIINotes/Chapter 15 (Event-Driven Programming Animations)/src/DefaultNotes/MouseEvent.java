package DefaultNotes;


import javafx.application.Application;
import javafx.event.*;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;

import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MouseEvent extends Application{

	//A MouseEvent is fired whenever a mouse button is pressed, released, clicked, moved or dragged on a Node or a Scene.
	
	/**
			javafx.scene.input.MouseEvent
		+getButton(): MouseButton
		+getClickCount(): int
		+getX(): double
		+getY(): double
		+getSceneX(): double
		+getSceneY(): double
		+getScreenX(): double
		+getScreenY(): double
		+isAltDown(): boolean
		+isControlDown(): boolean
		+isMetaDown(): boolean
		+isShiftDown(): boolean
		+isPrimaryButtonDown(): boolean
		+isSecondaryButtonDown(): boolean
		+isMiddleButtonDown(): boolean
	 */
	
	/**	Four constants are defined in MouseButton:
	 		* PRIMARY, SECONDARY, MIDDLE, and NONE indicate left, right, middle, and none mouse buttons
		
		Can use getButton() method to detect which button is being pressed:
			Example: getButton() == MouseButton.PRIMARY tests if left button is pressed
			
			 	-NOTE: In order for this to work, use EventHandler<MouseEvent> registration; here is an example with anonymous inner class:
			 		(new EventHandler<MouseEvent>(){
			 			public void handle(MouseEvent e) {
			 				System.out.println(e.getButton());	//Prints the type of button
			 			});
			
		Can also use isPrimaryButtonDown(), isSecondaryButtonDown(), or isMiddleButtonDown() to test if mouse button is pressed
				
	 */
	
	//Example: using setOnMouseDragged() to move text
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Text txt1 = new Text(100, 100, "Welcome to Java!");
		Font font = new Font("Times New Roman", 25);
		txt1.setFont(font);
		
		Pane pane = new Pane();
		pane.getChildren().add(txt1);
		
				
		//Ex 1: Use Lambda expression to simplify the EventHandler
		txt1.setOnMouseDragged( e ->{
			if(e.getButton() == MouseButton.PRIMARY) {	//This will only allow you to drag the text with left mouse button
				txt1.setX(e.getX());
				txt1.setY(e.getY());
			}
		});
						
		Scene scene = new Scene(pane, 300, 200);
		
		//Ex 2: Use anonymous inner class to identify which mouse button is clicked
		pane.setOnMousePressed(e ->{
			System.out.println(e.getButton());
		});
		
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
