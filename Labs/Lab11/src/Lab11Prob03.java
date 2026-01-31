/**
* File: Lab11Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Create a transposed array that essentially turns each row of the array to be aligned as the array's column
*/
public class Lab11Prob03 {

	public static void main(String[] args) {
		//
		int[][] array = {
			{ 1, 2, 3 }, 
			{ 5, 4, 6 }, 
			{ 9, 8, 7 }, 
			{ 12, 10, 11 } 
		};
		
		transpose2DArray(array);
		
		for(int i = 0; i < transpose2DArray(array).length; i++) {
			for(int j = 0; j < transpose2DArray(array)[i].length; j++) {
				System.out.print(transpose2DArray(array)[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] transpose2DArray(int[][] array){
		int[][] transposed = new int[array[0].length][array.length];
		
		for(int row = 0; row < transposed.length; row++) {
			for(int column = 0; column < transposed[row].length; column++) {
				transposed[row][column] = array[column][row];
			}
		}
		return transposed;
	}

}
