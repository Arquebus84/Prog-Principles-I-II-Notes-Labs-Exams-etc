package DefaultNotes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckBoxClass extends Application{
	
	//A CheckBox is used for the user to make a selection
	
	/**
		CheckBox inherits all the properties (similar to the Button class) such as onAction, text, graphic, alignment, 
			graphicTextGap, textFill, and contentDisplay from the ButtonBase class

	 */
	
	
	//NOTE: CheckBox is also a subclass of Node** as well as a subclass of Control, Labeled, and ButtonBase
	/**
 			java.scene.control.ButtonBase
						△
						|
			javafx.scene.control.CheckBox
		-selected: BooleanProperty
		+CheckBox()
		+CheckBox(text: String)
	 */
	
	

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		CheckBox cBox = new CheckBox("Check this");
		cBox.setStyle("-fx-font: 30px \"Times New Roman\";");
		
		FlowPane pane = new FlowPane();
		pane.getChildren().add(cBox);
		pane.setAlignment(Pos.CENTER);
		
		//System.out.println(cBox.isSelected());	//Returns boolean value of whether checkBox was selected or not
		
		//SetAction that updates the isSelected() method from the CheckBox
		cBox.setOnAction(e ->System.out.println(cBox.isSelected()));
		
		Scene scene = new Scene(pane, 500, 400);
		stage.setTitle("CheckBox_Test");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
