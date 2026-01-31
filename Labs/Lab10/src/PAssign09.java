/**
* File: PAssign09.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 9, 2024
* Last Modified: Nov 9, 2024
* Description: Using two arrays (annual maintenance and annual rental income), with the constraints, the program will display 12 properties (from 0 to 11);
* 				each property will be determined whether it should be kept or donated
*/
public class PAssign09 {

	public static void main(String[] args) {
		//The renovation/maintenance costs that are over 4.75 years have to be less than half of the 10.25-year rental revenue for all properties
		//**Ex: property 0 will be kept because half of it's 10.25 year rental ((26752 * 10.25) / 2 = 137104) is greater 
		//	than it's 4.75 year cost (26752 * 4.25 = 127072)
		
		//Arrays are in USD
		//Annual renovations/maintenance income
		double[] annualMain = {21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005};
		//Annual rental income
		double[] annualRental = {26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350};

		//calculate the total maintenance and rental income before and after the donation:
		double totalMainBefore = 0;
		double totalRentalBefore = 0;
		double totalMainAfter = 0;
		double totalRentalAfter = 0;
				
		for(int i = 0; i < annualMain.length; i++) {
			totalMainBefore += annualMain[i];			
			if(keepProperty(annualMain[i], annualRental[i]) == true) {
				totalMainAfter += annualMain[i];
			}
		}
		for(int i = 0; i < annualRental.length; i++) {
			totalRentalBefore += annualRental[i];			
			if(keepProperty(annualMain[i], annualRental[i]) == true) {
				totalRentalAfter += annualRental[i];
			}
		}
		
		System.out.printf("Total maintenance/renovation before donation: $%,.2f%nTotal rental income "
				+ "before donation: $%,.2f%n", totalMainBefore, totalRentalBefore);
		System.out.printf("%nTotal maintenance/renovation after donation: $%,.2f%nTotal rental income "
				+ "after donation: $%,.2f%n", totalMainAfter, totalRentalAfter);		
		//**The total donated income = annual Rental total Before Donation - annual Rental total After Donation
		System.out.printf("%nTotal Donated Rental Income: $%,.2f%n%n", (totalRentalBefore - totalRentalAfter));
		
		//Create new boolean array:
		boolean[] decisionArray = new boolean[annualMain.length];
		for(int i = 0; i < decisionArray.length; i++) {
			decisionArray[i] = keepProperty(annualMain[i], annualRental[i]);
		}
		
		//Invoke the printDecision method:
		printDecisions(decisionArray);		
	}
	
	//Keep Property Method contains a single property's annual maintenance (first parameter) and rental income (second parameter); both are doubles
	//Method returns true (keep) if property's maintenance costs over 4.75 are less than half of the projected 10.25-year rental revenue, else return false
	//***The result of this method should be stored in an array called decision (in main method)
	public static boolean keepProperty(double annual, double rental) {
		//maintenance costs * 4.5 are less than half the 10.25 rental revenue
		if(annual * 4.75 < (rental * 10.25) / 2.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void printDecisions(boolean[] decision) {
		//The array contains the values returned from keepProperty()
		for(int i = 0; i < decision.length; i++) {
			if(decision[i] == true){
				System.out.println("Property " + i + " - keep");
			}else {
				System.out.println("Property " + i + " - donate");
			}
		}
	}

}
