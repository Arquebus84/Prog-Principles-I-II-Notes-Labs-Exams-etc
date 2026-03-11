
public class CharacterAndUnicodeDemo {
	public static void main(String[] args) {
		//In java, the char data type is used to represent a single character that is either a letter or number
		char letter = 'A';
		char number = '4';
		
		//Character literal for A is 'A'
		//String literal for A is "A"
		
		//Encoding represents a character using binary code
		//Unicode is a code system for international characters managed by the Unicode Consortium
		//It is used to support the interchange, processing, and display of written texts in the world's languages
		//It was originally a 16-bit character encoding (had about 65,536 characters possible); however this was insufficient.
		//Now Unicode has expanded to support 1,112,064 characters; NOTE: these characters that go beyond the 16-bit limit are called Supplementary characters
		//16-bit Unicode takes 2 bytes that are preceded by \\u expressed as four hexadecimal digits running from \u0000 to \uFFFF
		//The greek symbols α β and γ are \u03b1 \u03b2 \u03b3
		
		//ASCII (American Standard Code for Information Interchange) is an 8-bit encoding scheme for representing all uppercase and lowercase letters,
		//	digits, punctuation marks, and control characters
		// Characters		:	Code Value in Decimal	:	Unicode Value
		// '0' - '9'		:	48 to 57				:	\u0030 to \u0039
		// 'A' - 'Z'		:	65 to 90				:	\u0041 to \u005A
		// 'a' - 'z'		:	97 to 122 				: 	\u0061 to \u007A
		
		char letterA = 'A'; //A has a Unicode of \u0041
		char uniA = '\u0041';
		char y = 'c';
		
		System.out.println(uniA); //Prints A
		
		//Increment a decrement operators can be used in char
		System.out.println(++letterA); //changes the original value A to B
		System.out.println(letterA++); //Doesn't change the original value A, but will display B (the next character)
		System.out.println(y++); //doesn't change the original value c
		System.out.println(++y); //does change the original value c, but ignores d
		
		//Escape Sequences for Special Characters
		//Escape sequence is a special notation that consists of a back slash character (\) and has to be followed by a combination of characters; Ex:
		/* ESeq	:	Name			:	Unicode	:	Decimal Value
		 	\b	:	backspace		:	\u0008	:	8
		 	\t	:	tab				:	\u0009	:	9
			\n	:	linefeed		:	\u000A	:	10
			\f	:	formfeed		:	\u000C	:	12
			\r	:	carriage return	:	\u000D	:	13
			\\	:	backslash		:	\u005C	:	92
			\"	:	double quote	:	\u0022	:	34
		*/
		//NOTE: \u345dE is invalid because Unicode has to have exactly four hex numbers
		System.out.println("\"\\b\" is for backspace");
		letter++;
		System.out.println("letter++ is " + (letter) + "\nbut number++ in this string is " + (number++));
	}
}
