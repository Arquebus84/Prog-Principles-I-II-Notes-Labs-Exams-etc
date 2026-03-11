
public class LoopsToUseNotes {
	public static void main(String[] args) {
		//The while-loop and for-loop are called pretest loops b/c the continuation-condition is before the body is executed.
		//The do-while loop is called a posttest loop b/c the continuation-condition is checked after the body is executed.
		/*
		 * while(loop-continuation condition){}		is the same as	for( ; loop-continuation-condition; ){}
		 * 
		 * 	for (initial-action; loop-continuation-condition; action-after-each-iteration){}
		 *		This is the same as:
		 *	initial-action;
		 *	while(loop-continuation-condition) {action-after-each-iteration;}
		 */
		/*NOTE: 
		 * A for-loop may be used for the number of repetitions known in advance; such as displaying the same message 100 times
		 * A while-loop may be used if the number of repetitions is not fixed, as in the case of reading numbers until the input is 0
		 * A do-while-loop may be used if the loop body has to be executed before the continuation condition is tested
		 */
		
		/*int i = 1;
		int sum = 0;
		while (sum < 10000) {
		  sum = sum + i;
		  i++;
		}
		System.out.println(sum);*/
		//Convert to for-loop
		
		int sum = 0;
		for(int i = 1; sum < 10000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//While loops can support doubles
		double summation = 0;
		double d = 0;
		while(d != 10.0) {
			d += 1.0; //Do not put d += 0.1 because then the program may not stop because there is a numerical inaccuracy for operating with floating-point numbers 
			summation += summation + d;
		}
		System.out.println(summation);
		
		//The program compiles and displays 14 despite having the semicolon instead of the curly brackets
		int i = 0;
	    for (i = 0; i < 10; i++);//		can also write this line as: for(i = 0; i <= 9; i++){};
	    System.out.println(i + 4);
		
	}
}
