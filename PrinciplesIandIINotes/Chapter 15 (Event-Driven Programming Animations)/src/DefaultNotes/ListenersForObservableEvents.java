package DefaultNotes;

//import javafx.beans.property.DoubleProperty;
//import javafx.beans.property.SimpleDoubleProperty;

import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ListenersForObservableEvents extends Application{
	//You can add a listener to process a value change in an observable object
	Circle c1;
	FlowPane pane;
	//Example 1: add a listener to change the size of the circle when the window size changes
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		c1 = new Circle(25);
		pane = new FlowPane();
		
		pane.getChildren().add(c1);
		pane.setAlignment(Pos.CENTER);
		
		/** Test 1
		//Align the circle with the height of the window
		pane.heightProperty().addListener(e ->{ //Just for test, use the heightProperty of the pane 
			c1.setRadius(pane.getHeight() / 2); //Divide by 2 to show the circle 
		});*/
		 
		
		pane.widthProperty().addListener(e ->{
			resize();
		});
		pane.heightProperty().addListener(e ->{
			resize();
		});
		
		Scene scene = new Scene(pane, 300, 200);
		stage.setScene(scene);
		stage.show();
	}
	
	public void resize() {
		double length = Math.min(pane.getHeight(), pane.getWidth());
		
		c1.setRadius(length / 2);
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
		//This example below changes the DoubleProperty balance to 6.5
		
//		DoubleProperty balance = new SimpleDoubleProperty();
//		
//		balance.addListener(ov -> 
//	      System.out.println(2 + balance.doubleValue()));
//	    
//	    balance.set(4.5);
	}
}
