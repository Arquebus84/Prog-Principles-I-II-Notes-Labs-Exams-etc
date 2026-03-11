
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		//**A 2D array is an array of one-dimensional arrays; a 3D array is an array of 2D arrays
		//Multi-Dimensional array: an array that contains an array that may contain another array (each element is another array)
		
		//2D arrays were used to represent a matrix; occasionally, you will need to represent nth-dimensional data structures**.
		//You can create nth-dimensional arrays for any positive integer n in Java
		
		//Declaring n-dimensional arrays:
		//The way to declare a 2-dimensional array variables and create 2-dimensional can be generalized to declare n-dimensional array variables and create
		//	n-dimensional arrays for n >= 3.
		
		/**You can use a 3D array to store exam scores for a class of 6 students, each student took 5 exams, and each exam has 2 parts to it (multiple-choice &
		//		free-response)
		//This declares the 3D array variable scores, creates an array, and assigns its reference to scores:
		//double[][][] score = new double[6][5][2];
		
		//Or use the array initializer for two students who took 3 exams and each exam has 2 parts to it**/
		double[][][] scores = {
				{{78, 22}, {65, 35}, {87, 13}},
				{{64, 36}, {12, 88}, {96, 4}},
		};
		System.out.println(scores[0][2][0] + " The length of the array is " + scores.length);//This code prints the first student's third exam's first part
		//**Syntax can be described as: 
		//			scores[i][j][k] i = which student, j = which exam, k = which part of the exam
		
		//In this case, scores.length is 2 (2 rows, each row represents a student)
		
		
		//Additional Notes:
		
		int[][][][][] dataSet = new int[3][3][3][3][3]; //This is declared and initialized as a 5D array, having 3 rows, each with 3 arrays within each array;
		System.out.println(dataSet[0][0][0][0][0]); //Since it is declared and referenced, each point in the array is initialized to 0
		
		//Using For-each loop
		for(int[][][][] e: dataSet) {
			System.out.print(e + " ");//This prints the generated memory file of each of the 3 rows of arrays
		}
		System.out.println();
		
		char[][][] characters = new char[12][5][2]; // the length of this array is 120 since its 12 x 5 x 2:
		int lengthOfChar = characters.length * characters[2].length * characters[0][0].length;
		System.out.println(lengthOfChar);
		
		int[][][] array = {
				{{1, 2}, {3, 4}}, 
				{{5, 6}, {7, 8}}
		};
		System.out.println(array[0][0][0]); //This prints 1
		System.out.println(array[1][1][1]); //This prints 8
		
		int[][][] m = {
				{{4, 5}, {6, 7}}, 
				{{2, 1}, {0, 3}}
		};
		System.out.println("The number of rows in the array at the first array (the 2D array) is " + m[0].length);
		
		//3D array with a method
		int[][][] data = {
				{{1, 2}, {3, 4}},
			    {{5, 6}, {7, 8}}
		};

		System.out.println(ttt(data[0]));
		
	}
	
	public static int ttt(int[][] m) {
		int v = m[0][0];
	    
	    for (int i = 0; i < m.length; i++)
	      for (int j = 0; j < m[i].length; j++)
	        if (v < m[i][j])
	          v = m[i][j];
	   
	    return v;
	}
}
