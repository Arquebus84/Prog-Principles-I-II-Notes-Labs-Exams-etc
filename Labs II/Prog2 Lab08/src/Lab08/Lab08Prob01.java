package Lab08;

/**
* File: Lab08Prob01.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Mar 28, 2025
* Last Modified: Mar 28, 2025
* Description:  Create a JavaFX program that will eventually become a fuel efficiency calculator for Miles Per Gallon (MPG)
*/
import javafx.application.Application;

import javafx.scene.text.*;
import javafx.scene.control.TextField;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab08Prob01 extends Application {

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
		TextField typeMPG = new TextField();
		
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
		Scene scene = new Scene(pane, 190, 100);
		
		//Set the stage and name the window
		stage.setTitle("MPG Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
