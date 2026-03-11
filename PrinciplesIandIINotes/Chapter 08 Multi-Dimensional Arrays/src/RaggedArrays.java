
public class RaggedArrays {

	public static void main(String[] args) {
		//Each row in a 2D array is an array in itself; thus rows can have different lengths
				
		//Ex:
		int triangle[][] = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5},
				{3, 4, 5},
				{4, 5},
				{5}
		};		
		System.out.println(triangle[1][3]);//Displays 5		
		//If you put a[4][1], it will be an error because it's out of bounds
		
		//Middle value of the array:
		System.out.println(triangle[triangle.length / 2][triangle.length / 2]); //Displays 5
		
		
		//If you don't know the values in a ragged array in advanced, but know the sizes, you can create a ragged array using the following syntax:
		int[][] triangleArray = new int[5][];
		triangleArray[0] = new int[5];
		triangleArray[1] = new int[4];
		triangleArray[2] = new int[3];
		triangleArray[3] = new int[2];
		triangleArray[4] = new int[1];
		//**For each row, a length is assigned (REMEMBER: each row is an array in itself)
		//You can now assign values to the array:
		triangleArray[2][1] = 4;
		triangleArray[1][3] = 5;
				
		//The syntax 'new int[5][]' for creating arrays requires the first index to be specified
		
		int[][] array = new int[4][5]; //This array has 4 rows and 5 columns
		int[] x = {1, 2, 3};
		array[0] = x; //The first row has the array of x
		
		System.out.println("array[0][1] is " + array[0][1]); //Displays 2
		System.out.println("array[0] size is " + array[0].length); //Displays the length as 3
	}

}
