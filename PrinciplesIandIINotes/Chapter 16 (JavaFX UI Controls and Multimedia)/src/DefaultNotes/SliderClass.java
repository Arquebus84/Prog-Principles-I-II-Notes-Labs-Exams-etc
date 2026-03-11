package DefaultNotes;

import javafx.application.Application;

import javafx.scene.layout.*;

import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class SliderClass extends Application {
	
	//Slider class is similar to ScrollBar
	
	/**
			javafx.scene.control.Slider
		-blockIncrement: DoubleProperty
		-max: DoubleProperty
		-min: DoubleProperty
		-value: DoubleProperty
		-orientation: ObjectProperty
		-majorTickUnit: DoubleProperty
		-minorTickCount: IntegerProperty
		-showTickLabels: BooleanProperty
		-showTickMarks: BooleanProperty
		+Slider()
		+Slider(min: double, max: double, value: double)
	 */
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Slider slider_Hor = new Slider();	//By default, the orientation is horizontal
		
		//NOTE: This statement only works when you place the slider in a pane within a pane
		//slider_Hor.setPrefWidth(200);
		
		//Thus, for now, use the maxWidth property
		slider_Hor.setMaxWidth(200);
		slider_Hor.setShowTickLabels(true);
		slider_Hor.setShowTickMarks(true);
		slider_Hor.setSnapToTicks(true);	//Snaps to the closest tick mark when you are in-between ticks
		slider_Hor.setMajorTickUnit(50);
		
		BorderPane bPane = new BorderPane();
		
		slider_Hor.valueProperty().addListener(ov ->{
			//Print when the mouse button is released so as to not update every millisecond 
			slider_Hor.setOnMouseReleased(e ->{
				System.out.println("Set to value: " + slider_Hor.getValue());
			});
		});
		
		bPane.setBottom(slider_Hor);
		
		Scene scene = new Scene(bPane, 500, 400);
		stage.setTitle("Slider_Test");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

