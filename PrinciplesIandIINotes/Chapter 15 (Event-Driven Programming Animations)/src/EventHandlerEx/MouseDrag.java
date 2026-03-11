package EventHandlerEx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;

import javafx.stage.Stage;

public class MouseDrag extends Application{

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Circle c1 = new Circle();
		c1.setRadius(25);
		
		FlowPane pane = new FlowPane();
		pane.setAlignment(Pos.CENTER);
		
		pane.getChildren().add(c1);
		Scene scene = new Scene(pane, 200, 150);
		
		c1.setOnMouseDragged(e ->{
			c1.setTranslateX(e.getX());
			c1.setTranslateY(e.getY());
		});
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
