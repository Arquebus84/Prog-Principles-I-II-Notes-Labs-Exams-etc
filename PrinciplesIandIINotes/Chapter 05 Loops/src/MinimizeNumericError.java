
public class MinimizeNumericError {
	public static void main(String[] args) {
		//Using floating-point numbers in the loop-continuation-condition may cause errors
		//Example for summation
		double sum = 0;
		//add 0.01 + 0.02 +...+ 0.99, 1 to sum
		for(double i = 0.01d; i <= 1.0d; i = i + 0.01d){
			sum += i;
		}
		System.out.println("Sum is " + sum);
		//Floating point numbers are imprecise because the computer considers them as approximation
		//float: 50.499985
		//double: 50.49999887123704
		//int count: 50.50000000000003			This is accurate
		//int (decrement): 50.49999999999995	This is less accurate compared to just incrementing currentValue by 0.01
		
		//Use int in the loop:
		double sum2 = 0;
		double currentValue = 0;
		for(int count = 0; count <= 100; count++) {
			sum2 += currentValue;
			currentValue += 0.01;
		}
		System.out.println("Sum2 is " + sum2);
		
		/*This is the same as the preceding example, but it is less accurate because of changing the parameters
		 * double sum2 = 0;
		double currentValue = 100;
		for(int count = 100; count >= 0; count--) {
			sum2 += currentValue;
			currentValue -= 0.01;
		}
		System.out.println("Sum2 is " + sum2);
		 */
		
		//Floating-point arithmetic is imprecise; we only have a limited amount of bits to store a number (double: 64bits	float: 32bits)
		float sum3 = 0;
		for(float t = 0.01f; t <= 1.0f; t += 0.01f){
			sum3 += t;
		}
		System.out.println("Sum3 is " + sum3);
		
		/*
		for (double i = 1.0; i >= 0.01; i = i - 0.01)
		
		//In this example, the program will NOT produce the correct result because floats are not accurate, thus i may never be exactly 0.01, but it can 
		be close to 0.01 (either greater than or smaller than 0.01)
		*/
		
		double sum4 = 0; //This compiles fine, even if the control variable (action-after-each iteration) is switched with the loop body
		for (double d = 0; d < 10; sum4 += sum4 + d) {  
		  d += 0.1;
		}
		System.out.println("Sum4 is " + sum4);
		
		
	}
	
}
