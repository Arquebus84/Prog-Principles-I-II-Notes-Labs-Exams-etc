import java.util.Scanner;

//Display the first 50 prime numbers in 5 lines, each containing 10 numbers
public class DisplayPrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//An integer greater than 1 is a prime if its only positive divisor is 1 or itself; 2, 3, 5, and 7 are prime, but 4, 6, 8, and 9 are composite
		/*
		 * Determine whether a given number is prime
		 * For number = 2,3,4,5... test whether its prime
		 * Count the prime numbers
		 * Display 10 prime numbers in each 5 lines
		 */
		//Write a loop and repeatedly test whether a new number is prime. If it is prime, increase he count by 1. The count is initially 0, when the
		//loop reaches 50, terminate the loop.
		
		//Set the number of prime numbers to be printed as a constant
		final int NUMBER_OF_PRIMES = 50;
		//Number of primes to display in 5 lines
		final int NUMBER_OF_PRIMES_PER_LINE = 10;						
		//Use count to track the number of prime numbers
		int count = 0;
		//Initial number
		int number = 2;
		while(count < NUMBER_OF_PRIMES) {			
			//Assume the number is prime
			boolean isPrime = true;
			
			//Test whether number is prime by checking if it's divisible by 2, 3, 4, and so on up to number/2. If a divisor is found, it is not a prime
			for(int divisor = 2; divisor <= number / 2; divisor++) {
				
				//If number is prime, display the prime number and increase count
				if(number % divisor == 0) {
					isPrime = false;
					//Exit out of the loop
					break;
				}
			}			
			//Print the number and increment count by 1
			if(isPrime) {
				count++;
			//**Technique on printing a list of characters per line with i being incremented by 1 if((i % CONSTANTNUMBER) == 0), then print a number on a new line
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					//Print the number and advance to the new line
					System.out.println(number);
				}else {
					System.out.print(number + "\t");
				}	
			}
			number++;
		}
		/*
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");				
			}
			for(int x = i; x <= 5; x++) {
				System.out.print(" ");
			}			
			System.out.println();
		}*/
		
	}
}
