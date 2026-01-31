/**
* File: LunchBox.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Orpesa, Sean Roe
* Created on: Jan 31, 2025
* Last Modified: Jan 31, 2025
* Description: Create a class called LunchBox, and make the program stable
*/

public class LunchBox {
	private double length;
	private double width;
	private double height;
	private WaterBottle waterBottle;
	
	//Default Constructor
	public LunchBox() {
		this(10.6, 7.7, 6.33, new WaterBottle(4.0, 0.9));
	}
	//Convenience constructor
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		this.length = (length > 0)? length: 10.6;
		this.width = (width > 0)? width: 7.7;
		this.height = (height > 0)? height: 6.33;
		
		if(waterBottle.getRadius() <= 2 && waterBottle.getRadius() > 0 && waterBottle.getHeight() < (height - 2) && (waterBottle.getRadius() * 2) < (0.25 * width)) {
			this.waterBottle = waterBottle;
		}else {
			System.out.println("Error, bottle is too big");
			this.waterBottle = new WaterBottle(4.0, 0.9);
		}
		
	}
	
	//length: accessor and mutator methods
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = (length > 0)? length: 10.6;
	}
	
	//width: accessor and mutator methods
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = (width > 0)? width: 7.7;
	}
	
	//height: accessor and mutator methods
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = (height > 0)? height: 6.33;
	}
	
	//waterbottle: accessor and mutator methods
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}
	public void setWaterBottle(WaterBottle waterBottle) {		
		
		if(waterBottle.getRadius() <= 2 && waterBottle.getRadius() > 0 && waterBottle.getHeight() < (height - 2) && (waterBottle.getRadius() * 2) < (0.25 * width)) {
			this.waterBottle = waterBottle;
		}else {
			System.out.println("Error, bottle is too big");
			this.waterBottle = new WaterBottle(4.0, 0.9);
		}
	}
}
