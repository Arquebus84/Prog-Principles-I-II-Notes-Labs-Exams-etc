
public class ChainedExceptionsAndDefiningCustomExceptions {
	
		//Defining Custom
	  
	  //java.lang.Exception class
	  /**
	  		java.lang.Exception
		+Exception()
		+Exception(message: String)
		+Exception(message: String, cause: Exception)
	   */
	
	//Main method references the Chained and Custom Exceptions methods
	public static void main(String[] args) {
		  chainedExceptionsEx();
		  
		  try {
			  throw new InputExceptionExample("Custom");
		  }catch(InputExceptionExample ex) {
			  System.out.println("Exception from Custom class: InputExceptionExample");
		  }
		  
		  printMessageExceptionMain();
	}
	
	
	
	//Chained Exceptions: Throwing a new exception along with another exception. For example:	
	public static void chainedExceptionsEx() {
	    try {
	      method1();
	    }
	    catch (Exception ex) {
	      //ex.printStackTrace();
	    	System.out.println("Chained Exception Complete");
	    }
	  }

	  public static void method1() throws Exception {
	    try {
	      method2();
	    }
	    catch (Exception ex) {
	      throw new Exception("New information from method 1", ex);
	    }
	  }

	  public static void method2() throws Exception {
	    throw new Exception("New info from method2");
	  }
	
	  
	  /**NOTE: This will be very useful to create a custom exception where you don't need to hard-code the message
			in the custom exception class; rather, you can throw new CustomException(write message here)
	   */
	  public static void printMessageExceptionMain() {
		  double a = 2;
		  double b = 0;
		  
		  try {
			  printExceptionDivision(a, b);
			  
		  }catch(PrintMessageException ex) {
			  System.out.println(ex.toString());
		  }
	  }
	  
	  public static double printExceptionDivision(double a, double b) throws PrintMessageException {
		  if(b == 0) {
			  throw new PrintMessageException("Cannot Divide by Zero");
		  }else {
			  return a / b;
		  }
	  }
	
}

@SuppressWarnings("serial")	//Suppresses the warning for this class
class InputExceptionExample extends Exception{
	//private String message;
	
	public InputExceptionExample(String message) {
		super(message);
	}
	
	public String newMessage(String message) {
		return message;
	}
}

@SuppressWarnings("serial")
class PrintMessageException extends Exception{
	
	private String message;
	
	public PrintMessageException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
