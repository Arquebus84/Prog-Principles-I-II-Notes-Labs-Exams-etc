
public class RaggedArrayExamples {

	public static void main(String[] args) {
		//Declare an array of 3x3; and check if the first row is of the same value
		/*int list1[][] = {
				{1, 2, 3},
				{2, 2, 2},
				{5, 4, 3}
		};
		boolean isSame = false;*/
		
		//**Order this array by the length of each row**
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{1, 2, 3},
				{1, 2, 3, 4},
				{1, 2}
		};
		//	Original version:
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		
		System.out.println();
		
		//	Ordered version
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++) {
				if((arr[j].length) > (arr[i].length)) {//Both are first seen as 0, but j will be 1 and will be compared to i at different arrays by their lengths
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}			
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length;  j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		//Since the 2D boolean array is created, but not defined, every value in each row is normally set to false
		boolean[][] x = new boolean[3][];
	    x[0] = new boolean[1]; 
	    x[1] = new boolean[2]; 
	    x[2] = new boolean[3];
	 
	    System.out.println("\nx[2][2] is " + x[2][2] + "\n");
	    
	    for(int i = 0; i < x.length; i++) {
	    	for(int c = 0; c < x[i].length; c++) {
	    		System.out.printf("%8b", x[i][c]);
	    	}
	    	System.out.println();
	    }
	}
}
