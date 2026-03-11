package SubAndSuperClassEx;

	//This class inherits the GeometryObject class
public class Circle extends GeometryObject{
	
	private double radius;
	
	public Circle(){
		this(1.0);	//Default set radius to 1
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}

	//Mutator and Accessor: Radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Get Area
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	//Get Diameter
	public double getDiameter() {
		return 2 * radius;
	}
	
	//Get Perimeter
	public double getPerimeter() {
		return (2 * Math.PI * radius);
	}
	
	//Modification: overriding method
	@Override
	public String toString() {
		return super.toString() + "Radius: " + getRadius();	//This will display both the creation date in GeometryObject, as well
															//	as the radius from the Circle class
	}
	
}
