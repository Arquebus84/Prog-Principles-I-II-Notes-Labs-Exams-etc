import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class ShapeClassesLineRectangleCircleEllipseArcPolygonAndPolyline extends Application{
	//JavaFX provides many shape classes for drawing texts, lines, rectangles, circles, ellipses, arcs, polygons, and polylines
	/**The Text class is in a separate class*/
	
	
	//Line Class
	/**
		javafx.scene.shape.Line
	-startX: DoubleProperty
	-startY: DoubleProperty
	-endX: DoubleProperty
	-endY: DoubleProperty
	+Line()
	+Line(startX: double, startY: double, endX: double, endY: double)
	 */
	
	//Rectangle
	/**
		javafx.scene.shape.Rectangle
	-x: DoubleProperty
	-y: DoubleProperty
	-width: DoubleProperty
	-height: DoubleProperty
	-arcWidth: DoubleProperty
	-arcHeight: DoubleProperty
	+Rectangle()
	+Rectangle(width: double, height: double)
	+Rectangle(x: double, y: double, width: double, height: double)
	 */
	
	//Circle and Ellipse
	/**
		javafx.scene.shape.Circle
	-centerX: DoubleProperty
	-centerY: DoubleProperty
	-radius: DoubleProperty
	+Circle()
	+Circle(x: double, y: double)
	+Circle(x: double, y: double, radius: double)
	 */
	
	/**
		javafx.scene.shape.Ellipse
	-centerX: DoubleProperty
	-centerY: DoubleProperty
	-radiusX: DoubleProperty
	-radiusY: DoubleProperty
	+Ellipse()
	+Ellipse(x: double, y: double)
	+Ellipse(x: double, y: double, radiusX: double, radiusY: double)
	 */
	
	//Arc
	/**
		javafx.scene.shape.Arc
	-centerX: DoubleProperty
	-centerY: DoubleProperty
	-radiusX: DoubleProperty
	-radiusY: DoubleProperty
	-startAngle: DoubleProperty
	-length: DoubleProperty
	-type: ObjectProperty
	+Arc()
	+Arc(x: double, y: double, radiusX: double, radiusY: double, startAngle: double, length: double)
	 */
	
	//Polygon and Polyline
	/**
		javafx.scene.shape.Polygon
	+Polygon()
	+Polygon(double... points)
	+getPoints(): ObservableList<Double>	//ArrayList
	 */
	
	/**
		javafx.scene.shape.Polyline
	+Polyline()
	+Polyline(double... points)
	+getPoints(): ObservableList<Double>	//ArrayList
	 */
	
	
	
	//Examples		
	public void start(Stage stage) {
		Rectangle rect1 = new Rectangle(200, 100);
		rect1.setFill(Color.WHITE);
		rect1.setStroke(Color.BLACK);
		
		//position x, position y, X radius, Y radius, angle of the entire arc (*counterclockwise like the unit circle), length of the arc
		Arc arc1 = new Arc(0, 0, 20, 40, 0, 180);
		arc1.setFill(Color.WHITE);
		arc1.setStroke(Color.BLUE);
		
		// each two points represent x and y (** Remember that 0, 0 is top-left corner in java)
		Polygon pgon1 = new Polygon(0, 0, 25, 0, 25, 40);	//Creating a triangle
		pgon1.setFill(Color.WHITE);
		pgon1.setStroke(Color.BLACK);
		
		/**	Octagon
		  
		  	40  _________
		  				|\	
		  			x	| \	40
		  				|  \
		  				|	\
		  				  x = sqrt((40^2) / 2)
		 */
		
															//28.28 + 40
		Polygon octagon1 = new Polygon(0,0, 40,0, 68.28,28.28, 68.28,68.28, 40,96.56, 0,96.56, -28.28,68.28, -28.28,28.28);	//Creating an Octagon
		octagon1.setFill(Color.WHITE);
		octagon1.setStroke(Color.BLACK);
		
		Line l1 = new Line();
		l1.setStartX(0);
		l1.setStartY(0);
		l1.setEndX(50);
		l1.setEndY(50);
		l1.setFill(Color.BLACK);
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.add(rect1, 0, 0);
		pane.add(arc1, 1, 0);
		pane.add(pgon1, 2, 0);
		pane.add(octagon1, 2, 1);
		pane.add(l1, 2, 2);
		
		pane.setHgap(5);
		Scene scene = new Scene(pane, 500, 400);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
