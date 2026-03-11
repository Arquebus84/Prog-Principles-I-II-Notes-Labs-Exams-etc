//import javafx.collections.*;
import javafx.geometry.*;

public class JavaFXTest {
	/*
		javafx.geometry.Point2D
	+Point2D(x: double, y: double)			//Constructs a new Point2D object with specific points at x and y (ex: Point2D p1 = new Point2D(x, y))
	+distance(x: double, y: double): double	//Returns the distance between this point (p1) and the specified x and y coordinates (ex: p1.distance(x, y))
	+distance(p: Point2D): double			//Returns the distance between this point (p1) and the other point (ex: p1.distance(p2))
	+getX(): double							//Returns x-coordinate at the point (ex: p1.getX())
	+getY(): double							//Returns y-coordinate at the point (ex: p1.getY())
	+midpoint(p: Point2D): Point2D			//Returns the midpoint between this point and the other point (ex: p1.midpoint(p2))
	+toString(): String	
	 */
	
	public static void main(String[] args) {
		Point2D p1 = new Point2D(0.1, 2.3);
		
		System.out.printf("%.2f", p1.distance(2.8, 3.5));
	}
}
