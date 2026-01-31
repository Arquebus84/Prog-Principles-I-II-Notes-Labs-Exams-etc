/**
* File: PAssign06.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Mar 13, 2025
* Last Modified: Mar 24, 2025
* Description: 	Import javafx, create java GUI that implements the same keys on a phone number pad:
* 								[1	2	3]
* 								[4	5	6]
* 								[7	8	9]
* 								[*	0	#]
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;	//Use the pane to organize each button

public class PAssign06 extends Application{

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("PAssign06");
		
		Button[] buttons = new Button[12];
		
		buttons[0] = new Button("1");
		buttons[1] = new Button("2");
		buttons[2] = new Button("3");
		buttons[3] = new Button("4");
		buttons[4] = new Button("5");
		buttons[5] = new Button("6");
		buttons[6] = new Button("7");
		buttons[7] = new Button("8");
		buttons[8] = new Button("9");
		buttons[9] = new Button("*");
		buttons[10] = new Button("0");
		buttons[11] = new Button("#");
		
		GridPane pane = new GridPane();		//For each pane, start with the node, then specify the column and the row
		
		//Nested for loops: outer specifies rows, inner specifies columns ** When applying to the GridPane, switch the rows and columns
		int k = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				pane.add(buttons[k], j, i);
				buttons[k].setPrefWidth(500);
				buttons[k].setPrefHeight(500);
				k++;
			}
		}
		
		
		pane.setAlignment(Pos.CENTER);
		Scene scene = new Scene(pane, 500, 500);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
