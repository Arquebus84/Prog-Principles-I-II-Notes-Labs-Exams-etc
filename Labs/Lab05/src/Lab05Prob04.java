import java.util.Scanner;

/**
* File: Lab05Prob04.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 20, 2024
* Last Modified: Sep 20, 2024
* Description: calculate triangle area with Heron's formula and use the printf() method
*/
public class Lab05Prob04 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Heron's area formula: area = sqrt(s(s-a)(s-b)(s-c))
		//s is semi-perimeter; s = (a + b + c)/2 
		//doubles a,b,c are side length entered by the user
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Calculate s
		double s = (a + b + c) / 2.0;
		double area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
		
		//println
		//System.out.println("For side lengths of " + a + ", " + b + ", " + c +", the area is " + area + ".");
		//prinf
		System.out.printf("For side lengths of %.2f, %.2f, %.2f, the area is %.2f.", a, b, c , area);
	}

}
