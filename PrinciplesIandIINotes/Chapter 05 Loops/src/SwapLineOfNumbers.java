
public class SwapLineOfNumbers {

	
	public static void main(String[] args) {
		
		//This is for swapping numbers on a list
		int x = 1234;	//Initial value
		while (x != 0) {	//Check to make sure that the initial value is not zero yet, if it becomes zero, exit the loop
			System.out.print(x % 10);	//print on the same line the remainder of the initial value
			x = x / 10;	//After the first few values were printed, that the initial value and divide it by 10 to find the remainder of the next few
							//values. For example, if x = 1335, 1335 % 10 is 5, then 1335 / 10 is 133 (which is integer not decimal), and repeat.
		}
		
		//Flips the following numbers
		System.out.println("Flip 1234 is ");
		flip(1234);
		m("LIVE");
	}
	
	//Flips the numbers
	public static void flip(int n) {
	    while (n != 0) {
	      System.out.print(n % 10);
	      n = n / 10;
	    }
	  }
	
	//Flips the letters
	public static void m(String s) {
	    for (int i = s.length() - 1; i >= 0; i--) {
	      System.out.print(s.charAt(i));
	    }
	}
	
}
