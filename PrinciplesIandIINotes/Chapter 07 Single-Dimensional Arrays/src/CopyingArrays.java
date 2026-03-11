
public class CopyingArrays {

	public static void main(String[] args) {
		//**To copy the contents of one array to another, it is required to copy the array's individual elements in the other array
		//int list1[] = {1, 2, 3, 4, 5};
		//int list2[] = {6, 7, 8, 9, 0};
				
		//list2 = list1;		
		//System.out.println(list1);
		
		//This will not copy the contents reference from list1 to list2; rather, it just copies the reference value from list1 to list2
		//**The array previously referenced by list2 is no longer referenced; it becomes garbage that will be collected by the JVM.
		//		Garbage Collection: JVM feature that automatically detects and reclaims the space required by unreferenced objects
		
		//You can use assignment statements to copy primitive data type variables, but not arrays; assigning one array to another array would copy one
		//	 reference to another and makes both variables point to the same memory location
		
		/*	3 ways to copy an array to another
				1) Use a loop to copy individual elements one-by-one
				2) Use the static arraycopy method in the System class ***The arraycopy class violates Java naming convention
				3) Use the clone method to copy arrays; this will be used later in the Abstract Classes and Interfaces 
		*/
		
		//Using a for-loop		
		int sourceArray[] = {2, 3, 1, 5, 10};
		int targetArray[] = new int[sourceArray.length];
		for(int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
			
			System.out.print(targetArray[i] + " ");
		}
		System.out.println();
		//**Using the static method arraycopy from the java.lang.System class
		//		Syntax for arraycopy:
		//			arraycopy(sourceArray, srcPos, targetArray, tarPos, length)
		
		//The parameters srcPos and tarPos indicate the starting positions of sourceArray and targetArray, respectively. The number of elements copied
		//	from sourceArray to targetArray is indicated by length. You can rewrite the loop as:
		//			System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length)
		//EX:
		int listX[] = {2, 4, 6, 8, 10};
		int listY[] = new int[listX.length];
		System.arraycopy(listX, 0, listY, 0, listX.length);
		
		//Print the result
		for(int i = 0; i < listY.length; i++) {
			System.out.print(listY[i] + " ");
		}
		System.out.println();
		//**The arraycopy does not allocate (distribute) memory space for the target array. The target array must have already been created with its memory
		//		space allocated. After the copying takes place, targetArray and sourceArray have the same content, but independent memory locations.
		
		int myList[];
		myList = new int[10];
		myList = new int[20];
		//In this example, the myList = new int[20] creates a new array, and assigns its reference to myList;
		System.out.println(myList[14]);
		
		
		//Other Examples:
		//In this example, a new value is assigned to an individual element in listA at index 1
		int[] listA = {1, 2, 3};
	    int[] listB = listA;
	    listB[1] = 10;
	    System.out.println(listA[1]);//Prints 10
		
	    
	    int[] list1 = {1, 2, 3};
	    int[] list2 = {1, 2, 3};
	    //The reference value of list1 is copied to list2
	    list2 = list1;
	    //In list1, index 0 and 1 are replaced with values 0 and 1, respectively. At list2, index 2 is replaced with 2, and it references list1 in the
	    //		last line.
	    list1[0] = 0; list1[1] = 1; list2[2] = 2;

	    for (int i = 0; i < list2.length; i++) {
	      System.out.print(list2[i] + " ");
	    }
	    System.out.println();
	    
	    int[] x = {1, 2, 3, 4}; 
	    int[] y = x;
	    
	    //This means nothing
	    x = new int[2];
	    //The length of array y is the same length as array x
	    for (int i = 0; i < y.length; i++)
	      System.out.print(y[i] + " ");
	    
	    
	    System.out.println();
	    //Switching Arrays
	    int listC[] = {1, 2, 3, 4, 5};
		int listD[] = {6, 7, 8, 9, 0};
		
		int[] temp = listC; //Create a third array called temp and assign it to the first array
		listC = listD; //Have the first array equal the second array
		listD = temp; //The second array will be the temp (which is the first array)
		
		for(int i = 0; i < temp.length; i++) {
			System.out.print(listD[i] + " ");
		}
		System.out.println();
		
		//Swapping arrays without the temp
		int[] listN = {1, 2, 3, 4};
		int[] listM = {2, 4, 6, 8};
		listN = listM;
		for(int i = 0; i < listN.length; i++) {
			System.out.print(listN[i] + " ");
		}
	    
	    
	}

}
