
public class ArraysClass {
	
	public static void main(String[] args) {
		//The java.util.Arrays class contains useful methods for common array operations such as sorting and searching
		//The Arrays class contains static methods for sorting and searching arrays, comparing arrays, filling array elements, and returning a string
		//	representation of the array. The methods are overloaded for all primitive data-types
		
		//You can use the sort or parallelSort method to organize the whole array or a partial array.
		double list[] = {2.6, -3, -1, 6, 4, -8};
		java.util.Arrays.parallelSort(list);
		java.util.Arrays.sort(new double[] {2.3, -12, 13.8, -18, 2, 3, 5});
		
		//Sort part of the array
		char[] characters = {'A', 'c', '6', '3', '2', 'B'};
		java.util.Arrays.parallelSort(characters, 1, 4); //Sorts part of the array at index 1 to index 4 ('c' '6' and '3' are switched)
		for(int i = 0; i <= characters.length - 1; i++) {
			System.out.print(characters[i] + " ");
		}
		
		//**parallelSort is more efficient if your computer has multiple processors
		
		//Binary Search method: Can be used to find a key in an array; the array must be in ascending order.
		//**Method returns -(insertionIndex + 1)		
		System.out.println("\nBinary Search");
		int[] scores = {1, 20, 30, 40, 50};
		System.out.println(java.util.Arrays.binarySearch(scores, 3));
		
		//The equals method can be used to check whether two arrays are strictly equal; they are equal if their corresponding arrays are the same
		int[] l1 = {2, 4, 6, 8};
		int[] l2 = {2, 4, 6, 8};
		int[] l3 = {2, 4, 5, 8, 10};
		System.out.println(java.util.Arrays.equals(l1, l2)); //True
		System.out.println(java.util.Arrays.equals(l1, l3)); //False
		l3 = l2;
		System.out.println(java.util.Arrays.equals(l1, l3)); //True
		
		//The fill method can be used to replace all or a partial of the numbers in the array with a single value:
		//**fill(int[] array, int value) to fill the entire array with a single value
		//**fill(int[] array, int fromIndex, int toIndex, int value) to fill the array partially
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = {2, 4, 6, 8, 10, 12};
		java.util.Arrays.fill(list1, 5); //Fill the whole array with 5
		java.util.Arrays.fill(list2, 1, 6, 2); //Fills the array with 2 into elements from listY[1] to listY[6 - 1]
		for(int i: list1) {
			System.out.print(list1[i] + " ");
		}
		System.out.println();
		for(int i: list2) {
			System.out.print(list2[i] + " ");
		}
		
		System.out.println("\ntoString");
		//The toString method can be used to return string that represents all the elements in the array. This is a quick way to display all the elements:
		double[] dList = {2.3, 4.5, 6,7, 7,9, 8};
		System.out.println(java.util.Arrays.toString(dList));//Displays [2.3, 4.5, 6,7, 7,9, 8]
		
		
	}
	
}
