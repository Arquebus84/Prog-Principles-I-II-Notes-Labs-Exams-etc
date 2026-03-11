package ExceptionHandlingEx;

import java.util.*;

public class InputMismatchExceptionEx {

	//the statement input.nextLine() discards the current input line, so the user can enter a new line of input
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int integerNum = 0;;
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an integer: ");
				integerNum = input.nextInt();
				
				continueInput = false;
			}catch(InputMismatchException Ex) {
				System.out.println("Not an integer; try again");
				input.nextLine();	//Discard input
			}
			
		}while(continueInput);
		
		System.out.println("The integer is: " + integerNum);
		input.close();
	}
}
