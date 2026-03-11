
public class ArraySizeDefaultAndAccessingArrays {

	public static void main(String[] args) {
		//Size of an array can be obtained by:
		//	arrayRefVar.length;
		
		//**When an array is created, its elements are assigned the default value of 0:
		int x[] = new int[4];
		//Length of 4, and element at x[3] is 0
		System.out.println(x[3]);
		
		int myList[] = new int[5];
		
		System.out.println(myList.length);
		
		//Accessing Arrays
		
		//**The array elements are accessed through the index. Arrays are 0-based, meaning they range from 0 to arrayRefVar.length - 1.
		//	Arrays are represented using the indexed variable:
		//		arrayRefVar[index];
		
		//Some languages use parentheses, but Java used square brackets(myList(6), Java: myList[6])
		
		//The following code adds the values in myList[0] and myList[1] to myList[2]:
		
		myList[2] = myList[0] + myList[1]; //This would be 0 if there are no values
		
		//If you were to make a for-loop with an array:
		//	int i = 5, with the array double[] t = new double[100]:
		//		**You cannot use (i + 6.5) as an index!
		
		
		//Fibonacci sequence example:
		/*
		 *for(int i = 0; i <= fibonacci.length - 1; i ++){
		 *	fibonacci[0] = 0;
		 *	fibonacci[1] = 1;

			if(i >= 2){
        		fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
    		}
    	 *}
		 */
	}

}
