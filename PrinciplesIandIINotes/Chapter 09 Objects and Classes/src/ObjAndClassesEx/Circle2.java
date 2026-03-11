package ObjAndClassesEx;

public class Circle2 {

	double radius;
	
	//Each object gets its own radius, but the numberOfObjects is shared by all objects of the class (there is only one copy no matter how many objects 
	//	we have created)
	static int numberOfObjects = 0;
	
	//Default constructor (no-arg constructor)
	Circle2(){
		radius = 1.0;
		numberOfObjects++;
	}
	
	//Constructor with one argument
	Circle2(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	//Static method that returns the numberOfObjects
	//The getNumberOfObjects is a static method (all methods in the Math class are static)
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//The reason why the getArea method is not static is because it requires the radius from the object in order to be calculated
	//In other words, it is called an *Instance method
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		//The number of objects will be zero because we didn't create any new objects
		/**Could also replace Circle2.getNumberOfObjects() with Circle2.numberOfObjects*/
		System.out.println("Number of Objects: " + Circle2.getNumberOfObjects());
		
		System.out.println("\nCreating an object...");
		Circle2 circleA = new Circle2(2);
		System.out.printf("CircleA has a radius of %.1f and an area of %.2f", circleA.radius, circleA.getArea());
		
		System.out.println("\nCreating another object...");
		Circle2 circleB = new Circle2(5);
		System.out.printf("CircleB has a radius of %.1f and an area of %.2f", circleB.radius, circleB.getArea());
		System.out.println("\nNumber of Objects: " + Circle2.getNumberOfObjects());
		
		System.out.println("\nCreating final object...");
		Circle2 circleC = new Circle2();
		System.out.printf("CircleC has a radius of %.1f and an area of %.2f", circleC.radius, circleC.getArea());
		//System.out.println("\nNumber of Objects: " + circleC.getNumberOfObjects()); //Notice how there is circleC instead of Circle2**
		System.out.println("\nNumber of Objects: " + Circle2.getNumberOfObjects()); //This has Circle2
	}
}
