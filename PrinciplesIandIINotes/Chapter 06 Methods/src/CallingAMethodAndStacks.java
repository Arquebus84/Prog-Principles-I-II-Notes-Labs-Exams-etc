
public class CallingAMethodAndStacks {
	//Calling a method executes the code in the method
	//To execute a method, you have to call or invoke it; the program that calls a method is called a caller
	
	//TWO ways to Call a method:
	//1)If a method returns a value, a call to the method is usually treated as a value; for ex:
	//		int larger = max(3, 4);
	//2)The max(3, 4) assigns a value to variable larger; another way to call a method that is treated as a value:
	//		System.out.println(max(3, 4));
	
	//If a method returns void, a call to the method must be a statement. For example, the method println returns void. The following call is a statement
	//		System.out.println("Welcome to Java!");
	
	//NOTE: A value-returning method can also be invoked as a statement. In this case, the caller simply ignores the return value. This is not often done, but
	//	it is permissible if the caller is not interested in the return value;
	
	//Method Signature:
	//	(Modifiers) (static) returnType name(parameter list){
	//	
	//	}**Modifiers can be public or private(protected), but static is also a modifier
	
	
	//Static methods are used to call the method instantly
	public static int max(int num1, int num2) {
		return((num1 > num2)? num1 : num2);
		
		/*	Can write:
		 * int result = (num1 > num2)? num1 : num2;
		 * return result;
		 * 
		 */
		
		/*	Can also write:
		 * int result;
		 * if(num1 > num2)
		 * 		result = num1;
		 * else
		 * 		result = num2;
		 * 
		 * return result;
		 */
	}
	
	//The public method includes the parameter list String[], this indicates that it's an array of String
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		//The main method is a caller and is calling the max() method
		System.out.println("The max value is " + max(x,y));
		
		/**When calling a method, the variable or value listed in a call to a method is called an argument*/
		Math.pow(2, 4);
	}
	
	//A return statement is required for a value-returning method. The example below shows the correct syntax for returning a value
	//**NOTE: on line 62, (else return -1;) do not write else if(n < 0), it will cause a compiler error because the compiler thinks that it won't return a value
	/*
	 * 	public static int sign(int n) {
  			if (n > 0)
    			return 1;
  			else if (n == 0)
    			return 0;
  			else 
    			return –1;
		}
	 */
	
	//***NOTE: If you create a new class, the max method can be invoked using ClassName.methodName (ex: CallingAMethodAndStacks.max() for this program, but you 
	//			 can create a class called MaxTest and invoke it as MaxTest.max())
	
	//	CALL STACKS
	//Each time a method is invoked, the system creates an activation record that stores parameters and variables for the method and places the activation
	//	record in an area of memory known as a call stack (aka execution stack, runtime stack, or machine stack).
	//When a method calls another method, the caller's activation record is kept intact and a new activation record is created for the new method called.
	//When a method finishes its work and returns to its caller, its activation record is removed from the call stack
	
	//A call stack stores the activation records in a last-in first-out fashion: The activation record for the method that is invoked last is removed first from
	//	the call stack. For ex:
	//		If method m1 calls method m2, and m2 calls method m3, the runtime system pushes m1's activation record into the stack, and then m2's, and m3's.
	//			After m3 is finished, its activation record is removed from the stack. After m2 is finished, its activation record is removed from 
	//			the stack; and finally, m1 is removed after it's finished
	
}