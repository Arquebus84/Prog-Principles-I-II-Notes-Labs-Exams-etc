
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
public class TextClass extends Application {

	/**
			javafx.scene.text.Text
		-text: StringProperty
		-x: DoubleProperty
		-y: DoubleProperty
		-underline: BooleanProperty
		-strikethrough: BooleanProperty
		-font: ObjectProperty
		+Text()
		+Text(text: String)
		+Text(x: double, y: double, text: String)
	 */
	
	/**Can combine the Text class with the Font class to create custom format*/
	//Check here the the specific fonts: https://motleybytes.com/w/JavaFxFonts	***
	
	@Override
	public void start(Stage stage) {
		Text text = new Text(100, 500, "Hello World!");
		
		//javafx.scene.text.Font font = new javafx.scene.text.Font("Times New Roman", 15);
		//Using the Font class
		Font font = new Font("Times New Roman", 15);
		text.setFont(font);
		GridPane pane = new GridPane();
		pane.getChildren().add(text);
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane, 200, 200);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
