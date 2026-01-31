import java.util.Scanner;
/**
* File: PAssign01a.java
* Class: CSCI-1301-H
* Author: Matteo Ventura Sean Roe
* Created on: August 16, 2024
* Last Modified: August 16, 2024
* Description: Display the cost of food products
*/
public class PAssign01a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Parameters
		double sandwichCost = 2.75;
		double beverageCost = 0.5;		
		double sandwichAmount, beverageAmount;
		
		//User input
		beverageAmount = input.nextInt();
		sandwichAmount = input.nextInt();		
		
		//Calculations
		double itemTotal = (sandwichCost * sandwichAmount) + (beverageCost * beverageAmount);
		
		//Display results
		System.out.println("The total of " + beverageAmount + " beverages and " + sandwichAmount + " sandwiches is $" + itemTotal + ".");
	}
}