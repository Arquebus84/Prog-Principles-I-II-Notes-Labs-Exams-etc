
public class StringClassAndFormatting {
	
	
	//String class is immutable; once an object of type String is created, it cannot be changed.
	
/* Method													:	Description
 * +length()												: Returns the number of characters in the string
 * +charAt(index)											: Returns the character at the specified index from the string (starts at 0 and ends to n)
 * +concat(s1)												: Returns a new string that concatenates (links together) this string with string s1
 * +toUpperCase()											: Returns a new string with all letters in uppercase
 * +toLowerCase()											: Returns a new string with all letters in lowercase
 * +trim()													: Returns a new string with white-space characters trimmed on both sides
 * +indexOf(str: String)									: Returns the first index of the specified string
 * +indexOf(char: char)										: Returns the first index of the specified char
 * +indexOf(str: String, fromIndex: int)					: Returns the index of the specified string after the index of fromIndex
 * +indexOf(char: char, fromIndex: int)						: Returns the index of the specified char after the index of fromIndex
 * +indexOf(str: String, beginIndex: int, lastIndex: int)	: Returns the index of the specified string between the first and last index
 * +indexOf(char: char, beginIndex: int, lastIndex: int)	: Returns the index of the specified char between the first and last index
 * +lastIndexOf(str String)									: Returns the last index of the specified string or letter
 */
	
	/**
/		/To convert an array of characters into a string, use the overloaded static valueOf() method in the String class
		//To convert a character or number to a string, still use the overloaded valueOf() method
			java.lang.String
		+valueOf(c: char): String
		+valueOf(data: char[]): String
		+valueOf(d: double): String
		+valueOf(f: float): String
		+valueOf(i: int): String
		+valueOf(l: long): String
		+valueOf(b: boolean): String
		+toCharArray(): char[]					//Use this to convert a string into an array of characters
	 */
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf('e', 2));
		System.out.println(s.indexOf('e', 2, 8));
		
		/**Can create a string object from a string literal or from an array of characters*/		
		/**Recommended/Preferred way to create a String:*/
		//String stringName = "stringLiteral"		//This does not create a new object and can be comparable (look below for s1 and s3)
		
		//A string literal is a sequence of letters closed in double quotation marks
		String stringLiteral = "THIS ";
		String a = new String(stringLiteral);
		
		String textA = "Java";
		textA.replace('J', 'L');
		System.out.println(textA);
		
		char charArray[] = {'I', 'S', ' ', 'O', 'K'};
		String b = new String(charArray);
		System.out.println(a + b);
				
		//String s;
		//System.out.println("s is" + s);	//Gives error b/c s is not defined
		
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		String s4 = new String("Welcome to Java");
		
		//NOTE from Chapter 4: Do not do String1 == String2, or use == boolean operator because it only checks whether String1 and String2 refer 
		//		to the same object; it doesn't tell you they have the same contents
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s2 == s4: " + (s2 == s4));
		System.out.println("s2.equals(s4): " + s2.equals(s4));
		
		/**Format strings by returning String.format(format, item1, item2, ..., itemN) */
		
		String stringF = String.format("%7.2f%6d%-4s", 34.5, 23, "C++");
		System.out.println(stringF);
		
		String a1 = new String("Welcome");
		String a2 = a1.toUpperCase();
		System.out.println((a1.equals(a2)));
	}
}
