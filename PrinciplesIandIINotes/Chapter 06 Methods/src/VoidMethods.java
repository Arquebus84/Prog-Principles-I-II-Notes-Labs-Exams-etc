
public class VoidMethods {
	/**
	 * ***In a void method, look for whether it prints something; this can indicate whether the method is of a void type (non-value returning) 
	 * 
	 */
	
	
	//Main method has a returnType of void
	public static void main(String[] args) {
		//Uses the printGrade (void) method
		System.out.println("The grade is ");
		printGrade(98.7);
		
		System.out.println("The grade is ");
		printGrade(77.3);
		
		//Uses the getGrade (char) method
		System.out.println("The grade is " + getGrade(95.4));
		System.out.println("The grade is " + getGrade(87.2));
		
	}

	//printGrade does NOT return a value, that is why it's invoked on a single line
	public static void printGrade(double score){
		//A return statement is not needed for a void method, but it can be utilized for terminating the method and returning to the method's caller.
		if(score > 100 || score < 0) {
			System.out.println("Invalid score");
			return;
		}
		
		
	    if (score >= 90.0) {
	      System.out.println('A');
	    } 
	    else if (score >= 80.0) {
	      System.out.println('B');
	    } 
	    else if (score >= 70.0) {
	      System.out.println('C');
	    } 
	    else if (score >= 60.0) {
	      System.out.println('D');
	    } 
	    else {
	      System.out.println('F');
	    }
	  }
	
	//returnGrade returns a value
	public static char getGrade(double score) {
		if (score >= 90.0) {
				return 'A';
		    }else if (score >= 80.0) {
		    	return 'B';
		    }else if (score >= 70.0) {
		    	return 'C';
		    }else if (score >= 60.0) {
		    	return 'B';
		    }else {
		    	return 'F';
		    }
	}
	
	/*	Method Headers Examples:
	 * 1)Return a sales commission , given the sales amount and commission rate: 
	 * 		*public static double getCommission(double salesAmount, double commissionRate)
	 * 
	 * 2)Display calendar for a month, given the month and year: 
	 * 		*public static void printCalendar(int month, int year)
	 * 
	 * 3)Return a square root of a number: 
	 * 		*public static double sqrt(double value)
	 * 
	 * 4)Test whether a number is even, and returning true if it is: 
	 * 		*public static boolean isEven(int value)
	 * 
	 * 5)Display a message a specified number of times: 
	 * 		*public static void printMessage(String message, int times)
	 * 
	 * 6)Return the monthly payment, given the loan amount, number of years, and annual interest rate: 
	 * 		*public static double monthlyPayment(double loan, int numberOfYears, double annualInterestRate)
	 * 
	 * 7)Return the corresponding uppercase letter, given a lowercase letter: 
	 * 		*public static char getUpperCase(char letter)
	 * 
	 */
}
