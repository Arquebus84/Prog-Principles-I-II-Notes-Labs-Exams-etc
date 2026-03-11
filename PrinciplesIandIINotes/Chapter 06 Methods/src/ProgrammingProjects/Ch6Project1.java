package ProgrammingProjects;

//This import has been 
//import java.util.Scanner;

/**
 * FV = PV * (1 + r)^n
 * FV = Future Value
 * PV = Present value of investment
 * r = annual interest rate
 * n = number of years the money is invested
 */

public class Ch6Project1 {

	public static void main(String[] args) {
		
		//DO NOT USE: Revel wants to use the scanner below this one
		//Scanner input = new Scanner(System.in);
		
		//This is Revel's requirement
		java.util.Scanner input = new java.util.Scanner(System.in);
						
		System.out.print("The amount invested: ");
	    double amount = input.nextDouble();

	    System.out.print("Annual interest rate in percent: ");
	    double interest = input.nextDouble();   

	    System.out.print("Enter number of years: ");
	    int years = input.nextInt();

	    System.out.println("\nThe amount invested: " + (int)amount + "\nAnnual interest rate: " + (int)interest);
	    
	    System.out.println("Years     	Future Value");
	    
	    for(int i = 1; i <= 30; i++) {
	    		    	
	    	double futureValue = futureInvestmentValue(amount, interest / 1200, i);
	    	System.out.printf("%d\t\t%.2f%n", i, futureValue);
	    }
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		
	    //FV = PV * (1 + r)^n    	
	    return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
	}

}
