import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RotationCommonPropertiesAndMethodsForNodes extends Application{
	//Node class defines many properties and methods that are common to all nodes.
	
	//CSS: Cascading Style Sheets is used to specify styles for HTML elements on a web page
	
	/**
		The style properties in JavaFX are called JavaFX CSS
			* In JavaFX, a style property is defined with prefix 
					-fx-
			**Each Node has its own style properties, which can be found in the link:
						*https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html*
					
			* Syntax for setting a style is 
					+setStyle:value
			* Example with object circle of type Node*
				circle.setStyle("-fx-stroke: black; -fx-fill: red;");
				//These two are equivalent to the previous statement:
				circle.setStroke(Color.BLACK);
				circle.setFill(color.RED);


		**NOTE: When rotating objects, it's done clockwise. Instead of starting at 0 and rotating counterclockwise, the rotation
					looks like this:
							 
							  0
						  /	 	 \
						270		  90			instead of the trigonometric circle
						  \		  /
							180 
	 */
	
	//Example of rotated button
	
	@Override
	public void start(Stage stage) {
		Button b1 = new Button("Click Here");
		b1.setRotate(45);						//setRotate rotates the button 45 degrees clockwise
		
		Scene scene = new Scene(b1, 200, 200);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
	
}
