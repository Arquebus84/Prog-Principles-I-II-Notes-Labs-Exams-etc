/**
* File: Lab10Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 8, 2024
* Last Modified: Nov 8, 2024
* Description: Print an array of doubles that are multiples of 7 in a method
*/
public class Lab10Prob01 {
	
	public static void main(String[] args) {
		//Declare the array with 21 elements
		double list[] = new double[21];
		
		//Call the method printArray
		printArray(list);
	}
	
	//Print the elements in the array
	public static void printArray(double[] array) {
		
		//For every element in the array, it will be 7 times the iteration
		for(int i = 0; i < array.length; i++) {
			array[i] = 7 * i;
			System.out.println(array[i]);
		}
	}
	
}
