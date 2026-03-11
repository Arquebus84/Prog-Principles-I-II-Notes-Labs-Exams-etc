package ClassMultiArrayEx;

public class StudentSelection {

	public static void main(String[] args) {
		//First create an array that is the same size as the class; each containing the full names of each student:
		//Create a random number generator that outputs random numbers from 0 to class length
		String classNames[] = {"Matteo Ventura", "Sean Roe", "Deondrey", "__", "__", "__"};
		
		int randomInt = (int)(Math.random() * classNames.length);
		//System.out.println((int)(Math.random() + 0.5));
		System.out.println(classNames[randomInt]);
		
		int[][][] testList = {
				{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}
		};
		
		for(int i = 0; i < testList.length; i++) {
			m(testList[i]);
			System.out.println();
		}
	}
	
	public static void m(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
	}

}
