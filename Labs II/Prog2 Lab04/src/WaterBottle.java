/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Orpesa, Sean Roe
* Created on: Feb 14, 2025
* Last Modified: Feb 14, 2025
* Description: Modify WaterBottle class by including a new class called LunchBagWaterBottle (subclass of WaterBottle), 
				and update it to OOP standards.
*/

public class WaterBottle {
	// Parameters (updates)
	private double height;
	private double radius;
	private String color;
	private static double largestInitialVolume = 0;

	// Default Constructor
	public WaterBottle() {
		setHeight(12);		//For part 2 set it to 4
		setRadius(2);		//For part 2 set it to 0.9
		setColor("green");
		checkInitialVolume();
	}
	// Convenience Constructor 1
	public WaterBottle(double height, double radius, String color) {
		if(height >= 0.0) {
			this.height = height;
		}else {
			this.height = 12;
		}		
		if(radius >= 0.0) {
			this.radius = radius;
		}else {
			this.radius = 2;
		}		
		if(color != null) {
			this.color = color;
		}else {
			this.color = "green";
		}

		checkInitialVolume();
	}
	// Convenience Constructor 2
	public WaterBottle(double height, double radius) {
		if(height >= 0.0) {
			this.height = height;
		}else {
			this.height = 12;
		}
		if(radius >= 0.0) {
			this.radius = radius;
		}else {
			this.radius = 2;
		}		
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

	// Print the water bottle information
	public String getInfo() {
		//System.out.printf("a %s water bottle with height %.2f, radius %.2f, and volume %.2f %n", color, height, radius, getVolume());
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
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
	public String getInfo() {
		return super.getInfo() + " and is appropriate for LunchBag instances";
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
	public String getInfo() {
		return super.getInfo() +  " and is appropriate for LunchBox instances";
	}
	
}
