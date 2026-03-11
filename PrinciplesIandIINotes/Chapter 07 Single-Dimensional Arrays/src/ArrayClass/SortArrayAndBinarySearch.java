package ArrayClass;

public class SortArrayAndBinarySearch {

	public static void main(String[] args) {
		double[] listA = {2.3, -3.4, -2, 8, 5, -9};

		sortArray(listA);
		
		for(int i = 0; i < listA.length; i++) {
			System.out.print((i < listA.length - 1)? listA[i] + ", " : listA[i]);
		}
		
		System.out.println("\nThe target number is at index " + binarySearch(listA, -2));
	}
	
	//Resort the array
	public static double[] sortArray(double[] array) {
		//double[] sorted = new double[array.length];
		
		//Using two for loops: First one looks through every element in the array at the specified index 
		for(int i = 0; i <= array.length - 1; i++) {
			double currentMinimum = array[i]; // current min is at 0
			int currentMinIndex = i;
			
			//In the second loop: Looks through every element after the first one
			for(int j = i + 1; j <= array.length - 1; j++) {
				//If the currentMinimum is greater than the next element, swap them to retain order
				if(currentMinimum > array[j]) {
					currentMinimum = array[j];
					currentMinIndex = j;
				}
			}
			
			//Swap the currentMinIndex with the array at index i; this is used to check for the first and the last element in the array
			if(currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMinimum;
			}
			
		}		
		return array;
	}
	
	public static int binarySearch(double[] array, double target) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int middle = (high + low) / 2;
			if(target < array[middle]) {
				high = middle - 1;
			}else if(target == array[middle]){
				return middle;
			}else {
				low = middle + 1;
			}
		}		
		
		return -(low + 1);
	}

}
