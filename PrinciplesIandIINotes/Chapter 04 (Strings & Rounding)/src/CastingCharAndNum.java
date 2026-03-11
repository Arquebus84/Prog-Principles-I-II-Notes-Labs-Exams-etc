
public class CastingCharAndNum {
	/**Type Casting (Casting): The process of converting a variable from one data type to another
	 		Ex1 implicit casting: 
	 			int a = 12;
	 			long b = a
	 			
	 		Ex2 explicit casting:
	 			int a = 12;
	 			double b = (double)a;
	 */
	public static void castingExample() {
		//Implicit
		int a = 12;
		long b = a;		
		double c = a;
		
		//Explicit
		double d = 23.76;
		int n = (int)d;
		System.out.println(a + " " + b + " " + c + " " + d + " " + n);
	}
	
	public static void main(String[] args) {
		
		//A char can be casted into any numeric data type and vice versa
		
		//When an integer is cast into a char data type, only its lower 16 bits (2 bytes) of data is used, the other part is ignored
		//NOTE: a hexadecimal integer is written using the prefix 0X 
		char ch = (char) 0XAB0041;		
		System.out.println(ch); //ch is the character A
		
		//When a floating-point value is cast into a char type, the floating-point value is first cast into an int, which is then cast into a char
		char cha = (char) 65.25; //Decimal 65 is assigned to cha
		System.out.println(cha); //cha is the character A
		
		//When a char is cast into a numeric value, the character's Unicode is cast into the specific numeric value
		int i = (int) 'A'; //Unicode of char A is assigned to i
		System.out.println(i); //i is 65
		
		//implicit casting can be used if the result of a casting fits into the target variable.
		//otherwise, explicit casting must be used, ex: Unicode for 'a' 97, which is within the range of a byte, these implicit castings are fine
		byte b = 'a';
		int c = 'a';
		//However, the following statement is incorrect because the Unicode \uFFF4 cannot fit into the byte
		//byte b = '\uFFF4'; //You have to explicitly cast it
		byte by = (byte) '\uFFF4';
		//Any positive integer from 0 to FFFF in hex can be cast into a character implicitly
		
		//Code that randomly generates a lowercase letter:
		char chr = (char)(97 + Math.random() * (122 - (97 + 1)));
		//or you could write (char)Math.random()*26 + 'a'
		System.out.println(chr);
		
		System.out.println('z' - 'a'); //This converts z to 122 and z to 97; the result is 25
		
		System.out.println(b + ", " + c + ", " + by);
	}
}
