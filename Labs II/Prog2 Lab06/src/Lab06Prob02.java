/**
* File: Lab06Prob02.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe
* Created on: Feb 28, 2025
* Last Modified: Feb 28, 2025
* Description: 	Using the pricelist.txt file from textFileIO.zip.
* 				Create a File object with the path ("src//filename.txt"), in this case, it's ("src/pricelist.txt")
* 				Use the try-with-resource blocks to surround the Scanner object inside the try's parenthesis
* 				Extract each price one-at-a-time and print them in the console; formatted in US currency ($XX.XX)
*/

import java.io.*;
import java.util.*;
public class Lab06Prob02 {
	public static void main(String[] args) {		
		//Declare and initialize File object with path directory
		File file = new File("src/pricelist.txt");
		
		//Use the try-with resource to surround the Scanner
		try(Scanner input = new Scanner(file);){
			//while-loop to ensure that the program will run until the input has suffice information
			while(input.hasNext()) {
				//The pricelist.txt file includes a numeric array of floating-point values, thus, each value will be read as a double
				
				//Print each value in a new line
				System.out.printf("$%.2f%n", input.nextDouble());
			}
		}catch(Exception ex) {	//Catch an exception in case the file does not exist (FileNotFoundException)
			System.out.println(ex.toString());
		}
	}
}
