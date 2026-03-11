
public class PassingArgumentsByValues {
	//**When you invoke a method with a parameter, the value of the argument is passed to the parameter. This is known as Passing by value
	//Java programmers often say passing x to y, which actually means passing the value of argument x to parameter y
	
	public static void main(String[] args) {
		nPrintln("Word\n", 3);
		
		int k = 2;
		nPrintln("A world\n", k);
		
		//Using increment method
		int x = 1;
	    System.out.println("Before the call, x is " + x);
	    increment(x);
	    System.out.println("After the call, x is " + x);
	}

	//Prints a message n number of times
	public static void nPrintln(String message, int n) {
		/*for(int i = 0; i < n; i++) {
			System.out.println(message);
		}*/
		
		while (n > 0) {
		    System.out.print(message);
		    n--;
		}
	}
	
	//NOTE: the arguments must match the parameters in order, number, and compatible type, as defined in the method signature
	
	//When you invoke a method with an argument, the value of the argument is passed to the parameter; This is referred to as pass-by-value. If the argument 
	//	is a variable rather than a literal value, the value of the var is passed to the parameter.
	public static void increment(int n){
	    n++;
	    System.out.println("n inside the method is " + n);
	}
	
	//Java programmers say pass x to y
}
