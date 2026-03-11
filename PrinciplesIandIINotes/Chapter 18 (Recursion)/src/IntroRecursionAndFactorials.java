
public class IntroRecursionAndFactorials {
	//Recursion is a technique that leads to elegant solutions to problems that are inherently recursive.
	
	/**H-trees (heap trees) are used in a very large-scale integration (VLSI), design as a clock distribution network for routing
 		timing signals to all parts of a chip with equal propagation delays.
	 */

	//Recursive methods: methods that invoke themselves; A method that invokes itself directly or indirectly
	//	NOTE: Recursion must eventually converge into the base
	
	//Example of recursive method:
	/**
	public static void sayHi() {	//This method will print out "Hi" until a StackOverflowException occurs
		System.out.println("Hi");
		sayHi();
	}*/
	//In the order above, it will print, then call sayHi(), then print then call sayHi() again until an exception breaks the program
	
	public static void sayHi(int count) {	//This method will print out "Hi", but will only do it depending on the base case
		System.out.println("Hi");
		if(count <= 1) {
			return;			//This method will return and exit the method
		}
		sayHi(count - 1);
	}
	
	/**More on returning primitive and Object data types in RecursionReturnExample package*/
	
	/**Computing Factorials*/
	
	/*
			0! = 1
			n! = n * (n - 1)!; n > 0
	 */
	
	/**
		Let factorial(n) be the method for computing n!
			* The method knows how to solve the simplest case, which is referred to as
			the *base case* or the *stopping condition* 			
		**Base Case (Stopping Condition): A simple case where recursion stops.
		* If you call the method with n > 0, it reduces the problem into a subproblem for computing the factorial of n.
			* The subproblem is the same as the original problem, but is simpler or smaller.
			* Since the subproblem has the same property as the original problem, you can call the method with a 
				different argument; known as ***Recursive Calling***

		* Example1: Recursive Algorithm for computing factorial(n)
			public static long factorial(int n){
				if(n == 0){
					return 1;
				}else{
					return n * factorial(n - 1);
				}
			}

		* Example2:
			public static void xMethod(int n) {
			
				//This base case here is confusing (since the recursive method is in the if-statement) the base case is n <= 0
    			if (n > 0) {
      				System.out.print(n % 10);
      				xMethod(n / 10);
    			}
  			}

	 */
	
	/**Infinite Recursion: Occurs if the recursion does not reduce the problem in a manner that allows it to eventually converge
		into the base or the base is not specified. Example, the factorial:
			public static long factorial(int n){
				return n * factorial(n - 1);
			}
		//This method runs indefinitely and causes a StackOverFlowError
	 */
	
	//Direct Recursion: A recursive method that invokes itself
	//Indirect Recursion: When method A invokes Method B, which in turn will either directly or indirectly invoke method A
	
	public static void main(String[] args) {
		sayHi(5);
		
		
		
		System.out.println("factorial(5) = " + factorial(5) + ". The method was invoked 6 times in total****");
		try {
			System.out.println("factorial(-3) = " + factorialCheck(-3));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		/**Important Example for Understanding Recursion*/
		System.out.println("\nChange(5) reduce: " + change(5)); // Should become 1 since it's called recursively until n > 1 is checked
		
		System.out.println("\nCheck for Primes: "); //Check if Prime
		int div = 2;
		System.out.println("22: " + isPrime(22, div));
		System.out.println("7: " + isPrime(7, div));
		System.out.println("2: " + isPrime(2, div));
		System.out.println("87: " + isPrime(87, div));
		System.out.println("51: " + isPrime(51, div));
		System.out.println("23: " + isPrime(23, div));
		
		System.out.println("Sum from 5: " + recursiveSum(5));
		
		/**StackOverFlowError*/
		//System.out.println("FactorialStack(5): " + factorialStack(5));
	}

	/** Return the factorial for a specified number */
	public static long factorial(int n) {
		if (n == 0) // Base case
			return 1;
		else
			return n * factorial(n - 1); // Recursive call
	}
	
	
	/**Examples: MUST RETURN THE RECURSION FUNCTION!!*/
	//Example1: Recursion Test (recursive function must return the function)
	public static int change(int n) {
		if(n < 1) {
			return 1;
		}else {
			return change(n - 1);
		}
	}
	
	//Example2: Return factorial of n, but throw IllegalArgumentException if n < 0
	public static int factorialCheck(int n){
		
		if (n == 0) {
			return 1;
		} else if (n < 1) {
			throw new IllegalArgumentException("You cannot calculate the factorial of a negative number");
			
		} else {
			return n * factorialCheck(n - 1);
		}
	}
	
	//Example3: return false if not a Prime, else return true
	public static boolean isPrime(int n, int divisor) {
		System.out.print(divisor + " ");
		//Base cases
		if(n <= 2) {
			return true;
		}else if(n % divisor == 0){
	    	return false;
	    }else if(divisor * divisor > n) {	//Check if the divisor^2 is greater than the integer; if yes, then it means that all possible 
	    	return true;					//	divisors have been checked, and not one has been found
	    }
		return isPrime(n, divisor + 1);	//Recursive call (Check for next Divisor)
	}
	
	//Example4: Recursive Sum: sum of natural numbers from 0 to it's integer n:
	public static int recursiveSum(int n){
		if(n == 0) {
			return 0;
		}else {
			return n + recursiveSum(n - 1);
		}
	}
	
	/**StackOverFlowError of Factorial*/
	public static long factorialStack(int n) {
	    return n * factorialStack(n - 1); 			//Without the base case, there will be an error
	  }
}
