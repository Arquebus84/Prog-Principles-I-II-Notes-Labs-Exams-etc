package DefaultTests;
import java.util.Scanner;

public class SeperateThreeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Print a 3-digit number: ");
		int a = input.nextInt();
		
		int firstDigit = a / 100;
		int secAndThird = a % 100;
		int secondDigit = secAndThird / 10;
		int lastDigit = secAndThird % 10;
		
		System.out.println("Length of number: " + Integer.toString(a).length());
		if(a > 999) {
			System.out.println("Number is too large!");
		}else {
			testX(a);
		}	
		
		System.out.println("The first digit is " + firstDigit + "\nThe second digit is " + secondDigit + "\nThe last digit is " + lastDigit);
		
		input.close();
	}
	
	public static void testX(int x) {		
		System.out.println("1st Number: " + (x / 100));
		System.out.println("2nd Number: " + (x % 100) / 10);
		System.out.println("3rd Number: " + (x % 100) % 10);
		
	}
}
