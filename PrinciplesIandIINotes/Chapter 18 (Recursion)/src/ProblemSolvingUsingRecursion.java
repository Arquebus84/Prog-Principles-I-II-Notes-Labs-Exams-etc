import java.io.File;
import java.util.Scanner;

public class ProblemSolvingUsingRecursion {
	//If you think recursively, you can solve many problems using recursion
	
	/***
 		All recursive methods have the following characteristics:
	 		* The method is implemented using an if-else or switch statement that leads to different cases
	 		* One or more base cases (the simplest case) are used to stop recursion
	 		* Every recursive call reduces the original problem, bringing it increasingly closer to a base case 
				until it becomes that case
				
				
			**Overall: To solve a problem using recursion, break it into subproblems. Each subproblem is the
						same as original but smaller in size.
						
			*Recursion example: drinking coffee is part of every day life:

				public static void drinkCoffee(Cup cup){
					if(!cup.isEmpty()){
						cup.takeOneSip();	//Take one sip and decrement the amount of coffee inside the cup
						drinkCoffee(cup);
					}
				}
	 */
	
	/*
		Consider the problem of printing a message n times. You can break the problem into two subproblems:
			* One is to print the message one at a time
			* Another is to print the message n - 1 times.
		The second subproblem is the same as the original problem, but it's smaller in size. The base case
			for the second problem is n == 0. Check the recursion code below: 
	 */
	public static void nPrintln(String message, int times) {
		//The Base case is times == 0
		if(times >= 1) {
			System.out.println(message);
			
			nPrintln(message, times - 1);	//Recursive call
		}
	}
	
	/**
		Consider the Palindrome Problem: A string is a palindrome if it reads the same from the left as it is from the right.
			For example, "mom" and "dad" are palindromes, but "uncle", or "aunt" are not.
		The problem of checking whether a string is palindrome can be divided into two subproblems:
			* Check whether first character and last character are the equal
			* Ignore the two end characters and check whether the rest of the substring is a palindrome
			
			****Substring NOTE from String class:
			
			substring(beginIndex, endIndex)	:	Returns this string's substring that begins with the specified beginIndex and extends 
										to the character at index endIndex - 1. NOTE: the character at endIndex is not part of the substring, so
										you must use endIndex - 1 in order to not get an StringIndexOutOfBoundsException
			 
	 */
	//Create a recursive palindrome method that uses a substring (substring is the same as the string but backwards)
	public static boolean isPalindrome(String s) {
		if(s.length() < 2) {
			return true;
		}else if(s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}else {
			return isPalindrome(s.substring(1, s.length() - 1));	//The substring method starting in the middle (second element) all 
																	//	the way to the last element
		}
	}
	/**NOTE: The problem with the code above is that it creates a new String as substring instead of checking the first character and 
				the last character, then checking the middle: more about this in RecursionHelperMethods.java*/
	
	public static void main(String[] args) {
		nPrintln("Check This", 3);
		System.out.println("\"moon\" is a palindrome: " + isPalindrome("moon"));
		System.out.println("\"noon\" is a palindrome: " + isPalindrome("noon"));
		
		System.out.println("Compress aaabbcz: " + compressString("aaabbcz"));
		
		System.out.println("Reverse String \"Lorenzo\": " + reverseString("Lorenzo"));
		
		
		/**Read the input from the file*/
		File inputFile = new File("C:\\Users\\matte\\TextFiles\\RecursiveInputText.txt");
		try {
			Scanner input = new Scanner(inputFile);	//The inputFile includes numbers 5 -3 8 0 in order to test the countPositiveMethod
			//Test print each number
//			while(input.hasNext()) {
//				System.out.println(input.next());
//			}
			System.out.println("CountPositive(input): " + countPositive(input));
			
			System.out.println("Find highest response from input; findHighestResponse(input): " + findHighestResponse(input));
			
		}catch(Exception ex) {
			
		}
		
		
	}
	
	
	//Examples:
	/**Compressed String: Implement a recursive method named compressString that accepts a String parameter.
	 	* recursively find consecutive characters in a String and compress them to a single character, followed by the number of its occurrences
		* For example: if string was aaabbcz, it should return the compressed string 3a2bcz
	 */
	
	public static String compressString(String str) {
		if (str.isEmpty()) {
            return "";
        }
        char firstChar = str.charAt(0);
        int count = 1;
        while (count < str.length() && str.charAt(count) == firstChar) {
            count++;
        }
        String compressed = firstChar + (count > 1 ? String.valueOf(count) : "");
        return compressed + compressString(str.substring(count));
    }
	
	//Writing a string backwards (return the entire string, not just a print of each character):
	public static String reverseString(String str) {
		if(str.length() < 2) {
			return str;
		}else {
			char lastChar = str.charAt(str.length() - 1);
			return lastChar + reverseString(str.substring(0, str.length() - 1));
		}
	}
	
	//Method that counts the positive numbers in an input: countPositive that accepts a Scanner object linked to a stream of integer inputs. 
	//	This method should recursively count and return the number of positive integers entered. For example 5 -3 8 0 should return 2
	//NOTE: Don't use loops
	
	public static int countPositive(Scanner input) {
		//Check to make sure that the next integer is included, if not, then return 0
		if(!input.hasNextInt()) {
			return 0;
		}
		int number = input.nextInt();	//Create the number which is the current checked number in the input file
		if (number > 0) {
			return 1 + countPositive(input); //If positive, then return 1 + the next possible positive int
		}else {
			return countPositive(input);	//Otherwise, check again for the next positive number
		}
	}
	
	/*
	Software system is designed to analyze survey responses; these responses are quantified int values. Instead of finding the
		most frequent response, it's tasked to identify the highest response value provided using recursion
	**Write a method called findHighestResponse() that takes in a Scanner associated with a **stream of input consisting of 
		integer response values.*** The method reads all the input values from the scanner, recursively determines the highest response 
		value, and returns it. Note: the method should not use loops of any kind		
	*/
	//Return the highest integer response value from the input
	public static int findHighestResponse(Scanner input) {
		//Check to make sure that the next integer is included, if not, then return 0
		if (!input.hasNextInt()) {	//Base case: return 0 if the input is empty
			return 0;
		}
		int min = input.nextInt(); // Create the number which is the current checked number in the input file
		int max = findHighestResponse(input); // Recursive step: find the highest response in the rest of the input
		
		if (min > max) {	//Check whether the current number is greater than the last one
			return min;
		} else {
			return max; // Otherwise, check again for the next positive number
		}
	}
}
