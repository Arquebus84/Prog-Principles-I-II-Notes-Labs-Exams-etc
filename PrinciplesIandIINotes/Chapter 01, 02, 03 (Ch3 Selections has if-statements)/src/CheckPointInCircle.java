import java.util.Scanner;
public class CheckPointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xCoord = 3.0;
		double yCoord = 3.0;
		
		double radius = Math.pow(xCoord * xCoord + yCoord * yCoord, 0.5);
		
		System.out.println("Enter a value that is between 0 and 5");
		double userInput = input.nextDouble();
		
		if(userInput < radius && userInput > -radius) {
			System.out.println("\nYour value is in the circle.");
		}else {
			System.out.println("\nYour value is outside the circle.");
		}
	}
}
