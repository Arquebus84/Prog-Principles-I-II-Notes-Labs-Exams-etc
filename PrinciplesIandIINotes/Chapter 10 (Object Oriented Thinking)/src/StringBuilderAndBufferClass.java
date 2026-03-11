
public class StringBuilderAndBufferClass {
	
	/**The StringBuilder and StringBuffer class are similar to String class, except that the String class is immutable*/
	
	//You can use the StringBuilder's constructor to create a string buffer* for a string, and use the toString method in StringBuilder
	//	class to return a string from a StringBuilder
	
	//An object of type StringBuilder can be modified unlike a normal String
	/**
			java.lang.StringBuilder
		+StringBuilder()
		+StringBuilder(capacity: int)
		+StringBuilder(s: String)
				
		+append(data: char[]): StringBuilder							//This method adds a collection of characters to the StringBuilder object
		+append(data: char[], offset: int, len: int): StringBuilder
		+append(v: aPrimitiveType): StringBuilder
		+append(s: String): StringBuilder
		+delete(startIndex: int, endIndex: int): StringBuilder
		+deleteCharAt(index: int): StringBuilder
		+insert(index: int, data: char[], offset: int, len: int): StringBuilder
		+insert(offset: int, data: char[]): StringBuilder
		+insert(offset: int, b: aPrimitiveType): StringBuilder
		+insert(offset: int, s: String): StringBuilder
		+replace(startIndex: int, endIndex: int, s: String): StringBuilder
		+reverse(): StringBuilder
		+setCharAt(index: int, ch: char): void
	*/
	
	/*		Extra methods for the StringBuilder, but this will be shown in ThetoStringCapacityLengthsetLengthcharAt class
		+toString(): String
		+capacity(): int				//Returns the current number of characters the string builder is able to store without 
											increasing its size (use the length() in order to gain the last character: stringBuilder.length() - 1)
		+charAt(index: int): char
		+length(): int					//*length is always less than or equal to the builder's capacity
		+setLength(newLength: int): void
		+substring(startIndex: int): String
		+substring(startIndex: int, endIndex: int): String
		+trimToSize(): void				//Used to reduce the capacity to the actual size (used to save memory space in case capacity 
											is too large)
	 */
	
	
	/**Modifying the StringBuilder*/
	public static void main(String[] args) {
		
		StringBuilder stringB = new StringBuilder(4); 	//Returns a new StringBuilder object with 4 characters
		stringB.append("ABCDE");						//Changes the size from 4 to 5 characters
		//System.out.println(stringB.charAt(5)); //Wrong
		System.out.println(stringB.charAt(4));
		
		String s = "Welcome to Java";
		StringBuilder build = new StringBuilder(s);
		change(build);
		System.out.println(build);
		
		change(s);
		System.out.println(s);
		
		//Replacing
		System.out.println("\nReplacing: ");
		StringBuilder b1 = new StringBuilder("ABCCEFC");
		b1.replace(2, 7, "TTEFT");
		System.out.println(b1);
		
		StringBuilder replaceBtw = new StringBuilder("123");
		System.out.println(replaceBtw);
		replaceBtw.replace(1, 1, "between");
		System.out.println(replaceBtw + "\n");
		
		StringBuilder b3 = new StringBuilder("ABTTEFT");
		
		//Inserting String within StringBuilder
		StringBuilder b2 = new StringBuilder("ABCDEF");
		b2.insert(3, "FFF");
		System.out.println(b2);
		
		//String Buffer
		StringBuffer buffer1 = new StringBuffer("ABTTEFT");
		System.out.println(buffer1 + " = " + b3 + ": " + buffer1.equals(b3));	//Compare buffer1 to b3 is not the case that they are the same
		
		//Deleting characters in string
		System.out.print("buffer1 was " + buffer1);
		buffer1.delete(1, 4); // 0A 1B 2T 3T 4E 5F 6T
		System.out.println(", but now it's " + buffer1);
		
		//StringBuffer Buff2 = "Hello there";	//This cannot be done
		
	}
	
	private static void change(StringBuilder builder) {
		builder.append(" and HTML");
	}
	
	private static void change(String s) {
		s = "Java and HTML";
	}
}
