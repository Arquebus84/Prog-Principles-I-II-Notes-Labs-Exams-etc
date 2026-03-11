
public class DeclaringMultiArrays {

	public static void main(String[] args) {
		//In multi-dimensional arrays, the elements are accessed through rows and columns indexes.
		//Syntax for two-dimensional arrays:
		//	double[][] arrayRefVar 	or 	double arrayRefVar[][]
		
		//2-dimensional array of 5-by-5 int values:
		int matrix[][] = new int[5][5];
		//At row 2, column 3, the value is set to 12
		matrix[2][3] = 12;
		
		//Could also declare a 2D array with only the rows
		int x[][] = new int[2][];//This array only contains 2 rows with no columns
		x[0] = new int[2];//Declares the size of the array at the first row
		System.out.println(x[0]);//Displays the memory of the array at index 0
		
		
		//Two subscripts are used for two-dimensional arrays: one for the row and the other for the column
		//	Row index: Each row is an array that contains the values. The values in each row can be accessed through column index
		//	Column index: Access the values of each row through column index
		
		//This array has 4 rows (0 to 3) and 3 columns (0 to 2)
		int matrix2[][] = {
				{1, 2, 3}, //Row 0
				{4, 5, 6}, //Row 1
				{7, 8, 9}, //Row 2
				{10, 11, 12}}; //Row 3
		//*Row and Column
		System.out.println(matrix2[1][2]);//Row 1 and column 2 is 6
		
		//It is useful to think of it this way:
		int[][] arrayRef = {
			      {1, 2, 3},
			      {4, 5, 6},
			      {7, 8, 9},
			      {10, 11, 12}
			    };
		System.out.println(arrayRef[0][1]);
		int[][] array = new int[4][3];
		array[0][0] = 1; array[0][1] = 2; array[0][2] = 3; 
		array[1][0] = 4; array[1][1] = 5; array[1][2] = 6; 
		array[2][0] = 7; array[2][1] = 8; array[2][2] = 9; 
		array[3][0] = 10; array[3][1] = 11; array[3][2] = 12;
		
	}
	
}
