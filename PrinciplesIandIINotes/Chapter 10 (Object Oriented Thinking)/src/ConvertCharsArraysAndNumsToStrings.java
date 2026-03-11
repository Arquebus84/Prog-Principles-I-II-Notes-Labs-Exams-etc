
public class ConvertCharsArraysAndNumsToStrings {

	//To convert an array of characters into a string, use the overloaded static valueOf() method in the String class
	//To convert a character or number to a string, still use the overloaded valueOf() method
	
	/**
			java.lang.String
		+valueOf(c: char): String
		+valueOf(data: char[]): String
		+valueOf(d: double): String
		+valueOf(f: float): String
		+valueOf(i: int): String
		+valueOf(l: long): String
		+valueOf(b: boolean): String
		+toCharArray(): char[]					//Use this to convert a string into an array of characters
	*/
	
	public static void main(String args[]) {
		//Array of characters into a single string ast
		char[] stringArr = {'a', 'b', 'o', 'u', 't'};
		
		String h = "ABCDEF";
		char[] b = h.toCharArray();	//Convert String h to array of characters
		printArray(b);
		
		
		String abt = stringArr.toString();	//This only references the memory designation of stringArr
		String ast = new String(stringArr);
		System.out.println(abt + "\n" + ast);
		
		String s = "abc";
		//String a = s.trim();
		s.toCharArray();
	}
	
	public static void printArray(char[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
