/**
* File: Lab10Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 8, 2024
* Last Modified: Nov 8, 2024
* Description: Write a method called halfPrintArray() that returns only half of the entire list of elements; display it using printArray()
*/
public class Lab10Prob02 {

	public static void main(String[] args) {
		//Declare the array
		double numbers[] = {18.7, -22.2, 43.4, 74.1, -25.5, 46.6, 27.8};
		printArray(numbers);
		
	}
	
	//Print the elements in the array
	public static void printArray(double[] array) {
		//Declare new array that only contains half of the numbers in the array
		double array2[] = halfCopyArray(array);
		
		//For every element in the array, it will be 7 times the iteration
		for(int i = 0; i <= array2.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	//Array that returns a half of the array
	public static double[] halfCopyArray(double[] array) {
		int middle = (array.length / 2);
		double halfArray[] = new double[middle];
		return halfArray;
	}
	
}
