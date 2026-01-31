import java.util.Scanner;
public class Exam1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String odd = "The number entered was = " + 3;
		double fracValue = 5068.721;
		/*
		System.out.println("Enter a value representing the order total between 1 and 150:");
		int subTotal = input.nextInt();
		
		double fee = (double)((subTotal >= 100)? 0.092 * subTotal: 0057 * subTotal);
		double totalCost = fee + subTotal;
		
		System.out.println("The fee will be $" + fee + "\nAnd the total cost will be $" + totalCost);*/
		
		System.out.println(odd);
		System.out.println(fracValue);
		
		/*System.out.println("Enter a positive floating-point number: ");
		double result = input.nextDouble();
		
		System.out.println((result <= 7.8)? "initial acceptable." : "initial not acceptable.");
		
		result = (result * 250.0) / 7;
		System.out.println((result >= 280.0)? "secondary acceptable." : "secondary not acceptable.");*/
	}
}
