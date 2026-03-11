
public class ForeachLoop {
	
	public static void main(String[] args) {
		//The convenient for-loop is also known as the foreach loop, which enables you traverse the array sequentially without using an index variable
		//Example:
		int list1[] = {2, 4, 8};
		for(int x: list1) {
			System.out.print(x + " ");
			//Prints every element in the list1 under the variable x
		}
		
		//You can read it as "for each element x in list1, do the following."
		
		/*Syntax for foreach loop:
		*	for(elementType element: arrayRefVar){
		*		Process the element
		*	}
		*/
		
		//**Accessing an array that is out of bounds is a common programming error; to avoid it, make sure you are NOT using arrayRefVar.length - 1 or
		//		simply using a foreach loop loop if possible.
		
		//Common off-by-one errors: 
		//	1)Forgetting that the first index in an array list is 0 instead of 1
		//	2)In a loop, using <= instead of <:
		/*
		 * 	for(int i = 0; i < myList.length; i++){
		 * 		System.out.print(list[i] + " ");
		 * 	}
		 */
		
		//Another out of bounds error would occur if you do not limit the length of the array in a for loop:
		//To correct this, write x.length - 1
		int[] x = new int[5]; 
	    int i;
	    for (i = 0; i < x.length - 1; i++)
	      x[i] = i;
	    System.out.println(x[i]);
		
	    double[] floatList = {2.3, 4.2, 5.0};
	    int[] myList = {1, 2, 3, 4, 5, 6};
		for (int j = myList.length - 2; j >= 0; j--) {
		  myList[j + 1] = myList[j];
		}
		System.out.println();

		for (int e: myList) 
		  System.out.print(e + " ");
		
		System.out.println();

		for(double y: floatList)
			System.out.print(y + " ");
		
		System.out.println("\n");
		
		
		//Foreach loop for 2D arrays:
		int[][] intList = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		for(int row[] : intList) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
	}

}
