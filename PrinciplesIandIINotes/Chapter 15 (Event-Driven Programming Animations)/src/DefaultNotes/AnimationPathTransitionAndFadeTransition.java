package DefaultNotes;

import javafx.application.Application;
//import javafx.geometry.Pos;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.animation.*;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationPathTransitionAndFadeTransition extends Application{
	//JavaFX provide the Animation class with the core functionality for all the animations
	
	/**
			The abstract Animation class is the root class for javafx animations
			
			javafx.animation.Animation
		-autoReverse: BooleanProperty						//Lets the Animation object alternate its direction automatically
		-cycleCount: IntegerProperty
		-rate: DoubleProperty								//Defines the speed and direction of the animation
		-status: ReadOnlyObjectProperty <Animation.Status>
		+pause(): void
		+play(): void
		+stop(): void
	 */
	
	
	
	
	//PathTransition class animates the moves of a node along a path from one end to the other over a given time.
	
	/**NOTE: the getter and setter methods were omitted

			javafx.animation.PathTransition
		-duration: ObjectProperty<Duration>
		-node: ObjectProperty<Node>
		-orientation: ObjectProperty <PathTransition.OrientationType>
		-path: ObjectType<Shape>
		+PathTransition()
		+PathTransition(duration: Duration, path: Shape)
		+PathTransition(duration: Duration, path: Shape, node: Node)
	 */
	/*The Duration class defines a duration in time; it's an immutable class. ***Not a subclass of Animation
	 	* Defines constants to represent indefinite duration:
			- INDEFINITE
			- ONE
			- UNKNOWN
			- ZERO
		* Use Duration(double millis) method to create an instance of Duration
		* Use the add, subtract, multiply, and divide methods to perform arithmetic operations
		* Use the toHours(), toMinutes(), toSeconds(), and toMillis() to return the number of hours, minutes, seconds, and milliseconds
		* 
		*** EX: 
		 	-Use the static method millis to set the duration of PathTransition object obj to one second:
		 			obj.setDuration(Duration.millis(1000));
		
		***Timeline is a subclass of Animation, and is used primarily as the Duration; more on this in Timeline class***
	*/
	
	//FadeTransition class
	/*
		The FadeTransition class animates the change of the opacity in a node over a given time. It's a subclass of Animation
	 */	
	/**
			javafx.animation.FadeTransition
		-duration: ObjectProperty<Duration>
		-node: ObjectProperty<Node>
		-fromValue: DoubleProperty
		-toValue: DoubleProperty
		-byValue: DoubleProperty
		+FadeTransition()
		+FadeTransition(duration: Duration)
		+FadeTransition(duration: Duration, node: Node)
	 */
	//The opacity ranges from 0.0 to 1.0
	
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) {
		
		//Using GridPane to visualize where both of the Nodes are at in the Pane (Both are in the same box)
		Pane pane = new Pane();		
		
		//Fix this image (Use the File class to find the location, then convert it using file.toURI().toURL().toString() in the imgView)
		Image img = new Image("data:image/png;base64,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");
		ImageView imgView = new ImageView(img);
		imgView.setScaleX(0.2);
		imgView.setScaleY(0.2);
						
		//Using Shape: Arc(x: double, y: double, radiusX: double, radiusY: double, startAngle: double, length: double)
		Arc arc = new Arc(0, 0, 100, 100, 270, 180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);
		
		pane.getChildren().add(arc);
		pane.getChildren().add(imgView);
		
		/**Align the arc to fit the center of the box in Pane*/
		arc.setCenterX(200);
		arc.setCenterY(200);
						
		/**Align the ImageView so that it is positioned to where the arc begins*/
//		imgView.setX(arc.getRadiusX());
//		imgView.setY(arc.getRadiusY());
		
		
		/**Setting up the animation*/
		//Animation1
		//Set the path transition (do it in this order: everything else, then play)
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(2000));	//Can also set the duration in the constructor
		pt.setPath(arc);
		pt.setNode(imgView);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);		
		/**Everything else must be before play() method in order to work recursively*/
		pt.play();
		
		
		/**Experiment: Make the image fade and reappear*/
		FadeTransition ft = new FadeTransition();
		ft.setDuration(Duration.millis(5000));
		ft.setNode(imgView);
		ft.setFromValue(1);
		ft.setToValue(0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);	//After it faded out for 5 seconds, fade in for 5 seconds
		
		ft.play();
				
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Animation_Test");
		primaryStage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
