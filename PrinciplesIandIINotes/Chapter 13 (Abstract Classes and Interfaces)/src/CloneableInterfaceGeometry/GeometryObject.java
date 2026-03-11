package CloneableInterfaceGeometry;

public abstract class GeometryObject {
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
