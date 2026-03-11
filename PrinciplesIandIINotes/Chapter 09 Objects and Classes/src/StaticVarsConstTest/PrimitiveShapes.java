package StaticVarsConstTest;

public class PrimitiveShapes {
	
	public static void main(String args[]) {
		Circle c = new Circle(10);
		System.out.println(c.getRadius());
		
		Circle circleA = Circle.newCircle(c);
		
		System.out.println(circleA.getRadius());
		System.out.println(c.getRadius());
	}
}

class Circle{
	
	private double radius;
	private static int numOfCircles;
	
	public Circle(){
		this(1.0);			//The *this will refer to the constructor of the same name, but with the arguments
		numOfCircles++;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static int totalCircles() {
		return numOfCircles;
	}
	
	public static Circle newCircle(Circle c) {
		c = new Circle();
		return c;
	}
}

class Rectangle{
	
	private double height;
	private double length;
	private static int numOfRectangles;
	
	public Rectangle() {
		this(1.0, 2.0);
		numOfRectangles++;
	}
	
	public Rectangle(double height, double length) {
		this.height = height;
		this.length = length;
		numOfRectangles++;
	}
	
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height = height;
	}
	
	public double getlength() {
		return length;
	}
	public void setlength(double length) {
		this.length = length;
	}
	
	public static int totalRectangles() {
		return numOfRectangles;
	}
	
}

