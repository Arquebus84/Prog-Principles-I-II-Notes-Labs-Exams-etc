import java.util.Scanner;

/**
* File: PAssign06.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Oct 12, 2024
* Last Modified: Oct 12, 2024
* Description: Prompt the user to enter a max number of multiples and display it in 4 different patterns
*/
public class PAssign06 {
	
	public static void main(String[] args) {
		//Initialize the scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		System.out.print("Enter max number of multiples: ");
		int maxValue = input.nextInt();
		
		while(maxValue < 0) {
			System.out.println("Please enter a positive value.\n");
			System.out.print("Enter max number of multiples: ");
			maxValue = input.nextInt();
		}
		
		//Pattern A is a decreasing right triangle that has multiples of 5. The base should contain 5 10 15 20 25 30
		System.out.println("\nPattern A:");
		for(int i = 1; i <= maxValue; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(5 * j + " ");
			}
			System.out.println();
		}
		
		//Pattern B is an inverse decreasing right triangle that has multiples of 5. The top should contain 5 10 15 20 25 30
		System.out.println("\nPattern B:");
		for(int i = maxValue; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j * 5 + " ");
			}
			System.out.println();
		}
		
		//Pattern C is a decreasing right triangle that has multiples of 5. The base should contain 30 25 20 15 10 5
		System.out.println("\nPattern C:");
		for(int i = 1; i <= maxValue; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j * 5 + " ");
			}
			System.out.println();
		}
		
		//Pattern D is an inverse decreasing right triangle that has multiples of 5. The top should contain 30 25 20 15 10 5
		System.out.println("\nPattern D:");
		for(int i = maxValue; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j * 5 + " ");
			}
			System.out.println();
		}
		System.out.print("\n");
	}

}
