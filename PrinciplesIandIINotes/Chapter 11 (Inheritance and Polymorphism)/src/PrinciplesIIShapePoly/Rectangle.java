package PrinciplesIIShapePoly;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle() {
		this(1.0, 1.0);
	}
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);		
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
}
