
public class MatchingReplacingAndSplittingByPatterns {

	/**A regular expression (regex) is a string that describes a pattern for matching a set of strings. You can match, replace, or split 
			a string by specifying a pattern.*/	
	
	public static void main(String args[]) {
		/**Matches method is more powerful than equals method b/c it not only can match two strings like the equals method, but also a 
			set of strings that follow a pattern: */
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("It is good to learn Java".matches(".*Java"));
		
		//The "Java.*" is a regular expression; it describes a string pattern that begins with java, followed by any zero or more characters.
		
		//This statement evaluates to true:
		System.out.println("440-02-4554".matches("\\d{3}-\\d{2}-\\d{4}"));
		
		/**The \\d represents a single digit, and \\d{3} represents 3 digits*/
		
		/*The replaceAll, replaceFirst, and split methods can be used with a regular expression. The following statement returns a 
			new string that replaces $, +, or # in "A+B$#C" with string NNN
		*/
		String a = "A+B$#C".replaceAll("[+$#]", "NNN");
		System.out.println(a);
		
		//The following statement splits the string into an array of strings delimited by punctuation marks
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
		for(int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + " ");		//Displays Java C C# C++ 
		}
		
		//Note: the comma is in the regular expression
		/**The regular expression "[.,:;?]" specifies the pattern that matches ., ,, :, ;, or ?*/
		//Thus, the string is split into Java, C, C#, and C++ which are stored in the array tokens
		
		
		System.out.println();
		
		//Other examples:
		System.out.print("Hi, ABC, good".matches("ABC") + " ");
		System.out.println("Hi, ABC, good".matches(".*ABC.*") + " ");
		
		System.out.print("A,B;C".replaceAll(",;", "#") + " ");
		System.out.println("A,B;C".replaceAll("[,;]", "#"));
	}
}
