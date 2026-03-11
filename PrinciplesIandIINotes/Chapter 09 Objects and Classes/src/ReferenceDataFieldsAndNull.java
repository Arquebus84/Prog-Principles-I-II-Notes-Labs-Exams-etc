
public class ReferenceDataFieldsAndNull {

	//Data fields can be of reference types; for example, in the Student class, it contains a data field 'name' of the String type (String is a 
	//	predefined class):
	
	/*
	public class Student{
		String name; //name has the default value null
  		int age; //age has the default value 0
  		boolean isScienceMajor; //isScienceMajor has default value false
  		char gender; //gender has default value '\u0000'
	}
	*/
	
	//Null: A literal of a reference variable that doesn't reference a concrete object. If a data field of a reference variable does not reference any object,
	//			the data field holds this value (null). **Null is a reserved word in Java not a reserved word.**
	
	/**Default value for a boolean type, numeric type, and object type are false, 0, and null*/
	
	//It does not work for all cases; in the main method, both x and y are not initialized, therefore, causing a compiler error
	public static void main(String[] args) {
	/** int x; // x has no default value
		String y; // y has no default value
		System.out.println("x is " + x);		//Error occurs in these two lines (23 and 24)
		System.out.println("y is " + y);*/
		System.out.println("X is " + 2);
	}
	
	//NullPointerException: Runtime error that occurs when you invoke a method on a reference variable with a null value.
}

/*
class TestNullException{
	int x;

	public TestNullException(String t) {
		System.out.println("Test");
	}

	public static void main(String[] args) {
		TestNullException test = null;
		System.out.println(test.x);			//Null Pointer Access Occurs Here
	}
}

class ReferenceEx{
	boolean x;
	
	public static void main(String[] args) {
		ReferenceEx a = new ReferenceEx();
		System.out.println(a.x);			//Prints out false
	}
}*/