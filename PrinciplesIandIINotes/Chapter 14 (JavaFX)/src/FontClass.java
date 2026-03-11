import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class FontClass extends Application{
	/**Font class is immutable (cannot change the contents of Font object once it's been created) similar to Color class*/
	
	/**
			javafx.scene.text.Font
		-size: double
		-name: String
		-family: String
		+Font(size: double)
		+Font(name: String, size: double)
		+font(name: String, size: double): Font									//(Static)
		+font(name: String, w: FontWeight, size: double): Font					//(Static)
		+font(name: String, w: FontWeight, p: FontPosture, size: double): Font	//(Static)
		+getFontNames(): List<String											//(Static)
	 */
	
	/**
			Custom Font:
			
			Font.font("-fx-font: 20px \"Times New Roman\";");
			
			Better use the setStyle for the text:
			text.setStyle("-fx-font: 20px \"Times New Roman\";");
	 */
		
	
	//Example
	
	@Override
	public void start(Stage stage) {
		/**Create Font object with font name Courier, FontWeight Bold, FontPosture Italic, and size 20 using the static font method*/
		Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20);
		
		Font fontTimesRoman = new Font("Times New Roman", 15);
		
		Font fontElephant = Font.font("-fx-font: 30px \"Elephant\";");
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		Text text = new Text("Text Example With Times New Roman Font");
		text.setFont(fontTimesRoman);
		
		Text text2 = new Text("Text Example With Elephant Font");
		//text2.setFont(fontElephant);
		text2.setStyle("-fx-font: 20px \"Elephant\";");
		text2.setTranslateY(25);
		
		pane.getChildren().add(text);
		pane.getChildren().add(text2);
		
		Scene scene = new Scene(pane, 400, 200);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);		
	}
}
