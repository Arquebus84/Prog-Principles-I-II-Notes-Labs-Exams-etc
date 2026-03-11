
public class MultiDeclareThrowAndCatchExceptions {
	/**
	 A handler for an exception is found by propagating the exception backward through a chain of method calls,
	 	starting from the current method
	 */
	//Exception handling in Java consists of catching, throwing, and catching and processing exceptions
	
	/**
	 method1(){											method2() throws Exception{	//Declare Exception
	 	try{
	 		invoke method2();								if (an error occurs){
	 	}catch(Exception Ex){	//Catch exception				throw new Exception();	//Throw exception
	 		process exception;								}
	 	}						 						
	 }													}
	 *  
	 */
	//Declaring Exceptions: All checked exceptions thrown by the method must be explicitly declared in the method declaration
	//	so that the caller of the method is informed of the exception.
	
	/**
	Catching Exceptions												Declaring Exceptions
	
		void p1() {												void p1() throws Exception{
  			try {													p2();
    			p2(); // p2() may throw an exception			}
  			}
  			catch (IOException ex) {
    			...
  			}
		}		
	 */
			
	public static void DeclareExceptionExample() {
		//Declaring Exception
		Exception ex = new Exception("The program has encountered an error.");
		
		ex.getClass();
	}
	
	//Throwing Exceptions: A program that detects an error can create an instance of an appropriate exception type an throw it.
	
	public static void throwExample() throws ArithmeticException{	
		System.out.println("Calculation Error");
		//throw new ArithmeticException("The calculation cannot be divided by zero.");	//To throw new, make sure the ExceptionType
																						//	is the same as the declaration above (throws)
	}
	
	
	//Catching Exceptions: When an exception is thrown, it can be caught and handled in a try-catch block:
	/**
		try{
			statements; //Statements that may throw exceptions
			
		}catch(ExceptionType1 exVar1){
			handler for exception1;
			
		}catch(ExceptionType2 exVar2){
			handler for exception2;
			
		}
		...
		catch(ExceptionTypeN exVarN){
			handler for exceptionN;			
		}
	*/
		//*If one of the statements inside the try block throws an exception, Java skips the remaining in the try block, and starts the
		//	process of finding code to handle the exception.
		
		//The Exception Handler: Code that handles the exception; it's found by exception propagation, meaning that it goes backward 
		//	through a chain of method calls, starting from the current method.
		
		//Exception Propagation: Refers to the mechanism for catching exceptions in a chain of method calls. The exception is propagated
		//	through a chain of methods.
	
	
	/*//Incorrect Order											//Correct Order
		
		try{														try {
  			...															...
		}															}
		catch (Exception ex) {										catch (RuntimeException ex) {
  			...															...
		}															}
		catch (RuntimeException ex) {								catch (Exception ex) {
  			...															...
		}															}
		
		//Causes a compiler error									//SubType must be checked before superType
		
	 */
	
	/**Multi-catching: allows a simplified code for catching multiple exception types with the same handling code*/
	
	/**Syntax:

		catch(Exception1 | Exception2 | ... | ExceptionN ex){
			//Same code for handling exceptions
		}
	 */
	
	//NOTE: When multi-catching, it's the same as making many catching clauses, so the same rules apply:
	/**
			//Incorrect **Runtime Exceptions only**

		catch(ArithmaticException | IOException | Exception ex){	//Cannot use Checked Superclass Exception or IOException
			
		}
		
			//Correct
		catch(ArithmaticException | NullPointerException | IllegalArgumentException ex){
			
		}
	 */
	
	public static void multiCatchEx(){	
		try {
			int b = 34 / 0;
			System.out.println(b);
			
		}catch(ArithmeticException | IllegalArgumentException exceptions) {
			System.out.println("Multi-Catching Complete");
		}
	}
	
	//Use the keyword 'throws' for declaring a method for throwing an exception
	//Use the keyword 'throw' for throwing an exception when an exception occurs
	//**A method may declare to throw multiple exceptions
	//**If a checked exception occurs in a method, it must be either caught or declared to be thrown from a method
	
	public static void main(String[] args) throws Exception {
		
		//Throwing Exception Test
		try {
			int a = 1/0;				//Immediately notices an Arithmetic Exception
			System.out.println(a);
		}catch(ArithmeticException ex) {
			throwExample();
		}
		
		
		//Exception does not occur
		Object o = null;
		System.out.println(o);
		
		//ClassCastException occurs
		/**
		Object b = new Object();
		String d = (String)b;
		System.out.println(d.toString());*/
		
		try {
			System.out.println("The result is " + (1 / 0));
		}catch(Exception Ex) {
			checkException();
		}
		
		//Catching exceptions
		multiCatchEx();
		catchExceptionTest();
	}
	
	public static void checkException() throws Exception{
		
		System.out.println("Check System Requirements");
	}
	
	public static void catchExceptionTest() {	//Causes a compiler error, but now will display NumberFormatException
		try {
		      String s = "5.6";
		      Integer.parseInt(s); // Cause a NumberFormatException

		      int i = 0;
		      @SuppressWarnings("unused")	//This suppresses the warnings for y being unused
		      int y = 2 / i;
		    }
		    catch (Exception ex) {
		      System.out.println("NumberFormatException");
		    }
		    //catch (RuntimeException ex) {					//Causes A Compiler Error b/c RuntimeException is subclass of Exception class
		     // System.out.println("RuntimeException");             
		   // }
	}
}

class Circle{
	double radius;
	
	Circle(){		
	}
	
	public void setRadius(double radius) {
		throw new IllegalArgumentException("Radius cannot be negative");		
	}
}
