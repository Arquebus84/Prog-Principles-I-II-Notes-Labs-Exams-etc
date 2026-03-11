
public class ObtainingSubstrings {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//You can obtain single character from a string with the charAt() method.
		//You can also obtain a substring from a string using the substring() method
		//Ex: message.substring(0, 3)
		
		/*	Method							:	Description
		 * 
		 * substring(beginIndex)			:	Returns this string's substring that begins with the character at the specified beginIndex and 
		 * 											extends to the end of the string
		 * substring(beginIndex, endIndex)	:	Returns this string's substring that begins with the specified beginIndex and extends to the 
		 * 											character at index endIndex - 1. NOTE: the character at endIndex is not part of the substring
		 */
		
		String message = "Welcome to Java";
		message = message.substring(0, 11) + "C++"; //Note the 11 is going to be 10 because it is endIndex - 1
		System.out.println(message); // Displays Welcome to C++
		System.out.println(message.substring(5) + "\n"); //Starts at the 5th index m and continues to display "me to C++"
		
		//Create a substring for message that goes from index 3 to index 10:
		System.out.println(message.substring(3,11) + "\n"); //Displays "come to"
		
		String s1 = "Welcome To Java";
		System.out.println(s1.substring(3)); //Displays come To Java
		System.out.println(s1.substring(3,8)); //Displays come
		System.out.println(s1.indexOf("Wel")); //Returns 0
		System.out.println(s1.lastIndexOf("Wel")); //Returns 0 
		System.out.println(s1.indexOf("Jav", 4)); //Returns 11
		System.out.println(s1.lastIndexOf("Jav", 4)); //Returns -1
		//NOTE: If the beginIndex is > endIndex, then a runtime error would occur.
		
		String st1 = "abc is the first 3";
		String st2 = "def is the next 3";
		//Swap the two
		String tmp = st1;
		st1 = st2;
		st2 = tmp;
		
		System.out.println(st1.equals(st2));		
		System.out.println(tmp.substring(0, 4));
		System.out.println(tmp.substring(4));
		System.out.println(st1.concat(st2)); //Connects and displays st2 and tmp(st1): "def is the next 3abc is the first 3"
		
		String s = "Jones exists";
		int k = s.indexOf(' ');
		String name = s.substring(0, k);
		String last = s.substring(k + 1);
		
		System.out.println(name + "\n" + last);
		
		String intString = "Integer value";
		String doubleString = "Double value";
		//int intValue = Integer.parseInt(intString);
		//double doubleValue = Double.parseDouble(doubleString);
		System.out.println(s.equals(null) + "\nType a string: ");
		
		String t = input.next();
		if(t == null) {
			System.out.println(t);
		}else {
			System.out.println(t);
		}
	}
}
