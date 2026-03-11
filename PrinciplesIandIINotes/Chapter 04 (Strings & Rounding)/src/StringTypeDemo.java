
public class StringTypeDemo {
	public static void main(String[] args) {
		//String is a sequence of characters
		//A String is a predefined class like the System and Scanner classes (A class is a reference type, not data type)
		//Ex: 
		String message = " Hello Java! ";//**White spaces on both sides of the message
		
		String.format("");	//Used to return a string in formated style
		
		//The table lists the String methods for obtaining the string length, characters in a string, concatenating a string, 
		// converting string to uppercase or lowercase letters, and trimming string.
		//Ex: String.length() obtains the total number of characters in a string message (starts at 0 as first character; includes 
		// the empty spaces and symbols)
		/* Method			:	Description
		 * length()			:	Returns the number of characters in the string
		 * charAt(index)	:	Returns the character at the specified index from the string (starts at 0 and ends to n)
		 * concat(s1)		:	Returns a new string that concatenates (links together) this string with string s1
		 * toUpperCase()	:	Returns a new string with all letters in uppercase
		 * toLowerCase()	:	Returns a new string with all letters in lowercase
		 * trim()			:	Returns a new string with white-space characters trimmed on both sides
		 */
		//These methods can only be invoked from a specific string instance; that is why they are called instance methods
		//Instance methods: Non-static methods in a class. Instance methods belong to instances and can only be invoked by them
		//Static methods (non-instance methods): Methods that can be invoked without creating an instance of the class. 
		//To static methods, put the modifier static in the method declaration. Ex: (Math.sin(2));
		//* All methods defined in the Math class are static method 
		//Syntax for invoking an instance method: referenceVariable.methodName(arguments)
		//Ex:
		System.out.println(message.trim());
		System.out.println("The length of the message, \"Hello Java!\" is " + message.length());
		System.out.println(message.charAt(5)); //Returns the letter J if it's 6 and nothing if it's 5
		System.out.println(message.charAt(0)); //Returns the first index of the string
		
		//System.out.println(message.charAt(message.length())) 
		//The above message would give an error saying StringIndexOutOfBoundsException because the index number is not listed in 
		// the String
		
		System.out.println(message.charAt(message.length() - 1)); //This is returns the number of the last character of the string 
		// without an error
		
		//Concatenate two strings:
		String add = " Here is your homework.";
		System.out.println(message.concat(add)); //This connects add to message
		//Can also use add operators:
		System.out.println(message + " And C++");
		//* At least one of the operands must be a string
		//Note: If you concatenate a string with a non-string (e.g. a number), that non-string is converted to a string and 
		// concatenated; for Example:
		String s = "Chapter " + 2; //s becomes Chapter 2
		String b = "Supplement " + 'B'; //b becomes Supplement B
		//Augment operator can also be used
		s += ". And here is more work: ";
		System.out.println(s + b);
		
		//Output notes:
		System.out.println("1" + 1); //Returns 11
		System.out.println('1' + 1); //Character 1 has a value of 49 in ASCII, so the result is 50
		System.out.println("1" + 1 + 1); //Returns 111 because the numbers are converted to strings
		System.out.println("1" + (1 + 1)); //Returns 12 due to the operation's result being converted to a string
		System.out.println('1' + 1 + 1); //Returns the character '1' as 49 and adds 1 and 1 to it to make 51
		System.out.println('\u0001'); //Prints the question mark
		System.out.println('\u0001' + 1); //Converts 1 into \u0031, adds \u0001 to make \u0032 and converts the result to 2 and prints it
		System.out.println('\u0001' + '1'); //The character 1 is converted to the value 49, the end value one is added to 49 to make 50
		System.out.println('\u0002' + '1');
		
		System.out.println(message + add);
		System.out.println("Java " + 1 + 2 + 3);
		
		//Removing white spaces from a string 
		System.out.println(message.replaceAll("\\s", ""));
		
	}
}
