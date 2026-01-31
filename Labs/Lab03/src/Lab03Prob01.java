/**
* File: Lab03Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Aug 30, 2024
* Last Modified: Aug 30, 2024
* Description: Display three messages to the console
*/
import java.util.Scanner;
public class Lab03Prob01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int currentCreditHours;
		int degreeCreditHours;
		int remainingCreditHours;
		
		System.out.println("Type the number of credit hours that you currently have accumulated:");
		currentCreditHours = input.nextInt();
		
		System.out.println("Type the number of credit hours that your degree requires:");
		degreeCreditHours = input.nextInt();
		
		System.out.println("You have " + currentCreditHours + " credit hour(s).");
		System.out.println("Your degree requires " + degreeCreditHours + " credit hour(s).");
	}
}