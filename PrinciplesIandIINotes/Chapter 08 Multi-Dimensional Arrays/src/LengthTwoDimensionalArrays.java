
public class LengthTwoDimensionalArrays {

	public static void main(String[] args) {
		//A two-Dinemsional array is an array in which each element is a one-dimensional array; the length of an array x is the number of elements in that
		//	array, which can be obtained by doing x.length, x[0], x[1], ..., and x[x.length-1] are arrays
		//	Their lengths can be obtained using x[0].length, x[1].length, ..., and x[x.length - 1].length
		
		//Ex:
		int m[][] = {
				{1, 2, 3},
				{4, 5, 6}
		};
		//If you put m.length, it counts the length of the array (number of rows), thus m.length is 2
		//If you write m[0].length, it counts the length of that single array, thus m[0].length is 3
		System.out.println(m.length + "\n" + m[0].length);
		System.out.println(m[m.length - 1].length); //Displays the length of the items on the last row: m.length - 1 = 2 - 1 = 1; m[1].length is 3
		
		//**m[0].length is the number of values in the first row
		
		//Total length of the matrix (row * column):
		int totalLength = 0;		
		for(int row = 0; row < m.length; row++) {
			totalLength += m[row].length;
		}
		//Also could do
		int total = m[0].length + m[1].length;
		
		
		//Results
		System.out.println("Total length of m is " + totalLength + " or " + total);
		System.out.println("Total length of m is " + (m[m.length - 1].length * m.length)); //This is rows * columns
		
		//Declaring a new matrix of 4 rows and 5 columns (20 elements total)
		double[][] matrix = new double[4][5];
		System.out.println(matrix.length + " and " + matrix[3].length); //Displays the total number of rows and total columns in row 3
		
	}

}
