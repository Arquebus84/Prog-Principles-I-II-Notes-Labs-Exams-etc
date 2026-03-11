package MatrixTests;

import java.util.regex.*;

public class MatrixProblems {

	public static void main(String[] args) {
		int[][] matrix = {{21, 43, 64, 15},
						{16, 48, 79, 0},
						{12, 6, 3, 16},
						{31, 22, 11, 1},
						{12, 62, 38, 45}};
		
//		displayMatrix(matrix);	//Standard
//		swapRows(matrix, 0, 2);	//Row Swap
//		transposeMatrix(matrix);	//transpose (rotate clockwise)
		String[] commands = {"swaprows 2 0", "Something"};
		swapRowsCommand(matrix, commands);
	}
	public static void displayMatrix(int[][] m) {
		for(int r = 0; r < m.length; r++) {
			for(int c = 0; c < m[r].length; c++) {
				System.out.print(m[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void swapRows(int[][] matrix, int r1, int r2) {
		int[][] finalM = new int[matrix.length][matrix[0].length];
		for(int r = 0; r < matrix.length; r++) {
//			if(r == r1) {
//				for(int c = 0; c < matrix[r1].length; c++) {
//					finalM[r][c] = matrix[r2][c];
//				}
//			}else if(r == r2) {
//				for(int c = 0; c < matrix[r2].length; c++) {
//					finalM[r][c] = matrix[r1][c];
//				}
//			}else {
//				for(int c = 0; c < matrix[r].length; c++) {
//					finalM[r][c] = matrix[r][c];
//				}
//			}
			if(r == r1) {
				finalM[r] = matrix[r2];								//Better result
			}else if(r == r2) {
				finalM[r] = matrix[r1];
			}else {
				for(int c = 0; c < matrix[r].length; c++) {
					finalM[r][c] = matrix[r][c];
				}
			}
		}
		displayMatrix(finalM);
	}
	
	public static void transposeMatrix(int[][] matrix) {
		int[][] transpose = new int[matrix[0].length][matrix.length];
		for(int row = 0; row < transpose.length; row++) {
			for(int col = 0; col < transpose[row].length; col++) {
				transpose[row][col] = matrix[col][row];
			}
		}
		displayMatrix(transpose);
	}
	
	/**
	 * 		commands for creating a matrix
	 * 
	 * "swaprows r1 r2"	
	 */
	public static void swapRowsCommand(int[][] matrix, String[] commands) {
		//Pattern pattern = Pattern.compile("[0-9]");
		int[][] swapped = new int[matrix.length][matrix[0].length];
		
		int r1 = 0, r2 = 1;
		for(int i = 0; i < commands.length; i++) {
			if(commands[i].startsWith("swaprows")) {
				//Matcher matcher = pattern.matcher(command[i]);
				String s2 = commands[i].substring(8).strip();
				//System.out.println(s2);
				r1 = Integer.parseInt(s2.substring(0,1));
				r2 = Integer.parseInt(s2.substring(2));
			}
		}
		//System.out.print(r1 + " " + r2);
		for(int r = 0; r < matrix.length; r++) {
			if(r == r1) {
				swapped[r] = matrix[r2];
			}else if(r == r2) {
				swapped[r] = matrix[r1];
			}else {
				for(int c = 0; c < matrix[r].length; c++) {
					swapped[r][c] = matrix[r][c];
				}
			}
		}
		displayMatrix(swapped);
	}

}
