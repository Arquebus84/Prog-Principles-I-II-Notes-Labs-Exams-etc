package ClassProject;

import javafx.geometry.Pos;

import java.util.ArrayList;

import javafx.application.Application;

import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ToDoList extends Application{
	
	TextField txtField;
	Button addTask;
	Button deleteTask;
	
	ListView<String> taskList;
	ArrayList<String> tasks;
		
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		FlowPane pane = new FlowPane();
		HBox hBox1 = new HBox();
		HBox hBox2 = new HBox();
		HBox hBox3 = new HBox();
		
		txtField = new TextField();
						
		addTask = new Button("Add Task");
		deleteTask = new Button("Delete Task");
		
		/**No need to add an ArrayList inside the observableArrayList method. Instead, update it with the taskButton*/
		//ObservableList<String> taskArray = FXCollections.observableArrayList();	
				
		taskList = new ListView<>(); // originally: taskList = new ListView<>(taskArray);
		taskList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		addTask.setOnAction(e ->{
			//taskArray.add(txtField.getText());	
			taskList.getItems().add(txtField.getText());
		});
		
		deleteTask.setOnAction(e ->{
			if(taskList.getSelectionModel().getSelectedIndices().size() > 0) {
				taskList.getItems().removeAll(taskList.getSelectionModel().getSelectedItems());
			}else {
				taskList.getItems().remove(taskList.getSelectionModel().getSelectedItem());
			}
			
			System.out.println("Delete Item index: " + taskList.getSelectionModel().getSelectedIndices());
		});
				
		hBox1.getChildren().add(txtField);
		hBox1.getChildren().add(addTask);
		hBox2.getChildren().add(hBox1);
		
		hBox2.getChildren().add(taskList);
		hBox2.getChildren().add(deleteTask);
		
		hBox3.getChildren().add(hBox2);
		hBox3.setAlignment(Pos.CENTER);
		hBox3.setSpacing(5);
		
		pane.getChildren().add(hBox3);
		pane.setAlignment(Pos.CENTER);		
				
		Scene scene = new Scene(pane, 600, 500);
		stage.setTitle("To Do List");
		stage.setScene(scene);
		stage.show();		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
