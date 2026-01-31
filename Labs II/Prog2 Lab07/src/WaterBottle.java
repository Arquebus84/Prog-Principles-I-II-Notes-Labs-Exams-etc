/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Mar 14, 2025
* Last Modified: Mar 14, 2025
* Description: Modify this class to include an interface named Drinkable with a single method named drink(), as well as implementing 
* the interfaces: Comparable<WaterBottle> and Cloneable
*/

//Drinkable interface
interface Drinkable {
	String drink();
}

public class WaterBottle implements Comparable<WaterBottle>, Cloneable, Drinkable{
	// Parameters (updates)
	private double height;
	private double radius;
	private String color;
	private static double largestInitialVolume = 0;

	// Default Constructor
	public WaterBottle() {
		setHeight(12);		
		setRadius(2);		
		setColor("green");
		checkInitialVolume();
	}
	// Convenience Constructor 1
	public WaterBottle(double height, double radius, String color) {
		setHeight(height);
		setRadius(radius);
		
		if(color != null) {
			this.color = color;
		}else {
			this.color = "green";
		}

		checkInitialVolume();
	}
	// Convenience Constructor 2
	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		
		this.color = "green";
		checkInitialVolume();
	}
	
	// Accessor: height
	public double getHeight() {
		return height;
	}
	// Mutator: height (constraint; height > 0.0)
	public void setHeight(double height) {
		if(height >= 0.0) {
			this.height = height;
		}else {
			this.height = 12;
		}
		
	}
	
	// Accessor: radius
	public double getRadius() {
		return radius;
	}
	// Mutator: radius (constraint; radius > 0.0)
	public void setRadius(double radius) {
		if(radius >= 0.0) {
			this.radius = radius;
		}else {
			this.radius = 2;
		}
	}
	
	// Accessor: color
	public String getColor() {
		return color;
	}
	// Mutator: color (constraint; if color == null, set "green")
	public void setColor(String color) {
		if(color != null) {
			this.color = color;
		}else {
			this.color = "green";
		}
	}
	
	// Return volume
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
	
	//static Accessor: largestInitialVolume
	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	//static void: checkInitialVolume
	public void checkInitialVolume() {
		if(getVolume() > largestInitialVolume) {
			largestInitialVolume = getVolume();
		}
	}

	//return true if this WaterBottle object has the same contents as the obj
	/**CastingObjectsAndInstanceOfOperator*/
	@Override
	public boolean equals(Object obj) {
		//Check if the object is of type WaterBottle
		if(obj instanceof WaterBottle && ((WaterBottle) obj).getRadius() == this.getRadius() && ((WaterBottle) obj).getHeight() == this.getHeight()) {
			return true;
		}else {
			return false;
		}
	}

	// Print the water bottle information
	@Override
	public String toString() {
		//System.out.printf("a %s water bottle with height %.2f, radius %.2f, and volume %.2f %n", color, height, radius, getVolume());
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
	}
	
	//Define and use the interface method
	@Override
	public String drink() {
		return "";
	}
	
	//Override the compareTo() method from Comparable
	@Override
	public int compareTo(WaterBottle waterBottle) {
		if(this.getVolume() > waterBottle.getVolume()) {	//Check if current WaterBottle object's volume is bigger than other volume
			return 1;
		}else if (this.getVolume() < waterBottle.getVolume()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	//Override the clone() method from Cloneable
	@Override
	public WaterBottle clone() {
		try {
			WaterBottle water = (WaterBottle)super.clone();
			water.setColor(new String(this.getColor()));
			return water;
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
}

class StandardWaterBottle extends WaterBottle{
		
	// Default Constructor
	public StandardWaterBottle() {
		super();
	}

	// Convenience constructor
	public StandardWaterBottle(double height, double radius) {
		super(height, radius);		
	}	

	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBag instances";
	}
	
	//Define and use the interface method
	@Override
	public String drink() {
		return "Unscrew top, tilt body";
	}
}

class Thermos extends WaterBottle{
	
	//Default Constructor
	public Thermos() {
		super(4.0, 0.9);
	}
	
	//Convenience Constructor
	public Thermos(double height, double radius) {
		super(height, radius);
	}
	
	@Override
	public String toString() {
		return super.toString() +  " and is appropriate for LunchBox instances";
	}
	
	
	//Define and use the interface method
	@Override
	public String drink() {
		return "Open drink spout, tilt body";
	}
}