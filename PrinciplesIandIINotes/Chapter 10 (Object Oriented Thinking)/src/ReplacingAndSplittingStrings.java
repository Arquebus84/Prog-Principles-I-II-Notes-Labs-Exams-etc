
public class ReplacingAndSplittingStrings {
	
	/**
			java.lang.String
		+replace(oldChar: char, newChar: char): String
		+replace(oldStr: string, newStr: string): String
		+replaceFirst(oldString: String, newString: String): String
		+replaceAll(oldString: String, newString: String): String
		+split(delimiter: String): String[]	
	*/
	
	public static void main(String[] args) {
		String s = "ABABC";
		s.replace('A', 'a');
		String b = s.replace("B", "k");		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(s.replace('A', 'K'));
		
		//System.out.println(s.change('A', 'B')); //Cannot work because it's
		
		String[] stringArray = "Welcome to Java".split("o"); //One way to create a string array by splitting it
		String[] arr2 = "Welcommen auf dem mond!".split("");
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}
}
