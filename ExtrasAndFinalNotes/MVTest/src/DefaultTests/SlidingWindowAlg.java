package DefaultTests;

public class SlidingWindowAlg {
	//Sliding Window: Used for subarray or substring problems
	
	/**
	 * 	Instead of repeatedly iterating the same elements, sliding window maintains a range (a window) that moves step by step
	 * 		through data, updating results incrementally
	 */

	public static void main(String[] args) {
		
		//Sliding Window for finding max sub array:
		/**
		 * 	Compute the sum of the first n elements out the the N terms using linear loop and store sum in variable window_sum
		 * 
		 * 	Traverse linearly over the array until it reaches the end and simultaneously keep track of the maximum sum
		 * 
		 * 	To obtain the current sum of a block of n elements, subtract the first element from the previous block
		 * 		and add the last element of the current block
		 */
		int[] arr = {5, 2, -1, 0, 3};	// N = 5
		System.out.println(maxSubNaive(arr, 3));
		System.out.println(MaxSubArray(arr, 3));
	}
	
	/**Finding Maximum Subarray with length 3*/
	
	//Naive: nested loop to find Max sum of an array's subarray
	public static int maxSubNaive(int[] array, int n) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length - n + 1; i++) {
			int currentSum = 0;
			for(int j = 0; j < n; j++) {
				currentSum += array[j];
			}
			max = Math.max(max, currentSum);
		}
		
		return max;
	}
	
	//Sliding Window: updates previous values to find Max sum of an array's subarray
	public static int MaxSubArray(int[] array, int n) {
		int maxSum = 0; // Global sum
		
		//First Block
		for(int i = 0; i < n; i++) {
			maxSum += array[i];
		}
		int window_sum = maxSum;	// Local sum
		
		//Following Blocks
		for(int i = n; i < array.length; i++) {
			window_sum += array[i] - array[i - n];		//Subtract first element from prev block and add last element of current block
			maxSum = Math.max(maxSum, window_sum);
		}
		
		return maxSum;
	}

}
