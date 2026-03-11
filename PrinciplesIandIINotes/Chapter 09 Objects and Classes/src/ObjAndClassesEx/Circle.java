package ObjAndClassesEx;

public class Circle {
	//**This class is tested in CircleTest class

	//Private constructor: private double radius, but now its set to default b/c we can obtain the radius in the CircleTest (Ex: c1.radius)
	double radius;//This is a member variable (any object that we create has a copy of this variable, meaning that we can create as many objects as we 
	//	want, and they have their own radius (value for this variable)).
		
	//Public constructor
	public Circle() {
		radius = 0;
	}
	//Construct of a circle object
	public Circle(double newRadius) {
		//The 'this' keyword that we return, refers to the particular object that we're operating on now
		this.radius = newRadius;
	}
	
	double getArea() {
		return (Math.PI * radius * radius);
	}
	
	//Circumference
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	//We need to update the radius of the circle, so this method is used as a setter for the radius
	public void getRadius(double newRadius) {
		this.radius = newRadius;
	}
	
}
