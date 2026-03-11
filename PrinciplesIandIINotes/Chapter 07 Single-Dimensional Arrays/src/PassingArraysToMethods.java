
public class PassingArraysToMethods {
	
	public static void main(String[] args) {
		//When passing an array to a method, the reference of the array is passed to the method
		
		//You can invoke the printArray method by passing an array:
		printArray(new int[] {2, 4, 6, 8});
		
		//The preceding statement creates an array using this syntax:
		//new elementType[]{value0, value1, ... valuek};
		
		//**There is no explicit reference to this array, therefore it is called an anonymous array
		
		System.out.println();
		//Java uses pass-by-value to pass arguments to a method
		//Differences between passing values of variables of primitive data types and passing arrays:
		//	* For argument of a primitive type, the argument's value is passed
		//	* For argument of array type, the value of the argument is a referenced to an array; this reference value is passed to the method. Systematically,
		//		it's described as passed-by-sharing: the array in the method is the same as the array being passed. If you change the array in the method, 
		//		you will see the change outside the method.
		
		int x = 1;//x represents an int value
		int y[] = new int[10];//y represents an array of int values
		m(x, y);
		//x remains the same
		System.out.println("The value of x is " + x);
		System.out.println("The value at y[0] is " + y[0]);
		//**In this example, y and numbers are independent variables, but they both reference the same array. When m(x, y) is invoked, the values of x and
		// y are passed to number and numbers. Since y contains the reference value to the array, numbers now contains the same reference to the array
		
		
		//**Arrays are objects in java; the JVM stores the objects in an area of memory called the heap, which is used for dynamic memory allocation
		
		int[] z = {1, 2};
		int i = 1;
		n(i, z);
		System.out.print(i + "," + z[0]);
				
		
	}
	
	//Method for printing array: takes the int
	public static void printArray(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void m(int number, int[] numbers) {
		number = 1001;//Assign a new value to number 
		numbers[0] = 5000; //Assign value at index 0
	}
	
	public static void n(int i, int[] list) {
	    i = 9;
	    list[0] = 9;
	  }
	
	//***Return a new array of values:
	public static double[] newArray(double[] array) {
		double[] newList = {12, 13, 4, 7, 8};
		
		return newList;
	}
	
}
