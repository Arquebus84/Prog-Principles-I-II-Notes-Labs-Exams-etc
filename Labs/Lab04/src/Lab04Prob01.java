/**
* File: Lab04Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Sep 6, 2024
* Last Modified: Sep 6, 2024
* Description: Display messages that determine whether someone is eligible for purchasing alcohol.
*/
//import gsu.Math;
public class Lab04Prob01 {
	public static void main(String[] args) {
		int n = 65;
		int age = (int)(Math.random() * (n + 1));
		
		if(age >= 21) {
			System.out.println("You are " + age + " years old and are eligible to purchase alcohol.");
		}else{
			System.out.println("You are " + age + " years old and are not eligible to purchase alcohol.");
		}		
	}
}
