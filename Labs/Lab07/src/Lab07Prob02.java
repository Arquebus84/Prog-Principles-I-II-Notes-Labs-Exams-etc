import java.util.Scanner;

/**
* File: Lab07Prob02.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Modify loop so that it does not include break and continue
*/
public class Lab07Prob02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		//Prompt the user to enter a number
		System.out.print("Enter a number: ");
		userInput = input.nextInt();
		for (int i = 0; i < userInput; i++) {
						
			if (i != 3 && i != 7 && i != 18 && i != 23) {
				System.out.printf("%d ", i);
			}
		}
		//Print results
		System.out.printf("%nYou entered %d%n", userInput);
		
		System.out.println("Program Completed");
		
	}
}
