import java.util.Scanner;
/**
* File: Lab06Prob03.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep, 27, 2024
* Last Modified: Sep, 27, 2024
* Description: Using a sentinel-controlled while loop, the program only sums up positive, even integers, and
* the resulting average is displayed on the console once the sentinel value of 672 is entered
* ***The sentinel value should not be included in any of the calculations (same as Lab03Prob01)
*/
public class Lab06Prob03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user
		System.out.println("Enter a set of integers (end the set by entering 672): ");
		int number = input.nextInt();
		int sum = number;
		double numbersEntered = 0.0;
		while(number != 672) {
			//Prompt the user until he/she enters sentinel value
			number = input.nextInt();
			if(number == 672 || number < 0 || number % 2 != 0) {
				continue;
			}else {
				numbersEntered++;
			}			
			sum += number;
		}
		//Find the average (NOTE: the numbers entered includes initial sum)
		double avg = (double) (sum / (numbersEntered + 1));
		//Display the sum and average
		System.out.printf("For the positive, even numbers, the sum was %d and the average was %.4f", sum, avg);
	}
}
