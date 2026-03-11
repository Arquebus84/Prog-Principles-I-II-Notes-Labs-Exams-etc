package ExceptionHandlingEx;

import java.util.Scanner;

public class ValidateInputTest{
	
	public static void main(String[] args) {
		
		/*try {
			
		}catch (InputException E) {
			
		}*/
		ValidateInput inputHandler = new ValidateInput();
		inputHandler.main(args);
		
		inputHandler.getClass();
	}
}

class ValidateInput{
	
	public ValidateInput() {
		
	}
	
	public void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean continueInput = true;
		while(continueInput) {
			try{
				System.out.println("Insert a number: ");
				int a = input.nextInt();
				System.out.println("The input is correct: " + a);
				continueInput = false;
				
			}catch(java.util.InputMismatchException Ex){
				System.out.println("The input was not a number, try again.");
				input.nextLine();
			}

		}
		
		input.close();
	}
}