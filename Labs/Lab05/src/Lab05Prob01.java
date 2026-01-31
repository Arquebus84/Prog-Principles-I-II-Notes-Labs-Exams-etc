import java.util.Scanner;

/**
* File: Lab05Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 20, 2024
* Last Modified: Sep 20, 2024
* Description: calculate triangle area with Heron's formula
*/
public class Lab05Prob01 {
	
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
		//Updated in Prob04
		System.out.println("For side lengths of " + a + ", " + b + ", " + c +", the area is " + area + ".");
	}

}
