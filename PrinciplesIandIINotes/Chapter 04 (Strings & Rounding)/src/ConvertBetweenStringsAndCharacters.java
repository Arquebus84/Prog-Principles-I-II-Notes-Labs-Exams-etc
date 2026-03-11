
public class ConvertBetweenStringsAndCharacters {
	public static void main(String[] args) {
		//You can convert a numeric string into a number. 
		//To convert a string into an int value, use the Integer.parseInt() method such as:
		//int intValue = Integer.parseInt(intString); //The intString is a numeric string such as "123"
		
		//Convert a string into a double value use Double.parseDouble() method:
		//double doubleValue = Double.parseDouble(doubleString); //the doubleString is a numeric such as "12.34"
		
		//Convert an integer to a string with Integer.toString(number)
		//Ex: 	int x = 1; 
		//		String st = Integer.toString(x);
		
		//**Convert char to String similarly to Integer.toString(intValue) by writing Character.toString(charValue)
		
		char c = 'A';
		String stringC = Character.toString(c);
		System.out.println(c + "\n" + stringC);
		
		int x = 1023; 
		String stringX = Integer.toString(x);
		System.out.println(stringX); //Displays the same number, but as a string instead of as an integer
		boolean end = stringX.endsWith("3");
		System.out.println(end);
		
		int y = 202;
		String m = String.valueOf(y);
		System.out.println(m); //Displays the same number, but as a string instead of as an integer
		
		if(m.endsWith("1")) {
			System.out.println(m); //Will only displays the same number if it ends with 1 (***uses the string m)
		}
		
		//Convert string to integer
		String message = "234";
		int z = Integer.parseInt(message);
		System.out.println(z);
		
	}
}
