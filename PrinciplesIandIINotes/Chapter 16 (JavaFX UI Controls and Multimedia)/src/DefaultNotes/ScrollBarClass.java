package DefaultNotes;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.ScrollBar;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScrollBarClass extends Application{
	
	//ScrollBar is a control that enables the user to select from a range of values
	
	/*	min value											max value
	 * 		 _____________________________________________________
			[<____________________________O______________________>]
		left button		track			thumb				right button
			
	 */		
	
	/**
			javafx.scene.control.ScrollBar
		-blockIncrement: DoubleProperty
		-max: DoubleProperty
		-min: DoubleProperty
		-unitIncrement: DoubleProperty
		-value: DoubleProperty
		-visibleAmount: DoubleProperty
		-orientation: ObjectProperty<Orientation>
		+ScrollBar()
		+increment()
		+decrement()
	 */
	
	//NOTE: for each data member in ScrollBar
	/**
		* unitIncrement: The amount to adjust the scroll bar when the increment() and decrement() methods are called (default: 1)
		* value: Current value of the scroll bar (default: 0)
		* blockIncrement: Amount to adjust scroll bar if the track of the bar is clicked (default: 10)
		* visibleAmount: The width of the scroll bar (default: 15)
		* orientation: Specifies the orientation of the scroll bar (default: HORIZONTAL)
		* min: Min value represented by this scroll bar (default: 100)
		* max: Max value represented by this scroll bar (default: 100)
	 */
	
	
	/**
		The width of the scroll bar's track corresponds to max + visibleAmount. When as scroll is set to its max value, the left
			side of the bubble is at max, and the right is at max + visibleAmount
	 */
	
	//When the user changes the value for the scroll bar, it notifies the listener for the change:
	//**You can register a listener on scroll bar's valueProperty() for responding to the change as follows:
	/**
			ScrollBar sb = new ScrollBar();
			sb.valueProperty().addListener(e -> {
				System.out.println("Old value: " + oldValue);
				System.out.println("New value: " + newValue);
			});
	 */
	
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		ScrollBar scrollBarHor = new ScrollBar();
		ScrollBar scrollBarVer = new ScrollBar();
		
		//Set the orientation for vertical Bar
		scrollBarVer.setOrientation(Orientation.VERTICAL);
		
		Pane textPane = new Pane();
		
		Text text = new Text("Welcome to Java! Now let's begin by talking about this program.");
		text.setStyle("-fx-font: 25px \"Times New Roman\";");
		text.setY(200);
		textPane.getChildren().add(text);
		
		BorderPane bPane = new BorderPane();
		bPane.setCenter(textPane);
		bPane.setBottom(scrollBarHor);
		bPane.setRight(scrollBarVer);
		
		//Add function for scroll bars
		scrollBarHor.valueProperty().addListener(e ->{
			text.setX(scrollBarHor.getValue() * textPane.getWidth() / -scrollBarHor.getMax());
		});
		
		scrollBarVer.valueProperty().addListener(e ->{
			text.setY(scrollBarVer.getValue() * textPane.getHeight() / scrollBarVer.getMax());
		});
				
		Scene scene = new Scene(bPane, 500, 400);
		
		stage.setTitle("ScrollBar_Test");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
