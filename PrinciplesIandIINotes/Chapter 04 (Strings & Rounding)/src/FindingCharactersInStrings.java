
public class FindingCharactersInStrings {
	public static void main(String[] args) {
		//Finding characters and substrings inside of strings
		/*message.indexOf(1,4);
		 * String Class provides several version indexOf() and lastIndexOf() methods to find a character or substring in a string
		 * Method						:	Description
		 * indexOf(ch)					:	Returns the index of the first occurrence of ch in the string. Returns -1 if it does not match
		 * indexOf(ch, fromIndex)		:	Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if it does not match
		 * indexOf(s)					:	Returns the index of the first occurrence of string s in the string. Returns -1 if it does not match
		 * indexOf(s, fromIndex)		:	Returns the index of the first occurrence of string s in the string after fromIndex. Returns -1 if it does not match
		 * lastIndexOf(ch)				:	Returns the index of the last occurrence of ch in the string. Returns -1 if it does not match
		 * lastIndexOf(ch, fromIndex)	:	Returns the index of the last occurrence of ch before fromIndex in the string. Returns -1 if it does not match
		 * lastIndexOf(s)				:	Returns the index of the last occurrence of string s in the string. Returns -1 if it does not match
		 * lastIndexOf(s, fromIndex)	:	Returns the index of the last occurrence of string s in the string before fromIndex. Returns -1 if it does not match
		 */
		
		String message = "Welcome to Java";
		System.out.println(message.indexOf('e')); //returns 1
		System.out.println(message.indexOf('W')); //returns 0
		System.out.println(message.indexOf('c', 4)); //Returns -1
		System.out.println(message.indexOf('c' , 3)); //Returns 3
		System.out.println(message.indexOf('c' , 0)); //Returns 3
		System.out.println(message.indexOf("to")); //Returns 8 because the t in to is at index 8
		
		System.out.println((message.substring(0, 7).equals("Welcome"))? "True" : "False");
		System.out.println((message.startsWith("Welcome"))? "True" : "False");
		System.out.println((message.endsWith("Java"))? "True" : "False");
		System.out.println((message.endsWith("a"))? "True" : "False");
		System.out.println((message.substring(message.length() - 4).equals("Java"))? "True" : "False");
		System.out.println((message.indexOf("Java") == 0)? "True" : "False");
		System.out.println((message.charAt(0) == 'J' && message.charAt(1) == 'a' && message.charAt(2) == 'v' && message.charAt(3) == 'a' )? "True" : "False");
		
		String num = "ABCDABC";
		System.out.println(num.lastIndexOf("BC")); //Returns 5 because the B from the last BC is at index 5
		
		System.out.println(message.substring(0,2) + "\n"); //Returns We
		
		//Suppose that there is a space inbetween the first and last name; here is how you can obtain the first and last names
		String s = "Chuck Jones";
		int space = s.indexOf(' ');
		String name1 = s.substring(0, space);
		String name2 = s.substring(space + 1); //Which is 6
		System.out.println(s + "\nFirst Name: " + name1 + "\nLast Name: " + name2);
	}
}
