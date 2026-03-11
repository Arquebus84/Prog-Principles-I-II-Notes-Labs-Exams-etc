
public class SearchingArrays {
	
	public static void main(String[] args) {
		//If an array is sorted, *binary search is more efficient than *linear search for finding an element in the array.
		
		//Searching: the process of finding a specific element in an array
		
		//Linear search: A method to search for an element in an array; linear search compares the key with the element in the array sequentially
		//Binary search: An efficient method to search a key in an array. Binary search first compares the key with the element in the middle of the array,
		//	and reduces the search range by half. NOTE: For binary search to work, the array must be PRE-SORTED.
		
		int list1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//Middle value is (0 + 10) / 2 = 5 which is value for 6
		System.out.println(linearSearch(list1, 8));
		System.out.println(linearSearch(list1, -3));
		
		//Old Binary search:
		System.out.println("Old method for binary search " + binarySearchOld(list1, 3));
		System.out.println("Old method for binary search " + binarySearchOld(list1, 18));
		
		System.out.println(binarySearch(list1, 3));
		System.out.println(binarySearch(list1, 18));//18 is not in the list; 18 is greater than 6, so the low will be 6 + 1 = 7; it continues to try to find it 
		//	until low = index 10 (low = 0 in the list), however, it does not find 18, so it will return -(10 + 1) = -11; therefore, 18 should be inserted
		//	at -(-11 + 1) = 10 (index 10, which is not in the list)
		
		
		int list2[] = {1, 2, 3, 7, 14};
		System.out.println(binarySearch(list2, 5));//5 is not in the list; 5 is greater than middle value 3 (index 2), but is less than value 7 (index 3);
		//	so the low is going to be index 3; therefore, it returns -(3 + 1) = -4
		
		//Create a new class called BinarySearch and call a method from that class
		int j = BinarySearch.binarySearch(list1, 6);
		System.out.println(j);
		
		System.out.println(binarySearch(new int[]{1, 4, 6, 8, 10, 15, 20}, 11));
		
	}

	
	//For linear search: a key (such as 8) is used to find a matching element in the array; it returns the index of the element if it's found,  
	//	otherwise, it returns -1
	public static int linearSearch(int[] list, int key) {
	    for (int i = 0; i < list.length; i++) {
	      if (key == list[i])
	        return i;
	    }
	    //Else return the index closest to the key
	    return -1;
	  }
	
	//In binary search, the array has to be pre-sorted. Binary search first compares the key with the element in the middle of the array. Assume 
	//	elements are increasing in the array (34, 42, 63, ...)
	//It follows these case:
	//	1) If the key is less than the middle element, you need to continue to search for the key only in the first half of the array.
	//	2) If the key is equal to the middle element, the search ends with a match
	//	3) If the key is greater than the middle element, you need to continue to search for the key only in the second half of the array.
	
	//Implementation:
	//Suppose array has n elements (let n be power of 2).
	//After the first comparison, n/2 elements are left for further search; after the second comparison, (n/2)/2 elements are left.
	//After the kth comparison, (n/2)^k elements are left.
	//When k = log_2(n), only one element is left in the array, and you need only one more comparison.
	//Therefore, in the worst case when using the binary search approach, you need log_2(n+1) comparisons to find an element in the sorted array.
	//In the worst case for a list of 1024 elements, binary search requires only 11 comparisons, whereas linear search requires 1024 comparisons
	
	//		**CONDITIONS FOR BINARY METHOD**
	//Precondition: The list must be in increasing order
	//PostCondition: The method returns the index of the element that matches the key; if the key is in the list and or a negative integer k such 
	//	that -(k + 1) is the position for inserting the key.
	
	//Precondition and postcondition are terms used to describe the properties of methods.
	
	//**2 ways to implement binary search:
	
	//Let low and high denote the lowest and highest index in the array respectively; also, let middle denote the index of middle element
	//		low is 0, high is list.length - 1, and mid is (high + low) / 2
	
	//Method 1:
	//***NOTE: Does not work because the low will not become the same as high***
	public static int binarySearchOld(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		int middle = (high + low) / 2;
		if(key < list[middle]) {
			high = middle - 1;
		}else if(key == list[middle]) {
			return middle;
		}else {
			low = middle + 1;
		}
		
		return -low - 1;
	}
	
	//Method 2:
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		//Checks to make sure that until the low value matches that same value as high
		while(high >= low) {
			//Middle value is the middle index of the list, not the element
			int middle = (high + low) / 2;
			if(key < list[middle]) {
				//If the key value is less than the value of the element in the middle index, high will change to being the index before the index of middle element
				high = middle - 1;
			}else if(key == list[middle]) {
				return middle;
			}else {
				//If the key is greater than the value of the element in the middle, then the low index will change to the index after the middle index
				low = middle + 1;
			}
		}
		//The binary search returns the index of the search key if it is contained in the list, otherwise it returns -low - 1
		return -low - 1; //Now high < low
		//***This returns the index closest to where the index for the key should be; for example, let n = -low - 1, the index should be -(n + 1)
	}
	
}
