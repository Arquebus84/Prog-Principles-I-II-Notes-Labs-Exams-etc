/**
* File: Lab04Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 6, 2024
* Last Modified: Sep 6, 2024
* Description: Display three messages to the console
*/
//import gsu.Math;
public class Lab04Prob03 {
	public static void main(String[] args) {
		int n = 950;
		int randomN = (int)(Math.random() * (n+1));
		double raise;
		double salary = 40000.0;
		
		int statusN = randomN % 7;
		//statusN = 4;
		
		if(statusN == 6) {
			raise =  8.7;
		}else if(statusN == 5) {
			raise =  7.3;
		}else if(statusN == 4) {
			raise =  6.1;
		}else if(statusN == 3) {
			raise =  5.7;
		}else if(statusN == 2) {
			raise =  4.2;
		}else if(statusN == 1) {
			raise =  3.7;
		}else if(statusN == 0) {
			raise =  0.0;
		}else {
			raise = 0.0;
		}
		
		double newSalary = salary + (salary * (raise / 100));
		
		System.out.println("With a random status of " + statusN + " and an initial salary of $" + salary + ", your raise is " + raise + "% which equates to a new salary of $" + newSalary + ".");
	}
}
