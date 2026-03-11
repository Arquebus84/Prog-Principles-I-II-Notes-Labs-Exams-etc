
public class ThethisReference {
	//The keyword this refers to the calling object. It can also be used inside a constructor to invoke another constructor of the same class.
	
	/**	'this' keyword: Refers to the object itself*/
	
	public static void main(String[] args) {
		CircleThis c1 = new CircleThis(2);
		
		System.out.println(c1.getRadius());
		System.out.println(c1.toString());
		System.out.println(c1.toString2());
		
		c1.setNumOfObj(2);
		System.out.println("\nObjects: " + c1.getNumOfObj());
		
		ThisExample e1 = new ThisExample();
		System.out.println("\nThisExample has a radius of " + e1.getRadius());
		
		c1.getClass();
		
	}
	
	//You can also use this to invoke a constructor (see at bottom of class ThisExample)
	/**NOTE: Java requires that the "this(argument-list)" statement appears first in the constructor before any other executable statements*/
}

//This class also uses this to reference data fields (see very bottom of the class CircleThis)
class CircleThis{
	private double radius;
	private static int numOfObjects;
	
	public CircleThis() {
		radius = 1;
		numOfObjects++;
	}
	
	public CircleThis(double radius) {
		/**You can use the this keyword to reference the object's instance members in the class*/
		this.radius = radius;	//This refers to data field radius in this object
	}
	
	public double getRadius() {
		return radius;
	}
	//There is no need for this method to be a public static modifier since numOfObjects are already part of the class
	public int getNumOfObj() {
		return numOfObjects;
	}
	
	//These two methods use the keyword explicitly
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}	
	public String toString() {
		return "\nRadius is " + this.radius + "\nArea is " + this.getArea();
	}
	
	//These two methods however use the keyword implicitly
	public double getArea2() {
		return radius * radius * Math.PI;
	}
	public String toString2() {
		return "\nRadius: " + radius + "\nArea: " + getArea();
	}
	
	//Reference data field (numOfObjects)
	
	/**Invoking CircleThis.setNumOfObj(3) is to execute CircleThis.numOfObjects = 3. setNumOfObj is a static method*/
	public void setNumOfObj(int numOfObj) {
		CircleThis.numOfObjects = numOfObj;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		/**CircleThis.radius = radius;	This cannot be done since it's a syntax error*/
	}	
}

/**The this(1.0) in the second constructor involves the first constructor with a double value argument*/
class ThisExample{
	private double radius;
	
	public ThisExample(double radius) {
		this.radius = radius;
	}
	
	public ThisExample() {
		this(1.0);
	}
	
	public double getRadius() {
		return radius;
	}
	
}