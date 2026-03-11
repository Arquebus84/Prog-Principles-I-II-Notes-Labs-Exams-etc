package ClassMethods;

public class TestMax {

	public static void main(String[] args) {
		int i = 25;
		int j = 9;
		
		int k = max(i, j);
		System.out.printf("The max beween %d and %d is %d%n", i, j, k);
		
		nothing();
		
		System.out.println("25 is above 0, so it returns a " + xMethod(i));
	}
	
	//Return max between two values
	public static int max(int num1, int num2) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		}else
			result = num2;
		
		return result;		
	}

	public static void nothing() {//Won't give an error because it is a void method (doesn't use a returnValueType)
		
		System.out.println("This is more rare than steaming horse shit.");
	}
	
	public static int xMethod(int n) {
		if(n > 0) 
			return 1;
		else if(n == 0)
			return 0;
		else
			return -1;
		
		/*** This line of code requires you to put return 0 at the end of the method body 
		 * if(n > 0) 
			return 1;
		else if(n == 0)
			return 0;
		else if(n < 0)
			return -1;
		 */
		//return 0;
	}
	
}
