package EventHandlerEx;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleEnlarge extends Application {
	CirclePane circlePane = new CirclePane();
	
	@SuppressWarnings("exports")
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	circlePane.setAlignment(Pos.CENTER);
	
    BorderPane bPane = new BorderPane();
        
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    
    HBox hBox = new HBox();
    hBox.setSpacing(20);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    bPane.setCenter(circlePane);
    bPane.setBottom(hBox);
    
    
    //    pane.getChildren().add(btEnlarge);
    //    pane.getChildren().add(btShrink);
    //pane.setAlignment(Pos.CENTER);
    
    //Event Handle
    btEnlarge.setOnAction(new EnlargeHandler());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(bPane, 300, 200);
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**NOTE: this class is inside the CircleEnlarge class, hence, it's called a nested or inner class */
  class EnlargeHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		}
		
	}
  
  public static void main(String[] args) {
    launch(args);
  }
}

class CirclePane extends GridPane{
	private Circle circle = new Circle(50);
	
	public CirclePane(){
		getChildren().add(circle);
	    circle.setStroke(Color.BLACK);
	    circle.setFill(Color.WHITE);
	}
	
	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink() {
		circle.setRadius(circle.getRadius() > 2? circle.getRadius() - 2 : circle.getRadius());
	}
}

