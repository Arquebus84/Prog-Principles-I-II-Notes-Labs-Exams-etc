package SubAndSuperClassEx;

	//This class inherits the GeometryObject class
public class Rectangle extends GeometryObject{

	private double length;
	private double width;
	
	public Rectangle() {
		this(1, 1);	//Default: set both values to 1
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(double length, double width, String color, boolean filled) {
		//Use super* keyword to reference the superclass' constructor
		super(color, filled);
		
		this.length = length;
		this.width = width;
	}

	//Mutator and Accessor: Length
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	//Mutator and Accessor: Width
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	//Return Area
	public double getArea() {
		return (length * width);
	}
	
	//Return Perimeter
	public double getPerimeter() {
		return ((2 * length) + (2 * width));
	}
	
}
