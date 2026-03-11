
public class Process2DArrayExamples {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Find the sum of each diagonal in a squared matrix:
		int[][] arr = {
				{1, 2, 3, 4},
				{1, 3, 5, 7},
				{2, 4, 8, 16},
				{2, 4, 5, 6}
		};
		
		int totalSum = 0;
		for(int row = 0; row < arr.length; row++){
		    totalSum += arr[row][row];
		    totalSum += arr[row][arr.length - row - 1];
		}
		
		
		//Check if the array's rows have the same length:
		boolean uniformSessions = true;
		int[][] sessionAttendees = {
				{1, 2, 3},
				{1, 2, 3, 4},
				{1, 2, 4, 5},
				{2, 4, 5, 6}
		};
		for(int row = 0; row < sessionAttendees.length; row++){    
		    if(sessionAttendees[0].length != sessionAttendees[row].length){
		        uniformSessions = false;
		    }else{
		        uniformSessions = true;
		    }
		}
		
		//Replace the first value 0 with sessionAttendees.length - row - 1
		for(int row = 0; row < sessionAttendees.length; row++){
		    if(sessionAttendees[sessionAttendees.length - row - 1].length != sessionAttendees[row].length){
		        uniformSessions = false;
		    }else{
		        uniformSessions = true;
		    }
		}		
		System.out.println(uniformSessions);
		
		//Find sum of array column:
		int totalColumn = 1;
		int sum  = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i][totalColumn];
		}
		//System.out.println("The sum of column " + totalColumn + "  is " + sum);//Displays 13
		
		//Sum of columns in arr
		int sum1 = 0;
		for(int column = 0; column < arr[0].length; column++) {
			for(int i = 0; i < arr.length; i++) {
				sum1 += arr[i][column];
			}
			//System.out.println("The sum of column " + column + "  is " + sum1);
			sum1 = 0;
		}
		/*
		//Code for finding the column with greatest sum, and swapping it with the first column
		int tempColumn = 0;
		int maxSumOfColumn = 0;
		int maxColumnIndex = 0;

		for(int column = 0; column < arr[0].length; column++){
		    for(int row = 0; row < arr.length; row++){
		        //maxSumOfColumn += arr[row][column];
		    	tempColumn += arr[row][column];
		    }
		    if(tempColumn > maxSumOfColumn){
		        maxSumOfColumn = tempColumn;
		        maxColumnIndex = column;
		    }
		    tempColumn = 0;
		    System.out.println("Column " + column + " has sum of " + maxSumOfColumn);
		}
		for(int i = 0; i < arr.length; i++){
		    int temp = arr[i][0];
		    arr[i][0] = arr[i][maxColumnIndex];
		    arr[i][maxColumnIndex] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]);
		}
		*/
		
		
		//Transposed array:
		int rows1 = arr.length;
		int columns = arr[0].length;
		int[][] transposedArr = new int[columns][rows1];//This array's rows are the same length as the arr's first row. The total number of columns are the same
														//number of rows as arr.
		// assign arr[j][i] to transposedArr[i][j]
		for(int i = 0; i < columns; i++){
		    for(int j = 0; j < rows1; j++){
		        int temp = arr[i][j];
		        arr[j][i] = transposedArr[i][j];
		        transposedArr[i][j] = temp;
		    }
		}
		
		for(int i = 0; i < transposedArr.length; i++) {
			for(int j = 0; j < transposedArr[i].length; j++) {
				System.out.print(transposedArr[i][j] + " ");
			}
			System.out.println();
		}
		
		//Shifted Array:
		int n = 2;//Shift the array n times
		int rows = arr.length;
		int cols = arr[0].length;
		int[][] shiftedArr = new int[rows][cols];
		// Assign the shifted result to shiftedArr. Only shift the columns, not the rows.
		// shiftedArr[i][(j + n) % cols] = arr[i][j];
		for(int i = 0; i < rows; i++){
		    for(int j = 0; j < cols; j++){
		        int temp = arr[i][j];
		        arr[i][j] = shiftedArr[i][(j + n) % cols];
		        shiftedArr[i][(j + n) % cols] = temp;
		    }
		}
		for(int i = 0; i < shiftedArr.length; i++){
		    for(int j = 0; j < shiftedArr[i].length; j++){
		    	System.out.print(shiftedArr[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}

}
