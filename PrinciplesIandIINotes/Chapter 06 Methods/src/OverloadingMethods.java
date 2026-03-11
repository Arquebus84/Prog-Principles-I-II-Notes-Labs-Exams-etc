
public class OverloadingMethods {
	//This shows the impact of using two different max methods
	//If you call a max with int parameters, the max method expects int parameters will be invoked; and if you call max with double parameters, then
	//	the max that expects double parameters is invoked. This is known as method overloading**
	
	//Method overloading: when two methods have the same name, but different parameter lists within one class
	//**The java compiler determines which method to use based on the method signature
	
	public static void main(String[] args) {
		System.out.println(max(24, 4));
		System.out.println(max(23.6, 34.43));
		System.out.println(max(23.6, 32.3, 25.7));
	}
	public static int max(int num1, int num2) {
		int result;
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		//Can be simplified as terniary operator return((num1 > num2)? num1 : num2);
		return result;
	}	
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	/** Return the max of three double values */
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
	 
	 //You can put an int value and double value such as (2, 3.5) and the compiler will automatically convert the value 2 into a double value
	 
	 //Ambiguous invocation causes a compiler error and occurs when there are two or more possible methods to match an invocation of a method, and neither is
	 //	more specific than the other(s), therefore the invocation is ambiguous

}
