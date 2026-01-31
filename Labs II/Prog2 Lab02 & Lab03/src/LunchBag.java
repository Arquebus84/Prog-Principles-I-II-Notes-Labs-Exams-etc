/**
* File: LunchBag.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Orpesa, Sean Roe
* Created on: Jan 31, 2025
* Last Modified: Jan 31, 2025
* Description: Create a class called LunchBag, and make the program stable
*/
public class LunchBag {

	private double length;
	private double width;
	private double height;
	private WaterBottle waterBottle;
	
	//Default Constructor
	public LunchBag() {
		this(11.2, 6.1, 7.9, new WaterBottle());
	}
	//Convenience constructor
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		this.length = (length > 0)? length: 11.2;
		this.width = (width > 0)? width: 6.1;
		this.height = (height > 0)? height: 7.9;
		
		if(waterBottle.getRadius() <= 2 && waterBottle.getRadius() > 0) {
			this.waterBottle = waterBottle;
		}else {
			System.out.println("Error, bottle is too big");
			this.waterBottle = new WaterBottle();
		}
		
	}
	
	//length: accessor and mutator methods
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = (length > 0)? length: 11.2;
	}
	
	//width: accessor and mutator methods
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = (width > 0)? width: 6.1;
	}
	
	//height: accessor and mutator methods
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = (height > 0)? height: 7.9;
	}
	
	//waterbottle: accessor and mutator methods
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}
	public void setWaterBottle(WaterBottle waterBottle) {		
		
		if(waterBottle.getRadius() <= 2 && waterBottle.getRadius() > 0) {
			this.waterBottle = waterBottle;
		}else {
			System.out.println("Error, bottle is too big");
			this.waterBottle = new WaterBottle();
		}
	}
	
}
