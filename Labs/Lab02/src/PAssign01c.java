/**
* File: PAssign01c.java
* Class: CSCI-1301-H
* Author: Matteo Ventura Sean Roe
* Created on: August 16, 2024
* Last Modified: August 16, 2024
* Description: Display the measurement of gas pressure
*/
public class PAssign01c {
	public static void main(String[] args) {
		//Ideal Gas Law: PV = nRT; calculate the pressure, P = nRT/V 
		//Parameters
		final double r = 8.31446;
		double volume = 0.25;
		int temperature = 313;
		
		//Calculation
		double pressure = (r * temperature) / volume;
		
		//Results
		System.out.println("The pressure of 1 mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " + temperature + " K is " + pressure + " pascals.");
	}
}
