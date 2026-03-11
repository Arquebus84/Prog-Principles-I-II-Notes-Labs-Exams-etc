package ClassLoopsEx;

import java.util.Scanner;

public class TestWhileDoWhile {

	public static void main(String[] args) {
		/*
		 * while(true) {//Execute statements}
		 * 
		 * while(100){} //This is true!
		 * 
		 * int count = 0;
		 * while(count < 2){
		 * System.out.println("Welcome!");
		 * count++; }
		 */
		//Take inputs
		//Calculate the sum of the inputs
		
		//If input is 0, then break (stop taking input)
		Scanner input = new Scanner(System.in);
		System.out.println("Write any integer, but stop it when you put a negative value: ");
		int data = input.nextInt();
		int maxValue = data;
		
		int sum = 0;
		//Do-while
		do {
			sum += data;
			if(data > maxValue) {
				maxValue = data;
			}
			System.out.println("Write any integer, but stop it when you put a negative value: ");
			data = input.nextInt();
		}while(data >= 0);
		
		//While
		while(data >= 0) {
			sum += data;
			if(data > maxValue) {
				maxValue = data;
			}
			System.out.println("Write any integer, but stop it when you put a negative value: ");
			data = input.nextInt();
		}
		System.out.printf("The Sum is %d%n", sum);
		System.out.printf("The largest number that you entered is %d", maxValue);
		
		
	}

}
