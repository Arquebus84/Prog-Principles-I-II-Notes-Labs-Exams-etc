/**
* File: Calculator.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe
* Created on: Feb 28, 2025
* Last Modified: Feb 28, 2025
* Description: With the InvalidCalcOperationException class (custom exception), modify the existing Calculator class to account for
* 				the try/catch/finally block
*/

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		char operation = 0;
		// The result of the operation
		int result = 0;
		
		try {
			// read in operands and operation from user
			System.out.print("Enter an integer (operand 1) and press Enter: ");
			num1 = scanner.nextInt();

			System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
			operation = scanner.next().charAt(0);
			
			System.out.print("Enter an integer (operand 2) and press Enter: ");
			num2 = scanner.nextInt();

			// Determine the operator
			switch (operation) { 
				case '+': 
					result = num1 + num2;
					break;
				case '-': 
					result = num1 - num2;
					break;
				case '*': 
					result = num1 * num2;
					break;
				case '/': 
					result = num1 / num2;
					break;
				default:
					throw new InvalidCalcOperationException(operation); //Throw the invalid exception
			}
			
			// Display result
			System.out.printf("%d %c %d = %d\nThe program is terminating", num1, operation, num2, result);
						
		} catch (InvalidCalcOperationException e) {
			System.out.println(e.getMessage() + "\nThe program is terminating because of an error");
			
		}finally {
			// close scanner when done
			scanner.close();
		}
			

	}
}