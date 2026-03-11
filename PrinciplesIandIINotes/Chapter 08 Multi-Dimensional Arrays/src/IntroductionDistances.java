
public class IntroductionDistances {

	public static void main(String[] args) {
		//A Two-Dimensional array is an array that contains other arrays as its elements. 
		//Single-Dimension arrays stores a linear collection of elements
		
		//Here, we will create a 2-dimensional array table that stores the distances of cities:
		double[][] distances = {
				{0, 983, 787, 714, 1375, 967, 1087},
				{983, 0, 214, 1102, 1763, 1723, 1842},
				{787, 214, 0, 888, 1549, 1548, 1627},
				{714, 1102, 888, 0, 661, 781, 810},
				{1375, 1763, 1549, 661, 0, 1426, 1187},
				{967, 1723, 1548, 781, 1426, 0, 239},
				{1087, 1842, 1627, 810, 1187, 239, 0}
		};
		
		//Each element in the distances array is another array; thus, distances is considered to be a nested array. In this case, distances stores
		//	two-dimensional data.
		
		System.out.println(distances[5][3]); //Row at index 5 and column at index 3 is 781
	}

}
