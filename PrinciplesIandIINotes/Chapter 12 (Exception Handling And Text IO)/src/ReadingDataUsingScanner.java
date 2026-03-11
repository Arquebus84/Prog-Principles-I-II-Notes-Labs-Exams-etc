import java.util.*;
import java.io.*;
public class ReadingDataUsingScanner {
	//The java.util.Scanner class is used to read Strings and primitive data values from the console. The Scanner class
	//	breaks its input into tokens delimited by whitespace characters
	
	//To read from keyboard input, create a Scanner as follows:
	/**Scanner input = new Scanner(System.in);	*/
	
	//To read from a file, create a Scanner as follows:
	/**Scanner read = new Scanner(new File(filename));	*/
	
	/**
			java.util.Scanner
		+Scanner(source: File)						//Creates Scanner that produces values scanned from the specified file
		+Scanner(source: String)					//Creates Scanner that produces values scanned from the specified String. It's
														interesting to note that a Scanner can scan data from a file as well as from
														a String
		+close()									//Closes the Scanner
		+hasNext(): boolean							//Returns true if this Scanner has more data to read
		+next(): String								//Returns the next token as a String from this Scanner (doesn't count the line-ending
														or line-separator (\r or \n))
		+nextLine(): String							//Returns a line-ending with the line separator from this Scanner
		+nextByte(): byte							//Returns next token as a byte from this Scanner
		+nextShort(): short							//Returns next token as a short from this Scanner
		+nextInt(): int								//Returns next token as a int from this Scanner
		+nextLong(): long							//Returns next token as a long from this Scanner
		+nextFloat(): float							//Returns next token as a float from this Scanner
		+nextDouble(): double						//Returns next token as a double from this Scanner
		**+useDelimiter(pattern: String): Scanner		//Sets this Scanner's delimiting pattern and returns this Scanner (Check below)
	 */
	
	//The scanner utilizes token-based and line-based input:
	/**Token-based input methods: nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), and next()*/
	
	/**Line-based method is nextLine()*/
	
	/**Token-based input skips any delimiters (whitespace characters by default) then reads a token ending at a delimiter*/
	
	//**If the token does not match the expected type, an InputMismatchException is thrown.
	
	/**NOTE: the line-separator string is defined by the system: it's \r and \n on Windows. To get line-separator on a particular
				platform use:
						String lineSeparator = System.getProperty("line.separator");
				
				*If you enter input from a keyboard, a line ends with the enter key, which corresponds to the \n character
	 */
	
	//Token-based input does not read the delimiter after the token; if nextLine() method is invoked after a token-based input 
	//	method, this method reads characters that start from this delimiter and end with the line separator. The line separator is
	//	read, but is not part of the string returned by the nextLine() method.
	//		**Check ScannerTest() method as an example
	
	public static void main(String[] args) {

		//Scanner Test: Difference between next() and nextLine()
		Scanner input = null;
		try {
			input = new Scanner(new File("C:\\Users\\matte\\ReadingDataTest.txt"));

			while (input.hasNext()) {
				// System.out.println(input.next());
				// Prints: 23,
				// 33,
				// 54

				System.out.println(input.nextLine());
				// Prints: 23, 53, 54
			}

		} catch (Exception ex) {
			System.out.println("Input Invalid");
		} finally {
			if (input != null) {
				input.close();
			}
		}
		
		System.out.println("Is this visible?");
		
		
		ScannerTest();
	}
		
	public static void ScannerTest(){
		Scanner input = new Scanner(System.in);
		
		
		/*		OLD Scanner Test
		System.out.println("Write your name: ");				
		while(input.hasNext()) {
			
			String b = input.nextLine();
			System.out.println("Okay, I'll call you " + b);
			break;
		}*/
				
		System.out.println("Write 34.3 57.8 789");
		
		double v1 = input.nextDouble();
		double v2 = input.nextDouble();
		String line = input.nextLine();
		
		char[] arr = line.toCharArray();	//contains [ , 7, 8, 9] from String line
		System.out.println(v1 + "\n" + v2 + "\nString line contains characters: " + java.util.Arrays.toString(arr));	
		
		
		input.close();
	}
}
