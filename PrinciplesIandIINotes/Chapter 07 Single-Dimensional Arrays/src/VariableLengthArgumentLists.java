
public class VariableLengthArgumentLists {
	
	public static void main(String[] args) {
		//A variable number of arguments of the same type can be passed to a method and treated as an array.
		//The parameter of the array is declared as follows:
		//	typeName...parameterName
		
		//In the method declaration, you can specify the type followed by an ellipsis (...) Only one variable-length parameter may be specified in a method,
		//	and this parameter has to be the last parameter. *Any regular parameters must precede it. The method return-type cannot be a variable-length parameter.
		
		//Java treats a variable-length parameter as an array.
		
		printMax(34, 3, 3, 2, 56.5);
	    printMax(new double[]{1, 2, 3});
	    //Linear sorting
	    System.out.println(newList(3, new int[] {2, 3, 5, 7, 11}));
	}
	
	//variable length parameter example
	public static void printMax(double...numbers) {
		if(numbers.length == 0) {
			System.out.println("No arguments passed.");
			return;
		}
		
		double result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > result) {
				result = numbers[i];
			}
		}
		System.out.println("The max value is " + result);
	}
	
	//**The array has to be the last parameter in a method
	public static int newList(int target, int...integers) {
		for(int i = 0; i < integers.length - 1; i++) {
			if(target == integers[i]) {
				return i;
			}
		}
		return -1;
	}
}
