/**
* File: Lab04Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 6, 2024
* Last Modified: Sep 6, 2024
* Description: Display messages that determine whether someone is eligible for purchasing alcohol.
*/
import java.util.Scanner;
public class Lab04Prob02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int monthNumber;
		
		System.out.print("Enter the month number: ");
		monthNumber = input.nextInt();
		
		if(monthNumber > 12)
			System.out.println("That is not a valid month");
		else if(monthNumber > 11)
			System.out.println("Month " + monthNumber + " occurs during winter");
		else if(monthNumber > 8)
			System.out.println("Month " + monthNumber + " occurs during autumn");
		else if(monthNumber > 5)
			System.out.println("Month " + monthNumber + " occurs during summer");
		else if(monthNumber > 2)
			System.out.println("Month " + monthNumber + " occurs during spring");
		else if(monthNumber > 0)
			System.out.println("Month " + monthNumber + " occurs during winter");
		else
			System.out.println("That is not a valid month");
		
	}
}
