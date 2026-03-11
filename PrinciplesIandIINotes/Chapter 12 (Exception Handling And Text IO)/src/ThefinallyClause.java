import java.util.*;
import java.io.*;
public class ThefinallyClause {
	//The finally clause is always executed regardless of whether an exception has occurred or not.
	
	/**Good use for the finally clause: If there is an exception, or there isn't an exception, you can use the finally 
		clause to print a string or even close a scanner in case there is an exception caught. 
	 		**For example, if you need the program to still run even when there is an exception, the finally clause is always executed
	 */
	
	//Syntax:
	/**
		try{
			statements;
		
		}catch(Exception ex1){
			handling ex
			
		}finally{
			finalStatements;
		}	
	 */
	
	//There are 3 cases for the finally clause:
	
	/**
	1. If no exception arises in the try block, finalStatments is executed and the next statement after the try statement is executed.
	
	2. If a statement causes an exception in the try block that is caught in a catch block, the rest of the statements in the try
			block are skipped, the catch block is executed, and the finally clause is executed. The next statement after the try
			statement is executed.
	
	3. If one of the statements causes an exception that is not caught in any catch block, the other statements in the try block
			are skipped, the finally clause is executed, and the exception is passed to the caller of this method.
	 */
	
	//NOTE: the catch block may be omitted when the finally clause gets used.
	/**
		try{
			code may *throw a non-checked exception;
			regardless of whether an exception has occurred, the finalStatements are executed;
			
		}finally{
			finalStatements;
		}
	 */
	
	//Examples:
	
	public static void finallyScanner() {
		
		Scanner input = null;
		
		try {			
			input = new Scanner(new File("C:\\Users\\matte\\ReadingDataTest.txt"));	//References the directory
			
			while(input.hasNext()) {
				//System.out.println(input.next());
				//Prints:	23,
				//			33,
				//			54
				
				System.out.println(input.nextLine());
				//Prints: 23, 53, 54
			}
			
		}catch(Exception ex) {
			System.out.println("Input Invalid");
		}finally {
			if(input != null) {
				input.close();
			}
		}
	}
	
	public static void main(String[] args) {
		finallyScanner();
		
		try {
			System.out.println("\nWelcome to Java");
			return;		//**Will display the same results regardless if you add a return statement
		} finally {
			System.out.println("The finally clause is executed");
		}		
	}
}
