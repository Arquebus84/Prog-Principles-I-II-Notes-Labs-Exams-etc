package AbstractGeometryClass;

//Look at the UML for each class

public abstract class GeometryObject {	//Includes only Rectangle underneath, but Circle is separate java file
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	//Default Constructor
	protected GeometryObject() {
		this("blue", false);
		dateCreated = new java.util.Date();
	}
	//Convenience Constructor
	protected GeometryObject(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	
	//Concrete methods
	//Accessor/Mutator: color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Concrete methods
	//Accessor/Mutator: filled
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//Concrete methods
	//Accessor: dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	//Concrete methods
	//Print object
	@Override
	public String toString() {
		return String.format("Object is colored %s %nIs filled: %b", getColor(), isFilled());
	}
	
	//Abstract methods
	/**The getArea() and getPerimeter() methods are defined in the subclasses*/
	//Abstract method getArea()
	public abstract double getArea();
	//Abstract method getPerimeter()
	public abstract double getPerimeter();
}

class Rectangle extends GeometryObject{
	private double width;
	private double height;
	
	public Rectangle() {
		this(2, 1);
	}
	
	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	
	//Accessor and Mutator: width
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	//Accessor and Mutator: height
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//Return the area
	public double getArea() {
		return width * height;
	}
	//Return the perimeter
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
}