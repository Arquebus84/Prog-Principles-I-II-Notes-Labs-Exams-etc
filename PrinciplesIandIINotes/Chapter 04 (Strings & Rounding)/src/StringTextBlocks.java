
public class StringTextBlocks {
	public static void main(String[] args) {
		//Converting strings
		//use the toUpperCase() and toLowerCase() methods to convert a string message to either uppercase or lowercase letters
		System.out.println("welcome".toUpperCase());
		String message = "how loud should i be?";
		System.out.println(message.toUpperCase());
		
		//The trim() method returns a new string by eliminating the white-space characters from both ends of the string
		//Note:'', \t, \f, \r, or \n are known as white-space characters.
		//For example
		System.out.println("\t Good Night \n".trim()); //Returns Good Night; Without the trim method, the message would be displayed after a tab
		
		
		//Reading a string from console
		//The next() method reads a string from a text that is separated by white-spaces
		//The nextLine() method reads the entire line of text from the string
		
		//The next(), nextByte, nextShort(), nextInt(), nextLong(), nextFloat(), and nextDouble() are token-based inputs because
		// they read individual elements separated by white spaces
		//The nextLine() is a line-based input because it reads an entire line
		//Note: DO NOT use a line-based input after a token-based input; it will cause errors
		//Obtain a character from the console:
		char ch = message.charAt(0); //Returns the first character in the string
		System.out.println(ch);
		
		//Text Blocks
		System.out.println("""
				Creates new lines
				Java
				C++
				""");
	}
}
