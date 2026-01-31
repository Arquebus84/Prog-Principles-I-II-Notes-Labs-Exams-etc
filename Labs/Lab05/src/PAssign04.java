import java.util.Scanner;

/**
* File: PAssign04.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 20, 2024
* Last Modified: Sep 20, 2024
* Description: Prompt the user to enter rectangle width and height and the program will calculate it
*/
public class PAssign04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter width for rectangle: ");
		int width = input.nextInt();
		System.out.printf("Enter height for rectangle: ");
		int height = input.nextInt();
		
		//If width and height is negative
		if(width < 0 || height < 0) {
			System.out.printf("Your rectangle must have a positive height and width.%n");
		}else {
			
			System.out.printf("Enter x,y value for center point of rectangle: ");
			String center = input.next();
			System.out.printf("Enter x,y value for test point: ");
			String test = input.next();
			
			//Indicate the comma
			int centerComma = center.indexOf(',');
			int testComma = test.indexOf(',');
			//Convert Strings to doubles
			double centerX = Double.parseDouble(center.substring(0,centerComma));
			double centerY = Double.parseDouble(center.substring(centerComma + 1));
			double testX = Double.parseDouble(test.substring(0,testComma));
			double testY = Double.parseDouble(test.substring(testComma + 1));
			
			//Calculate horizontal and vertical distance
			double distHor = Math.sqrt((testX - centerX) * (testX - centerX));
			double distVer = Math.sqrt((testY - centerY) * (testY - centerY));
			
			//Convert to integers
			int cX = (int)(centerX);
			int cY = (int)(centerY);
			int tX = (int)(testX);
			int tY = (int)(testY);
			
			//Display results
			if(distHor <= (width / 2.0) && distVer <= (height / 2.0)) {
				System.out.printf("(%d" + ", " + "%d) is in the rectangle centered at (%d" + ", " + "%d) with width %d and height %d%n", tX, tY, cX, cY, width, height);
			}else {
				System.out.printf("(%d" + ", " + "%d) is not in the rectangle centered at (%d" + ", " + "%d) with width %d and height %d%n", tX, tY, cX, cY, width, height);
			}
			
		}
		
	}
}
