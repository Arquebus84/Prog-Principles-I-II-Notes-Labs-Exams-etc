package Lab09;

/**
* File: Lab09Pro01.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Apr 4, 2025
* Last Modified: Apr 4, 2025
* Description: Modify Lab 08 part 1, and provide functionality to the Miles Per Gallon Calculator
*/
import javafx.application.Application;

import javafx.scene.text.*;
import javafx.scene.control.TextField;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab09Prob01 extends Application{

	TextField typeMPG;
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Button resetB = new Button("Reset");
		Button calculateB = new Button("Calculate");
		
		Text miles = new Text("Miles: ");
		TextField typeMiles = new TextField();
		
		Text gallons = new Text("Gallons: ");
		TextField typeGallons = new TextField();
				
		Text MPG = new Text("MPG: ");
		typeMPG = new TextField();
		
		calculateB.setOnAction(e ->{
			double milesAmount = Double.parseDouble(typeMiles.getText());
			double gallonsAmount = Double.parseDouble(typeGallons.getText());
			calculateMPG(milesAmount, gallonsAmount);
		});
		
		resetB.setOnAction(e ->{
			typeMiles.setText(0 + "");
			typeGallons.setText(0 + "");
			typeMPG.setText(0 + "");
			
		});
				
		//Create a gridPane to hold all the nodes
		GridPane pane = new GridPane();
		pane.add(miles, 0, 0);
		pane.add(typeMiles, 1, 0);
		pane.add(gallons, 0, 1);
		pane.add(typeGallons, 1, 1);
		pane.add(MPG, 0, 2);
		pane.add(typeMPG, 1, 2);
		
		pane.add(resetB, 0, 3);
		pane.add(calculateB, 1, 3);
				
		//Set the scene and the window size
		Scene scene = new Scene(pane, 200, 150);
		
		//Set the stage and name the window
		stage.setTitle("MPG Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	//Method for calculating the Miles Per Gallon
	public void calculateMPG(double miles, double gallons) {
		try {
			double result = miles / gallons;
			
			String resCalc = String.format("%.1f", result);
			typeMPG.setText(resCalc);
			
			if(gallons == 0) {
				throw new Exception("gallons = 0");
			}
		}catch(Exception e) {
			System.out.println("gallons cannot be zero");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
