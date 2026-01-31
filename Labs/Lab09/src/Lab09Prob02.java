/**
* File: Lab09Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 1, 2024
* Last Modified: Nov 1, 2024
* Description: With an array of 10 doubles, print them with a for-loop
*/
//import gsu.Math;
public class Lab09Prob02 {
	
	public static void main(String[] args) {
		//Array of doubles
		double[] dList = { -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};
		//Find the maximum value
		double maxValue = dList[0];
		//Max index value
		int maxIndex = 0;
		
		//Loop throughout the array
		for(int i = 0; i < dList.length; i++) {
			System.out.printf("Index %d of 9: %.5f%n", i, dList[i]);
			
			//Find the maximum value by checking if the element is greater than the previous element
			if(dList[i] > maxValue) {
				maxValue = dList[i];
				maxIndex = i;
			}
		}
		//Display
		System.out.printf("\nMaximum Value: %.5f at index %d\n", maxValue, maxIndex);
	
	
	}
	
}
