/**
* File: Lab07Prob03.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Use loops to create a Taylor Series to approximate Cos(x) at pi/6; also compare it to the actual value
*/
public class Lab07Prob03 {
	public static void main(String[] args) {
		//**cos(x) ~ sum (from 0 to 7) for [(-1)^i/(2i)!] * x^2i
		//X
		double x = (Math.PI)/6.0;
		double actual = 0.0;
		double approx = 0.0;
		for(int i = 0; i <= 7; i++) {
			
			//factorial of 2i
			double n = (2 * i);
			double factorialN = 1.0;
			for(int j = 1; j <= n; j++) {
				factorialN *= j;
			}
			
			//Calculate top
			double top = (Math.pow(-1.0, i));
			//Calculate bottom
			double bottom = factorialN;
			double newX = Math.pow(x, (2.0*i));
			approx += (top * newX)/(bottom);
		}
		
		actual = Math.cos(x);
		
		System.out.printf("Actual Cos (PI/6): %.16f%n", actual);
		System.out.printf("Approx Cos (PI/6): %.16f", approx);
	}
}
