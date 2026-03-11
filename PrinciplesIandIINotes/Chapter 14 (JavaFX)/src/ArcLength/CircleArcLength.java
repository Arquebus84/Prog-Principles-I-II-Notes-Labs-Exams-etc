package ArcLength;

public class CircleArcLength {

	public static void main(String[] args) {
		//Get the distance from arc length: a = theta/(2*PI) * 2 * PI * r
		
		//Arc Length from PI/2 to 5PI/6
		Circle c = new Circle(1);
		double theta = Math.PI / 3; //(5 * Math.PI / 6) - (Math.PI / 2);
		double arcL = (theta / (2 * Math.PI)) * c.getCircumference();
		
		System.out.printf("%.4f", arcL);
	}

}


class Circle{
	
	double radius;
	
	public Circle() {
		this(1);
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	double getCircumference() {
		return Math.PI * 2 * radius;
	}
}