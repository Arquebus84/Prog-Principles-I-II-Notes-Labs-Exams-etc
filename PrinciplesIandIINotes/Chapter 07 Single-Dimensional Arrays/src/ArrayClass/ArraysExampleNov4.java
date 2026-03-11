package ArrayClass;

import java.util.Scanner;

public class ArraysExampleNov4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		//In an array with strings, if you do not put any string in the array, it will return null b/c it is a non-primitive value; unlike int, which 
		//	returns 0, and for double, returns 0.0 
		
		/*
		Array
		int intArray[] = new int[10];
		System.out.println("Enter 10 integers: ");
		//User enters the elements at each index
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = input.nextInt();
		}
		
		int accumulation = 0;
		//Print each element at each index at i
		for(int i = 0; i < intArray.length; i++) {
			//Sum of each element in list
			accumulation += intArray[i];
			
			//Put a comma after each number that is last than the last index value
			System.out.print((i < intArray.length - 1)? intArray[i] + ", " : intArray[i]);
		}
		System.out.println("\nThe sum of each element in the array is " + accumulation);
		*/
		
		int intArray2[] = new int[5];
		intArray2[0] = 3;
		intArray2[1] = 2;
		intArray2[2] = 8;
		intArray2[3] = 4;
		intArray2[4] = 1;
		minAndMax(intArray2);
		
		System.out.println("\nIf you swap the first and last index, the new array will be: ");
		swap(intArray2, 0, intArray2.length - 1);
		
		System.out.println();
		int newArray[] = {-1, 3, -24, -8, 26, 40};
		printSortedArray(newArray);	
		
		//Close scanner
		input.close();
	}
	
	public static int minAndMax(int[] array) {
		int min = array[0];
		int minIndex = 0;
		int max = array[0];
		int maxIndex = 0;
		//Find the max and min in the intArray2
		for(int i = 0; i < array.length; i++) {
			//Put a comma after each number that is last than the last index value
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i]);
			
			//Check the max and the min
			if(max < array[i]) {
				max = array[i];
				maxIndex = i;
			}else {
				min = array[i];
				minIndex = i;
			}
		}
		System.out.println("\nThe min of intArray2 is " + min + " at index " + minIndex + 
				"\nThe max of intArray2 is " + max + " at index " + maxIndex);
		
		return minIndex;
	}
	
	public static void swap(int[] array, int index1, int index2) {
		int temp =	array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		for(int i = 0; i < array.length; i++) {
			//Put a comma after each number that is last than the last index value
			System.out.print((i < array.length - 1)? array[i] + ", " : array[i] + "\n");
		}
	}
	
	public static void printSortedArray(int[] array) {
		java.util.Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
		
}
