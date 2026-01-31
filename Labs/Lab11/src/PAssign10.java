/**
* File: Lab11Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Process the volume of shipping containers; if a container has a volume equal to or above 2,000 and equal to or under 7,000 cubic inches (inches 3 ) 
* 				then it can be shipped out on the next boat.
*/
public class PAssign10 {

	public static void main(String[] args) {
		//Array of length, width, and height in centimeters
		double[][] shippingContainers = {
				{47.19, 39.19, 36.50}, {59.25, 59.25, 54.50}, {47.25, 29.25, 29.50},
				{23.19, 19.20, 19.50}, {17.33, 17.33, 17.50}, {83.19, 47.25, 42.50},
				{23.33, 19.33, 19.50}, {31.25, 23.25, 23.50}, {29.33, 29.33, 24.50},
				{23.19, 23.19, 23.19}, {35.19, 35.19, 30.50}, {47.19, 44.19, 29.50},
				{40.19, 27.88, 20.00}, {59.19, 47.19, 42.50}, {47.19, 47.19, 22.50},
				{39.33, 39.33, 34.50}, {47.25, 29.25, 29.50}, {35.19, 21.19, 16.50},
				{11.33, 11.33, 11.50}, {47.19, 39.19, 29.50}, {47.19, 47.19, 42.50},
				{66.19, 29.20, 25.00}, {57.19, 41.19, 40.50}, {59.25, 59.25, 42.50},
				{71.25, 47.25, 42.50}
		};
		
		//Calculate and print the containers' volume
		printShippable(shippingContainers);
	}
	
	public static void printShippable(double[][] array) {
		//Calculate volume in inches
		final double INCHES_TO_CENTI = 0.3937007874;
		
		double volume = 0;
		
		for(int row = 0; row < array.length; row++) {
			for(int colm = 0; colm < array[row].length; colm++) {
				array[row][colm] *= INCHES_TO_CENTI;
			}
			
			//Calculate volume in inches
			volume = ((array[row][0] * array[row][1] * array[row][2]));
						
			//Find out if the volume is in range
			if(volume >= 2000 && volume <= 7000) {
				System.out.printf("Container %d (%,.2f in^3) can be shipped%n", row, volume);
			}
			volume = 0;
			
		}
	}

}
