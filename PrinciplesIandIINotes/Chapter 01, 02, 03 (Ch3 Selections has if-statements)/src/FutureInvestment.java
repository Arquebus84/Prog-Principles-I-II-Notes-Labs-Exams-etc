import java.util.Scanner;

public class FutureInvestment {
	
	//** A = P(1 + rt)
	//P is how much you invest
	//r is the interest rate
	//t is the time in years
	
	/**
	 * FV = PV * (1 + r)^n
	 * FV = Future Value
	 * PV = Present value of investment
	 * r = annual interest rate
	 * n = number of years the money is invested
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*double interestRate = 0.05;
		double taxRate = 0.05;
		double interest = interestRate * 45;
		
		System.out.println("Interest is " + interest);*/
		
		System.out.print("The amount invested: ");
	    double amount = input.nextDouble();

	    System.out.print("Annual interest rate in percent: ");
	    double interest = input.nextDouble();   

	    System.out.print("Enter number of years: ");
	    int years = input.nextInt();

	    System.out.println("The amount invested: " + amount + "\nAnnual interest rate: " + interest);
	    
	    //Change in interest rate
	    interest /= 100.0;
	    
	    System.out.println("Years       Future Value");

	    int i = 1;
	    while(i <= years){
	        System.out.printf("%d\t\t%.2f%n", i, futureInvestmentValue(amount, (interest), i));
	        i++;
	    }
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){       
		
		double power = Math.pow((1 + monthlyInterestRate), years);
	    double futureValue = investmentAmount * power;
	    return futureValue;
	}


}
