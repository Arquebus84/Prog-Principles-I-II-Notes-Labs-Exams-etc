import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Loop: A structure that controls a repeated execution of a block of statements
		//Java provides while loops, for loops and do-while loops
		//While loop: a loop construct; checks if a condition is true and repeats it until it reaches the final amount
		/*
		 * Syntax:
		 * while(loop-continuation-condition){
		 * 		//Loop body
		 * 		Statements;
		 * }
		 */
		
		//This is a counter-controlled loop
		int count = 0;
		while(count < 10) {
			count++;
			//System.out.printf("count is: %d%n", count); //Prints the same line 10 times
		}
		System.out.printf("count is: %d%n", count); //Prints the result of count
		//If count++ was not in the loop body, then it would continue forever b/c count is 0;
		
		//Answer correctly
		/*int num1 = (int)(Math.random() * 10); //Random numbers from 0 to 9
		int num2 = (int)(Math.random() * 10);
		
		System.out.print("What is " + num1 + " + " + num2 + "?: ");
		int answer = input.nextInt();
		
		while(num1 + num2 != answer) {
			System.out.println("Wrong answer. Try again. " + "What is " + num1 + " + " + num2 + " = ?: ");
			answer = input.nextInt();
		}
		
		System.out.println("Correct! " + num1 + " + " + num2 + " = " + (num1 + num2));*/
		
		//This is a while loop that relates to a for loop
		int i = 1, sum = 0;
		while (i <= 10) {
		  sum += i;
		  i++;
		}
		System.out.println("sum is " + sum); //Code runs 10 times: 1 + 2 + 3 ... + 9 + 10 = 55
		
		//This is a while loop that calculates the factorial of 10 or 10!
		int r = 1, mutliply = 1;
		while (r <= 10) {
			mutliply *= r;
		  r++;
		}
		System.out.println("10! is " + mutliply); //Code runs 10 times: 1 + 2 + 3 ... + 9 + 10 = 55
		
		/*NOTE: infinite loops (common programming error) occur when the program has a bug where it takes an unusual amount of time to run and doesn't stop
			int in = 1;
			while(in < 100) {
				if(in % 2 == 0)
					System.out.println(in); }
		
		//Note: Off-by-one error occurs when the first element in the array i is 1 and the last is 10; while (i < 10) therefore making 9 iterations
		int in = 1;
		while(in <= 10) {
		  if((in++) % 2 == 0) {
			  System.out.println(i); //In this example, in is 1, but since 1 is added to in, it becomes 2 (which is divisible by 2). 
		  }
		}//Therefore it prints: 11
		
		//This is what happens when a variable is assigned a value too large to be stored; it causes an overflow
		int x = 80000000;
		while (x > 0) 
		  x++;
		System.out.println("x is " + x);// x is -2147483648 because 2147483647 + 1 becomes negative
		*/
		
		//***Iteration: the one time execution of the loop body
		
		int e = 0;
		while(e++ < 10) {
			System.out.println("This is repeated 10 times");
		}
		int a = 0;
		while(++a < 10) {
			System.out.println("This is repeated 9 times");
		}
		
		//CASE STUDY: Guess the number between 0 and 100
		/*int num = (int)(Math.random() * 101);
		System.out.print("Guess the randomly selected number that is between 0 and 100: ");
		int guess = input.nextInt();
		
		while(num != guess) {
			if(guess < 0 || guess > 100) {
				System.out.println("Your number is not between 0 and 100, try again: ");
			}else if(guess > num)
				System.out.println("Your number is too high, try again: ");
			else if(guess < num) {
				System.out.println("Your number is too low, try again: ");
			}			
			guess = input.nextInt();
		}
		System.out.println("Yup, the correct number is " + num);*/
		
		//number between 0 and 10 with boolean
		int number = (int)(1 + Math.random() * 10);
		//Ask user to guess
		System.out.print("Guess the randomly selected number that is between 1 and 10: ");
		int userGuess = input.nextInt();
		
		boolean notDone = true;
		while(notDone) {	
			if(userGuess == number) {
				System.out.println("Yup, the correct number is " + number);
				notDone = false;
				break;
			}else if(userGuess < 1 || userGuess > 10) {
				System.out.println("Your number is not between 1 and 10, try again: ");
			}else if(userGuess > number) {
				System.out.println("Your number is too high, try again: ");
			}else if(userGuess < number) {
				System.out.println("Your number is too low, try again: ");
			}			
			userGuess = input.nextInt();
		}
		/*
		int count = 0;
		while (count < 100) {
		  // Point A
		  System.out.println("Welcome to Java!");
		  count++;
		  // Point B
		}

		// Point C
		 * In this case, when count < 100, Point A is always true, Point B may be true, but become false, and Point C is always false 
		*/
	}
}
