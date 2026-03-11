
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class ColorClass extends Application{
	/**Color class is immutable (cannot change the contents of Color object once it's been created)*/
	
	/**
			javafx.scene.paint.Color
		-red: double
		-green: double
		-blue: double
		-opacity: double
		+Color(r: double, g: double, b: double, opacity: double)		//Creates Color object (**includes opacity, whereas +color has rgb and rgb & opacity)
		+brighter(): Color
		+darker(): Color
		+color(r: double, g: double, b: double): Color					//(Static) Both this and the one below create new Color object (doesn't include opacity)
		+color(r: double, g: double, b: double, opacity: double): Color	//(Static) (Includes opacity)
		+rgb(r: int, g: int, b: int): Color								//(Static) 
		+rgb(r: int, g: int, b: int, opacity: double): Color			//(Static)
	 */
	
	//Example
	@Override
	public void start(Stage stage) {
		Color.color(0.2, 0.2, 0.2, 1);	//Example with 20% of r, g, and b, with maximum opacity
		
		Rectangle[] rectangle = new Rectangle[4];
		
		for(int i = 0; i < rectangle.length; i++) {
			rectangle[i] = new Rectangle(100, 100);
		}		
				
		Color red = new Color(1, 0, 0, 1);		
		rectangle[0].setFill(red);
		
		Color green = new Color(0, 1, 0, 1);
		rectangle[1].setFill(green);
		
		Color blue = new Color(0, 0, 1, 1);
		rectangle[2].setFill(blue);
		
		Color normalBlue = new Color(0.5, 0.5, 1, 1);
		rectangle[3].setFill(normalBlue);
		
		int k = 0;
		GridPane pane = new GridPane();
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				pane.add(rectangle[k], j, i);
				k++;
			}
		}
				
		Scene scene = new Scene(pane, 200, 200);		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
