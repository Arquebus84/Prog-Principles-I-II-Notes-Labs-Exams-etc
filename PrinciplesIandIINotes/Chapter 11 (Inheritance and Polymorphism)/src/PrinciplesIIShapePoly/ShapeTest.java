package PrinciplesIIShapePoly;

public class ShapeTest {
	public static void main(String[] args) {
		// create a Shape
		//Shape myShape = new Shape();
		//System.out.println(myShape.toString());
		
		// create a Triangle
		Triangle myTriangle = new Triangle();
		System.out.println("Number of Sides: " + myTriangle.getNumOfSides() + "\n" + myTriangle.toString());
	}
}
