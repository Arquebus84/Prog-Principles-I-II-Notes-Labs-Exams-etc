import java.util.*;
/**
* File: PAssign04.java
* Class: CSCI 1302
* Author: Matteo Ventura
* Created on: Feb 15, 2025
* Last Modified: Feb 17, 2025
* Description: Use sentinel-controlled loop (sentinel value is -999 & it should NOT be included in the array), to ask user for input of double 
* 				numbers; if the new inputed numbers are not the same as the last ones, add it to the ArrayList (use the !contains(input) to check).
* 				Utilize exception-handling (try/catch) that looks for handles of InputMismatchExceptions, ArrayStoreExceptions, and general Exception.
*/
public class PAssign04 {
	
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in); // From java.util.Scanner

		// ArrayList
		ArrayList<Double> arrayList = new ArrayList<>();
		double a = 0;
		double avg = 0;

		try {
			while (a != -999) {
				// InputMismatchException from java.util.InputMismatchException
				try {
					System.out.print("Enter a double value (-999 to exit): ");
					a = input.nextDouble();

					if (arrayList.contains(a)) {
						throw new ArrayStoreException("Duplicate");
					}

					if (!arrayList.contains(a) && a != -999) {
						arrayList.add(a);
						avg += a;
					}
					
					// If an InputMismatchException occurs, print an error message and allow the
					// user to enter another value
				} catch (InputMismatchException InputEx) {
					System.out.println("That is not a valid double value");
					input.nextLine(); // Discards input

					// If a non-unique value is entered, a new instance of an ArrayStoreException should be thrown 
				} catch (ArrayStoreException AStoreEx) {
					System.out.println("Duplicate Value");
				}
			}
			input.close();

			avg /= arrayList.size();

			// Check if there are any errors by first calculating the minimum and maximum
			double min = java.util.Collections.min(arrayList);
			double max = java.util.Collections.max(arrayList);
			
			// Display ArrayList
			System.out.printf("%n%s%n", arrayList); // Returns the list
			// Calculate and display the min/max values of ArrayList using the java.util.Collection
			System.out.printf("Average: %.2f%n", avg); // Returns the Average
			System.out.printf("Max: %.2f%n", max); // Returns the Max
			System.out.printf("Min: %.2f%n", min); // Returns the Min

			/**NOTE: could also utilize NoSuchElementException*/
		} catch (Exception InValidEx) {	
			//Display that there were no values to process
			System.out.println("There were no values to process");
		}
	}

}
