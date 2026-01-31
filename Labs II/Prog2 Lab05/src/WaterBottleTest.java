/**
* File: WaterBottleTest.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Orpesa, Sean Roe
* Created on: Feb 21, 2025
* Last Modified: Feb 21, 2025
* Description: Using the ArrayList object type, create an ArrayList in the WaterBottleTest class to display each WaterBottle type; as well 
* 				as the total volume, the maximum volume, and the minimum volume.
*/

import java.util.*;
public class WaterBottleTest {
	
	public static void main(String[] args) {
		
		/*WaterBottle w1 = new WaterBottle(2, 2.4);
		WaterBottle w2 = new WaterBottle(2, 2.6);
		
		WaterBottle w3 = new Thermos(2, 2.4);
		StandardWaterBottle w4 = new StandardWaterBottle(2, 2.4);
		
		System.out.println(w1.equals(w2));
		System.out.println(w1.equals(w3));
		System.out.println(w3.equals(w4));*/
		
		ArrayList<WaterBottle> waterBottles = new ArrayList<>();
		waterBottles.add(new WaterBottle());
		waterBottles.add(new StandardWaterBottle());
		waterBottles.add(new Thermos());
		waterBottles.add(new StandardWaterBottle(10, 0.7));
		waterBottles.add(new Thermos(5, 0.5));
		
		//Calculate totalVolume, max, and min
		double totalVolume = 0;
		double max = waterBottles.get(0).getVolume();
		double min = waterBottles.get(0).getVolume();
		
		System.out.printf("Number of bottles: %d%n", waterBottles.size());
		for(int i = 0; i < waterBottles.size(); i++) {
			System.out.printf("%s%n", waterBottles.get(i));
			
			//Calculate total volume
			totalVolume += waterBottles.get(i).getVolume();
			
			//Calculate max and min
			if(max < waterBottles.get(i).getVolume()) {
				max = waterBottles.get(i).getVolume();
			}else {
				min = waterBottles.get(i).getVolume();
			}
		}
		//Display total volume
		System.out.printf("Total volume: %.4f%n", totalVolume);
		
		//Display the maximum and minimum volume
		System.out.printf("Max volume: %.4f%n", max);
		System.out.printf("Min volume: %.4f%n", min);
		
	}
	
	
	
	
}
