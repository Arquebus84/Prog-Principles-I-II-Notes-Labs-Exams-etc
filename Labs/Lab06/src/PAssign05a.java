import java.util.Scanner;

/**
* File: PAssign05a.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep, 28, 2024
* Last Modified: Sep, 29, 2024
* Description: Using while/do-while loops, read exam grades until a sentinel value is entered (-999). Once the user is done entering grades, display
* the results
*/
public class PAssign05a {
	public static void main(String[] args) {
		//Program should display number of valid grades entered, number of grades rejected, lowest grade and highest grade
		//Classify and count the grades as either As Bs Cs Ds or Fs and display them
		//A = (90-100), B = (80-89), C = (70-79), D = (60-69), F = (<60)
		Scanner input = new Scanner(System.in);
		
		double highest = 0;
		double lowest = 0;
		int validG = 0;
		int invalidG = 0;
		//Classify the grades that are As, Bs, Cs, Ds, or Fs
		int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;
		
		System.out.print("Enter grade from 0-100, -999 to stop: ");
		int grade = input.nextInt();
				
		//loop-condition-control (sentinel value)
		while(grade != -999) {
			//Check if the grade is in range, otherwise, display this message
			if(grade > 100 || grade < 0) {
				System.out.println("Error: That is not a valid score.");
				invalidG++;
			}else {
				validG++;
			}
			
			System.out.print("Enter grade from 0-100, -999 to stop: ");
			grade = input.nextInt();
						
			//The sentinel value should not be counted as grades (continue)
			if(grade == -999) {
				continue;
			}
			
			//Classify grade as either A, B, C, D, or F
			if(grade >= 90)
				numA++;
			else if(grade >= 80)
				numB++;
			else if(grade >= 70)
				numC++;
			else if(grade >= 60)
				numD++;
			else if (grade <= 60)
				numF = 0;
						
			//Find the highest grade in the range
			if(grade > highest && grade <= 100) {
				highest = grade;
			}
			//Find the lowest grade in the range
			if(grade < highest && grade >= 0) {
				lowest = grade;
			}
		}
		//Display results:
		//Grades validity and range
		System.out.println("\nValid grades:\t" + validG);
		System.out.println("Invalid grades:\t" + invalidG);
		System.out.printf("Highest grade:\t%.2f%n", highest);
		System.out.printf("Lowest grade:\t%.2f%n", lowest);
		//Grades classification
		if(highest == 0 || lowest == 0) {
			System.out.printf("\nAs:\t%d%n", 0);
		}else
			System.out.printf("\nAs:\t%d%n", numA);
		System.out.printf("Bs:\t%d%n", numB);
		System.out.printf("Cs:\t%d%n", numC);
		System.out.printf("Ds:\t%d%n", numD);
		System.out.printf("Fs:\t%d%n", numF);
		
	}
}
