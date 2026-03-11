
public class BreakAndContinue {

	public static void main(String[] args) {
		//The break and continue keys provide additional controls in loops
				//**break: break out of current loop
				//**continue: break out of current iteration
				
				//**Using them can simplify programming in some cases, however, over using or improperly using them can make programs difficult to read or debug
				//Number Test:
				int sum = 0;
				int number = 0;
				while(number < 20) {
					number++;
					sum += number;
					
					if(sum >= 100) {
						break;
					}
				}
				System.out.println("The number is " + number);
				System.out.println("The sum is " + sum);//Sum should be 105 with break; without break, it is 190
				//In this example, the program adds integers from 1 to 20 in this order until the sum is greater than or equal to 100
				//Without the if statement, the program calculates the sum of integers from 1 to 20; however, with if statement, the loop terminates when sum is 
				//greater than or equal to 100
				
				//a continue ends the current iteration and program control goes to the end of the loop body.
				//**Continue breaks out of an iteration and Break breaks out of a loop
				//Number Test2:
				int sum2 = 0;
				int number2 = 0;
				while(number2 < 20) {
					number2++;
										
					if(number2 == 5 || number2 == 12) {
						continue;
					}
					sum2 += number2;
				}
				System.out.println("\nThe number for 2 is " + number2);
				System.out.println("The sum for 2 is " + sum2);//Sum is 193
				//Program adds integers from 1 to 20, except for 5 and 12 
				
				//NOTE: In while and do-while loops, the loop-continuation condition is evaluated after the continue statement. In the for-loop, the 
				//action-after-each-iteration is performed, then the loop-continuation condition is immediately evaluated after the continue statement.
				
				//SIDE NOTE: Some programming languages have a goto statement (go-to). the goto statement indiscriminately transfers control to any statement
				//in the program and executes it. This makes your program vulnerable to errors. The break and continue statements are different from goto
				//because they operate only in a loop or switch statement.
				
				//Find the smallest common factor (that is not 1) for number (assume the factor is >= 2)
				int n = 15;
				int factor = 2;
				while(factor <= n) {
					if(n%factor == 0) {
						break;
					}
					factor++;
				}
				System.out.println("The smallest factor other than 1 for 15 is " + factor);
				
				//Another way to write this program without break or continue:
				int fact1 = 2;
				while(n%fact1 != 0) {
					fact1++;
				}
				System.out.println(fact1);
				
				//Or
				int i;
				for(i = 2; n % i != 0; i++);
				System.out.println(i);
				
				//This creates an error if int a = 0
				int x = 5;
			    for (int a = 1; a < x; a++) {
			      if (x % a == 0) {
			        continue;
			      }
			      System.out.print(a + " ");
			    }
			    
			    int sum3 = 0;
			    int item = 0;
			    do {
			      item++;
			      sum3 += item;
			      if (sum3 > 4) 
			        break;
			    }
			    while (item < 5);
			    System.out.println("\n" + sum3);
			    
			    //Finding if 25 is a prime number
			    int number3 = 25;
			    int e;

			    boolean isPrime = true;
			    for (e = 2; e < number3 && isPrime; e++) {//e is 2 + 1 (3) + 1 (4) + 1 (5) + 1 (6) (realizes that 5 is a divider for 25)
			      if (number3 % e == 0) {
			        isPrime = false;
			      }
			    }
			    System.out.println("e is " + e + " isPrime is " + isPrime);
				
	}
}
