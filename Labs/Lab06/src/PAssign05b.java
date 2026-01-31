import java.util.Scanner;

/**
* File: PAssign05b.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep, 28, 2024
* Last Modified: Sep, 29, 2024
* Description: Prompt the user to enter the number of grades; once they have entered the grades, display the valid, invalid, and the number of As, Bs,
* Cs, Ds, and Fs.
*/
public class PAssign05b {
	public static void main(String[] args) {
		//Program should display number of valid grades entered, number of grades rejected, lowest grade and highest grade
		//Classify and count the grades as either As Bs Cs Ds or Fs and display them
		//A = (90-100), B = (80-89), C = (70-79), D = (60-69), F = (<60)
		Scanner input = new Scanner(System.in);
				
		double highest = 0;
		double lowest = 0;
		int validG = 0;
		int invalidG = 0;
		int grade = 0;
		//Classify the grades that are As, Bs, Cs, Ds, or Fs
		int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;
		
		//Prompt the user to enter the number of grades (sentinel value)
		System.out.print("Number of Grades: ");
		int gradeN = input.nextInt();
				
		//For loop with number of grades 
		for(int i = 1; i <= gradeN; i++) {						
			System.out.print("Enter grade from 0-100 (" + i + " of " + gradeN + "): ");
			grade = input.nextInt();
			
			//Check if the grade is in range, otherwise, display this message
			if(grade > 100 || grade < 0) {
				System.out.println("Error: That is not a valid score.");
				invalidG++;
				continue;
			}else {
				validG++;
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
		System.out.printf("\nAs:\t%d%n", numA);
		System.out.printf("Bs:\t%d%n", numB);
		System.out.printf("Cs:\t%d%n", numC);
		System.out.printf("Ds:\t%d%n", numD);
		System.out.printf("Fs:\t%d%n", numF);
	}
}
