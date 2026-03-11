package DefaultNotes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class RadioButtonClass extends Application{

	//RadioButton, also known as option button, enables you to choose a single item from a group of choices
	
	/**		
			RadioButton is a subclass of ToggleButton***
				*The difference is that a radio button is rendered in a circular shape, whereas a toggle button is rendered
					in a rectangular shape.
					
					
			javafx.scene.control.ToggleButton
		-selected: BooleanProperty
		-toggleGroup: ObjectProperty<ToggleGroup>
		+ToggleButton()
		+ToggleButton(text: String)
		+ToggleButton(text: String, graphic: Node)
						△
						|
						|
			javafx.scene.control.RadioButton
		+RadioButton()
		+RadioButton(text: String)
			
	 */
	
	//Example:
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		RadioButton radio1 = new RadioButton("Choice 1");
		radio1.setStyle("-fx-font-size: 30px");		
		RadioButton radio2 = new RadioButton("Choice 2");
		radio2.setStyle("-fx-font-size: 30px");
		RadioButton radio3 = new RadioButton("Choice 3");
		radio3.setStyle("-fx-font-size: 30px");
		
		//To group radio buttons, create an instance of ToggleGroup and set a radioButton's toggleGroup property to join the group
		/**NOTE: CANNOT USE the ToggleGroup in order to put it inside a pane*/
		//pane.getChildren().add(groupRadioButton);	//Have to add all the buttons
		
		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(radio1, radio2, radio3);
		
		//****The ToggleGroups's purpose is to allow you to select another button, while disabling the last one you clicked!!
		ToggleGroup groupRadioButton = new ToggleGroup();
		radio1.setToggleGroup(groupRadioButton);
		radio2.setToggleGroup(groupRadioButton);
		radio3.setToggleGroup(groupRadioButton);
		/**Without grouping, these buttons would be independent*/
				
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane, 300, 300);
		stage.setScene(scene);
		stage.setTitle("RadioButton_Test");
		stage.show();
		
		radio1.setOnAction(e ->{
			System.out.println("Pressed radio1");
		});
		radio2.setOnAction(e ->{
			System.out.println("Pressed radio2");
		});
		radio3.setOnAction(e ->{
			System.out.println("Pressed radio3");
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
