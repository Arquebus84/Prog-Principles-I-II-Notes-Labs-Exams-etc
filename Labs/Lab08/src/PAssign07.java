/**
* File: PAssign07.java
* Class: CSCI 1301
* Author: Matteo Ventura
* Created on: Oct 23, 2024
* Last Modified: Oct 25, 2024
* Description: Prompt the user to enter a string, then a character. The program should determine how many times that character occurs in the string using loops 
* as well as the reverse of the string. This project should contain at least three methods: (countCharacters, printCount, reverseString)
*/

import java.util.Scanner;

public class PAssign07 {
	
	//NOTE: Do not use break/continue
	//When the user enters STOP (in all caps) as a string, that is when the loop terminates
	public static void main(String[] args) {
		//Initialize Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a string
		System.out.print("Enter a string: ");
		
		//Initialize the stringInput
		String stringInput = input.next();
		
		//Loops until the user enters STOP as a string
		while(!stringInput.equals("STOP")) {
						
			//Prompt user to enter a character
			System.out.print("Enter a character: ");
			String charInput = input.next();
			char userChar = charInput.charAt(0);
			
			//prints the number of occurrences of the letter
			printCount(stringInput, userChar, countCharacters(stringInput, userChar));
			
			System.out.printf("The reverse of %s is ", stringInput);
			reverseString(stringInput);
			
			//Prompt user to enter a string again
			System.out.print("\n\nEnter a string: ");
			stringInput = input.next();
			
		}
	}
	
	//Method1: Count how many times that letter occurs in the word and return that count;
	public static int countCharacters(String word, char letter) {
		//Initialize count
		int count = 0;		
		//Check each letter of the word if they compare to the letter chosen by user (if it occurs, then increment count by 1)
		//***while(i < word.length() - 1) 	word.length()-1 is the last character in the word
		int i = 0;
		while(i <= (word.length() - 1)) {
			if(word.charAt(i) == letter) {
				count++;
			}			
			i++;
		}		
		return count;
	}
	
	//Method2: Prints the number of occurrences to the console; does not return any values
	public static void printCount(String word, char letter, int i) {
		System.out.printf("%s occurs in %s %d times%n", letter, word, i);
	}
	
	//Method3: Prints the reverse of the stringInput
	public static String reverseString(String word) {
		
		//Starting at the last letter in the string, and all the way until it has reached index 0 (the first letter), print the character at those indices
		for(int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		
		return word;
	}

}
