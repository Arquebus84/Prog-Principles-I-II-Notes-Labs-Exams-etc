package ClassMethods;

public class TestPassByValue {

	/**
	 * PASSING PARAMETERS 
	 */
	public static void nPrintln(String message, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		nPrintln("Switch", 3);
		
		int num1 = 2;
		int num2 = 3;
		
		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		
		swap(num1, num2);
		
		System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		
	}
	
	public static void swap(int n1, int n2) {
		System.out.println("\tInside swap method");
		System.out.println("\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
		
		int temp;
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
	}

}
