package DefaultNotes;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class ListViewClass extends Application{

	//A list view is a control that basically performs the same function as a combo box, but it enables the use to choose a single value 
	//	or multiple values
	
	/**	NOTE: The getter and setter values were omitted

			javafx.scene.control.ListView<T>
		-items: ObjectProperty<ObservableList<T>>
		-orientation: BooleanProperty
		-selectionModel: ObjectProperty <MultipleSelectionModel<T>>		//Specifies how the items are selected (also used to obtain selected items)
		+ListView()
		+ListView(items: ObservableList<T>)
	 */
	
	/**The getSelectionModel() returns an instance of SelectionModel; contains methods for setting selection mode and obtaining selected
		indices and items.
				*Selection mode has two constants:	SelectionMode.MULTIPLE	and		SelectionMode.SINGLE	(Default value is SINGLE)
	 */
	
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Button addItemB = new Button("Add Item");	//These three will be used for the custom ListView for adding new Items
		Button delItemB = new Button("Delete Items");
		TextField txtField = new TextField();
		
		ObservableList<String> items = FXCollections.observableArrayList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6");
		ListView<String> viewItems = new ListView<>(items);
		
		viewItems.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);	//Can Select Multiple with Shift or Ctrl keys
		
		//To register a listener for processing a listView item change, use:
		viewItems.getSelectionModel().selectedItemProperty().addListener(e->{
			//Process Statements
			System.out.println("Chang this item");
		});
		
		
		
		//Example 2:
		
		//This observableList does not have any items at the moment, because it will get full every time you click the addItem Button
		//ObservableList<String> newItems = FXCollections.observableArrayList();		
		
		//New Items List View
		//ListView<String> viewNewItems = new ListView<>(newItems);
		ListView<String> viewNewItems = new ListView<>();	//This ListView does not use the newItems as a parameter
		viewNewItems.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);	//Allow the selection and deletion of multiple items 
		
		addItemB.setOnAction(e ->{
			//newItems.add(txtField.getText());		//Old
			viewNewItems.getItems().add(txtField.getText());
		});
		
		delItemB.setOnAction(e ->{
			//**The getItems() method was also in the ComboBox class
			
			//Check to make sure that the user is selecting more than one item, then delete those
			//	items, otherwise delete selected item
			if(viewNewItems.getSelectionModel().getSelectedIndices().size() > 1) {
				viewNewItems.getItems().removeAll(viewNewItems.getSelectionModel().getSelectedItems());
				System.out.println("Deleted Items: " + viewNewItems.getSelectionModel().getSelectedIndices());
				
			}else {
				//viewNewItems.getItems().remove(viewNewItems.getSelectionModel().getSelectedIndex());	//For index
				
				viewNewItems.getItems().remove(viewNewItems.getSelectionModel().getSelectedItem());
				System.out.println("Deleted Item: " + viewNewItems.getSelectionModel().getSelectedIndices());
			}
			
			//Can use getSelectedItems or getSelectedIndices
			//System.out.println("Deleted Items: " + viewNewItems.getSelectionModel().getSelectedIndices());	
		});
		
		
		VBox vBox = new VBox();
		HBox buttons = new HBox();
		buttons.getChildren().add(addItemB);
		buttons.getChildren().add(delItemB);
		buttons.setSpacing(110);
		
		vBox.getChildren().add(txtField);
		vBox.getChildren().add(buttons);
		vBox.getChildren().add(viewNewItems);
		
		HBox pane = new HBox();
		pane.getChildren().add(viewItems);
		pane.getChildren().add(vBox);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(25);
		
		Scene scene = new Scene(pane, 650, 500);
		stage.setTitle("ListView_Test");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
