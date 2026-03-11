
public class MinMaxAbsoluteDemo {
	public static void main(String[] args) {
		//number can be float, long, int, or double
		//Math.min(number1, number2) or Math.max(number1, number2) returns the minimum/maximum of the two numbers
		//Math.abs(number) returns the absolute value of a number
		System.out.println(Math.max(Math.max(2.4, 5.6), Math.min(3.4, 1.2))); //returns 5.6
		System.out.println(Math.abs(-2)); //returns 2
		System.out.println(Math.round(Math.abs(-2.5))); //-2.5 becomes 2.5; then it is 2.5 + 0.5 is 3.0, so it returns 3
		
		//This is for Math.random(): Syntax is (a + Math.random() * b)
		//Example: (int)(2 + Math.random() * 10) returns any 10 integers between 2 and 11 (starts at 2 and continues to 10 + 2 (12), but excludes 10 + 2)
		System.out.println((int)(2 + Math.random() * 10));
		
		//Obtain an integer between 34 and 55: (NOTE: the + 1 makes 55 included, but there are a total of 22 integers)
		System.out.println(34 + (int) (Math.random() * (55 + 1 - 34)));
		
	}
}
