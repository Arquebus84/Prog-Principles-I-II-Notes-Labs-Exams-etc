
public class ProcessingMultiDimensionalArrays {

	public static void main(String[] args) {
		//Processing Multi-Dimensional arrays involves for-loops
		
		/*
		 * //Initialize arrays with input values:
		int[][] matrix = new int[10][10];		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " colums:");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		*/
		//Initialize arrays with random values:
		int[][] matrix1 = new int[10][10];
		for(int row = 0; row < matrix1.length; row++) {
			for(int column = 0; column < matrix1[row].length; column++) {
				//Random number from 1 to 10
				matrix1[row][column] = (int)(1 + Math.random() * 10);
			}
		}
		
		
		//Print arrays (Summing all elements):
		int sum = 0;
		for(int row = 0; row < matrix1.length; row++) {
			for(int column = 0; column < matrix1[row].length; column++) {
				sum += matrix1[row][column];
				System.out.printf("%4d", matrix1[row][column]);
			}
			System.out.println();
		}
		System.out.println("The sum of matrix1 is " + sum);
		System.out.println();
		
		
		//Summing elements by column:
		int sumOfColumn = 0;
		//Find the columns first (rows and columns are switched)
		for(int column = 0; column < matrix1[0].length; column++) {
			for(int row = 0; row < matrix1.length; row++) {
				//The sum of each column
				sumOfColumn += matrix1[row][column];				
			}
			System.out.println("The sum of column " + column + " is " + sumOfColumn);
			sumOfColumn = 0; //**Reset the sum because it will add the other columns together
		}
		System.out.println();
		
		
		//Which row has the largest sum? (using matrix1 with numbers from 1 to 10):
		//***Use maxRow and indexOfMaxRow to track the largest sum and index of the row. For each row, compute the sum and update both maxRow and 
		//		indexOfMaxRow if the new sum is greater
		
		//Store the max sum with maxRow and compare it with the sum of the row we are checking
		int maxRow = 0;
		int indexOfMaxRow = 0;
		
		//Get the sum of first row in maxRow
		for(int column = 0; column < matrix1[0].length; column++) {
			maxRow += matrix1[0][column];			
		}
		
		for(int row = 1; row < matrix1.length; row++) {
			int totalOfThisRow = 0;
			for(int column = 0; column < matrix1[row].length; column++) {
				totalOfThisRow += matrix1[row][column];								
			}
			
			//Compare maxRow with the row we are checking
			if(totalOfThisRow > maxRow) {
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		System.out.println("Row " + indexOfMaxRow + " has a maximum sum of " + maxRow);
		System.out.println();
		
		
		//RandomShuffling
		//**To accomplish this, for each element in matrix[i][j], randomly generate indices i1 and j1 and swap matrix[i][j] with matrix[i1][j1]:
		
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0; j < matrix1[i].length; j++) {
				int i1 = (int)(Math.random() * matrix1.length);
				int j1 = (int)(Math.random() * matrix1[i].length);
				
				//Swap matrix1[i][j] with matrix1[i1][j1]
				int temp = matrix1[i][j];
				matrix1[i][j] = matrix1[i1][j1];
				matrix1[i1][j1] = temp;
				
				System.out.printf("%4d", matrix1[i][j]);
			}
			System.out.println();
		}
		
		//Calculate the sum of the array along each diagonal: / (first diagonal is 2; / second diagonal is 4 + 5 = 9; / third is 3 + 8 + 8 = 19 and so on)
		int arr[][] = {
				{2, 5, 8},
				{4, 8, 2},
				{3, 4, 9}
		};
		int totalSum = 0;
		for(int row = 0; row < arr.length; row++){			
		    for(int column = 0; column < arr[row].length; column++){
		        if(column == row && column < arr[row].length) {
		        	totalSum += arr[row][column];
		        }
		    }
		}
		System.out.println("The sum of the diagonal of arr is " + totalSum);
		
		
		//Find the sum of each diagonal in a squared matrix:
		int[][] array = {
				{1, 2, 3, 4},
				{1, 3, 5, 7},
				{2, 4, 8, 16},
				{2, 4, 5, 6}
		};
		
		int totalSquaredSum = 0;
		for(int row = 0; row < array.length; row++){
			totalSquaredSum += array[row][row];
			totalSquaredSum += array[row][array.length - row - 1];
		}
		System.out.println("\nThe total sum of the squared array is " + totalSquaredSum);		
		
		
		//Using Array class to sort each row's array
		System.out.println();
		int[][] values = {{3, 4, 5, 1 }, {33, 6, 1, 2}};

	    for (int row = 0; row < values.length; row++) {
	      java.util.Arrays.sort(values[row]);
	      for (int column = 0; column < values[row].length; column++)
	        System.out.print(values[row][column] + " ");
	      System.out.println();
	    }
	    System.out.println("\nTransposed array:\n");
	    //Transposed array: Create a new array with all the elements in the rows organized as columns, and the same is switched for the columns
	    
	    int[][] array1 = {
	    		{1, 2, 3},
	    		{4, 5, 6},
	    		{7, 8, 9},
	    		{10, 11, 12}
	    };
	    
	    int rows = array1.length;
	    int cols = array1[0].length;
	    int[][] transposedArray = new int[cols][rows];
	    // assign arr[j][i] to transposedArr[i][j]
	    for(int row = 0; row < cols; row++){
	        for(int column = 0; column < rows; column++){
	            //int temp = array1[column][row];
	            transposedArray[row][column] = array1[column][row]; //Can just use this one line
	            //transposedArray[row][column] = temp;
	        }
	    }
	    //Display the result of the transposed array
	    for(int i = 0; i < transposedArray.length; i++) {
	    	for(int j = 0; j < transposedArray[0].length; j++) {
	    		System.out.print(transposedArray[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	}

}
