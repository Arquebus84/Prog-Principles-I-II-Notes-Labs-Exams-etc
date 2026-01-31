package Lab09;

/**
* File: Lab09Pro02.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Apr 4, 2025
* Last Modified: Apr 4, 2025
* Description: Modify Lab 08 part 1, and provide functionality to the simple calculator
*/
import javafx.application.Application;

import javafx.scene.control.TextField;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab09Prob02 extends Application {
	
	Double op1;
	Double op2;
	Double res;
	TextField operand1;
	TextField operand2;
	TextField result;
	
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
		
		operand1 = new TextField();
		operand2 = new TextField();
		result = new TextField();
								
		for(Button b : operator) {
									
			b.setOnAction(e ->{
				
				op1 = Double.parseDouble(operand1.getText());
				op2 = Double.parseDouble(operand2.getText());
				switch(b.getText()) {
					case "+": res = op1 + op2; break;
					case "-": res = op1 - op2; break;
					case "*": res = op1 * op2; break;
					case "/": division(); break;
				}
				
				result.setText(res + "");
			});
		}
						
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
	
	public void division() {
		try {
			res = op1 / op2;
			if(op2 == 0) {throw new Exception("op2 is zero"); }
		}catch(Exception ex) {
			System.out.println("Cannot divide by zero");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
