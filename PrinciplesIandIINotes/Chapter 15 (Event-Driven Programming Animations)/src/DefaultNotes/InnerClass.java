package DefaultNotes;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

	//An inner class or nested class, is a class defined within the scope of another class. 
	//	Inner classes are useful for defining handler classes



/**Inner class Syntax
	//Class A is inner class of outer class Test

		public class Test {
			public class A{
			
			}
		
		}
		
		The inner class is compiled into a class named OuterClassName$InnerClassName.class
		
		//In this case, it would be compiled into Test$A.class file
 
 
	//Inner class Example 1:
		**The Inner class can access data and methods in the outer class

		public class OuterClass {
			private int data;
			
			// A method in the outer class 
			public void m() {
			  // Do something
			}
			
			// An inner class
			class InnerClass {
			  // A method in the inner class 
				public void mi() {
				  // Directly reference data and method
				  // defined in its outer class
				  data++;
				  m();
				}
			}
		}
 */


//Example: Inner class will be compiled into class file name: InnerClass$EventHandleInner.class
public class InnerClass extends Application{
	
	
	@SuppressWarnings("exports")
	public void start(Stage stage) {
		Button b = new Button("Click Here");
		StackPane pane = new StackPane();
		pane.getChildren().add(b);
		
		b.setOnAction(new EventHandleInner());
		
		Scene scene = new Scene(pane, 200, 200);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	class EventHandleInner implements EventHandler<ActionEvent>{
				
		public void handle(ActionEvent e) {
			System.out.println("Inner class Test");
		}
	}
	 
}
