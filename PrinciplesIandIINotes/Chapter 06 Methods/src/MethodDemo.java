
public class MethodDemo {
	/*
	 * If you were to write the sum from 1-10 and the sum from 20-37, you could write 2 separate loops in the main method:
	 * int result = 0;
	 * for(int i = 1; i <= 10; i++){
	 * 		result += i;
	 * }
	 * System.out.println("The sum from 1 to 10 is " + result);
	 * 
	 * result = 0;
	 * for(int i = 20; i <= 37; i++){
	 * 		result += i;
	 * }
	 * System.out.println("The sum from 20 to 37 is " + result);
	 * 
	 *	However, it would be more efficient if we wrote one common code and reuse it. This is why we use methods:
	 *	In the example below, the method is called sum, and it uses two parameters: int i1, int i2
	 *	In the main method, the statements invoke sum(1, 10), sum(20, 37), sum(35, 49) to compute the sum from i1 to i2
	 */
	
	public static int sum(int i1, int i2) {
		int result = 0;
		//Starts with i1 as the first value, then adds each integer until it reaches i2 (i2 is included in the summation)
		for(int i = i1; i <= i2; i++) {
			result += i;
		}		
		return result;
	}
	
	public static void main(String[] args) {
		//sum(i1, i2)**
		System.out.println("The sum from 1 to 10 is " + sum(1, 10));
		System.out.println("The sum from 20 to 37 is " + sum(20, 37));
		System.out.println("The sum from 35 to 49 is " + sum(35, 49));
		
		//Method: A collection of statements grouped together to perform an operation
	}

}
