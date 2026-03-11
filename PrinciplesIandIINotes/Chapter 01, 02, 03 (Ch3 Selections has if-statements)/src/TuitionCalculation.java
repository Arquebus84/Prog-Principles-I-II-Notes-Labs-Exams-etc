import java.util.Scanner;
public class TuitionCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int tuitionAmount = 1;
		
		System.out.println("If you are an in-state resident press 1, but if you are an out-of-state resident press 0: ");
		userInput = input.nextInt();
		
		if(userInput == 1) {
			System.out.println("You are elligible for a $3000 tuition.");
			tuitionAmount *= 3000;
		}else if (userInput == 0){
			System.out.println("You are elligible for a $7500 tuition.");
			tuitionAmount *= 7500;
		}else {
			System.out.println("Incorrect number");
		}
		
		System.out.println("Your tuition amount: $" + tuitionAmount);
	}
}
