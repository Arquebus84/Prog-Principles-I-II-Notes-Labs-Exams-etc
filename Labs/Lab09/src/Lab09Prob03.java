/**
* File: Lab09Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 1, 2024
* Last Modified: Nov 1, 2024
* Description: Using the same code as Lab09Prob02, print the max, min, and average value, and count the number of values above and below the average
*/
public class Lab09Prob03 {
	
	public static void main(String[] args) {
		//Array of doubles
		double[] dList = { -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};
		//Find the maximum and minimum value
		double maxValue = dList[0];
		double minValue = dList[0];
		//Average value
		double avg = 0;
		
		//Loop throughout the array
		for(int i = 0; i < dList.length; i++) {
			
			//Find the maximum value by checking if the element is greater than the previous element
			if(dList[i] > maxValue) {
				maxValue = dList[i];
			}
			if(dList[i] < minValue) {
				minValue = dList[i];
			}
			
			avg += dList[i];
		}
		
		avg /= dList.length;
		
		//**Counting the values above and below the average***
		//Count the values above the average
		int upper = 0;
		//Count the values below the average
		int lower = 0;
		for(int i = 0; i < dList.length; i++) {
			if(dList[i] > avg) {
				upper++;
			}else {
				lower++;
			}
		}
		//Display
		System.out.printf("Maximum value: %.3f%nMinimum value: %.3f%nAverage value: "
				+ "%.3f%nValues above average: %d%nValues below average: %d%n", maxValue, minValue, avg, upper, lower);
		
	}
	
}
