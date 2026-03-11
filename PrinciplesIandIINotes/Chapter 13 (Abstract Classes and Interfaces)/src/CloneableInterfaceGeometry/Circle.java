package CloneableInterfaceGeometry;

public class Circle extends GeometryObject implements Cloneable{
	private double radius;
	
	//Default constructor
	public Circle() {
		this(1.0);
	}
	//Convenience constructors
	public Circle(double radius) {
		this(radius, "blue", false);
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		setRadius(radius);
	}
	
	//Accessor and Mutator: radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Calculate the diameter:
	public double getDiameter() {
		return 2 * radius;
	}
	
	//getArea and getPerimeter (the circumference)
	public double getArea() {
		return (radius * radius) * Math.PI;
	}
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}
	
	@Override
	public Object clone() {
		return true;
	}
}