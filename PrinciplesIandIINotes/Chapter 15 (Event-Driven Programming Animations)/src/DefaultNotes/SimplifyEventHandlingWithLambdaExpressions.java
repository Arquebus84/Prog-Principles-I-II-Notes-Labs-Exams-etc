package DefaultNotes;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimplifyEventHandlingWithLambdaExpressions extends Application{
	//Lambda expressions can be used to greatly simplify coding for event handling
	
	/**Single Abstract Medthod (SAM) interface: Must contain exactly one abstract method
 			* Also called a Functional Interface (only has one method)

 			* Lambda expression (aka lambda function) creates an object and the object performs a function by invoking this single method
 				-Meaning that Lambda Expression only work with SAM interface because the EventHandler<Event> interface only contains the
 					handle(Event event) method; if it contains more than one method, it would not compile.
	 */
	
	
	/**Lambda Expression: can be viewed as an anonymous class with a concise syntax*/
	/**NOTE: Notice that in Lambda, the interface EventHandler<ActionEvent> and the method handle are omitted*/
	
	/**	Given the button b1:
			1) Use anonymous inner class
				b1.setOnAction(
					new EventHandler<ActionEvent>(){
						@Override
						public void handle(ActionEvent e){
							//Code for processing event e
						}
					});
			
			2) Use Lambda 
				b1.setOnAction(
					(ActionEvent e) -> {
						//Code for processing event e
					}
				);
	 */
	
	/**	Basic Syntax for Lambda Expression:
			(type1 param1, type2 param2, ...) -> expression
			
			or
			
			(type1 param1, type2 param2, ...) -> {statements; }
		
	 */
	
	/*	NOTE: You can omit the parameter data type (ActionEvent for example)		**All of These are the Same
 			(ActionEvent e) -> {
 				circle1.enlarge();
 			}
			
			(e) -> {
				circle1.enlarge();	//Omit parameter data type				
			}
			
			e -> {
				circle1.enlarge();	//Omit parenthesis
			}
			
			e -> circle1.enlarge();	//Omit braces
	 */
	
	//Example
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setAlignment(Pos.CENTER);
		Button b1 = new Button("Click Here");
		Button b2 = new Button("Click This");
		
		b1.setOnAction(
				(ActionEvent e)->{
					System.out.println("Clicked the button: " + ((Button)e.getSource()).getText());
				});
		
		b2.setOnAction(e->{
			System.out.println("Clicked the button: " + ((Button)(e.getSource())).getText());
		});
		
		pane.getChildren().add(b1);
		pane.getChildren().add(b2);
		
		Scene scene = new Scene(pane, 200, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
