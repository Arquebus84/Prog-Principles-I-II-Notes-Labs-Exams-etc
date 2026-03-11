import java.util.Scanner;
public class CompareStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * String Class Methods
		 * Ex: message.equals(s1);
		 * Method					:		Description
		 * equals(s1)				:	Returns true if this string is equal to s1
		 * equalsIgnoreCase(s1)		:	Returns true if this string is equal to s1; it is case sensitive
		 * compareTo(s1)			:	Returns an integer > 0, = 0, or < 0 to indicate whether this string is either > s1, = s1, or < s1
		 * compareToIgnoreCase(s1)	:	Same as compareTo(), except that the comparison is case-sensitive
		 * startsWith(prefix)		:	Returns true if this string starts with the specified prefix
		 * endsWith(suffix)			:	Returns true if this string ends with the specified suffix
		 * contains(s1)				:	Returns true if s1 is a substring to this String
		 */
		
		//NOTE: Do not do String1 == String2, or use == boolean operator because it only checks whether String1 and String2 refer to the same object; it
		//		doesn't tell you they have the same contents
		
		
		/*
		 * if(String1.equals(String2){
		 * 		System.out.println("Both strings have the same contents");
		 * }else{
		 * 		System.out.println("Both strings are different");}
		 */
		String s1 = "Message from Java";
		String s2 = "message from java";
		System.out.println(s1.equals(s2)); //Displays false
		System.out.println(s1.equals(s2) == s2.equals(s1)); //Displays true because they are the same object (false == false)
		
		//The compareTo() method returns a value of 0 is s1 is equal to s2, a value less than 0 if s1 lexicographically (refers to Unicode ordering) less 
		//than s2, or a number greater than 0 is s1 is lexicographically greater than s2.
		//NOTE: The actual value returned from the compareTo() method depends on the offset of the first two distinct characters in s1 and s2 from left
		//to right. For example, if s1 = "abc" and s2 = "abg", in s1.compareTo(s2) the first two characters 'a' & 'a' are compared. Because they are equal,
		//the second two characters are then compared, 'b' & 'b', and because those are found to be equal, it compares the third two characters 'c' & 'g', and
		//since c is 4 less than g, it returns the value of -4;
		String abc = "abc";
		String abg = "abg";
		System.out.println(abc.compareTo(abg)); //Returns -4 because c is 4 letters below g
		
		System.out.println(s1.compareTo(s2)); //Returns -32
		System.out.println(s1.compareTo(s1)); //Returns 0
		
		String a = "This is it";
		String b = "This is it";
		
		System.out.println("Difference between \"" + a + "\" and \"" + b + "\" is: " + a.compareTo(b));
		
		//Another compare to example would be city Names:
		String city1 = "Chicago";
		String city2 = "Atlanta";
		System.out.println((city1.compareTo(city2) < 0)? "Negative Number" : "Positive Number");
		System.out.println((city2.compareTo(city1) < 0)? "Negative Number" : "Positive Number");	//Will be negative b/c C is greater than A
		
		//The equalsIgnoreCase() and the compareToIgnoreCase() methods ignore the case of letters when comparing two strings
		System.out.println(s1.equalsIgnoreCase(s2)); //Returns true even if not all of the letters are exactly uppercase
		//prefix, suffix, and contains
		System.out.println(s1.startsWith("Me"));
		System.out.println(s1.endsWith("ava"));
		System.out.println(s1.contains("from"));
		
		
		//Checks whether the user has typed the url that begins with the prefix https in uppercase and lowercase
		String url = input.next();
		boolean isSecure;
		if(url.startsWith("https") || url.startsWith("HTTPS")){
		    isSecure = true;
		}else{
		    isSecure = false;
		}
		System.out.println(isSecure + "\n");
		
		input.close();
	}
}
