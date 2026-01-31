/**
* File: Lab02Prob02.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Aug 23, 2024
* Last Modified: Aug 23, 2024
* Description: Display birth year and current age as well as some additional text, to the console
*/
public class Lab02Prob02 {
	public static void main(String[] args) {
		int birthYear = 1997;
		int currentYear = 2024;		
		int currentAge = currentYear - birthYear;
		
		System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
		System.out.println("In 15 years, you will be " + (currentAge + 15) + " years old.");
		System.out.println("Someone twice your age is " + (currentAge * 2) + " years old.");
		System.out.println("Someone half your age is " + (currentAge / 2.0) + " years old.");
	}
}
