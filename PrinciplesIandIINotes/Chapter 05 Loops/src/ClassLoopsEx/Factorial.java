package ClassLoopsEx;

import java.util.Scanner;

//***Factorial of 5 = 5! = 1*2*3*4*5
public class Factorial {

	
	//**Remember that the formula for factorial n is n * (n - 1) * (n - 2) * (n - 3) * ... * 3 * 2 * 1
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Factorial n has to be a double
		
		System.out.println("Input an integer");
		double factorial = 1;
		double n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + n + " is: " + factorial);
		System.out.println("Factorial of " + n + " is: " + factorial(n));
		System.out.println("Factorial of 3 is: " + factorial(3));

	}
	
	public static double factorial(double n) {
		double result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}		
		
		return result;
	}
	
	public static int factorial(int n) {
		int result = n;
		for(int i = n - 1; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}
