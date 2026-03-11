
public class BinarySearch {

	public static void main(String[] args) {
		
		double[] list = {1, 2, 3, 4, 5};
		System.out.println(java.util.Arrays.binarySearch(list, 3.5));
		
		int[][] matrix = new int[5][5];
		for(int i = 0; i < matrix[4].length; i++) {
			matrix[4][i] = 10;
		}
				
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int middle = (high + low) / 2;
			if(key < list[middle]) {
				high = middle - 1;
			}else if(key == list[middle]) {
				return middle;
			}else {
				low = middle + 1;
			}
			
		}
		
		//The binary search returns the index of the search key if it is contained in the list, otherwise it returns -low - 1
		return -low - 1; //Now high < low
		
		/**This should return -(insertionPoint + 1)  */
	}

}
