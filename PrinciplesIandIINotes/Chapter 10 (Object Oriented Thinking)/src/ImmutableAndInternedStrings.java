
public class ImmutableAndInternedStrings {
	//The following code will not change the String object s, because String is immutable
	/*
	String s = "C++";
	s = "HTML";
	*/
	
	//Interned String: A String that is contained
	
	public static void main(String args[]) {
		System.out.println(getFormat());		
	}
	
	public static String getFormat() {
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		String s4 = new String("Welcome to Java");
		
		return String.format("s1 == s2: " + (s1 == s2) + "%ns1 == s3: " + (s1 == s3) + "%ns2 == s4: " + (s2 == s4));
	}
	
}
