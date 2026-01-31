/**
* File: WaterBottleTest.java
* Class: CSCI 1302
* Author: Matteo, Sean, Naomi
* Created on: Jan 17, 2025
* Last Modified: Jan 17, 2025
* Description: Create a class called WaterBottleTest to create objects referencing the WaterBottle class
*/

public class WaterBottleTest {
	
	public static void main(String[] args) {
		// Water bottle objects
		WaterBottle waterBottle1 = new WaterBottle();
		WaterBottle waterBottle2 = new WaterBottle(9.5, 1.5, "green");
		WaterBottle waterBottle3 = new WaterBottle(10, 2.5, "blue");

		// Display
		
		//For problem 2
		/*System.out.printf("a " + waterBottle1.color + " water bottle with height %.2f and radius %.2f%n",
				waterBottle1.height, waterBottle1.radius);
		System.out.printf("a " + waterBottle2.color + " water bottle with height %.2f and radius %.2f%n",
				waterBottle2.height, waterBottle2.radius);
		System.out.printf("a " + waterBottle3.color + " water bottle with height %.2f and radius %.2f%n",
				waterBottle3.height, waterBottle3.radius);*/
		
		//For problem 3
		System.out.println(waterBottle1.getInfo());
		System.out.println(waterBottle2.getInfo());
		System.out.println(waterBottle3.getInfo());
	}
}