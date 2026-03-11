package MultiDimensionalArrayEx;

public class Ordering2DArrays {

	public static void main(String[] args) {
		//Array for testing rows:
		int[][] list = {
				{10, 11, 12, 13, 14}, 
				{3, 4, 5},
				{1, 2},
				{6, 7, 8, 9},
				{15, 16, 17, 18, 19, 20}
		};
		
		int amountOfItems = 0;
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				amountOfItems++;
			}
		}
		
		System.out.println("The amount of items in the ragged array is " + amountOfItems + "\n");
		
		//Array for testing columns
		int[][] list2 = {
				{2, 3, 1, 7, 4},
				{4, 5, 8, 6, 7},
				{3, 2, 5, 4, 1}
		};
		
		//Ordering by rows:
		orderByRow(list);
		System.out.println();
		
		System.out.println("The list's greatest length is " + maxRow(list));
		
		//Ordering by columns:
		System.out.println("\nOld list:");
		for(int row = 0; row < list2.length; row++) {
			for(int colm = 0; colm < list2[0].length; colm++) {
				System.out.print(list2[row][colm] + " ");
			}
			System.out.println();
		}
		System.out.println("\nNew list:");
		orderByColumn(list2);
		
	}
	
	public static void orderByRow(int[][] array){
		for(int row = 0; row < array.length; row++) {			
			for(int row2 = 0; row2 < array.length; row2++) {
				//This condition checks if the length of the array starting at row = 0 (row2 is the next row) is the same as the length of the array 
				//	starting at row = 0 (row)
				if(array[row2].length > array[row].length) {
					int[] temp = array[row2];
					array[row2] = array[row];
					array[row] = temp;
				}
			}
		}		
		for(int i = 0; i < array.length; i++) {			
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//This method returns the row with the greatest length
	public static int maxRow(int[][] array) {
		//Initialize maxLength to the length of the first row
		int maxLength = array[0].length;
		for(int row = 0; row < array.length; row++) {
			if(maxLength < array[row].length) {
				maxLength = array[row].length;
			}
		}
		return maxLength;
	}
	
	public static void orderByColumn(int[][] array) {
		//Use a transposed array to convert between the array's columns to rows
		int[][] rowsToColumns = new int[array[0].length][array.length];
				
		for(int row = 0; row < rowsToColumns.length; row++) {			
			for(int column = 0; column < rowsToColumns[row].length; column++) {
				rowsToColumns[row][column] = array[column][row];
			}
		}
		
		for(int row = 0; row < rowsToColumns.length; row++) {
			for(int column = 0; column < rowsToColumns[row].length; column++) {				
				System.out.print(rowsToColumns[row][column] + " ");
			}
			System.out.println();
		}
				
	}
	

}
