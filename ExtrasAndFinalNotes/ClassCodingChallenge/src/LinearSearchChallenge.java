
public class LinearSearchChallenge {

	public static void main(String[] args) {
		// Array
		int[] array = {2, 5, 9, 0, 34, 6, 7};

		System.out.println("The index in the array for 6 is " + linearSearch(array, 6));
	}
	
	public static int linearSearch(int[] array, int key) {
		
		for(int i = 0; i < array.length; i++) {
			if(key == array[i]) {
				return i;
			}
		}
		return -1;
	}

}
