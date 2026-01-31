/**
* File: PAssign08.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 1, 2024
* Last Modified: Nov 1, 2024
* Description: Using an array, prompt the user to enter the size of the array, and the values within the array. Display each index's value, the maximum and
* minimum with their respective indexes. Show the average, as well as the counted values that are above and below the average of the array
*/
public class PAssign08 {

	public static void main(String[] args) {
		//Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
				
		//Prompt the user to enter a number of values for the string
		System.out.print("Enter number of values: ");
		int[] array = new int[input.nextInt()];

		System.out.println();
		for(int i = 0; i < array.length; i++) {			
			System.out.print("Enter value (" + (i + 1) + " of " + array.length + "): ");
			array[i] = input.nextInt();
		}
		System.out.println();
		//Max and Min values and their respective indexes
		int max = array[0];
		int maxIndex = 0;
		int min = array[0];
		int minIndex = 0;
		double avg = 0;
				
		//Values above/below average:
		int aboveAVG = 0;
		int belowAVG = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println("Index " + i + ": " + array[i]);
			//Check if the value of the array is above the max, and assign max that value; otherwise, assign it to min
			if(array[i] > max) {
				max = array[i];
				maxIndex = i;
			}else{
				min = array[i];
				minIndex = i;
			}			
			//calculate the sum of all the values
			avg += array[i];
		}		
		//Calculate average
		avg /= array.length;
		
		//Count the number of values that are above and below the average
		for(int i = 0; i < array.length; i++) {
			if(array[i] > avg) {
				aboveAVG++;
			}else {
				belowAVG++;
			}
		}
		System.out.println();
		//Display the results
		System.out.printf("Maximum: %d at index %d%nMinimum: %d at index %d%nAverage: %.4f%nValues over "
				+ "average: %d%nValues under average: %d%n", max, maxIndex, min, minIndex, avg, aboveAVG, belowAVG);
		
		input.close();
	}

}
