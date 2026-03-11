package DefaultNotes;

import javafx.event.*;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

/**Recall: javafx.event.Event class*/

public class RegisteringHandlersAndHandlingEvents extends Application{
	//A handler is an object that must be registered with an event source object and it must be an instance of an appropriate
	//	event-handling interface.
	
	/*
		Java uses a delegation-based model for event handling: 
			**A source object fires an event, and an object interested in the event handles it.
	 */	
	/**Event Handler: Object that handles the event*/
	
	//**Not every object can fire an event; a String object cannot fire an event
	
	
	//A listener must be an instance of a listener interface and must be registered with a source object
	/**	
		a) Generate source object with a generic event T
		
		(User Action)-----triggers event------>	[	source: SourceClass		]◇---------	[listener: ListenerClass]
												[+setOnXEventType(listener)	]							|
																										|
																										▽
			1) A listener object is instance of a listener interface					[			<<interface>>			]
			2) Register by invoking:													[	EventHandler<T extends Event>	]
					source.setOnXEventType(listener);									[+handle(event: T)					]
		
	 */
	
	/**
		b) A Button source object with an ActionEvent
		
		[	source: javafx.scene.control.Button	]◇-------------------------------------	[listener: CustomListenerClass]
		[+setOnAction(listener)					]														|
																										|
																										▽
			1) An action event listener is instance of EventHandler<ActionEvent>		[			<<interface>>			]
			2) Register by invoking:													[	EventHandler<ActionEvent>		]
					source.setOnAction(listener);										[+handle(event: ActionEvent)		]
				
	 */
	
	//**Example:
	/**
			Registering an action event handler on a *Button* object requires the method: +setOnActive() on the button object			
			*The parameter type for the setOnActive() method is EventHandler<ActionEvent>
			
			*With these combined, create a button object called btn1:
					btn1.setOnActive(EventHandler<ActionEvent>);
	 */
	
	
	//The following class is a blueprint on how to implement an EventHandler for a Button**
	/**
		class CustomHandler implements EventHandler<ActionEvent> {
    		@Override // Override the handle method
    		public void handle(ActionEvent e) {
      			//Method(s) such as a method from Circle class to change the radius of circle when button is pressed
    		}
  		}
  
	 */
	
	
	//Example: create a button that prints to the console that it was clicked
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		
		Font font = new Font("Times New Roman", 25);
		Button b1 = new Button("Click Here");
		b1.setFont(font);
		pane.getChildren().add(b1);
		pane.setAlignment(Pos.CENTER);
		
		//Event Handle for button
		b1.setOnAction(new RegisterClick());
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**Notice that this is an inner class: more on the subject in InnerClass */
	class RegisterClick implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			System.out.println("Clicked Button!");
		}
	}

}
