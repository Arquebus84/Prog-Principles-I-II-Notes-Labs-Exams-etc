package ArrayOfObjectsTest;

public class Circle {

	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}	
}
