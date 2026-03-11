package MultiDimensionalArrayEx;

public class MultiArrayEx {

	public static void main(String[] args) {
		//The biomeData is = new int[3][2][4]

		int[][][] biomeData = new int[3][2][4];
		
		System.out.println("Rows: " + biomeData.length + "\nColumns: " + biomeData[0].length + "\nArrays per column length: " + biomeData[0][0].length + "\n");
		
		/**Can Write it like this:
		int[][][] biomeData = {
				{{15, 15, 15, 15}, {15, 15, 15, 15}},
				{{20, 20, 20, 20}, {20, 20, 20, 20}},
				{{25, 25, 25, 25}, {28, 29, 30, 31}}
		};
		*/
		
		//But in this case, use for loops and if-statements
		for(int row = 0; row < biomeData.length; row++) {
			for(int colm1 = 0; colm1 < biomeData[0].length; colm1++) {		
				for(int i = 0; i < biomeData[0][0].length; i++) {
					biomeData[0][0][i] = 15;
					biomeData[0][1][i] = 15;
				}				
			}
			
			for(int colm1 = 0; colm1 < biomeData[1].length; colm1++) {				
				for(int i = 0; i < biomeData[0][0].length; i++) {
					biomeData[1][0][i] = 20;
					biomeData[1][1][i] = 20;
				}				
			}
			
			for(int colm1 = 0; colm1 < biomeData[2].length; colm1++) {				
				for(int i = 0; i < biomeData[0][0].length; i++) {
					biomeData[2][0][i] = 25;
					biomeData[2][1][i] = 28 + i;
				}
			}			
		}
		
		for(int i = 0; i < biomeData.length; i++) {
			System.out.print("Row " + (i + 1) + ": ");
			for(int j = 0; j < biomeData[i].length; j++) {
				System.out.print("\t");
				for(int k = 0; k < biomeData[0][0].length; k++) {
					System.out.print((k < (biomeData[i][j].length - 1))? (biomeData[i][j][k] + ", ") : (biomeData[i][j][k]));
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("The total amount of items in the array is " + (biomeData.length * biomeData[0].length * biomeData[0][0].length) + "\n");
		
		System.out.println("The last element in a new array is " + printArray(new int[][] {{1, 3}, {5, 7}}));
	}
	
	public static int printArray(int[][] array) {
		//To invoke the array, look above in the main method
		return array[array.length - 1][array[array.length - 1].length - 1]; //This is the last index in the array
	}

}
