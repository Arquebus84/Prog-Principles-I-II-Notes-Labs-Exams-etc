
public class ReverseArray {

	public static void main(String[] args) {
		//When a method returns an array, the reference of the array is returned
		
		//Example 1:
		int[] list1 = {1, 2, 3, 4, 5};
		int[] list2 = reverse(list1);
		
		for(int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < list2.length; i++) {
			System.out.print(list2[i] + " ");
		}
		System.out.println();
		
		//Example 2:
		int[] list = {1, 2, 3, 5, 4};

		//i is first index, j is last index; i is less than the middle index
		//In the case of j, we are checking the array backwards
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
		  // Swap list[i] with list[j]
		  int temp = list[i];
		  list[i] = list[j];
		  list[j] = temp;
		}
		for(int k = 0; k < list.length; k++) {
			System.out.print(list[k] + " ");
		}
		
		System.out.println();
		//Example 3: Doubles
		reverseDoubles(new double[] {2.4, 4, 7.4, 8, 12.3, 16});
		System.out.println();
		//Second void method for doubles array
		reverseDoubles2(new double[] {2.4, 4, 7.4, 8, 12.3, 16});
		
	}
	
	//Method returns an array that is the reverse of an array
	public static int[] reverse(int[] list) {		
		int[] result = new int[list.length];
		
		for(int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}		
		
		return result;
	}
	
	//Second method to reverse an array:
	public static double reverseDoubles(double[] array) {
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		return 0;
	}
	//Void method for reversing an array of doubles
	public static void reverseDoubles2(double[] array) {
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	//In a method with an array, you can return a new array like this:
	public static int[] newList(int[] list) {
		
		return new int[] {1, 2};
	}
	
	
	
	
	

}
