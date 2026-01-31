package LabandPAssign;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MPGEX extends Application {
	private TextField tfMiles = new TextField();
	private TextField tfGallons = new TextField();
	private TextField tfMilesPerGallon = new TextField();
	private Button btCalculate = new Button("Calculate");
	private Button btReset = new Button("Reset");
	
	// Creates two new RadioButtons to be selected between by the user
	private RadioButton rbMPG = new RadioButton("MPG");
	private RadioButton rbLKM = new RadioButton("L/100KM");
	
	// Makes the Labels named instances so that they can be updated easily
	private Label lblMiles = new Label("Miles:");
	private Label lblGallons = new Label("Gallons:");
	private Label lblMPG = new Label("Miles Per Gallon:");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create UI with Labels, TextFields, and a Button
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(rbMPG, 0, 0);
		gridPane.add(rbLKM, 1, 0);
		gridPane.add(lblMiles, 0, 1);
		gridPane.add(tfMiles, 1, 1);
		gridPane.add(lblGallons, 0, 2);
		gridPane.add(tfGallons, 1, 2);
		gridPane.add(lblMPG, 0, 3);
		gridPane.add(tfMilesPerGallon, 1, 3);
		gridPane.add(btReset, 0, 4);
		gridPane.add(btCalculate, 1, 4);
		
		// places rbMPG and rbLKM in a group so that an action to one effects the other
		ToggleGroup group = new ToggleGroup();
		rbMPG.setToggleGroup(group);
		rbLKM.setToggleGroup(group);
		// has the rbMPG selected by default
		rbMPG.setSelected(true);
		
		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
		tfGallons.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallon.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallon.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events with a lambda expression to call calculate MPG
		btCalculate.setOnAction(e -> calculate());
		tfMiles.setOnAction(e -> calculate());
		tfGallons.setOnAction(e -> calculate());
		
		// Process events for the reset button
		btReset.setOnAction(e -> reset());
		
		// Process events for the RadioButtons
		rbMPG.setOnAction(e -> setMPG());
		rbLKM.setOnAction(e -> setLKM());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("MPG Calculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	private void setMPG() {
		// Updates the Labels
		lblMiles.setText("Miles:");
		lblGallons.setText("Gallons:");
		lblMPG.setText("Miles Per Gallon:");
		// Converts the kilometers to miles if possible
		if(tfMiles != null && !tfMiles.getText().isEmpty()) {
			double kilometers = Double.parseDouble(tfMiles.getText());
			String miles = String.format("%.0f", kilometers*0.621371);
			tfMiles.setText(miles);
		}
		// Converts the liters to gallons if possible
		if(tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double liters = Double.parseDouble(tfGallons.getText());
			String gallons = String.format("%.0f", liters*0.264172);
			tfGallons.setText(gallons);
		}
		// Converts the liters per 100 kilometers into miles per gallon if possible
		if(tfMiles != null && !tfMiles.getText().isEmpty() && tfMilesPerGallon.getText() != null && !tfMilesPerGallon.getText().isEmpty() &&
			tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double miles = Double.parseDouble(tfMiles.getText());
			double gallons = Double.parseDouble(tfGallons.getText());
			String MPG = String.format("%.2f", (miles) / (gallons));
			tfMilesPerGallon.setText(MPG);
		}
	}
	
	private void setLKM() {
		// Updates the labels
		lblMiles.setText("Kilometers:");
		lblGallons.setText("Liters:");
		lblMPG.setText("Liters Per 100KM:");
		// Converts the miles into kilometers if possible
		if (tfMiles != null && !tfMiles.getText().isEmpty()) {
			double miles = Double.parseDouble(tfMiles.getText());
			String kilometers = String.format("%.0f", miles*1.60934);
			tfMiles.setText(kilometers);
		}
		// Converts the gallons into liters if possible
		if (tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double gallons = Double.parseDouble(tfGallons.getText());
			String liters = String.format("%.0f", gallons*3.78541);
			tfGallons.setText(liters);
		}
		// Converts the miles per gallons into liters per 100 kilometers if possible
		if (tfMiles != null && !tfMiles.getText().isEmpty() && tfMilesPerGallon.getText() != null && !tfMilesPerGallon.getText().isEmpty() && 
			tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			double kilometers = Double.parseDouble(tfMiles.getText());
			double liters = Double.parseDouble(tfGallons.getText());
			String LKM = String.format("%.2f", (liters*100) / (kilometers));
			tfMilesPerGallon.setText(LKM);
		}
		
	}
	
	private void reset() {
		// Resets the TextFields to 0
		tfMiles.setText("0");
		tfGallons.setText("0");
		tfMilesPerGallon.setText("0");
	}

	private void calculate() {
		// make sure there are no blank or un-entered values, and that the rbMPG is selected
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() &&
			tfGallons.getText() != null && !tfGallons.getText().isEmpty() &&
			rbMPG.isSelected()) {
			
			// pull text from TextField(s) and convert to double to do numeric operations
			double miles = Double.parseDouble(tfMiles.getText());
			double gallons = Double.parseDouble(tfGallons.getText());
			double result = miles/gallons;

			// Display miles per gallon in result TextField with 4 decimal places by converting back to string
			tfMilesPerGallon.setText(String.format("%.2f", result));
		}
		// make sure there are no blank or un-entered values, and that the rbLKM is selected
		else if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() &&
				tfGallons.getText() != null && !tfGallons.getText().isEmpty() &&
				rbLKM.isSelected()) {
			
			double kilometers = Double.parseDouble(tfMiles.getText());
			double liters = Double.parseDouble(tfGallons.getText());
			double result = (liters*100) / (kilometers);

			// Display miles per gallon in result TextField with 4 decimal places by converting back to string
			tfMilesPerGallon.setText(String.format("%.2f", result));
		}
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
