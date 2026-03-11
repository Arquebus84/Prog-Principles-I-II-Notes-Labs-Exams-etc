package ClassActivity;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResizeApp extends Application {
	
	//Add the shapes
	CircleShape circle;
	RectangleShape rectangle;
	
	//Organize the shapes in a FlowPane
	FlowPane shapePane;
	VBox controlPane;
	HBox circleProperties;
	HBox rectangleProperties;
	Slider rectangleSlider;
	Slider circleSlider;
	
	RadioButton rb_circle;
	RadioButton rb_rectangle;
			
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) {
		BorderPane bPane = new BorderPane(); 
		shapePane = new FlowPane(); // New FlowPane for displaying shapes (og: Pane)
		controlPane = new VBox(10); // VBox for controls and shapes
						
		rectangleSlider = new Slider(0.5, 2.0, 1.25);
		circleSlider = new Slider(0.5, 2.0, 1.25);
		
		rb_circle = new RadioButton("Circle");
		rb_rectangle = new RadioButton("Rectangle");
		rb_circle.setSelected(true);
		
		ToggleGroup radioGroup = new ToggleGroup();
		rb_circle.setToggleGroup(radioGroup);
		rb_rectangle.setToggleGroup(radioGroup);
		
		/**Add HBox for organizing each shape based on the radio button, and the slider controls for that shape*/
		circleProperties = new HBox();
		rectangleProperties = new HBox();
		
		circleProperties.getChildren().addAll(rb_circle, circleSlider);
		//circleProperties.setSpacing(25);
		circleProperties.setAlignment(Pos.CENTER);
		rectangleProperties.getChildren().addAll(rb_rectangle, rectangleSlider);
		//rectangleProperties.setSpacing(25);
		rectangleProperties.setAlignment(Pos.CENTER);
		
		//Add both circle and rect properties to controlPane (VBox)
		controlPane.getChildren().addAll(circleProperties, rectangleProperties);
		//controlPane.getChildren().addAll(circleSlider, rectangleSlider);
		controlPane.setAlignment(Pos.CENTER);
		
		bPane.setCenter(shapePane);
		bPane.setBottom(controlPane);

		// Create CircleShape and RectangleShape objects
		circle = new CircleShape(50);
		rectangle = new RectangleShape(100, 60);

		// Draw shapes on the pane
		circle.draw(shapePane);
		rectangle.draw(shapePane);
		shapePane.setHgap(200);
		shapePane.setAlignment(Pos.CENTER);

		// Slider to resize the circle
		circleSlider.setShowTickMarks(true);
		circleSlider.setShowTickLabels(true);
		// Slider to resize the rectangle
		rectangleSlider.setShowTickMarks(true);
		rectangleSlider.setShowTickLabels(true);
		
		System.out.println("Circle: " + rb_circle.isSelected());
		System.out.println("Rectangle: " + rb_rectangle.isSelected());
				
		/**NOTE: If you want to modify the shape size if the radio button is selected to that specific shape, then
		 	 check to see if that radio button is selected before calling the resize method from the shape object
		 */
		circleSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
			if(rb_circle.isSelected()) {
				circle.resize(newVal.doubleValue());
			}
		});
		rectangleSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
			if(rb_rectangle.isSelected()) {
				rectangle.resize(newVal.doubleValue());
			}
		});
		
		rb_circle.setOnAction(e ->{
			System.out.println("Circle: " + rb_circle.isSelected());
			System.out.println("Rectangle: " + rb_rectangle.isSelected());
		});
		rb_rectangle.setOnAction(e ->{
			System.out.println("Circle: " + rb_circle.isSelected());
			System.out.println("Rectangle: " + rb_rectangle.isSelected());
		});

		// Set up the stage and scene
		Scene scene = new Scene(bPane, 600, 500);
		primaryStage.setTitle("Shape Resizer");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

//Abstract Shape class
abstract class Shape {
	abstract void draw(Pane pane); // Abstract method for drawing
	//abstract void delete(Pane pane); //Abstract method for deleting the shape
}

//Resizable interface
interface Resizable {
	void resize(double factor); // Method to resize the shape
}

//CircleShape class extending Shape and implementing Resizable
class CircleShape extends Shape implements Resizable {
	private Circle circle;
	private double radius;

	public CircleShape(double radius) {
		this.radius = radius;
		this.circle = new Circle(radius);
		this.circle.setFill(Color.BLUE);
	}

	@Override
	public void draw(Pane pane) {
		// Set initial position and add to pane
		circle.setCenterX(100);
		circle.setCenterY(100);
		pane.getChildren().add(circle);
	}
	
//	@Override
//	public void delete(Pane pane) {
//		pane.getChildren().remove(circle);
//	}

	@Override
	public void resize(double factor) {
		circle.setRadius(radius * factor);
	}
}

//RectangleShape class extending Shape and implementing Resizable
class RectangleShape extends Shape implements Resizable {
	private Rectangle rectangle;
	private double width;
	private double height;

	public RectangleShape(double width, double height) {
		this.width = width;
		this.height = height;
		this.rectangle = new Rectangle(width, height);
		this.rectangle.setFill(Color.RED);
	}

	@Override
	public void draw(Pane pane) {
		// Set initial position and add to pane
		rectangle.setX(250);
		rectangle.setY(75);
		pane.getChildren().add(rectangle);
	}
	
//	@Override
//	public void delete(Pane pane) {
//		pane.getChildren().remove(rectangle);
//	}

	@Override
	public void resize(double factor) {
		rectangle.setWidth(width * factor);
		rectangle.setHeight(height * factor);
	}
}