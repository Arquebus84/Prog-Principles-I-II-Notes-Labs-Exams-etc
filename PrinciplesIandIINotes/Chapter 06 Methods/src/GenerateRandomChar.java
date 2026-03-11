
public class GenerateRandomChar {

	public static void main(String[] args) {
		//Characters in Unicode range from 0 to FFFF in hexadecimal (0 to 65535 in decimals).
		//The Math.random() is generates decimal values from 0 to 1 (you have to add 1 into the expression)
		//Use (int)(Math.random() * (1 + 65535)) in order to generate random numbers between 0 and 65535
		
		//**The unicode for a is (int)'a'
		
		//A random integer from a to z is (int)((int)'a' + Math.random() * ((int)'z' - ((int)'a' + 1))
		
		//***Remember that all numeric operators can be applied to the char operands. The char operand is cast into a number if the other operand is a number
		//	or a character. Therefore, a random number can be generated with:
		// 		'a' + Math.random() * ('z' - 'a' + 1)
		//In order to generate a random lower case letter from integer values, you can write:
		//		(char)('a' + Math.random() * ('z' - 'a' + 1))
		
		//Hence any random character between two characters ch1 and ch2 with ch1 < ch2, can be generated with:
		//		(char)(ch1 + Math.random() * (ch2 - ch1 + 1))
		
		
		System.out.println(getRandomCharacter('a', 'z'));
	}
	
	//GetRandom Character method that is invoked in the main method. 
	public static char getRandomCharacter(char ch1, char ch2) {
	  return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	/** Generate a random lower case letter */
	public static char getRandomLowerCaseLetter() {
	  return getRandomCharacter('a', 'z');
	}

	/** Generate a random upper case letter */
	public static char getRandomUpperCaseLetter() {
	  return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
	  return getRandomCharacter('0', '9');
	}
	
	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	
}
