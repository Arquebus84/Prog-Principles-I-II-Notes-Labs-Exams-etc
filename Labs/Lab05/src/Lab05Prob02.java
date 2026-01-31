import java.util.Scanner;

/**
* File: Lab05Prob02.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 20, 2024
* Last Modified: Sep 20, 2024
* Description: User enters string value and the program reads it in using the Scanner’s nextLine() method. The string has to be 4 characters or longer.
*/
public class Lab05Prob02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string value:");
		String value = input.nextLine();
		
		char firstV = value.charAt(0);
		char middleV = value.charAt((value.length() / 2) + 1);
		char lastV = value.charAt(value.length() - 1);
		
		//If the String is not long enough, display an error message.
		if(value.length() < 4) {
			//System.out.println("The string you entered " + value + " contains less than 4 characters");
			System.out.printf("The string you entered %s contains less than 4 characters", value);
		}else {
			//System.out.println("For the string " + value +"\nfirst letter is " + firstV + "\nlast letter is " + lastV + "\n\"middle\" letter is " + middleV);
			//printf
			System.out.printf("For the string %s\nfirst letter is %c\nlast letter is %c\n\"middle\" letter is %c", value, firstV, lastV, middleV);
		}
	}

}
