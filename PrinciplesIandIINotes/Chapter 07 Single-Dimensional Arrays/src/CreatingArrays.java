
public class CreatingArrays {
	
	public static void main(String[] args) {
		//If a variable does not contain any reference to an array, the value of the variable is null
		//		int u[];
		//		u[0] = 1;	//This gives an error because the array size is not defined
		
		//After an array variable is declared, you can create an array by using new operator and assign its reference to the variable:
		//	arrayRefVar = new elementType[arraySize]
		
		//This statement creates an array using	new elementType[arraySize] and it assigns the reference to the newly created variable, arrayRefVar
		
		//Preferred:
		//	elementType[] arrayRefVar = new elementType[arraySize]
		
		//Allowed (C++ style):
		//	elementType arrayRefVar[] = new elementType[arraySize]
		
		//Ex1:
		int x[]; 
		x = new int [2];
		x[0] = 2;
		
		//Ex2:
		double y[] = new double[5];
		y[0] = 2;		
		
		double myList[];
		myList = new double[10];
		//This creates an array of 10 elements of double type. To assign values in the elements, use the syntax:
		//		arrayRefVar[index] = value;
		
		myList[0] = 2.4;
		myList[1] = 3.6;
		myList[2] = 3.6;
		myList[3] = 3.6;
		myList[4] = 3.6;
		myList[5] = 3.6;
		myList[6] = 3.6;
		myList[7] = 3.6;
		myList[8] = 7.5;
		myList[9] = 2.6;
		
		System.out.println(myList[8]);
		
		//** An array variable and an array are different; an array variable contains a reference to that array. ** arrayRefVar = myList
	}
	
}
