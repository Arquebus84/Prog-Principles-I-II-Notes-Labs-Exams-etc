/**
* File: Lab06Prob03.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe
* Created on: Feb 28, 2025
* Last Modified: Feb 28, 2025
* Description: 	Copy Lab06Prob02 and make the following Adjustments:
* 					Extract each price one-at-a-time, and display them as follows:
* 						- If price < $50, increment price by 6.25% (Calculate as: (1 + 0.0625) * price)
* 						- If ($50 <= price < $100), then increment price by 12.5% (1.125 * price)
* 						- If price > $100, then increment price by 25% (1.25 * price)
* 					Display each calculation in the printf() statement (limiting them to 2 decimal points)
* 					
*/
import java.io.*;
import java.util.*;
public class Lab06Prob03 {
	public static void main(String[] args) {
		// Declare and initialize File object with path directory
		//Test with: "C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\pricelist.txt"
		
		Scanner input = null;
		try {			
			//Declare and Initialize PrintWriter (for GradeScope)
			/**PrintWriter output = new PrintWriter(new File("src/pricelist-lab06.txt"));
			File file = new File("src/pricelist.txt");*/
			
			//**Make Modifications here:
			File file = new File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\pricelist.txt");
			PrintWriter output = new PrintWriter(new File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\pricelist-lab06.txt"));
			
			input = new Scanner(file);
			
			double price;
			// while-loop to ensure that the program will run until the input has suffice information
			while (input.hasNext()) {
				// The pricelist.txt file includes a numeric array of floating-point values; thus, each value will be read as a double
				price = input.nextDouble();
				// Print each value in a new line
				if(price > 100.0) {
					price *= 1.25;		//Increment price by 25%
				}else if(price < 100.0 && price >= 50.0) {
					price *= 1.125;		//Increment price by 12.5%
				}else if (price < 50.0){
					price *= 1.0625;	//Increment price by 6.25%
				}
				//output.format("%.2f\n", price);
				
				output.printf("%.2f\n", price);
				
			}
			output.close();
		} catch (Exception ex) { // Catch an exception in case the file does not exist (FileNotFoundException)
			System.out.println("Conversion unsuccessful");
		}finally {
			input.close();
		}
		
		
		try {
			File displayFile = new File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\pricelist-lab06.txt");
			Scanner scan = new Scanner(displayFile);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		}catch(Exception ex) {
			System.out.println("File not found");
		}
		
	}
}
