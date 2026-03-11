package Windows;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class OpenWindow extends Application {
			
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) {
		GridPane pane = new GridPane();
		Button bt = new Button("Click Here");
		Scene scene = new Scene(pane, 600, 400);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().add(bt);
		
		stage.setScene(scene);
		stage.show();
	}
	
	
	
}
