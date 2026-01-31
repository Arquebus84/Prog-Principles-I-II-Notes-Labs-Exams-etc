/**
* File: Lab07Prob01.java
* Class: CSCI 1301
* Author: Sean Roe & Matteo Ventura
* Created on: Oct 11, 2024
* Last Modified: Oct 11, 2024
* Description: Use loops to create an inverse decreasing right triangle
*/
public class Lab07Prob01 {
	public static void main(String[] args) {
		//Outer loop for vertical asterisks
		for(int i = 0; i < 5; i++) {
			//Inner loop for horizontal asterisks
			for(int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
