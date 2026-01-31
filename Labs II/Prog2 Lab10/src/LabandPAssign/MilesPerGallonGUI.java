package LabandPAssign;

/**
* File: Lab10Pro01.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Apr 11, 2025
* Last Modified: Apr 11, 2025
* Description: Update the MilesPerGallonGUI file to include Liters per 100 Kilometers
*/

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.geometry.HPos;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MilesPerGallonGUI extends Application {
		
	private TextField tfMiles = new TextField();	
	private TextField tfGallons = new TextField();	
	private TextField tfMilesPerGallons = new TextField();
	
	//Set the labels:
	Label distLabel = new Label("Miles:");
	Label quantLabel = new Label("Gallons:");
	Label distPerQuantLabel = new Label("Miles Per Gallon:");
	
	private RadioButton MPG_Conv = new RadioButton("MPG");
	private RadioButton LKM_Conv = new RadioButton("L/100KM");
	
	private Button calculate = new Button("Calculate");
	private Button reset = new Button("Reset");
	
	private final double KILOMETER_PER_MILE = 1.60934;
	private final double MILE_PER_KILOMETER = 0.621371;
	private final double LITER_PER_GALLON = 3.78541;
	private final double GALLON_PER_LITER = 0.264172;

	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) {
				
		GridPane gridPane = new GridPane();
		//Create an HBox for the RadioButtons
		HBox convButtons = new HBox();
		convButtons.getChildren().addAll(MPG_Conv, LKM_Conv);
		convButtons.setSpacing(5);
		
		// Create UI with Labels, TextFields, and a Button				
		gridPane.setHgap(5);
		gridPane.setVgap(5);		
		gridPane.add(MPG_Conv, 0, 0);
		gridPane.add(LKM_Conv, 1, 0);		
		gridPane.add(distLabel, 0, 1);
		gridPane.add(tfMiles, 1, 1);
		gridPane.add(quantLabel, 0, 2);
		gridPane.add(tfGallons, 1, 2);		
		gridPane.add(distPerQuantLabel, 0, 3);
		gridPane.add(tfMilesPerGallons, 1, 3);
		
		gridPane.add(reset, 0, 4);
		gridPane.add(calculate, 1, 4);
		
		// Create a toggle group
		ToggleGroup toggleGroup = new ToggleGroup();
		MPG_Conv.setToggleGroup(toggleGroup);
		LKM_Conv.setToggleGroup(toggleGroup);

		// Select MPG as default
		MPG_Conv.setSelected(true);
		
		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
		tfGallons.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallons.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallons.setEditable(false);
		GridPane.setHalignment(calculate, HPos.RIGHT);
		
		//Process lambda expressions
		calculate.setOnAction(e -> calculate());
		tfMiles.setOnAction(e -> calculate());
		tfGallons.setOnAction(e -> calculate());
		
		reset.setOnAction(e -> reset());
						
		/**Convert between MPG and LKM*/				
		MPG_Conv.setOnAction(e -> setMPG());
		LKM_Conv.setOnAction(e -> setLKM());
				
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("MPG Calculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	private void setMPG() {
		distLabel.setText("Miles:");
		quantLabel.setText("Gallons:");
		distPerQuantLabel.setText("Miles Per Gallon:");
		
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty()){
			double kilometer = Double.parseDouble(tfMiles.getText());
			String miles_String = String.format("%.0f", kilometer * MILE_PER_KILOMETER);
			tfMiles.setText(miles_String);
		}
		
		if(tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double liter = Double.parseDouble(tfGallons.getText());
			String gallons_String = String.format("%.0f", liter * GALLON_PER_LITER);
			tfGallons.setText(gallons_String);
		}
		
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() && tfGallons.getText() != null && !tfGallons.getText().isEmpty()
			&& tfMilesPerGallons.getText() != null && !tfMilesPerGallons.getText().isEmpty()) {
			double miles = Double.parseDouble(tfMiles.getText());
			double gallons = Double.parseDouble(tfGallons.getText());
			double result = miles / gallons;
			
			String MPG = String.format("%.2f", result);
			tfMilesPerGallons.setText(MPG);
		}
		
	}
	
	private void setLKM() {
		distLabel.setText("Kilometers:");
		quantLabel.setText("Liters:");
		distPerQuantLabel.setText("Liters Per 100KM:");
		
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty()){
			double mile = Double.parseDouble(tfMiles.getText());
			String kilometers_String = String.format("%.0f", mile * KILOMETER_PER_MILE);
			tfMiles.setText(kilometers_String);
		}
		
		if(tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double gallon = Double.parseDouble(tfGallons.getText());
			String liters_String = String.format("%.0f", gallon * LITER_PER_GALLON);
			tfGallons.setText(liters_String);
		}
		
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() && tfGallons.getText() != null && !tfGallons.getText().isEmpty() 
			&& tfMilesPerGallons.getText() != null && !tfMilesPerGallons.getText().isEmpty()) {
			double kilometers = Double.parseDouble(tfMiles.getText());
			double liters = Double.parseDouble(tfGallons.getText());
			double result = (liters * 100) / kilometers;
			
			String LKM = String.format("%.2f", result);
			tfMilesPerGallons.setText(LKM);
		}
	}
		
	private void calculate() {
		
		if(tfMiles.getText() != null && !tfMiles.getText().isEmpty() && tfGallons.getText() != null && !tfGallons.getText().isEmpty()){
			// make sure there are no blank or un-entered values
			if (LKM_Conv.isSelected()) {
										
				// pull text from TextField(s) and convert to double to do numeric operations depending on the selected unit of measurement
				double kilometers = Double.parseDouble(tfMiles.getText());
				double liters = Double.parseDouble(tfGallons.getText());
				//String kiloString = String.format("%.0f", kilometers);
				//String litString = String.format("%.0f", liters);

				//tfMiles.setText(kiloString);
				//tfGallons.setText(litString);

				double result = (liters * 100) / kilometers;

				// Display miles per gallon in result TextField with 4 decimal places by converting back to string
				tfMilesPerGallons.setText(String.format("%.2f", result));
			}else if(MPG_Conv.isSelected()) {
				double miles = Double.parseDouble(tfMiles.getText());
				double gallons = Double.parseDouble(tfGallons.getText());
				//String strMiles = String.format("%.0f", miles);
				//String strGallons = String.format("%.0f", gallons);

				//tfMiles.setText(strMiles);
				//tfGallons.setText(strGallons);

				double result = miles / gallons;

				// Display miles per gallon in result TextField with 4 decimal places by converting back to string
				tfMilesPerGallons.setText(String.format("%.2f", result));						
			}
		}		
	}	
		
	private void reset() {
		tfMiles.setText("");
		tfGallons.setText("");
		tfMilesPerGallons.setText("");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}