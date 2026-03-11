import java.util.Scanner;

public class SentinelValue {
	public static void main(String[] args) {
		//A sentinel value is a unique value that signals the end of a data structure or indicates exceptional cases; used as a condition for termination
		//It is common to use a sentinel value to terminate the input of a loop. In the SubtractionQuiz, the loop terminates after 5
		/* If you want the user to decide whether to continue, you can offer a user confirmation:
		 * char continueLoop = 'Y'
		 * while(continueLoop == 'Y'){
		 * 		Execute loop body once
		 * 		
		 * 		Prompt user for confirmation
		 * 		System.out.println("Enter Y to continue or enter N to exit: ");
		 * 		continueLoop = input.nextLine().charAt(0);
		 * }
		 * Prompts the user to decide whether to advance to the next question
		 */
		//Sentinel value: a special input value that signifies the end of the input: for sentinel-controlled loops
		//This program reads and calculates the sum of an unspecified number of integers; 0 specifies the end of the input. The variable, data is used to 
		//store the input value, and use a variable named sum to store the total:
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer (the input ends if the integer is 0): ");
		int data = input.nextInt();
		int sum = 0;
		
		while(data != 0) {
			sum += data;
			System.out.println("Enter an integer (the input ends if the integer is 0): ");
			data = input.nextInt();
		}
		System.out.printf("The sum is %d%n", sum);
		
		//NOTE: Do not use floating-point numbers for equality checking in a loop control.
		/*
		 * double item = 1; double sum = 0;
		 * while(item != 0){
		 * 		sum += item;
		 * 		item -= 0.1;
		 * }
		 * System.out.print(sum);
		 * 		The loop should terminate when the item become 0, however, there is no guarantee that item will be exactly 0 because doubles are approximated
		 * ***This is an infinite loop 
		 */
		//If you have a large number of data to enter, you can store the data separated by whitespaces in a text file, say 
		//input.txt for example as a text document, and run the program using this command:
		//			java SentinelValue.java < input.txt
		
		//This is an input redirection: Obtain input from a file instead of from a console. The program takes the input from the file (input.txt) rather than
		//having the user type the data from the keyboard at runtime. 
		/*Suppose that the input.txt file has the following contents:
		 * 	2 3 4 5 6 7 8 9 12 23 32
		 * 	23 45 67 89 92 12 34 35 3 1 2 4 0
		 */
		//If this txt file is used in the SentinelValue class, then the sum would be 518
		
		//There is also an output redirection which sends the output to a file rather than displaying it to the console.
		//(Write the output to the file instead of to the console with the command:
		//			java ClassName > output.txt
		//Input and output redirections can be used in the same command:
		//			java ClassName < input.txt > output.txt
		//
		
		// Example where you use input.hasNext() method in order to add all the numbers up:
		//In this case, the input is 1 2 3 4 5 6 (the sentinel value is going to be false from the hasNext() in which will become false after 6)
	    int sum1 = 0;
	    System.out.println("Enter as many numbers as you want: ");
	    while (input.hasNext()) {
	      sum1 += input.nextInt();
	    }	     
	    System.out.println("The sum is " + sum1);
	    //If your program reads lines, then you can use the input.hasNextLine() to detect the end of an input
	    
	    //In this test example, suppose the inputs are 2 3 4 5 0;
		System.out.println("Enter 2 3 4 5 0: ");
	    int number = input.nextInt();
	    int max = number;

	    while (number != 0) {
	      number = input.nextInt();
	      if (number > max)// Checks if number > max, then max will be the greater number
	        max = number; 
	    }

	    System.out.println("max is " + max);//Max is 5
	    System.out.println("number " + number);//number will be 0
	    
	    int num = 6;
	    while (num > 0) {
	    	num -= 3;
	    	System.out.print(num + " "); //Will be (6-3) 3 and 0
	    }
	}
}
