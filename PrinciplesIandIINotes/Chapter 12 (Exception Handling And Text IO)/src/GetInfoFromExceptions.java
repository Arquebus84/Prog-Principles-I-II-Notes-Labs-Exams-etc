
public class GetInfoFromExceptions {

	/**
			java.lang.Throwable
	+getMessage(): String					//Returns a message that describes this exception object
	+toString(): String						//Returns the concatenation of three strings: the full name of the exception class,
												a colon and a space (": "), and the getMessage() method
	+printStackTrace(): void				//Prints the throwable object and its call stack trace information on the console
	+getStackTrace(): StackTraceElement[]	//Returns an array of stack trace elements representing the stack trace pertaining
												to this exception object.
	 */

	public static void main(String[] args) {
		//Exception test 1
		/**Important, an exception is raised due to the Integer.parseInt(s), and does not operate the rest of the code, *remember from 
			EclaringThrowingAndCatchingExceptions code:
			
				*If one of the statements inside the try block throws an exception, Java skips the remaining in the try block, 
					and starts the process of finding code to handle the exception.
		 */
		try {
			String s = "5.6";
			Integer.parseInt(s); // Cause a NumberFormatException
			
			int i = 0;		//Skips the rest of this code due to the first exception
			@SuppressWarnings("unused")
			int y = 2 / i;
			System.out.println("Welcome to Java");
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		
		//Exception test 2
		try {
			p();
			System.out.println("After the method call");
			
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
			//ex.printStackTrace();
			
		} catch (RuntimeException ex) {
			System.out.println("RuntimeException");
		}
	}
	
	static void p() {
	    String s = "5.6";
	    Integer.parseInt(s); // Cause a NumberFormatException

	    int i = 0;
	    @SuppressWarnings("unused")
	    int y = 2 / i;
	    System.out.println("Welcome to Java");   
	  }
	
}
