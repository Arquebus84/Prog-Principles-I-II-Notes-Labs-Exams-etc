
public class RethrowingExceptions {
	//Java allows an exception handler to rethrow the exception if the handler cannot process the exception, or simply wants to
	//	let its caller be notified of the exception.
	
	//Syntax
	/**
		try{
			statements;
			
		}catch (ExceptionType ex){
			perform operations before exits;
			throw ex;
		}
	
	 */
	//**The statement "throw ex" rethrows the exception to the caller so other handlers in the caller get a chance to
	//		process the exception ex
	
	
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		} catch (RuntimeException ex) {
			System.out.println("RuntimeException");
		} catch (Exception ex) {
			System.out.println("Exception");
		}
	}

	static void method() throws Exception {
		try {
			String s = "5.6";
			Integer.parseInt(s); // Cause a NumberFormatException

			int i = 0;
			@SuppressWarnings("unused")
			int y = 2 / i;
			System.out.println("Welcome to Java");
		} catch (NumberFormatException ex) {					//The catch block rethrows the exception
			System.out.println("NumberFormatException");
			throw ex;
		} catch (RuntimeException ex) {
			System.out.println("RuntimeException");
		}
	}
	
}
