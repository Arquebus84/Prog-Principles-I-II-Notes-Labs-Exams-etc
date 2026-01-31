import java.util.Scanner;
/**
* File: Lab06Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep, 27, 2024
* Last Modified: Sep, 27, 2024
* Description: Using a do-while loop, prompt the user to enter floating point numbers from -100.0 to 100.0 and determine the largest and smallest
* of those numbers. Any numbers outside the range should be ignored. The loop should exit once the user enters a value of -19.5. Also account for the
* situation where no valid values are entered and don't print a max or min
*/
public class Lab06Prob01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number from -100.0 to 100.0 (to stop, enter -19.5): ");
		double number = input.nextDouble();
		double max = 0;
		double min = 0;
		do {
			//Prompt user again until condition terminates loop
			number = input.nextDouble();
			//Check if the number is -19.5
			if(number == -19.5 || number > 100.0 || number < -100.0) {
				continue;
			}
			//Find the max and check if it's in range
			if(number > max && max < 100.0) {
				max = number;
			}
			//Find the min and check if it's in range
			if(number < min && min > -100.0) {
				min = number;
			}
						
		}while(number != -19.5);
		
		//Display
		if(max == 0.0 && min == 0.0) {
			System.out.println("There were no valid values");
		}else {
			System.out.println("The max value was " + max + "\nThe min value was " + min);
		}
	}
}
