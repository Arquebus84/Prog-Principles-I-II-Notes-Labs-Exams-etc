
public class ExceptionTypes {
	//Checked and Unchecked Exceptions (more at the bottom) are determined:
	//		* Checked: Exceptions that are caught during compiling time
	//		* Unchecked (or Runtime): Exceptions that are caught during runtime
	//		* Error instances are also considered as unchecked exceptions
	
	//Exceptions are objects; objects are defined using classes. 
	/**The root class for exceptions is java.lang.Throwable (Meaning that Java exceptions is an instance of Throwable)*/
	
	//Exceptions thrown are instances of this diagram
	/**
 													⬐--[Many More Classess...]
													⬐--[ClassNotFound]
													⬐--[IOException]
								⬐---[Exception]◁-------[RuntimeException]◁-----------------	[ArithmeticException]
	[Object]◁---[Throwable]◁----														⬑---[NullPointerException]
								⬑---[Error]◁-----------[LinkageError]					⬑---[IndexOutOfBoundsException]
													⬑--[VirtualMachineError]			⬑---[IllegalArgumentException]
													⬑--[Many More Classess...]			⬑---[Many More Classess...]
													
	 */
	//**The Error, Exception, and RuntimeException classes are all exceptions and all of the errors occur at the same time.
	
	//Errors (**System-Level Problems) (Fatal)
	/**System errors are thrown by the JVM and are represented int the Error class; Error class describes internal fatal
		system errors, though such errors rarely occur. If one does, there is little to do beyond notifying the user and 
		gracefully shutting down the program.
	 */
	
	//Example of subclasses Error
	/**		Class:											Reason For Exception
		LinkageError:						A class has some dependency on another class, but the latter class has changed
										incompatibly after the compilation of former classes
		
		VirtualMachineError					The JVM is broken or has run out of the resources it needs in order to continue operating 
	 */
	
	//Exceptions	(Non-Fatal)
	/**Exception class describes errors caused by your program and by external circumstances. These errors are non-fatal, and can 
		be caught and handled by your program.
	 */
	
	//Examples of subclasses Exception
	/**		Class:											Reason For Exception
		ClassNotFound:						Attempt to use a class that does not exist. This exception would occur if you tried
										to run a nonexisting class using the java command or if your program were composed of (for example)
										three class files, only two of which can be found.
		
		IOException:						Input/Output operations, such as invalid input, reading past the end of a file, and opening a
										non-existing file. Examples of IOException subclasses are InterruptedIOException, EOFException (End-Of-File),
										and FileNotFoundException		
	 */
	
	//Runtime Exceptions
	/**RuntimeException class describes programming errors, such as bad casting, accessing an out-of-bounds array index, and numeric errors.
		Runtime exceptions normally indicate programming errors.
		
	 */
	//Examples of RuntimeException
	/**		Class:											Reason For Exception
		ArithmeticException:				Dividing an integer by 0. Note floating-point arithmetic doesn't throw exceptions
		
		NullPointerException:				Attempting to access an object through a null reference variable
		
		IndexOutOfBoundsException:			Index to an array is out-of-range
		
		IllegalArgumentException:			Method is passed as an argument that is illegal or innappropriate
	 */
	
	//**Unchecked Exceptions: Instances of RuntimeExceptions, Error, and their subclasses
	
	//**Checked Exceptions: Instances of all other subclasses that are not part of RuntimeExceptions, Error, or their respective subclasses. 
	//		Meaning that IOException and ClassNotFound are checked
	
	
}
