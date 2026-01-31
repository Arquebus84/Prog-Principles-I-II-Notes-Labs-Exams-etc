package Lab08;

/**
* File: Lab08Prob02.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Mar 28, 2025
* Last Modified: Mar 28, 2025
* Description:  Create a JavaFX program that will eventually become a simple two operand calculator
*/

import javafx.application.Application;

import javafx.scene.control.TextField;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab08Prob02 extends Application {

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		GridPane gPane = new GridPane();
		
		Button[] operator = new Button[4];
		operator[0] = new Button("+"); operator[1] = new Button("-"); operator[2] = new Button("*"); operator[3] = new Button("/");
		
		//For each row and column in 2x2 gPane, add a button
		int k = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				//set up as j for columns, and i for rows
				gPane.add(operator[k], j, i);
				k++;
			}
		}
		
		TextField operand1 = new TextField();
		TextField operand2 = new TextField();
		TextField result = new TextField();
		
		HBox hBox = new HBox();
		hBox.getChildren().add(operand1);
		hBox.getChildren().add(gPane);
		hBox.getChildren().add(operand2);
		hBox.getChildren().add(result);
		
		//Set the scene and window size
		Scene scene = new Scene(hBox, 500, 50);
		
		//Set the stage and name the window
		stage.setTitle("Simple Calculator");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
