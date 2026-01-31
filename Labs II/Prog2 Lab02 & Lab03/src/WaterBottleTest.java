/**
* File: WaterBottleTest.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Orpesa, Sean Roe
* Created on: Jan 24, 2025
* Last Modified: Jan 24, 2025
* Description: Test the WaterBottle class
*/
public class WaterBottleTest {

	public static void main(String[] args) {
		WaterBottle bottles[] = new WaterBottle[5];
		
		for(int i = 0; i < bottles.length; i++) {
			bottles[i] = new WaterBottle();
		}
		
		bottles[0].setColor("blue");
		bottles[0].setHeight(17);
		
		bottles[2].setRadius(0);
		bottles[2].setHeight(14);
		
		bottles[4].setRadius(3);
		bottles[4].setColor(null);
				
		for(int i = 0; i < bottles.length; i++) {
			System.out.println(bottles[i].getInfo());
		}
		System.out.println(WaterBottle.getLargestInitialVolume());
	}

}
