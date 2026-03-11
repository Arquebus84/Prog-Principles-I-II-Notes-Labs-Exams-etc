package DataFieldEncapsulationTest;

public class Circle3Test {

	public static void main(String[] args) {
		//New circle with radius 5.0
		Circle3 myCircle = new Circle3(5.0);
		System.out.println("Circle of radius " + myCircle.getRadius() + " has an area of " + myCircle.getArea());
		
		//Increment the myCircle object by 10% (multiply by 1 + .10)
		/**invoke the setRadius method to change the radius of the current circle object*/
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("Circle of radius " + myCircle.getRadius() + " has an area of " + myCircle.getArea());
		System.out.println("The number of objects created is " + Circle3.getNumberOfObj());
		
	}

}
