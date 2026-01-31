/**
* File: Lab11Prob01.java
* Class: CSCI 1301
* Author: Matteo Ventura & Sean Roe
* Created on: Nov 15, 2024
* Last Modified: Nov 15, 2024
* Description: Display whether the cargo in the first array should be kept or tossed if it weighs more than 100lb and has a value of less than $1500
*/
public class Lab11Prob01 {

	public static void main(String[] args) {
		//Array:
		int[][] pirateBooty = {
			{ 110, 1600 }, 
			{ 101, 1400 }, 
			{ 200, 50 }, 
			{ 322, 700 }, 
			{ 57, 500 },
			{ 625, 1500 }, 
			{ 300, 320 }, 
			{ 50, 210 }, 
			{ 100, 105 }, 
			{ 90, 400 },
			{ 30, 2000 }, 
			{ 200, 1300 },
		};
				
		for(int i = 0; i < pirateBooty.length; i++) {
			//If it is in the constraints, it's a keep
			if((pirateBooty[i][0] > 100) && (pirateBooty[i][1] < 1500) && (i + 1) > 10) {
				System.out.printf("Cargo %d: toss%n", i + 1);
			//If it's not then toss
			}else if((pirateBooty[i][0] > 100) && (pirateBooty[i][1] < 1500) && ((i + 1) < 10)) {
				System.out.printf("Cargo  %d: toss%n", i + 1);				
			}else if((i + 1) < 10) {
				System.out.printf("Cargo  %d: keep%n", i + 1);
			}else{
				System.out.printf("Cargo %d: keep%n", i + 1);
			}
		}
	}

}
