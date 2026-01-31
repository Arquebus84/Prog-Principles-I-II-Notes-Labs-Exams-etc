/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Matteo, Sean, Naomi
* Created on: Jan 17, 2025
* Last Modified: Jan 17, 2025
* Description: Create a class called WaterBottle
*/

public class WaterBottle {

	// Parameters
	double height;
	double radius;
	String color;
	double volume;

	// Default Constructor
	public WaterBottle() {
		height = 12;
		radius = 2;
		color = "green";
	}

	// Convenience Constructor
	public WaterBottle(double height, double radius, String color) {
		this.height = height;
		this.radius = radius;
		this.color = color;
	}
	
	//Return volume
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}

	//Print the water bottle information
	public String getInfo() {
		//System.out.printf("a %s water bottle with height %.2f, radius %.2f, and volume %.2f %n", color, height, radius, getVolume());
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
	}
}