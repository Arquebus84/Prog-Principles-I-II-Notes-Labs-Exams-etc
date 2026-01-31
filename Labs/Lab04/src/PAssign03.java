/**
* File: PAssign03.java
* Class: CSCI 1301
* Author: Matteo Ventura
* Created on: Sep 6, 2024
* Last Modified: Sep 6, 2024
* Description: Display and calculate the food order
*/
import java.util.Scanner;
public class PAssign03 {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Constants
		final double sandCost = 2.75;
		final double bevCost = 0.5;
		
		//Variables
		double subTotal;
		double total;		
		double sandQ;
		double bevQ;	
		
		//Prompt the user to enter the beverages
		System.out.print("Enter the number of beverages: ");
		bevQ = input.nextDouble();		
		
		//If the user entered 0 for beverage quantity, prompt the user to enter a value again
		if(bevQ > 0) {
			System.out.println("Ordered: " + (bevQ) + " beverages\n");
		}else {			
			System.out.println("ERROR: A quantity of zero is not allowed.\n");			
			System.out.print("Enter the number of beverages: ");
			bevQ = input.nextDouble();
			System.out.println("Ordered: " + (bevQ) + " beverages\n");			
		}
		
		//Prompt the user to enter the sandwiches
		System.out.print("Enter the number of sandwiches: ");
		sandQ = input.nextDouble();
		
		//If the user entered 0 for sandwich quantity, prompt the user to enter a value again
		if(sandQ > 0) {						
			System.out.println("Ordered: " + (sandQ) + " sandwiches\n");
		}else {
			System.out.println("ERROR: A quantity of zero is not allowed.\n");
			
			System.out.print("Enter the number of sandwiches: ");
			sandQ = input.nextDouble();
			System.out.println("Ordered: " + (sandQ) + " sandwiches\n");
		}
		
		//Subtotal is calculated by the combined value of each item
		subTotal = (sandQ * sandCost) + (bevQ * bevCost);
		
		//Total is calculated by multiplying the tax of 1.075
		total = subTotal * (1.075);
		
		//Display the items
		if(sandQ == 0 || bevQ == 0) {
			System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
		}else {
			System.out.println("The subtotal of " + bevQ + " beverages and " + sandQ + " sandwiches is $" + (subTotal) + ".\nWith tax, the total is $" + (total) + ".");
		}
		
		//Close scanner to prevent memory leak
		input.close();
	}
}