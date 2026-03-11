
public class DefiningMethodEx {

	public static void main(String[] args) {
		System.out.println(triple(3));
		System.out.println(half(1));
		String n = "Matteo";
		welcomeMessage(n);
		
	}
	
	//Multiplies the integer a by 3 and returns the value of a
	public static int triple(int a) {
		a *= 3;
		return a;
	}
	
	//Method takes an integer, divides it by 2 and returns the result as a double
	public static double half(int a) {
		double result = a / 2.0;
		return result;
	}
	
	//Method takes the string and displays the message
	public static void welcomeMessage(String name){
	    System.out.println("Welcome to School, " + name + "!");
	}
	
}
