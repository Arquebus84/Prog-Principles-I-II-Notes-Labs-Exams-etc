package AnimationTests;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
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

public class ProceduralTest extends Application{
	
	private final int WIDTH = 500;
	private final int HEIGHT = 400;
	Circle point;
	Circle target;
	Line distanceLine;
	Arc arcLine;

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		
		point = new Circle(10);
		point.setFill(Color.GREEN);
		target = new Circle(15);
		target.setFill(Color.RED);
		
		//Set Both in the center
		point.setCenterX(WIDTH * 0.5);
		point.setCenterY((HEIGHT * 0.5));
		target.setCenterX(WIDTH * 0.5);
		target.setCenterY((HEIGHT * 0.5));
		
		distanceLine = new Line(target.getCenterX(),target.getCenterY(), point.getCenterX(),point.getCenterY());		
		//+Arc(x: double, y: double, radiusX: double, radiusY: double, startAngle: double, length: double)
		arcLine = new Arc(midPointX(target, point), target.getCenterY(), distanceBetweenPointsX(target, point) * 0.5, 50, 0, 180);
		distanceLine.setFill(Color.BLACK);
		arcLine.setFill(Color.TRANSPARENT); arcLine.setStroke(Color.BLACK);
		
		pane.getChildren().add(target);
		pane.getChildren().add(point);	//Point has to be on top of target
		pane.getChildren().add(distanceLine);
		pane.getChildren().add(arcLine);
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Procedural Animation");
		stage.show();
		
		pane.setOnMouseDragged(e ->{
			point.setCenterX(e.getX());
			distanceLine.setStartX(target.getCenterX()); distanceLine.setStartY(target.getCenterY());
			distanceLine.setEndX(point.getCenterX()); distanceLine.setEndY(point.getCenterY());
			//Update The arcLine
			arcLine.setRadiusX(distanceBetweenPointsX(point, target) * 0.5);
			arcLine.setCenterX(midPointX(point, target));
			
			/**When the point changes directions, take the inverse in order for the animation to be more consistent*/
			PathTransition animation = new PathTransition();
			animation.setDuration(Duration.millis(200));				
			animation.setInterpolator(Interpolator.EASE_BOTH);
			animation.setPath(arcLine);
			
			if(point.getCenterX() > target.getCenterX()) {
				arcLine.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
				//System.out.printf("%.2f%n", distanceBetweenPointsX(target, point));
			}else {
				arcLine.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
				//System.out.printf("%.2f%n", -distanceBetweenPointsX(target, point));
			}
			
			if(distanceBetweenPointsX(target, point) > 70) {
				animation.setNode(target);
				target.setCenterX(point.getCenterX());				
				animation.play();
			}
			
			//System.out.printf("%.2f%n", distanceBetweenPointsX(target, point));
		});
	}
	
	@SuppressWarnings("exports")
	public double distanceBetweenPointsX(Circle pt1, Circle pt2) {
		//Distance Formula: distance = sqrt[	(pt2.X - pt1.X)^2 + (pt2.Y - pt1.Y)^2	]
		double distance = Math.sqrt(	(Math.pow(pt2.getCenterX() - pt1.getCenterX(), 2)) + (Math.pow(pt2.getCenterY() - pt1.getCenterY(), 2))	);
		
		return distance;
	}
	
	//Midpoint
	@SuppressWarnings("exports")
	public double midPointX(Circle pt1, Circle pt2) {
		double midPoint = (pt1.getCenterX() + pt2.getCenterX()) * 0.5;
		return midPoint;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
