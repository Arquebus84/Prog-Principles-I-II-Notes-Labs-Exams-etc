package DataFieldEncapsulationTest;

public class Circle3 {

	private double radius = 1;
	
	private static int numberOfObj = 0;
	
	//Construct a circle with radius 1
	public Circle3() {
		numberOfObj++;
	}
	
	//Construct a circle with a specified radius
	public Circle3(double newRadius) {
		radius = newRadius;
		numberOfObj++;
	}
	
	//Return the object's radius
	public double getRadius() {	//**Getter method (Accessor method)
		return radius;
	}
	
	//Set new radius (if it's negative return a positive modification)
	public void setRadius(double newRadius) {	//**Setter method (Mutilator method)
		radius = ((newRadius >= 0)? newRadius : (newRadius * -1));
	}
	
	//Return the number of objects
	public static int getNumberOfObj() {
		return numberOfObj;
	}
	
	//Return the area of the circle object
	public double getArea() {
		return (Math.pow(radius,  2) * Math.PI);
	}
	
	
	
}
