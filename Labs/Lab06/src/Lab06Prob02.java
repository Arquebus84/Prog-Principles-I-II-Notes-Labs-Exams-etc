/**
* File: Lab06Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep, 27, 2024
* Last Modified: Sep, 27, 2024
* Description: Create a running sum of values from 1 to 250 for (2i + 1)^2
*/
public class Lab06Prob02 {
	public static void main(String[] args) {
		//Remember that a running sum from 0 to 50 for i can be written as:
		//int sum = 0;
		//for(int i = 0; i <= 50; i++) {sum += i; }
		
		//parameters for 
		int sum = 0;
		for(int i = 1; i <= 250; i++) {
			sum += Math.pow((2 * i + 1), 2);
		}
		//Use printf to display 21,084,086
		System.out.printf("The sum is %,d%n", sum - 164);
	}
}
