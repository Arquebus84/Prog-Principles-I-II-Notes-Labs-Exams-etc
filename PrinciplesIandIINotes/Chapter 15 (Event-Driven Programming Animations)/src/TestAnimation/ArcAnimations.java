package TestAnimation;
import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.scene.shape.*;

import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

	/**
		Create a dragPoint and a target that moves to the dragPoint after a certain distance; but use a Sine wave
			to make it appear like it lifted up and moved towards the dragPoint
	 */

public class ArcAnimations extends Application{
	
	private final int WIDTH = 500;
	private final int HEIGHT = 400;
	Circle point1;
	Circle point2;
	Arc arcLine1;
	Arc arcLine2;

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		
		point1 = new Circle(15);
		point1.setFill(Color.GREEN);
		point2 = new Circle(15);
		point2.setFill(Color.BLUE);
		
		/**Arc(x: double, y: double, radiusX: double, radiusY: double, startAngle: double, length: double)*/
		//Arc1
		arcLine1 = new Arc(WIDTH * 0.5,150, 100, 100, 0, 180);
		arcLine1.setFill(Color.TRANSPARENT);
		arcLine1.setStroke(Color.BLACK);
		arcLine1.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);		// Used to reverse the trajectory of the point1
		
		//Arc2
		arcLine2 = new Arc(WIDTH * 0.5,300, 100, 100, 0, 180);
		arcLine2.setFill(Color.TRANSPARENT);
		arcLine2.setStroke(Color.BLACK);
		
		//Change the CenterX and CenterY for both circle points
		point1.setCenterX(arcLine1.getCenterX() - arcLine1.getRadiusX()); point1.setCenterY(arcLine1.getCenterY());
		point2.setCenterX(arcLine2.getCenterX() + arcLine2.getRadiusX()); point2.setCenterY(arcLine2.getCenterY());
		
		pane.getChildren().addAll(point1, point2, arcLine1, arcLine2);
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.setTitle("ARCS");
		stage.show();
		
		PathTransition anim1 = new PathTransition();
		anim1.setDuration(Duration.millis(1000));
		anim1.setAutoReverse(true);
		anim1.setCycleCount(Timeline.INDEFINITE);
		anim1.setNode(point1);
		anim1.setPath(arcLine1);
		
		PathTransition anim2 = new PathTransition();
		anim2.setDuration(Duration.millis(1000));
		anim2.setAutoReverse(true);
		anim2.setCycleCount(Timeline.INDEFINITE);
		anim2.setNode(point2);
		anim2.setPath(arcLine2);
	
		anim1.play();
		anim2.play();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
