import java.util.Scanner;

public class SentinelValuePart2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Example where you use input.hasNext() method in order to add all the numbers up:
		//In this case, the input is 1 2 3 4 5 6 (the sentinel value is going to be false from the hasNext() in which will become false after 6)
		int sum1 = 0;
		System.out.println("Enter as many numbers as you want and press Ctrl + Z to end the program: ");
		while (input.hasNext()) {
			sum1 += input.nextInt();
		}	     
		System.out.println("\nThe sum is " + sum1);
		
		//***If your program reads lines, then you can use the input.hasNextLine() to detect the end of an input
	}

}
