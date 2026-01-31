import java.util.Scanner;
/**
* File: PAssign01b.java
* Class: CSCI-1301-H
* Author: Matteo Ventura Sean Roe
* Created on: August 16, 2024
* Last Modified: August 16, 2024
* Description: Display area of triangle
*/
public class PAssign01b {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		double base, height;
		
		//User input
		base = input.nextDouble();
		height = input.nextDouble();
		
		//Calculate the area of triangle
		double area = (base * height) / 2.0;
		
		System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + area + ".");
		
	}
}
