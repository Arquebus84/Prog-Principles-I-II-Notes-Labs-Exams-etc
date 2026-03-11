package DefaultNotes;

import javafx.application.Application;

import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ComboBoxClass extends Application {

	/**
			javafx.scene.control.ComboBoxBase<T>
		-value: ObjectProperty<T>
		-editable: BooleanProperty
		-onAction: ObjectProperty <EventHandler<ActionEvent>>
						△
						|
						|								****The Traingle △ indicates that ComboBox extends from ComboBoxBase
			javafx.scene.control.ComboBox<T>
		-items: ObjectProperty<ObservableList<T>>
		-visibleRowCount: IntegerProperty
		+ComboBox()
		+ComboBox(items: ObservableList<T>)


	 */
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		
		ComboBox<String> cBox = new ComboBox<>();
		cBox.getItems().addAll("Item1", "Item2", "Item3");
		cBox.setStyle("-fx-font: 30px \"Times New Roman\";");	//Set the style of the Combo Box
		cBox.setValue("Item1");	//Set the default item to Item1 (index 0)
				
		Pane pane = new Pane();
		pane.getChildren().add(cBox);
		
		cBox.setOnAction(e ->{
			System.out.println(cBox.getValue());	/**The getValue() method returns the selected item*/
		});
		
		Scene scene = new Scene(pane, 300, 500);
		stage.setTitle("ComboBox");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
