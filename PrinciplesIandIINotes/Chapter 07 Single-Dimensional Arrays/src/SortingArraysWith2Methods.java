
public class SortingArraysWith2Methods {
	
	//Selection sort: an approach to sorting an array. It finds the largest value in the list and places it last; it then finds the largest number remaining
	//	and places it next to the last, and so on until the list contains only a single number.
	
	/*	The solution can be found with this:
	 * 	for(int i = 0; i < array.length - 1; i++){
	 * 		select the smallest element in array[i...array.length - 1];
	 * 		swap the smallest with array[i] if necessary;
	 * 		//array[i] is in it's correct position
	 * 		//the next iteration applies to array[i + 1...array.length - 1]
	 * 	}
	 * 
	 */	
	
	public static void main(String[] args) {
		//List will be sorted from smallest to largest
		double[] list = {-2, 4.5, 5, 1, 2, -3.3};
		double[] list2 = {3.9, 5.0, 1.6, 8.5, 23.2, -2.0};
	    selectionSort(list);
	    sortArray(list2);
	    sortArray(list);
	    
	    for (int i = 0; i < list.length; i++)
	    	System.out.print(list[i] + " ");
	    
	    System.out.println();
	    
	    for (int i = 0; i < list.length; i++)
	    	System.out.print(list2[i] + " ");
	    
	}
	
	public static void selectionSort(double[] list) {
		//Takes the array and runs through the array until it reaches the last index
	    for (int i = 0; i < list.length; i++) {
	    	
	    	//Select the smallest number in list[i...list.length - 1]
	    	//Swap the smallest with list[i] if necessary
		    double currentMin = list[i];//Current minimum is at index 0
		    int currentMinIndex = i;//Index of the current minimum
		    
		    //In the first iteration, the first element and second element at index 0 and index array.length - 1 are switched
		    for (int j = i + 1; j < list.length; j++) {
		    	//Checks to make sure that the current minimum (first at index 0) is greater than the second element (at index 1). If so, switch the two
		    	if (currentMin > list[j]) {
			        currentMin = list[j];
			        currentMinIndex = j;
			    }
			}
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {//when the current minimum index does not match the iteration, the element at the current minimum index is the 
										//same as the element in the list at the current iteration
			   list[currentMinIndex] = list[i];
			   list[i] = currentMin;
			}
	    }	    
	}
	//Simpler way to sort an array
	public static void sortArray(double[] array) {
		for(int i = 0; i < array.length; i++) {			
			for(int j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
					double temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
}
