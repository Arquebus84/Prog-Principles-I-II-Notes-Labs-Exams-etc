
public class FibonacciComputing {
	//In some cases, recursion enables you to create an intuitive, straightforward, simple solution to the problem
	
	/**	Fibonacci Series
	 		* Series: 0 1 1 2 3	5 8 13 21 34 55 89
	 		* Indexes:0 1 2 3 4 5 6 7  8   9 10 11 
	 */
	
	//NOTE: Fibonacci Series in this example is Binary Recursion
	/**Fibonacci series begins with 0 and 1; each subsequent number is the sum of two preceding numbers. 
		Can be defined recursively as:
		
			fib(0) = 0;
			fib(1) = 1;
			fib(index) = fib(index - 1) + fib(index - 2); n >= 2
		
		//Recursive Algorithm:
		if(index == 0) {
			return 0;
		}else if(index == 1) {
			return 1;
		}else {
			return fib(index - 1) + fib(index - 2);
		}
	*/
	
	/***Number of recursive calls in Fibonacci:
			* For example, invoking fib(4) makes two recursive calls, fib(3) and fib(2), and 
				then returns fib(3) + fib(2), since it's fib(n - 1) and fib(n - 2) THE ORDER MATTERS!
			* In Java, the operands are evaluated from left to right.
			* Invoking fib(4) spawns recursive calls to fib:			NOTE: Think of this graph as a flowchart

											fib(4)
												| *0: call fib(4)
												|							*17: return fib(4)
							____________________|_________
							[return: 	fib(3) 	+ 	fib(2)]							*16: return fib(2)
						*1: call fib(3)	|				|
										|				|	*11: call fib(2)
		*10: return fib(3)				|				|						*12: call fib(1)
					____________________|______			|__________________________
					[return:	fib(2) + fib(1)]		[return:	fib(1) + fib(0)]
				*2: call fib(2)	| 			|						|			|		*14: call fib(0)
*7: return fib(2)				|			|						|			|
								|			|						|			|
								|			| *8: call fib(1)		return 1	return 0
			____________________|_______	|												*15: return fib(0)
			[return: 	fib(1) + fib(0)]	return 1				*13: return fib(1)
		*3: call fib(1)	|			|			*9: return fib(1)
						|			|
						|			|
						|			| *5: call fib(0)
					return 1		return 0
	*4: return fib(1)				*6: return fib(0)

			***The return fib(n) are used to return back and call fib(n - 1) 
				-For example, return fib(1) to call fib(0)
		
		
	*Overall: There are many duplicated recursive calls. For instance:
				**fib(2) is called twice, fib(1) is called three times, and fib(0) is called twice
			
			In general, computing fib(index) requires roughly twice as many recursive calls as does computing fib(index - 1).
				* As you try harder and harder values, the number of calls substantially increases
	
		index:		2	3	4	10		20			30				40				50
		# of calls: 3	5	9	177		21,891		2,692,537		331,160,281		2,075,316,483
	 */
	
	
	/**NOTE: The number of times fib is invoked in fib(5) = 1 + number of time fib is invoked in fib(3) + number of 
				time fib is invoked in fib(4) 
											= 1 + 5 + 9 = 15 total**
	 
	 */
	
	public static void main(String[] args) {
		System.out.println(fibonacci(6));
		
		System.out.println("xMethod1(5): "); xMethod1(5);
		System.out.println("\nxMethod2(5): "); xMethod2(5);
		System.out.println("\n\n1247 % 10 = " + (1247 % 10));
		System.out.println("\nsumDigits(1247): " + sumDigits(1247));
	}
	
	public static long fibonacci(int index) {
		if(index == 0) {	//Base Case
			return 0;
		}else if(index == 1) {	//Base Case
			return 1;
		}else {			//Reduction and recursive calls
			return fibonacci(index - 1) + fibonacci(index - 2);
		}
	}

	//Examples:
	/**NOTE: The order in which you place the recursive calls is important!*/
	public static void xMethod1(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			xMethod1(n - 1);			//Reverses the number leading to 1
		}
	}
	public static void xMethod2(int n) {
		if (n > 0) {
			xMethod2(n - 1);			//Writes it forward leading to 5
			System.out.print(n + " ");
		}
	}
	
	
	//Create a method that returns the sum of individual digits that lead to the input number;
	//	for example sumDigits(1247) should be 14 1 + 2 + 4 + 7 = 14
	/**NOTE: 1247
			n % 10 returns last digit 7	//Only time when you need to return n % 10**
			n / 10 % 10 returns 4
			n / 100 % 10 returns 2
			n / 1000 returns 1 (same for n / 1000 % 10)
	 */
	public static int sumDigits(int n){
		
		/**NOTE: could also write:	if(n == 0){
		 								sum = 0;
		 							}else{}
		 */
		
	    //Check if the number is less than 2 digits
		int sum = 0;
		if(n < 10) {
			sum = n % 10;
		}else {
			//Sum is last digit plus the next terms to the left
			sum += (n % 10) + sumDigits(n / 10); // Returns last digit
		}
		return sum;
	}
	
}
