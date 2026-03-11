package PassingObjectsTest;

public class Circle {
	
	private double radius;
	private static int numberOfObj;
	
	public Circle() {
		radius = 1;
		numberOfObj++;
	}
	public Circle(double newRad) {
		radius = newRad;
		numberOfObj++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public static int getNumberOfObj() {
		return numberOfObj;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	/*
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		c1.setRadius(2);
		
		System.out.println("C1 has radius of " + c1.getRadius() + ", and the number of objects created is " + Circle.getNumberOfObj());
		System.out.println("C2 has radius of " + c2.getRadius() + ", and the number of objects created is " + Circle.getNumberOfObj());
	}*/
	
	
}
