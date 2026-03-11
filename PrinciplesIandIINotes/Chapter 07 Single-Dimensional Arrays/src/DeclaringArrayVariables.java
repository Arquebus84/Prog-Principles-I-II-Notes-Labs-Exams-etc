
public class DeclaringArrayVariables {

	public static void main(String[] args) {
		//Syntax (preferred by putting square brackets after the element type (data type) such as double[] or int[])
		//	elementType[] arrayRefVar;
		
		//Allowed (but not preferred syntax) ***This is the C++ style 
		//	elementType arrayRefVar[];
		
		int x[] = new int[10];
		
		int y[] = {3, 1, 4, 1, 5, 9};
		
		System.out.println(y[1]);
		System.out.println(x[1]);
		
		
	}

}
