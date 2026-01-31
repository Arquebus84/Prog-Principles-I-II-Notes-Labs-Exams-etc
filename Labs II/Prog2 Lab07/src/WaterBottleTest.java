/**
* File: WaterBottleTest.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe, Carter Kidd
* Created on: Mar 14, 2025
* Last Modified: Mar 14, 2025
* Description: Create 5 WaterBottle objects and instantiate them for:
* 					* StandardWaterBottle
* 						- 10H and 0.7R
* 						- 1 default
* 					* Thermos
* 						- 5H and 0.5R
* 						- 1 default
*  						- 6H and 0.4R
*/
import java.util.ArrayList;

public class WaterBottleTest {
	
	public static void main(String[] args) {
		
		ArrayList<WaterBottle> waterBottles = new ArrayList<>();
		waterBottles.add(new StandardWaterBottle(10, 0.7));
		waterBottles.add(new StandardWaterBottle());

		waterBottles.add(new Thermos(5, 0.5));
		waterBottles.add(new Thermos());
		waterBottles.add(new Thermos(6, 0.4));

//		WaterBottle a = waterBottles.get(0).clone();
//		a.setColor("Blue");
//		System.out.println(a.toString() + "\n");

		for (int i = 0; i < waterBottles.size(); i++) {
			System.out.printf("%s%n", waterBottles.get(i));
		}

		// Sort the WaterBottle ArrayList
		System.out.println("\nSorted: ");
		java.util.Collections.sort(waterBottles);

		for (int i = 0; i < waterBottles.size(); i++) {
			System.out.printf("%s%n", waterBottles.get(i));
		}
		//Display the maximum and minimum volume
		System.out.printf("%nLargest: %s%n", java.util.Collections.max(waterBottles).toString());
		System.out.printf("%nSmallest: %s%n", java.util.Collections.min(waterBottles).toString());
	}
}