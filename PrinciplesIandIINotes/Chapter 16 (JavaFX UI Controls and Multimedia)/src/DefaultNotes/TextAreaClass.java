package DefaultNotes;

import javafx.application.Application;


import javafx.scene.control.TextArea;

import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextAreaClass extends Application{
	
	//TextArea enables the user to enter multiple lines of text
	
	/**
			javafx.scene.control.TextInputControl
							△
							|
							|
			javafx.scene.control.TextArea
		-prefColumnCount: IntegerProperty
		-prefRowCount: IntegerProperty
		-wrapText: BooleanProperty				//Used to wrap a line in a text area
		+TextArea()
		+TextArea(text: String)
	 */
	
	//@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		TextArea txtArea1 = new TextArea();
		
		txtArea1.setPrefRowCount(2);		//Specifies the number of text rows
		txtArea1.setPrefColumnCount(15);	//Specifies the number of text columns (also ends up changing the width)
		txtArea1.setWrapText(true); 		//Specifies whether the text is wrapped to the next line
		txtArea1.setEditable(true);			//Indicates whether the text can be edited by the user
		
		/**Used to wrap a line in a text area on words*/
		//txtArea1.setWrapStyleWord(true);
		
		/**Used to append a String in a text area*/
		txtArea1.appendText("Write Here: ");
		
		FlowPane pane = new FlowPane();
		pane.getChildren().add(txtArea1);
		
		Scene scene = new Scene(pane, 500, 400);
		
		stage.setScene(scene);
		stage.setTitle("TextArea_Test");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
