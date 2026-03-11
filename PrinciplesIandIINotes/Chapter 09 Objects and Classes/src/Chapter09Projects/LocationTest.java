package Chapter09Projects;

import java.util.Scanner;

public class LocationTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns of the array: "); //For example, write 3 4 then hit enter
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		double[][] arrayA = new double[rows][cols];
		
		System.out.println("Enter the array: ");
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayA[i].length; j++) {
				//arrayA[i][j] = input.nextDouble();
				arrayA[i][j] = (double)(1 + Math.random() * 50);
				System.out.printf("%6.2f ", arrayA[i][j]);
			}
			System.out.println();
		}
		
		locateLargest(arrayA);
		
		input.close();
	}
	
	//Method returns the location of the largest element in a 2D array a
	public static Location locateLargest(double[][] a) {
		double m = a[0][0];
		int x = 0;
		int y = 0;
		
		/**Old technique made the objects in Location class default instead of encapsulating them
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > m) {
					m = a[i][j];
					x = i;
					y = j;
				}
			}
		}*/
		
		// Assume the max value in a is m and location is at (x, y)
	    Location location = new Location(x, y, m, a);
	    
	    /**Old technique made the objects in Location class default instead of encapsulating them
	    location.maxValue = m; 
	    location.x = x; 
	    location.y = y;
	    
	    System.out.printf("The largest element is " + m + ", located at (" + x + ", " + y + ")");
	    */
	    
	    return location;
	}
}

//Class contains three public data fields row (int), column (int), and maxValue (double). maxValue stores the maximal value in the 
//	two-dimensional array. row and column are the row and column indices for maxValue in the array.
class Location{
	private int x = 0;
	private int y = 0;
	private double maxValue = 0;
	
	//This class prints the location on the array
	/**Originally, the constructor Location() was a default constructor with no parameters*/
	public Location(int x, int y, double maxValue, double[][] array) {
		this.x = x;
		this.y = y;
		this.maxValue = maxValue;		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
					x = i;
					y = j;
				}
			}
		}		
		System.out.printf("The largest element is " + maxValue + ", located at (" + x + ", " + y + ")");
	}
	
	//Getter Methods (used to prevent memory leak)
	public double getMaxValue() {
		return maxValue;
	}
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
}