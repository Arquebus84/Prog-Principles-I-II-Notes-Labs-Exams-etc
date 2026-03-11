
public class RecursiveHelperMethods {
	/*Sometimes you can find a solution to the problem by defining a recursive method to a problem similar to the 
		original problem. This new method is called a recursive helper method where the original problem can be solved
		by invoking this helper method from the original recursive method.
	 */
	
	/**
		In the class ProblemSolvingUsingRecursion, the recursive isPalindrome method is inefficient because it creates 
			a new string for every recursive call.
		To avoid creating new strings, use the low and high indices to indicate the range of the substring.
			* These two indices must be passed to the recursive method
			* The original recursive method is isPalindrome(String s), thus you must create a new method called
				isPalindrome(String s, int low, int high) to accept additional information in the String
	 */
	
	public static boolean isPalindrome(String s) {
		return isPalindrome(s, 0, s.length() - 1);	//First index and last index are low and high, respectively
	}
	
	public static boolean isPalindrome(String s, int low, int high) {
		if(high <= low) {	//Check if the length - 1 (last character index) is less than the first index
			return true;				//iterate recursively until the statement above is true, otherwise return false
		}else if(s.charAt(low) != s.charAt(high)) {		/**Check the first and last characters; if they are not equal, then return false*/
			return false;
		}else {
			//return isPalindrome(s.substring(low + 1, high));	//Creates a new string
			return isPalindrome(s, low + 1, high - 1);	//Doesn't create a new string
				/**Continue to recursively iterate from this method until the low and high converge (i.e. until the if (high <= low) is true)*/
				//***Recall that recursion works when the recursive call becomes the base case (converges to the base case)
		}
	}
	
	/**The second method can be invoked recursively to check a palindrome in an ever-shrinking substring. It is a 
		common design technique in recursive programming to define a second method that receives additional parameters. 
		**This is known as a Recursive Helper Method***
		
		*Recursive Helper Method: Sometimes the original method needs to be modified to receive additional parameters
			in order to be invoked recursively. A recursive helper method can be declared for this purpose.
	 */
	
	/**
		Recursive Selection Sort:
			Can be split into two subproblems:
				* Find the smallest element in the list and swap it with the first element
				* Ignore the first element and sort the remaining smaller list recursively
	 */
	
	//Two overloaded selectionSort methods are defined
	public static void selectionSort(double[] list) {
		selectionSort(list, 0, list.length - 1);	//Sort the entire list
	}
	public static void selectionSort(double[] list, int low, int high) {
		if(high > low) {
			int indexOfMin = low;
			double min = list[low];
			for(int i = low + 1; i <= high; i++) {		//Could also say (int i = low + 1; i < high + 1; i++)
				if(list[i] < min) {
					min = list[i];
					indexOfMin = i;
				}
			}
			//Swap the smallest in the list(low ... high) with list(low)
			list[indexOfMin] = list[low];
			list[low] = min;
			
			selectionSort(list, low + 1, high);	//Since high will remain list.length - 1, change low in order to swap each element
												//**Think of this as BubbleSorting
		}
	}
	
	/**
		Recursive Binary Search
			** Elements must be in increasing order for binary search to work
	 		In the three cases, consider that binary search first compares the key with the middle element in the array:
	 			* Case 1: If the key is less than the middle element, recursively search for the key in the 
					lower half (first-half) of the array.
	 			* Case 2: If the key is equal to the middle element in the array, the search ends with a match
	 			* Case 3: If the key is greater than the middle element, recursively search for the key in the 
					upper half (second-half) of the array
	 */
	
	public static int binarySearch(int[] list, int key) {
		return binarySearch(list, key, 0, (list.length - 1));
	}
	public static int binarySearch(int[] list, int key, int low, int high) {
		if(low > high) 	//The list has been exhausted without a match
			return -(low + 1);
		
		int middle = (low + high) / 2;
		
		if(key < list[middle]) {
			return binarySearch(list, key, low, middle - 1);
		}else if(key == list[middle]) {
			return middle;
		}else {
			return binarySearch(list, key, middle + 1, high); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("isPalindrome(\"moon\"): " + isPalindrome("moon"));
		System.out.println("isPalindrome(\"noon\"): " + isPalindrome("noon"));
		
		double[] list = {2, 4.5, 1.6, 9, 4, 7.5};
		selectionSort(list);
		for(int i = 0; i < list.length; i++) {
			System.out.print((i == list.length - 1)? list[i] : list[i] + ", ");
		}		
		System.out.println();
		int[] array = {1, 2, 3, 4, 6, 8, 12, 16, 24};
		System.out.println("Find the index of 12 in the array {1, 2, 3, 4, 6, 8, 12, 16, 24}: " + binarySearch(array, 12));
		
		//Examples:
		System.out.println("DBDA contains \"DBD\": " + findPattern("DBDA"));
		System.out.println("\n3^3 = " + calculatePower(3, 3));
		
		System.out.println("\nFind minimum from int array above: " + findMinimum(array, 0, array.length - 1));
		
		System.out.printf("\nFind average from int array above: %.2f%n", calculateAverage(array));
		//Arrays Tests:
		int[] arr1 = {10, 10, 5, 5, 1}; 
		System.out.printf("Average of arr1: %.2f%n", calculateAverage(arr1));
	}
		
	//Examples
	
	/**Implement a recursive method that accepts a string and returns true if the pattern "DBD" is present with the provided
		input string, otherwise returns false
			***Remember the matches method from String class; detailed in MatchingReplacingAndSplittingByPatterns in chapter 10***
	 */
	public static boolean findPattern(String s) {
		return findPattern(s, 0);
	}
	public static boolean findPattern(String s, int index) {
		if (s.length() < 3) {
            return false;
        }
        // Check the first three characters
        if (s.substring(0, 3).equals("DBD")) {
            return true;
        }
        // Recursive call on the substring starting from the next character
        return findPattern(s.substring(1));
	}
	
	/**Create a method called calculatePower that accepts two int parameters for base and exponents: Do not use loops*/
	public static double calculatePower(int base, int exponent) {
		if (exponent == 0) {
            return 1;
        }
        // Handle negative exponents
        if (exponent < 0) {
            return 1 / calculatePower(base, -exponent);
        }
        // Recursive case: multiply base by result of smaller exponent
        return base * calculatePower(base, exponent - 1);
	}
	
	/**Create a recursive method that finds the minimum value in an integer array. The method should accept the following:
	 	* array: an array of int elements;
	 	* start: an int that can be used to identify the start of the subarray within array;
	 	* end: an int that can be used to identify the end of the subarray within array;
	 */
	public static int findMinimum(int[] array, int start, int end) {
		 // Base case: only one element in subarray
        if (start == end) {
            return array[start];
        }

        // Recursive case: find min between current element and rest of subarray
        int minRest = findMinimum(array, start + 1, end);
        return Math.min(array[start], minRest);		
	}
	
	/**Create a method, calculateAverage(), that takes an int[] array and should return the average value of the array as a double. Also
		implement a recursive helper method sumArrayHelper() that will compute the sum of the array's elements; the method takes 
		two parameters: the int[] array and an int index
	 */
	public static double calculateAverage(int[] array) {
		
		int sum = sumArrayHelper(array, 0); //0 is the starting index and the sum is divided by the total length of the array
		return ((double)sum / array.length);	//Cast as double in order to get decimal values
	}
	public static int sumArrayHelper(int[] array, int index) {
		if(index == array.length - 1) {
			return array[array.length - 1];
		}
		return array[index] + sumArrayHelper(array, index + 1);	//***Could also just return the sum directly
	}
	
}
