import java.util.Random;
import java.util.Scanner;

public class ExeptionHandlingOverview {
	//Exceptions are thrown from a method; the caller of method can catch and handle an exception
	
	public static void throwException() throws Exception{
		throw new Exception("Critical Failure!");
	}
	
	//Exceptions are runtime errors. Exception handling enables a program to deal with runtime errors and continue its normal execution.
	
	//How can a method notify its caller when an exception has occured?: Java enables a method to throw an exception that can be
	//	caught and handled by the caller.
	/**
	 * 							try{
	 * 				⬐-----------				
	 * 		If error occurs
	 * 				↪----------→}catch (Exception E){
	 * 
	 * 							}
	 */
	
	//Syntax for utilizing exceptions
	
	//Try-Throw-Catch blocks:
	/*
	 * 		try	{
	 * 			//Code to run;
	 * 			//Statement or a method that may *throw* an exception;
	 * 			//More code to run;
	 * 		}catch(type ex)	{	//Specify the type of exception
	 * 			//Code to process the exception;
	 * 		}
	 */
	
	//Advantages: Enables a method to throw an exception to its caller, enabling the caller to handle the exception; without this, 
	//	the called method itself must handle the exception or terminate the program.
	
	/**InputMismatchException is useful for reading input from a user.
	
		*Example is in ExceptionHandlingEx package
	
		When executing input.nextInt(), an InputMismatchException occurs if the input entered is not an integer.
		In the catch block, if it's executed, the statement input.nextLine() discards the current input line, so the
			user can enter a new line of input.		
	 * 
	*/
	
	//Examples:
	@SuppressWarnings("resource")
	public static void ExceptionTest() {	//The main method invokes this method
		
		//Arithmetic Exception
		System.out.println("1 / 0 results in: ");
		try {
			System.out.println("1 / 0 results in: " + (1/0));
		}catch(ArithmeticException AE) {
			System.out.println("Cannot divide by zero");
		}
		
		
		Scanner input = new Scanner(System.in);
	    
		//throwException();
		
	    // Prompt the user to enter two integers (ONLY integers, if they write non-numeric digits, then utilize the java.util.InputMismatchException)
		/**InputMismatchException example is in the ExceptionHandlingEx package*/
	    
		try {
			System.out.print("Enter two integers: ");
			int number1 = input.nextInt();
			int number2 = input.nextInt();

			// Example 1
			// The following code is a basic way to handle a division by 0
			if (number2 != 0) {
				System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
			} else {
				System.out.println("Cannot divide by 0");
			}

			/** The following code is equivalent to the one above */
			try {
				if (number2 == 0) {
					throw new ArithmeticException("Divisior Cannot be zero");
				}
				System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
			} catch (ArithmeticException E) {
				System.out.println("Exception: Cannot divide by 0");
			}
			/** NOTE: A floating-point number divided by 0 does not raise an exception */

			// Example 2: Same result, just different format

			try {
				int result = quotient(number1, number2);
				System.out.println(number1 + " / " + number2 + " is " + result);
			} catch (ArithmeticException ex) {
				System.out.println("Exception: an integer cannot be divided by zero ");
			}

		} catch (java.util.InputMismatchException I) {	//Catches the invalid inputs
			System.out.println("Not a valid input");
			input.nextLine();
		}
	  
	    input.close();
	}
	
	public static int quotient(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("Divisor cannot be 0");
		}else {
			return (num1 / num2);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//Exception Test 1 (Above)
		ExceptionTest();
		
				
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		java.util.Date[] date = new java.util.Date[10];
		date = new java.util.Date[5];
		System.out.println(date[0]);
		
		//Checks if the divisor is 0
		try {
			if(num2 == 0) {
				throw new ArithmeticException("Divisor cannot be zero.");
			}
			System.out.println(num1 + "/" + num2);
		}
		catch(Exception exceptionA){	//An arithmetic exception is a type of exception
			System.out.println("Exception: Integer cannot be divided by zero!\n");
		}
		
		/*
		//Example 4
		try {
			throw new Exception("Critical Failure!");
		}
		catch(Exception ex){
			System.out.println("Exception caught: Crticial Failure!");
		}
		//System.out.println(1/0);	//This runtime error is an ArithmeticException
		*/
		
		
		//Examples:
		ExeptionHandlingOverview inputHandler = new ExeptionHandlingOverview();
		@SuppressWarnings("unused")
		boolean hasError;
		try{
		    inputHandler.validateInput();
		}catch (Exception E){
		    hasError = true;
		}
		
		
		//**This code makes Java thow no Exceptions
		int num = Integer.MAX_VALUE + 1;
		System.out.println(num);
		
		
	}
	
	public void validateInput() {
		System.out.println("Validated");
	}

}
