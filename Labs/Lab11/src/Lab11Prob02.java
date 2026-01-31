/**
* File: Lab11Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Create a method that prints the maximum value of each array in a 2D array
*/
public class Lab11Prob02 {

	public static void main(String[] args) {
		//Array:
		int[][] array =  {
				{2, 9, 4}, {-512, -1024, -2048}, {5, -8, 17} 
		};
		//Print result
		printRowMax(array);
		
	}
	
	public static void printRowMax(int[][] array) {
		//Calculate the max element in each array in the array
		
		
		for(int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] > max) {
					max = array[i][j];
				}
			}
			
			System.out.printf("Row %d Max: %d%n", (i + 1), max);
		}
	}
}
