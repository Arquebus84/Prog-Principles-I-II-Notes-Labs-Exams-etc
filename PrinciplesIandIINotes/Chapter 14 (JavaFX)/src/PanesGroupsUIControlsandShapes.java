import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PanesGroupsUIControlsandShapes extends Application{
	//Panes, Groups, UI Controls, and Shapes are sub-types of Node
	
	//Node: A visual component such as a shape, an image view, a UI control
	
	
	//When creating a button, it's always centered in the middle of the program. To fix this, use panes
	
	//Pane: A javafx node for grouping and laying out nodes in a desired location and space (**More on panes in PaneClasses)
	
	/**Panes: A JavaFX node for grouping and organizing other nodes*/
	
	
	/**
											
			[Stage]
			  ◆
			  |			⬐--------[Shape]
			  |			|
	⬐------◆[Scene]		|
	|					|--------[ImageView]
	|					|
	|					|
	|	↱---[Node]◁-----	⤶	⬐----[Control]
	|	|	 △				|
	|	|	 |				|
	|	|	 |				|----[Group]			⬐--	[FlowPane]
	↪------[Parent]◁-------↤						⬐--	[GridPane]
		|					|						⬐--	[BorderPane]
		|					⬑----[Pane]◁---------------	[HBox]
		| 						   *◆				⬑--	[VBox]
		↪---------------------------⤴				⬑--	[StackPane]
	
			
			
			//Shapes such as Circle, Rectangle, Ellipse, Line, Arc, Polygon, Polyline, and Text are subclasses of Shape
			//ImageView is for displaying images
			//UI controls such as Label, TextField, Button, CheckBox, RadioButton, and TextArea are subclasses of Control
	 */
	
	//Example with Circle Shape
	
	/***
			NOTE: When displaying shapes, the convenient Cartesian Coord. System is not going to be useful because, these objects are first
				placed in the top-left corner:
				
				Standard Cartesian Coord.										Java Coord. System (Also for other computers)
						 y-axis														 ___________________ x-axis
							|														|		|
							|														|		|
							|														|		|
				____________|____________ x-axis									|-------*(x, y)
							|(0, 0)													|
							|														|
							|														|
																					y-axis
	 */	
	
	//Example with circle
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200, 200);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

