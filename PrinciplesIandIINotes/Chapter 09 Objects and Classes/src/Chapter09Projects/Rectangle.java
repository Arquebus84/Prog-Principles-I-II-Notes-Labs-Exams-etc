package Chapter09Projects;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		width = 1;
		height = 2;
	}
	
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter(double w, double h) {
		return (w * 2) + (h * 2);
	}
}
