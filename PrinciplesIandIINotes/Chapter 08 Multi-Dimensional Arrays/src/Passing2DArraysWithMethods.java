import java.util.Scanner;

public class Passing2DArraysWithMethods {

	public static void main(String[] args) {
		//Declare array:
		int[][] m = getArray();
		
		//Display sum of all elements
		System.out.println("\nThe sum of all the elements in the array is " + sum(m));
	}
	
	public static int[][] getArray() {
	    // Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    // Enter array values
	    int[][] m = new int[3][4];
	    System.out.println("Enter " + m.length + " rows and "
	      + m[0].length + " columns: ");
	    for (int i = 0; i < m.length; i++)
	      for (int j = 0; j < m[i].length; j++)
	        m[i][j] = input.nextInt();

	    //Close the scanner to prevent resource leak
	    input.close();
	    
	    return m;
	  }

	  public static int sum(int[][] m) {
	    int total = 0;
	    for (int row = 0; row < m.length; row++) {
	      for (int column = 0; column < m[row].length; column++) {
	        total += m[row][column];
	      }
	    }

	    return total;
	  }
}
