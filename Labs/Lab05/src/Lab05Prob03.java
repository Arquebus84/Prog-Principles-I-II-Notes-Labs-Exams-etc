import java.util.Scanner;

/**
* File: Lab05Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 20, 2024
* Last Modified: Sep 20, 2024
* Description: User enters a 5-letter word; if the word is shorter than or longer than five characters, display an error message and quit the program.
*/
public class Lab05Prob03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a five-letter word: ");
		String word = input.nextLine();
		
		
		//Calculates each character of the word
		if(word.length() == 5) {
			char c1 = word.charAt(0);
			char c2 = word.charAt(1);
			char c3 = word.charAt(2);
			char c4 = word.charAt(3);
			char c5 = word.charAt(4);
			
			String reverseWord = c5 + "" + c4 + "" + c3 + "" + c2 + "" + c1;
					
			//System.out.println("For the string " + word + " the reverse is " + reverseWord);
			System.out.printf("For the string %s the reverse is %s", word, reverseWord);
		}else {
			//System.out.println("The string you entered " + word + " does not contain 5 characters");
			System.out.printf("The string you entered %s does not contain 5 characters", word);
		}
	}
}
