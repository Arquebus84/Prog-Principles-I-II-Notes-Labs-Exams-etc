/**
* File: Lab10Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 8, 2024
* Last Modified: Nov 8, 2024
* Description: Calculate the temperature difference for a set of high and low temperatures; store those differences in a third array;
*/
public class Lab10Prob03 {

	public static void main(String[] args) {
		//arrays high and low
		int high[] = {66, 73, 77, 79, 81, 82, 83, 85, 85, 87, 82};
		int low[] = {41, 44, 49, 51, 49, 62, 59, 59, 57, 61, 63};
		
		//Create a new array that contains the differences between the high and lows
		int differences[] = calculateDiff(high, low);
		
		//Greatest value for both highest and lowest temperatures
		int highest = high[0];
		int lowest = low[0];
		//Averages:
		double avgHigh = 0;
		double avgLow = 0;
		double avgDiff = 0;
		
		for(int i = 0; i < high.length; i++) {
			if(highest < high[i]) {
				highest = high[i];
			}
			if(lowest > low[i]) {
				lowest = low[i];
			}
			
			avgHigh += high[i];
			avgLow += low[i];
			avgDiff += differences[i];
		}		
		//Lowest, Highest, and difference averages:
		avgHigh /= high.length;
		avgLow /= low.length;
		avgDiff /= differences.length;
				
		//Print results
		System.out.println("Days greater than 25 degree difference:");
		int aboveDifference = 0;
		for(int i = 0; i < 10; i++) {			
			if(differences[i] > 25) {
				aboveDifference++;
				System.out.println("Day " + (i) +":\t" + differences [i]);				
			}			
		}
		System.out.println();
		System.out.printf("Statistics:%nMin Low: %d%nAverage Low: %.2f%n%nMax High: %d%nAverage High: %.2f%n%n", lowest, avgLow, highest, avgHigh);
		
		System.out.printf("Average Difference: %.2f%nNumber of days with above-average "
				+ "difference: %d out of %d%n%n", avgDiff, aboveDifference, differences.length);
	}
	
	
	//Method calculate differences between values and returns a new array
	public static int[] calculateDiff(int high[], int low[]) {
		int differences[] = new int[high.length];
		for(int i = 0; i < high.length; i++) {
			differences[i] = high[i] - low[i]; 
		}
		
		return differences;		
	}
}
