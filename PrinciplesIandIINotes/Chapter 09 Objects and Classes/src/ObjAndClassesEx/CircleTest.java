package ObjAndClassesEx;

public class CircleTest {
	
	public static void main(String[] args) {
		
		/**If you compile CircleTest, the Java compiler automatically compiles the Circle.java if it has not been compiled since the last change*/
				
		//The variable radius is defined here:
		//These three objects represent Circle, that were all defined using the single Circle.java (single Circle class)
		Circle c0 = new Circle();
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(25);
		Circle c3 = new Circle(125);
		Circle c4 = new Circle();		//In this reference object, c4 will directly set its radius.
		c4.radius = 20;	//**In this case, the radius object in the Circle class is not private, therefore, it can be modified; more on this
						//		in the DataFieldEncapsulation notes
		
		Circle[] circles = new Circle[5];
		circles[0] = new Circle(10);
		
		//NOTE: Originally, in the Circle class, the radius data field was private, however, if we want to print the radius from each of the new circles,
		//			we do not want to set it private, but either leave it as: double radius or public double radius
		
		//Calculate the area of circle 1 with radius 1, by using the getArea() method from the Circle class
		System.out.printf("Circle 0 has a radius of %.1f and an area of %.3f%n", c0.radius, c0.getArea());
		System.out.printf("Circle 1 has a radius of %.1f and an area of %.3f%n", c1.radius, c1.getArea());
		System.out.printf("Circle 2 has a radius of %.1f and an area of %.3f%n", c2.radius, c2.getArea());
		System.out.printf("Circle 3 has a radius of %.1f and an area of %.3f%n", c3.radius, c3.getArea());
		System.out.printf("Circle 4 has a radius of %.1f and an area of %.3f%n", c4.radius, c4.getArea());
		
	}
}
