/**
* File: Lab09Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 1, 2024
* Last Modified: Nov 1, 2024
* Description: Create an array that stores random integers from -256 to 256
*/
//import gsu.Math;
public class Lab09Prob01 {
	
	public static void main(String[] args) {
		
		//Array
		int[] array = new int[12];		
		//Minimum index value
		int minIndex = 0;
		//Minimum element
		int minValue = array[0];
		
		System.out.println("Length: " + array.length + "\n");
		for(int i = 0; i < array.length; i++) {
			//Random integers
			array[i] = (int)(-256 + Math.random() * (256 + 256 + 1));
			System.out.println(array[i]);
			
			//If the minValue is greater than the value in the array, the minValue will be the value of the element in the array
			if(array[i] < minValue) {
				minValue = array[i];
				minIndex = i;
			}
		}
		
		//Display result
		System.out.println("\nMinimum value: " + minValue + " at index " + minIndex);
	}
	
	
}
