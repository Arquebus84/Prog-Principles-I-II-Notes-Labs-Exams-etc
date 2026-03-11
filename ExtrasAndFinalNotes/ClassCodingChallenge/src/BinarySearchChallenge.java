
public class BinarySearchChallenge {

	public static void main(String[] args) {
		//Array has to be ordered from lowest to largest
		int[] array = {2, 6, 7, 9, 10, 14, 20};
		System.out.println(binarySearch(array, 9));
		
	}

	public static int binarySearch(int[] array, int key) {
		int high = array.length - 1;
		int low = 0;
		while(low <= high) {
			int middle = array.length / 2;
			if(key < array[middle]) {
				high = middle;
			}else if(key == array[middle]) {
				return middle;
			}else {
				low = middle;
			}
		}
		
		return -(low + 1);
	}
	
}
