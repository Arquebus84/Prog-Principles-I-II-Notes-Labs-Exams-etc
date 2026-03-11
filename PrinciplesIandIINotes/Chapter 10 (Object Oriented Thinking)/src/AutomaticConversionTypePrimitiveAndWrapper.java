
public class AutomaticConversionTypePrimitiveAndWrapper {

	//A primitive-type value can be automatically converted to an object using a wrapper class, and vice versa
	
	/**Boxing: converting a primitive value to an object*/
	
	/**Unboxing: (reverse) converting an object to a primitive value: compiler will automatically obtain the primitive value from object*/
	
	//autoboxing/autounboxing: The compiler automatically will box a primitive value that appears in a context requiring an object; and it will
	//	also unbox an object that appears in a context requiring a primitive value.
	
	//For example:
	Integer intA = Integer.valueOf(2);	//Create Integer object and assign it to intA
	Integer intB = 2;					//2 is autoboxed into an Integer object for 2
	
	int integerA = 3;					//int value 2 is assigned to integerA
	int integerB = Integer.valueOf(3);	//Integer object 2 is autounboxed and assigned to integerB
	
	
	
	
	Integer[] intArray = {1, 2, 3};
	int i = intArray[0] = intArray[2];
	int b = i + intArray[1];
	double a = intArray[2];
	
}
