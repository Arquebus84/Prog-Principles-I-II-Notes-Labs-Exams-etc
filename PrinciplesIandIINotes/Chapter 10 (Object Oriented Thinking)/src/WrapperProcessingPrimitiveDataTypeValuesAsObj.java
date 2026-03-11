import java.lang.Integer;
public class WrapperProcessingPrimitiveDataTypeValuesAsObj {
	
	/**Primitive type value is not an object, but it can be wrapped in an object using a wrapper class in the Java API.*/
	
	//Java offers a convenient way to incorporate, or wrap, a primitive data type value into an object (e.g. wrapping an int into 
	//	an Integer object).
	
	/* Java provides these wrapper classes (All wrapper classes are immutable):
	
		Integer
		Double
		Boolean
		Character
		Float
		Short
		Byte
		Long
	*/
	
	//Numeric wrapper classes are similar; they contain doubleValue(), floatValue(), intValue(), longValue(), shortValue(), and byteValue()
	
	//**Integer wrapper class (properties are very similar in the Double class, the only key is to change Int/Integer to Double)
	/**
			java.lang.Integer
	
		-value: int
		+MAX_VALUE: int		(*static)
		+MIN_VALUE: int		(*static)
		__________________
		+Integer(value: int)
		+Integer(s: String)
		+byteValue(): byte
		+shortValue(): short
		+intValue(): int
		+longValue(): long
		+floatValue(): float
		+doubleValue(): double
		+compareTo(o: Integer): int
		+toString(): String
		+valueOf(value: int): Integer					(*static)
		+valueOf(s: String): Integer					(*static)
		+valueOf(s: String, radix: int): Integer		(*static)
		+parseInt(s: String): int						(*static)
		+parseInt(s: String, radix: int): int //Returns an Integer for a specified integer string using the specified radix. (*static)
	
	 */
	
	//Wrapper classes do not have no-arg constructors; the instances of all wrapper classes are all immutable (once the objects 
	//	are created, their internal values cannot change).
	
	//Examples
	@SuppressWarnings("removal") //This is used as a condition in order for the code to run without warnings
	public static void main(String[] args) {
		
		Integer x1 = new Integer("32");
	    Integer x2 = new Integer("32");		//These are deprecated because they are references to the Integer class, which doesn't have a constructor.
	    Integer x3 = Integer.valueOf("32");	//These are not deprecated.
	    Integer x4 = Integer.valueOf(32);
	    System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
	    System.out.println("x1 == x3 is " + (x1 == x3)); // Display false
	    System.out.println("x3 == x4 is " + (x3 == x4)); // Display true
		
	    
	    /**Each numeric wrapper has constants MAX_VALUE and MIN_VALUE*/
	    
	    System.out.println(Integer.MIN_VALUE); //Displays the minimum integer value
	    System.out.println(Float.MIN_VALUE); //Displays the minimum float value
	    System.out.println(Double.MIN_VALUE); //Displays the minimum double value
	    
	    /**Each numeric wrapper contains the methods doubleValue(), intValue(), floatValue(), longValue(), byteValue(), and shortValue() */
	    System.out.println(Integer.valueOf("23").doubleValue());
	    System.out.println(Double.valueOf("4.07").intValue());
	    
	    //Recall: the String class has the compareTo method for comparing 2 strings, so do the wrapper classes.
	    /**The compareTo method returns 1 0 or -1 if this number is >, =, or < the second number**/
	    Integer a = Integer.valueOf("23");
	    Integer b = Integer.valueOf("26");
	    Integer c = Double.valueOf("23.4").intValue();
	    System.out.println(a.compareTo(b));	//In this case, 23 < 26, returns -1
	    System.out.println(a.compareTo(c));	//Here, 23 = (int)(23.4), therefore, 23 = 23, returns 0
	    
	    //Recall, have used the parseInt (or parseDouble) method to parse a string into a number:
	    System.out.println(Integer.parseInt("002"));
	    
	    /**Each numeric wrapper has two overloaded parsing methods to parse a numeric string into an appropriate numeric value based 
	    on 10 (decimal) or any specific radix (e.g. 2 for binary, 8 for octal, and 16 for hexadecimal).
	    
	    	//the parseInt methods in the Integer class:
	    	public static int parseInt(String s)
	    	public static int parseInt(String s, int radix)
	    	
	    	//the parseDouble methods in the Double class:				**The radix is whole number
	    	public static double parseDouble(String s)
	    	public static double parseDouble(String s, int radix)
	    */
	    
	    /**Note: binary only includes 1 and 0*/
	    System.out.println("\"11\", 2 returns: " + Integer.parseInt("11", 2));		//returns 3
	    System.out.println("\"12\", 8 returns: " + Integer.parseInt("12", 8));		//returns 10
	    System.out.println("\"13\", 10 returns: " + Integer.parseInt("13", 10));	//returns 13
	    System.out.println("\"1A\", 16 returns: " + Integer.parseInt("1A", 16));	//returns 26
	    
	    //***Integer.parseInt("12", 2); will result in a runtime error exception b/c 12 is not a binary number
	    
	    
	    //**NOTE: you can convert a decimal number into a hexadecimal number using the format method
	    String aMessage = String.format("%x", 26); //Returns 1a
	    System.out.println("Returns " + aMessage);
	    
		
	    /**This expression returns a decimal integer from a binary string*/
	    System.out.println(Integer.parseInt("1010", 2));
	    /**This expression returns a decimal integer from a hex string*/
	    System.out.println(Integer.parseInt("29AF", 16));
	    
		int i = (int)(Double.parseDouble("12"));
		int j = Integer.parseInt("23");
		int k = Integer.valueOf("23");
		int h = Integer.valueOf("23").intValue();
		//int b = (new Integer("23")).intValue(); //Can do this, but will result in a warning
		
		System.out.println(i + " " + j + " " + k + " " + h);
		
		//System.out.println(Integer.parseInt("12", 2));	//Cannot be done because 12 is not a binary number
		System.out.println(Integer.parseInt("12", 8));
	}
	
}
