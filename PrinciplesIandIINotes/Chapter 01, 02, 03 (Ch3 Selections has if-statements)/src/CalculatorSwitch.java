import java.util.*;

public class CalculatorSwitch {
	public static void main(String[] args) {
		// get operands and operator from user
		Scanner input = new Scanner(System.in);
		int op1 = 0, op2 = 0, result = 0;
		char operation; 
		
		// prompt user for values
		System.out.println("Enter first value: ");
		op1 = input.nextInt();
		
		System.out.println("Enter operation (+, -, *, /): ");
		String tmp = input.next();
		operation = tmp.charAt(0);
				
		System.out.println("Enter second value: ");
		op2 = input.nextInt();
		
		// perform operation
		switch (operation) {
			case '+': 
				result = op1 + op2;
				break;
			case '-':
				result = op1 - op2;
				break;
			case '*':
				result = op1 * op2;
				break;
			case '/':
				result = op1 / op2;
				break;
			default:
				operation = 'X';
		}
		
		// output results of operation
		if (operation != 'X') {
			System.out.println(op1 + " " + tmp + " " + op2 + " = " + result);
			System.out.printf("%d %c %d = %d%n%d", op1 , operation, op2, result, op1);
			//%d is integer op1, %c is the char operation, %d is op2, %d is result, %n is new line; for that new line you tell it to print %d (a new number), which is op1
		} else {
			System.out.println("You chose an invalid choice");
		}
		
		int count = 5;
		double amount = 45.65;
		System.out.printf("count is %d and amount is %f", count, amount);
		
		/*new line/enter = %n or %n
		tab = \t
		decimal (decimal place) = %0.2f*/
		double decimal = 3.1415926;
		System.out.printf("%n%.2f", decimal);
		
		input.close();
	}

}
