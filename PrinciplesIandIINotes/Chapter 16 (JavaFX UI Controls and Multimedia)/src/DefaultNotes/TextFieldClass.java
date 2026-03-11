package DefaultNotes;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class TextFieldClass extends Application{

	//TextField can be used to enter or display a String
	
	/**An object of type TextField is a subtype of TextField, as well as a subtype of Node, Control, TextInputControl*/
	
	/**
			javafx.scene.control.TextInputControl
		-text: StringProperty
		-editable: BooleanProperty
		+AppendText(s: String)
						△
						|
						|
			javafx.scene.control.TextField
		-alignment: ObjectProperty<Pos>
		-prefColumnCount: IntegerProperty
		-onAction: ObjectProperty <EventHandler<ActionEvent>>
		+TextField()
		+TextField(text: String)
	 */
	
	//Example: Create an application that displays the text from the user and change the color and font
	//@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		
		HBox hBox = new HBox();
		
		Font timesRoman_Font = new Font("Times New Roman", 15);
		
		Text message = new Text("Enter a message: ");
		TextField textField = new TextField();
		
		message.setFont(timesRoman_Font); textField.setFont(timesRoman_Font);
		hBox.getChildren().addAll(message, textField);
		hBox.setSpacing(25);
		hBox.setAlignment(Pos.CENTER);
		
		RadioBoxPane radioPane = new RadioBoxPane();
		
		Text messagePrint = new Text();
		//messagePrint.setEditable(false);
		
		BorderPane pane = new BorderPane();
		pane.setLeft(radioPane);
		pane.setTop(hBox);
		pane.setCenter(messagePrint);
		
		Scene scene = new Scene(pane, 600, 400);
		
		hBox.setPrefWidth(scene.getWidth());
		
		stage.setScene(scene);
		stage.setTitle("RadioButton_Test");
		stage.show();
		
		//If you press enter, what you have written in the TextField will be displayed in the messagePrint
		textField.setOnKeyPressed(e ->{
			if(e.getCode() == KeyCode.ENTER) {
				messagePrint.setText(textField.getText());
			}
		});
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}


class CheckBoxPane extends HBox{
	public CheckBoxPane() {
		
	}
}

class RadioBoxPane extends VBox{
	public RadioBoxPane() {
		
		RadioButton red = new RadioButton("Red");
		red.setStyle("-fx-font-size: 15px");		
		RadioButton green = new RadioButton("Green");
		green.setStyle("-fx-font-size: 15px");
		RadioButton blue = new RadioButton("Blue");
		blue.setStyle("-fx-font-size: 15px");
						
		//Toggle group
		ToggleGroup groupRadioButton = new ToggleGroup();
		red.setToggleGroup(groupRadioButton);
		green.setToggleGroup(groupRadioButton);
		blue.setToggleGroup(groupRadioButton);
		
		super.getChildren().addAll(red, green, blue);
		super.setAlignment(Pos.CENTER_LEFT);
	}
}
