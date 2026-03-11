
import java.util.regex.*;

public class RegularExpressions {

	public static void main(String[] args) {
		// Regex is used to quickly search through an array of characters and organize string format
		//		Regex contains Pattern and Matcher classes
		
		/**	Regex Syntax Elements:
				Character Classes: 		*Could also write [a-z]
						[abc] characters from a to z, [^abc] beginning with characters from a to z
						[0-9], 
						\d (digit) [0-9], \D (non-digit) [\^0-9]
						\s (whitespace), \S (non-whitespace), 
						\w (word character), \W (non-word character).						
						\b (word boundary) Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
						\B (non-word boundary)
				Metacharacters: 
						. (any character), 
						^ (beginning of line/string), It's an anchor for the start of a line/string and a negation operator within a character ckass
						$ (end of line/string), 
						| (OR), 
						! (NOT)
						`\` (escape character).
						-	(hyphen)
				Quantifiers: 
						+ (one or more), 		n+ one or more occurrence of n
						* (zero or more), 		n* zero or more occurrence of n
						? (zero or one), 		n? zero or one occurrence of n
						{n} (occur exactly n times),
						{n,} (occur n or more times), 
						{n,m} (occur between n and m times). char s: s{2,4} s occurs more than 2 time but no more than 4 times
		 */
		
		String testCaret = "With this number, $2044$, we can deduce that ^&H()a)n&#d@#$K is gaining a discount";
		System.out.println(testCaret.replaceAll("[^a-zA-Z0-9]", ":"));
		
		
		String line = "i1n23j45us67t00080ic9e";
		String regex = "\\D";				// Print non-digit characters
		//String regex_1 = "\\d";			// Print only digit characters
		String regex_1 = "([0-9&&[1-9]])";		// Print only digit characters (That don't repeat (0 is omitted))
											//Prints only 0 repeated by using: 		"([0-9])\\1+";	
		
		Pattern pattern = Pattern.compile(regex);
		Pattern pattern_1 = Pattern.compile(regex_1);
		
		Matcher match = pattern.matcher(line);
		Matcher matcher = pattern_1.matcher(line);
		
		while(match.find()) {
			System.out.print(match.group());
		}
		System.out.println();
		
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
		
		//Using regular expressions to remove unwanted characters
		/**Removing both digits and hyphen characters*/
		String sentence = "H3a4te? 2L3et 1me5 t6e--ll7 y8ou8 h8o8w6 m56u89ch 1I2'2v3e c89ome 9to0 h09a90t0e y12o3u s5567in0c0e 0I0 -b-e0-gan- to908 l78ive.";
		System.out.println("\n" + sentence);
		System.out.println(sentence.replaceAll("[\\-\\d]", ""));	//remove the hyphen and the digits
		
	}

}
