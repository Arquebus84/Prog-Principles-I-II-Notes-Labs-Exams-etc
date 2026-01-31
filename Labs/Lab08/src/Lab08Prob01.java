
/**
* File: Lab08Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura
* Created on: Oct 25, 2024
* Last Modified: Oct 25, 2024
* Description: Create a method that returns the average of 3 double values
*/
public class Lab08Prob01 {
	
	public static void main(String[] args) {
		
		//Values
		int num1 = 2, num2 = 3, num3 = 6;
		double dNum1 = 2.74, dNum2 = 3.45, dNum3 = 6.21;
		
		System.out.printf("The average of %d, %d, and %d is %.5f%n", num1, num2, num3, averageValue(num1, num2, num3));
		System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f%n", dNum1, dNum2, dNum3, averageValue(dNum1, dNum2, dNum3));
		
	}
	
	//Method 1: floating-point values
	public static double averageValue(double num1, double num2, double num3) {
		double avg = (num1 + num2 + num3)/ 3.0;
		return avg;
	}
	
	//Method 2: integer values
	public static double averageValue(int num1, int num2, int num3) {
		double avg = (num1 + num2 + num3)/ 3.0;
		return avg;
	}
	
}
