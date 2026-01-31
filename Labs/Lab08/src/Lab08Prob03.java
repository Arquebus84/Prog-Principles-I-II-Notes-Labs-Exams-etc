/**
 * File: Lab08Prob03.java 
 * Class: CSCI 1301 
 * Author: Matteo Ventura 
 * Created on: Oct 25, 2024 
 * Last Modified: Oct 25, 2024 
 * Description: Calculate and display the standard deviation of all the values 
 */
public class Lab08Prob03 {

	public static void main(String[] args) {
		
		double num1 = 2.74, num2 = 3.45, num3 = 6.21, num4 = 11.91;
		
		
		System.out.printf("The standard deviation of %.2f, %.2f, %.2f, and %.2f is %.5f%n", num1, num2, num3, num4, stdDevSample(num1, num2, num3, num4));

	}
	
	//Method 1: 3 floating-point values
	public static double averageValue(double num1, double num2, double num3) {
		double avg = (num1 + num2 + num3)/ 3.0;
		return avg;
	}
	
	//Method 2: 3 integer values
	public static double averageValue(int num1, int num2, int num3) {
		double avg = (num1 + num2 + num3)/ 3.0;
		return avg;
	}
	
	//Method 3: 4 floating-point values
	public static double averageValue(double num1, double num2, double num3, double num4) {
		double avg = (num1 + num2 + num3 + num4)/ 4.0;
		return avg;
	}
	
	//Method 4: 4 integer values
	public static double averageValue(int num1, int num2, int num3, int num4) {
		double avg = (num1 + num2 + num3 + num4)/ 4.0;
		return avg;
	}
	
	//Standard Deviation Method
	public static double stdDevSample(double num1, double num2, double num3, double num4) {
		double numI[] = {num1, num2, num3, num4};
		
		double u = averageValue(num1, num2, num3, num4);
		
		double summation = 0;
		//Summation
		//summation += Math.pow(Math.abs((num1 - u)), 2) + Math.pow(Math.abs((num2 - u)), 2) + Math.pow(Math.abs((num3 - u)), 2) + Math.pow(Math.abs((num4 - u)), 2);
		
		//Loop version
		for(int i = 0; i < 4; i++) {
			summation += Math.pow(Math.abs((numI[i]- u)), 2);
		}
		
		double result = Math.sqrt(summation / (3.0));
		return result;
	}
}
