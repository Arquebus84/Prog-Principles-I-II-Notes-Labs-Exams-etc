import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Lottery randomly generates a two-digit number
		//If user input matches lottery number, display that you win $10,000;
		//If all the digits in the user input match the lottery number, you win $3,000;
		//If one of the digits in the user input matches at least one of the numbers from the lottery, you win $1,000;
		
		int lottery = (int)(Math.random() * 100);
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		System.out.print("Enter a two-digit number: ");
		int userInput = input.nextInt();
		
		int userDigit1 = userInput / 10;
		int userDigit2 = userInput % 10;
		
		System.out.println("\nThe lottery number is " + lottery + "\n");
		
		if(userInput == lottery) {
			System.out.print("Match! You win $10,000");
		}else if(userDigit1 == lotteryDigit2 && userDigit2 == lotteryDigit1) {
			System.out.print("Your numbers match the numbers of the lottery! you win $3,000");
		}else if(userDigit1 == lotteryDigit1 || userDigit1 == lotteryDigit2 || userDigit2 == lotteryDigit1 || userDigit2 == lotteryDigit2) {
			System.out.print("at least one of your numbers matches the numbers of the lottery! you win $1,000");
		}else
			System.out.print("Your numbers do not match the numbers of the lottery. What a shame.");
	}
}
