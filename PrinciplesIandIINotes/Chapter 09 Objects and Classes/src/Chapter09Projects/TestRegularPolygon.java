package Chapter09Projects;

	//An n-sided regular polygon’s sides all have the same length and all of its angles have the same degree (i.e., the 
	//	polygon is both equilateral and equiangular)

//Use this class to reference the RegularPolygon class
public class TestRegularPolygon{	
	
	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6, 4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("p1 perimeter: " + p1.getPerimeter() + "\np1 area: " + p1.getArea());
		System.out.println("p2 perimeter: " + p2.getPerimeter() + "\np2 area: " + p2.getArea());
		System.out.println("p3 perimeter: " + p3.getPerimeter() + "\np3 area: " + p3.getArea());
	}
	
}

//The actual class for the regular polygon
class RegularPolygon {
	
	private int n;	//the int data field n defines the number of sides of the polygon
	private double side;	//stores the length of each side
	private double x;	//defines the x-coordinate of the center of the polygon with default value 0
	private double y;	//defines the y-coordinate of the center of the polygon with default value 0
	
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//returns the perimeter of the polygon
	public double getPerimeter() {
		return side * n;
	}
	
	//returns the area of the polygon. The formula for computing the area of a regular polygon is area = (n*side^2) / (4*tan(PI/n))
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
	
}

