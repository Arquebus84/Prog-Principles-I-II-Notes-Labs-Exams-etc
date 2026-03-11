package AbstractGeometryClass;

public class TestGeometry {

	public static void main(String[] args) {
		GeometryObject geoObj1 = new Circle(4);
		GeometryObject geoObj2 = new Rectangle(2, 5);
		
		geoObj1.setColor("green");
		geoObj2.setFilled(true);
		
		System.out.println("The two objects are equal: " + isEqual(geoObj1, geoObj2));
		
		displayObject(geoObj1);
		displayObject(geoObj2);
	}
	
	public static boolean isEqual(Object obj1, Object obj2) {
		return (GeometryObject)obj1 == (GeometryObject)obj2;
	}

	public static void displayObject(GeometryObject obj) {
		System.out.printf("%nThe area is %.2f %nThe perimeter is %.2f%n", obj.getArea(), obj.getPerimeter());
	}
}
