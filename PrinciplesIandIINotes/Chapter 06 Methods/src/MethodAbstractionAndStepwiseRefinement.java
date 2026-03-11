
public class MethodAbstractionAndStepwiseRefinement {

	public static void main(String[] args) {
		//Method abstraction: A technique in software developing that hides detailed implementation. 
		//	It is achieved by separating the use of a method from its implementation.
		/**	The client can use a method without knowing how it's implemented. If you decide to change the implementation, the client program will not be affected;
				this is known as information hiding or **encapsulating** 
				Information hiding: (Software engineering concept for hiding the detailed implementation of a method for a client). This can 
				only work if you DID NOT change the method signature		
		*/
		
		/*Divide-and-conquer: The concept of method abstraction that can be applied to the process of developing programs. When writing a large program, you
				can use the strategy of "divide-and-conquer" to decompose it into subproblems. The subproblems can be further decomposed into smaller, more
				manageable problems.
				This is also called stepwise refinement**		
		*/
		
		//For example, when trying to create a program that displays the calendar month, and year, you do not want to start trying to work out the solution to
		//	every detail. ***Attention to detail is good, however, in the beginning of making the program, the concern for detail may block the problem-solving
		//	process. To make the problem solving flow smoothly, use method abstraction to isolate details from design.
		
		//Top down design:
		/*	This is the design process for a program that reads the calendar date:
		
		 		Print Calendar (main)
		 		↓					↓
		 		readInput			printMonth
		 							↓		↓
		 				printMonthTitle		printMonthBody
		 				↓					↓			↓
		 			getMonthName		getStartDay		getNumberOfDaysInMonth
		 									↓				↑		↓
		 							getTotalNumberOfDays--->↑		↓
		 									↓						↓
		 								isLeapYear	<----------------
		 
		 */
		
		//For the implementation, the subproblem corresponds to a method in the implementation. For example, the subproblem, readInput can simply 
		//	be implemented in the main method
		
		//You can use the top-down or bottom-up approach for the implementation, however, there is also an incomplete method:
		//**Stubs: A simple, but incomplete version of a method, can be used for the methods waiting to be implemented. The use of stubs enables you to quickly 
		//		build the framework of the program. Implement the main method first then use a stub for the printMonth method (let printMonth display year 
		//		and month in the stub)
		
		
		//For each program, write a test program, known as a *driver* to examine the initial code and check to see how it works.
		
		//**isLeapYear can use this mathematical code:
		//		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		
		
	}

}
