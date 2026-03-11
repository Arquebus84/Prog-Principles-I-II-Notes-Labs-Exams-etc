package SubAndSuperClassEx;

public class GeometryTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle(3.0, "Green", false);
		
		Rectangle rect1 = new Rectangle(2, 4.5, "Blue", true);
		
		//System.out.println("Circle 1: \n" + circle1.toString() + "Radius: " + circle1.getRadius() + "\nDiameter: " + 
				//circle1.getDiameter() + "\nArea: " + circle1.getArea() + "\n");
		System.out.println("Circle 1: \n" + circle1.toString() + "\n");
		System.out.println("Rectangle 1: " + rect1.toString() + "Area: " + rect1.getArea());

	}
}
