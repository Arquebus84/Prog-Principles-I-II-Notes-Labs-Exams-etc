package MathematicalCalculations;

import javafx.application.Application;

import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ACMCodingChallenge extends Application{

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		HBox equation = new HBox();
		TextField num1, num2, result, minText, maxText;
		Text equals;
		Button calculateButton = new Button("Calculate");
		Button maxMinButton = new Button("Find Max and Min");
		
		ComboBox<String> operations = new ComboBox<>(); //Includes operations +, -, *, /
		operations.getItems().addAll("+", "-", "*", "/");
		operations.setStyle("-fx-Font: 25px \"Times New Roman\";");
		operations.setPrefWidth(290);
		
		num1 = new TextField();
		num1.setStyle("-fx-Font: 25px \"Times New Roman\";");
		num2 = new TextField();
		num2.setStyle("-fx-Font: 25px \"Times New Roman\";");
		equals = new Text("=");
		equals.setStyle("-fx-Font: 25px \"Times New Roman\";");
		result = new TextField();
		result.setStyle("-fx-Font: 25px \"Times New Roman\";");
		result.setEditable(false);
		
		Text maxMess = new Text("Max:"); maxMess.setStyle("-fx-Font: 25px \"Times New Roman\";");
		minText = new TextField(); minText.setStyle("-fx-Font: 25px \"Times New Roman\";");
		Text minMess = new Text("Min:"); minMess.setStyle("-fx-Font: 25px \"Times New Roman\";");
		maxText = new TextField(); maxText.setStyle("-fx-Font: 25px \"Times New Roman\";");
		
		VBox minMaxTextPane = new VBox(minMess, maxMess);
		VBox minMaxFieldPane = new VBox(minText, maxText);
		HBox hBox = new HBox(minMaxTextPane, minMaxFieldPane);
		
		equation.getChildren().addAll(num1, operations, num2, equals, result, hBox);
		equation.setSpacing(5);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(calculateButton, maxMinButton);
		
		VBox pane = new VBox(equation, vBox);
		
		Scene scene = new Scene(pane, 500, 400);
		stage.setScene(scene);
		stage.setTitle("ACM");
		stage.show();
		
		calculateButton.setOnAction(e ->{
			if(num1.getText() != "" && num2.getText() != "") {
				double number1 = Double.parseDouble(num1.getText());
				double number2 = Double.parseDouble(num2.getText());
				
				double resultCal = 0;
				switch(operations.getValue()) {
					case "+": resultCal = number1 + number2; break;
					case "-": resultCal = number1 - number2; break;
					case "*": resultCal = number1 * number2; break;
					case "/": resultCal = number1 / number2; break;
				}
				
				result.setText(resultCal + "");
			}else {
				System.out.println("Cannot calculate");
			}
		});
		
		maxMinButton.setOnAction(e ->{
			if(num1.getText() != "" && num2.getText() != "") {
				double number1 = Double.parseDouble(num1.getText());
				double number2 = Double.parseDouble(num2.getText());
				
				double min = 0;
				double max = 0;
				if(number1 > number2) {
					max = number1;
					min = number2;
				}else if(number2 > number1) {
					max = number2;
					min = number1;
				}
				
				minText.setText(min + "");
				maxText.setText(max + "");
				
			}else {
				System.out.println("Cannot calculate");
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
