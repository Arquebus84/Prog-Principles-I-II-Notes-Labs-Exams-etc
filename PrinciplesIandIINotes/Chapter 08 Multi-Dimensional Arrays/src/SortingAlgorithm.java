
public class SortingAlgorithm {
	public static void main(String[] args) {
		int[][] list = {{0, 0}, 
						{0},
						{0, 0, 0, 0},
						{0, 0, 0},
						{0, 0, 0, 0, 0, 0},
						{0, 0, 0, 0, 0},
						{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
						{0, 0, 0, 0, 0, 0, 0},
						{0, 0, 0, 0, 0, 0, 0, 0, 0},
						{0, 0, 0, 0, 0, 0, 0, 0}
						};
		
		//Standard way of showing the list
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		
		//Organize the array
		organizeArray(list);
	}

	public static void organizeArray(int[][] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i].length < array[j].length) {
					int[] temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length;  j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
