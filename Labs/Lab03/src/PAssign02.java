/**
* File: PAssign02.java
* Class: CSCI 1301
* Author: Matteo Ventura
* Created on: Aug 30, 2024
* Last Modified: Aug 30, 2024
* Description: Calculate grades
*/
import java.util.Scanner;
public class PAssign02 {
	public static void main(String[] args) {
		//Note: The percentage grade for each category of the course is provided in the syllabus
		
		//Scanner
		Scanner input = new Scanner(System.in);		
		
		int count = 0;
		
		//Prompt the user to enter grades for Revel exercises
		System.out.print("Enter Revel grade: ");
		double revelGrade = input.nextDouble();
		double wrG = revelGrade * 0.10;
		count++;
		
		//Prompt the user to enter grades for Programming Assignments
		System.out.print("Enter Programming Assignments grade: ");
		double programGrade = input.nextDouble();
		double wpG = programGrade * 0.10;
		count++;
		
		//Prompt the user to enter grades for Lab
		System.out.print("Enter Lab grade: ");
		double labGrade = input.nextDouble();
		double wlG = labGrade * 0.10;
		count++;
		
		//Prompt the user to enter grades for Exam 1
		System.out.print("Enter Exam 1 grade: ");
		double exam1Grade = input.nextDouble();
		double we1G = exam1Grade * 0.15;
		count++;
		
		//Prompt the user to enter grades for Exam 2
		System.out.print("Enter Exam 2 grade: ");
		double exam2Grade = input.nextDouble();
		double we2G = exam2Grade * 0.15;
		count++;
		
		//Prompt the user to enter grades for Exam 3
		System.out.print("Enter Exam 3 grade: ");
		double exam3Grade = input.nextDouble();
		double we3G = exam3Grade * 0.15;
		count++;
		
		//Prompt the user to enter grades for Final Exam
		System.out.print("Enter Final Exam grade: ");
		double finalExamGrade = input.nextDouble();
		double wfEG = finalExamGrade * 0.25;
		count++;
			
		//Calculation
		float finalGrade = (float) (wrG + wpG + wlG + we1G + we2G + we3G + wfEG);
			
		//Final Output
		System.out.println("There were " + count + " grades entered.");
		System.out.println("The final grade for this course is " + finalGrade + ("."));
		
		//Close scanner to prevent memory leak
		input.close();
	}
}
