package ArrayExamples;

public class TestPassArray {
	
	public static void main(String[] args) {
		//Array
		int a[] = {1, 2};
		
		//Swap elements using the swap method
		System.out.println("Before invoke swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    swap(a[0], a[1]);
	    System.out.println("After invoking swap");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

	    // Swap elements using the swapFirstTwoInArray method
	    System.out.println("Before invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    swapFirstTwoInArray(a);
	    System.out.println("After invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	}
	
	//Swap the two variables
	public static void swap(int num1, int num2) {
		int temp = num1;		
		num1 = num2;
		num2 = temp;
	}
	
	public static void swapFirstTwoInArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
	
}
