/**
* File: Lab02Prob01.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Aug 23, 2024
* Last Modified: Aug 23, 2024
* Description: Display birth year and current age to the console
*/
public class Lab02Prob01 {
	public static void main(String[] args) {
		int birthYear = 1997;
		int currentYear = 2024;
		int currentAge = currentYear - birthYear;
		
		System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
	}
}
