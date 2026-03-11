package ClassMethods;

public class OverloadingMethodsClassEx {
	
	public static void main(String[] args) {
		/*Reason for Overloading methods:
		 * Several Different methods of the same name
		 * Different parameters set for each method
		 * 		-Number of parameters
		 * 		-Parameter types
		 * 			num1, num2, num3
		 * 			maxInt(num1, num2, num3)
		 * 			maxDouble(num1, num2, num3)
		 * 
		 *Method overloading
		 *		max(n1, ..., nN)	//Number of parameters used in max() can be too much
		 *		max(n1, ..., nN)
		 * 
		 */
		
		//Program that writes 3 methods
		
		System.out.println(max(3,4));
		System.out.println(max(3.0, 5.4));
		System.out.println(max(3.0, 5.4, 10.14));
		
		
		/**Local Variables: Variables defined inside a method
		 * 	Scope: The part of the program where the variable can be referenced
		 * 		-SCope of a local variable starts from its declaration and continues to the end of the block that contain the variable. A local variable must
		 * be declared before it can be used. You declare a local with the same name multiple times in different non-nesting blocks in a method, but you 
		 * cannot declare a local variable twice in nested blocks
		 * 	
		 * Nested for loops with variables i and j
		 * 		for(int i = 0; i < 10; i++){
		 * 			int j;
		 * 
		 * 		}
		 * 
		 * Formal parameters: It's a local variable
		 * 	Scope: Covers the whole method body
		 * Ex:
		 * int x = 1;
		 * int y = 1;
		 * 		for(int i = x; i < 10; i++)
		 * 			x += i;
		 * 		for(int i = y; i < 10; i++)
		 * 			y += i;
		 * 
		 * **int i is declared twice
		 * 
		 */
		
	}
	
	//Method 1
	public static int max(int num1, int num2) {
		System.out.println("Int First Max");
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	//Method 2
	public static double max(double num1, double num2) {
		System.out.println("Double First Max");
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
		
	//Method 3
	public static double max(double num1, double num2, double num3) {
		//Calls the first double max method
		System.out.println("Double Second Max");
		return max(max(num1, num2), num3);
	}

}
