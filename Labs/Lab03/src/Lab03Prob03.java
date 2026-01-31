/**
* File: Lab03Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Aug 30, 2024
* Last Modified: Aug 30, 2024
* Description: Display three messages to the console
*/
import java.util.Scanner;
public class Lab03Prob03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//User Variables
		int currentCreditHours;
		int degreeCreditHours;		
						
		//User Input
		System.out.print("Type the number of credit hours that you currently have accumulated: ");
		currentCreditHours = input.nextInt();
		
		System.out.print("Type the number of credit hours that your degree requires: ");
		degreeCreditHours = input.nextInt();
		
		//Calculated Variables
		double remainingCreditHours = (degreeCreditHours - currentCreditHours);		
		
		//Display Output
		System.out.println("You have " + currentCreditHours + " credit hour(s).");
		System.out.println("Your degree requires " + degreeCreditHours + " credit hour(s).");
		System.out.println("You have " + (int) remainingCreditHours + " credit hour(s) until graduation.");
		System.out.println("You have " + (remainingCreditHours / 15.0) + " semester(s) (@ 15 credit hours/semester) left until graduation.");
		System.out.println("You have " + (remainingCreditHours / 30.0) + " year(s) (@ 2 semesters/year) left until graduation.");
		System.out.println("You have " + (remainingCreditHours / 45.0) + " year(s) (@ 3 semesters/year) left until graduation.");
		System.out.println("You have " + (int) remainingCreditHours / 30 + " year(s), " + (int) remainingCreditHours % 30 / 15 + " semester(s), and " + (int) remainingCreditHours % 15 % 30 + " credit hour(s) (@ 2 semesters/year) left until graduation.");
	}
}