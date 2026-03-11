
public class ArrayInitializer {

	public static void main(String[] args) {
		//Syntax for initializing an array:
		//	elementType[] arrayRefVar = {value0, value1, ... valuek};
		
		
		double myList[] = {2.45, 4.65, 23.5};
		//This is called "indexed variable" because it initializes myList at index 0
		myList[0] = 2.3;
		
		double x[] = new double[5];
		x[0] = 2.4;
		System.out.println(x[0]);
		
		//**The new operator is NOT used in an array-initializer syntax; you have to declare, create, and initialize the array in one statement;
		//Ex: Incorrect
		//		int x[];
		//		x = {2, 5, 7};
		
		//String array
		String forecast[] = {"Clear", "Cloudy", "Rainy", "Stormy", "Snowy", "Windy", "Foggy"};
		forecast[0] = "Very Clear";
		
		//Incorrect:
		//	char twoChar[] = new char[2];
		//	twoChar[] = {'a', 'b'};
		
		//Correct
		char twoChar[] = new char[2];
		twoChar[0] = 'b';
		twoChar[1] = 'a';
		//or
		char twiceChar[] = {'a', 'b'};
		twiceChar[0] = 'c';
		
	}

}
