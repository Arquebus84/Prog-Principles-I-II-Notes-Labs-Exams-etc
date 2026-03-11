//import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		//A for-loop is a concise syntax for writing loops
		/*While loop example
		 * i = initialValue;
		 * 	while(i < endValue){
		 * 		//Loop body
		 * 		i++ //Adjust loop control variable
		 * }
		 * Programmers often forget to adjust the loop control variable; which leads to an infinite loop
		 */
		
		//A for loop is easier to control. Syntax:
		/*
		 * 	for(initial-action; loop-continuation-condition; action-after-each-iteration){
		 * 		statements;
		 * 	}
		 */
				
		for(int i = 0; i < 10; i++) {
			System.out.println("Welcome to Java!");//Prints this 10 times
		}
		
		int i;
		for(i = 0; i < 10; i++) {
			System.out.println(i);//Prints 10 numbers from 0 to 9
		}
		System.out.println(i); //Prints 10 because the count for i is 10
		
		//**The control variable can declared inside the for-loop, HOWEVER; It cannot be used outside the for-loop
		//**The Initial-action in a for-loop can be a list of zero or more comma-separated variable declaration statements or assigned expressions:
		//		for(int i = 2, j =5; i + j < 10; i++, j++)
		//**The action-after-each-iteration can also be a list of zero or comma-separated variables:
		//		for(int i = 0; i < 10; System.out.println(i), i++)
				
		//NOTE: if the loop-continuation-condition in a for-loop is omitted, it is implicitly true. Thus, the statement below is an infinite loop:
		//			for( ; ; ){		}
		//It is the same as the one below:
		//			for( ; true; ){		}
		//To avoid confusion, it's better to use this loop for this case:
		//			while(true){	}
		
		/*TESTS:
		for(int e = 0; e < 1; e++) {
			System.out.println("I hate you.");
		}
		
		//generate 10 numbers; add them all together:
		int tally = 0;
		for(int num = 1; num < 10; num++) {
			Scanner input = new Scanner(System.in);
			System.out.printf("%s", "Please enter an integer: ");
			tally += input.nextInt();
		}
		//Display total at the end
		System.out.println("The sum is " + tally);
		*/
		
		
		//Both of these result in the same sum because i++ and ++i is used separately;
		int sum1 = 0;
		for (int x = 0; x < 10; ++x) {  
			  sum1 += x;
			}
		System.out.println(sum1);
		
		int sum2 = 0;
		int x;
		for (x = 0; x < 10; x++) {  
			  sum2 += x;
			}
		System.out.println(sum2);
		System.out.println(x); //x will be 10
		
		/* Number of iterations
		int count = 5;
		while (count < n) {
		  count = count + 3;
		}
			***In this example, the number of iterations will be the ceiling of (n - 5)/3 times
		*/
		
		for(int count = 1; count < 5; count += 3) {
			System.out.println(count); //Prints 1 4
		}
		
		for (int y = 1; y < 10; y += 2) {
		      System.out.printf("%1d", y); //In this example, y is 13579
		}
		
		for(int e = 1; e <= 10; e++) {
			System.out.println("Welcome!" + e); //Prints Welcome! 10 times (if e = 0 and e < 10 it would be 9 times) (if e = 1 and e <= 10 it would be 9 times)
		}
		
		//Program should only print values that are both multiples of 3, and end in 1
		//REMEMBER: in order to take the second digit of a number like 23: you have to divide 23 by 10 and gain the remainder, which is 3;
		//Remember the 3 integers project that you made!
		int n = 30;
		int u;
		for(u = 0; u < n; u++){	
			//Read the last value of the integer
			//Divisible by 3
			if(u % 3 == 0 && u % 10 == 1){
			    System.out.println(u);
			}
		}
		
		for(i = 300; i > 147; i--){
		    if(i % 3 == 0){
		        System.out.print(i + " ");
		    }
		}
		
	}
}
