import java.util.Random;

public class BUBBLESort {
	//Sorting, like searching, is also a common task in computer programming. In this example, you will use Bubble sorting.
	
	/**Bubble sort: Compares adjacent elements and swaps them if they are in the wrong order, iterating through the array 
						until no further swaps are needed.	*/

	public static void main(String[] args) {
		Random random = new Random();
		//Random randTen = new Random();
		//int[] array = new int[1 + randTen.nextInt(10)]; //Random number for length
		
		int[] array = new int[10]; //This array has a fixed set of 10 elements instead of a random number for length
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
		printArray(array);
		
		//Sort from smallest to largest
		sort(array);
		
		//int[] bubbleExArray = {6, 1, 8, 5, 3};
		
		//Bubble Sorting Algorithm
		bubbleSort(array);
		
	}
	
	//Print the original array
	public static void printArray(int[] array) {
		System.out.println("Before:");
		for(int i = 0; i < array.length; i++) {
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i]);
		}
		
	}
	
	public static void bubbleSort(int[] array) {
		System.out.println("\n\nAfter with BUBBLE sorting algorithm:");
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
		
		//Print the results of Bubble sort
		for(int i = 0; i < array.length; i++) {
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i]);
		}
	}
	
	//Original sorting algorithm that sorts the array from smallest to largest values
	public static void sort(int[] array) {
		
		System.out.println("\n\nAfter with regular sorting algorithm:");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i]);
		}
	}
	
	//Extra: sorting algorithm that simply takes the last element of the array and places it to the first element:
	public static void putLastInTheFirst(int[] array) {
		
		//Very similar to sort, but starting at 1
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		//Print the results of putLastInTheFirst
		for(int i = 0; i < array.length; i++) {
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i]);
		}
	}
	
}
