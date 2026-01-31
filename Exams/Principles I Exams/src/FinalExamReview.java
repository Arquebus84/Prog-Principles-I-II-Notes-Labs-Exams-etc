
//Approx 27 questions (34 total with extra questions within the 27) (MCQ: 50%; SAQ: 35%; Programming Questions: 15%)

public class FinalExamReview {
	//Java was originally developed by a team led by James Gosling at Sun Microsystems
	//Due to security reasons, Java applets cannot run from a Web browser in the new version of Java; however, java *applications can be
	//	executed from a web browser
	
	//JDK: Java Development Kit		JVM: Java Virtual Machine		JRE: Java Runtime Environment	IDE: Integrated Development Environment
	//API: Application Programmer Interface										**JRE and IDE are not the same (JRE is for java programs only)
	
	//NOTE: The process for turning source code into a runnable program:
	//				source code (java language) ---> compiled into bytecode ---> executed by the JVM (after compiled into machine code)
	/**Steps:
			The java compiler translates the source code into java bytecode* (The extension name of the bytecode file is .class)
			NOTE: The java source code file cannot be executed on the JVM
	*/
	
	//Why it is important to be familiar with computer hardware in terms of program performance during runtime important
	//	for developers?
	/**Answer: Being aware of hierarchies of hardware speed allows developers to determine the most efficient way to use the hardware available to them */
	
	/**Main method is used as an entry point of the program when starting to execute*/
	//main display of all the examples
	public static void main(String[] args) {
		/**Method header: public static void main(String[] args) 	without curly brackets*/
		
		
		//Changing from character a to b using a pre-increment
		incrementChar();		
		//Print Holiday! n times
		loopExample();		
		//Print a right triangle using a nested for loop
		rTriangle();
		
		//Arrays
		stringArrayExample();	//This should print null
		
		sortArray();
		int[] arr = {8, 3, 5, 2, 6};
		bubbleSort(arr);
				
		exceptionExample();
		
		
	}
	/**Storage*/
	//Secondary storage hardware include CD, Floppy Disk, and Hard Disk, BUT not RAM 
	
	/**Debugging*/
	//Using the built-in debugger in the IDE is valuable:
	//Usage:
	//		* To examine/change value of variables during the execution of the program
	//		* To visually observe how a program's execution flow is being executed
	//		* To control the execution of a program
	
	/**Variables*/
	//Variable: A named piece of memory that can store and retrieve values
	
	//Declare variables like so: 
	//			int x;
	//			boolean isActive;
	
	//Assignment types:
	//			x = 1;
	//			a = 'A';
	
	//Declare and initialize in one step:
	//			int x = 2;
	//			double d = 1.4;
	
	//Increment variable x by 1 in 3 different ways (there are more that this):
	//	x++;		x += 1;		x = x + 1
	
	/**Short-Circuit Operators*/
	//&&	||
	//Note: the ^ and ! are not a short-circuit since ^ is exclusive or, and the not ! is boolean
	
	/**Data Types: Primitive vs Reference types*/
	//Primitive types:
	//	*Directly named pieces of memory with fixed sizes (e.g. int, double, char)
	//Reference types:
	//	*Refer to memory locations that hold values that can vary in size (e.g. String, arrays)
	
	//Key differences:
	//	*Memory allocation
	//	*Default values and behavior
	
	/**Characters and String:*/
	//Usage: Represent symbols and text in programming
	
	//String holds a collection of characters
	   
	//Encoding Systems:
	//*ASCII: (American Standard Code for Information Interchange)
	//*Unicode: Extends ASCII to support a wide range of characters from various languages
	
	//Examples in Java:
	//		char letter = 'A';
	//		String message = "Hello World!";
	
	/**Character Data Type:*/
	
	//**A character can hold any single alphanumeric symbols only
	
	//char letter = 'A' (ASCII)				Decimal value for A - Z (65 - 90), and a - z (97 - 122)
	//char numChar = '4' (ASCII)			Decimal value for 0 - 9 (48 - 57)
	//char letter = '\u0041' (Unicode)
	//char numChar = '\u0034' (Unicode)
	
	//NOTE: The increment and decrement operators can be used on char variables to get the next or preceding Unicode character:
	//Ex: 
	public static void incrementChar() {
		char ch = 'a';
		System.out.println(++ch); //Using pre-increment
	}	
	
	/**String type*/
	
	//The char type only represents one character.
	//Note: String is NOT a primitive type, it's a reference type
	
	//**A string can hold any number of alphanumeric(letters and numbers, etc.) symbols only
	
	
	/**Ctrl Structures - Conditional Statements*/
	//**Purpose: Make decisions about which branches of code to execute based on boolean expressions (x > 1 is it true or false?)
	
	//Common Statements:
	//if, else if, else, switch
	
	/*Ex:
	
	if(score > 90) {
		grade = 'A'
	}else if (score > 80) {
		grade = 'B';
	}else {
		grade = 'C';
	}
	*/
	
	/**Ctrl Structures - Boolean type and operators*/
	//Used to compare two values
	//Example:
	boolean b = (1 > 2);	//Results in false
	
	
	//Loops:
	//while, do while, for loop
	
	/**Types of Loops*/
	//Purpose: Repeat code blocks based on certain conditions
	
	//While: Best for unknown number of iterations
	//Do-While: Ensures the loop executes at least once
	//For loop: Best for a fixed number of iterations
	
	//*Syntax: for(initial-action; loop-continuation-condition; action-after-each-iteration)
	//You can always convert a for-loop into a while loop, but NOT a while-loop to a for-loop often
	
	/**Sentinel value vs a counter in a loop:*/
	//	* A sentinel-controlled loop executes until a specific value is entered.
	//	* A counter-controlled loop executes a fixed number of times
	
	/**Using break and continue in a loop*/
	//break: terminates the entire loop
	//continue: skips the current iteration of the loop
	
	//**Avoid using the 'break' keyword: Can be done by moving the break condition into the loop-continuation-condition
	
	/**Which loop to use?*/
	//Converting between loops: check Chapter 5: 3.19
	//Recommendation: use the one loop that is most comfortable to you
	//Ex:
	public static void loopExample() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Holiday!");
		}
	}
	
	//Nested Loops
	
	public static void rTriangle() {
		for(int row = 0; row <= 6; row++) {
			for(int col = 1; col < row; col++) {
				System.out.print(5 * col + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int row = 5; row > 0; row--) {
			for(int col = row; col > 0; col--) {
				System.out.print(5 * col + " ");
			}
			System.out.println();
		}
	}
	
	/**Methods: Purpose of methods*/
	//Methods: To modularize and name pieces of code for reuse and maintainability
	//Methods: A collection of statements that are grouped together to perform an operation
	
	//Benefits:
	//	*Improves code organization
	//	*Facilitates debugging and testing
	//	*Enhances readability
	
	/*		Method syntax
	//Method signature: methodName(parameter list);
	//Parameter list: int m1, int n2;
	//formal parameters: m1, n2
	*/
	
	/**Purpose of methods:*/
	//Concept: How arguments are passed to methods
	//Pass-By-Value: Used by java for both primitive and reference types
	//Implications:
	//	*Changes to parameters within methods do not affect original variables (for primitives)
	//	*Changes to object properties within methods affect the original objects (for reference types)
	
	
	/*	Benefits of method:
	 * 		Write a method once and reuse it anywhere
	 * 		Information hiding (aka encapsulating). Hide implementation from the user
	 * 		Reduce complexity
	 */
	
	/**NOTE: A static method in a class CANNOT access the instance variables in the same class 
	 			* Instance methods can access static and instance variables
	 			* Static methods can only access static variables
	*/
	
	//Arrays are data structure that represent a collection of the same types of data
	//Def: Collection of data of the same data type
	
	/*
	 * Have a fixed size 
	 * All elements must be of the same type 
	 */
	
	/**Built-in functions*/
	//Java provides many built-in functions as methods in the Math class. These are the reasons why a programmer would use these functions:
	//	* To use proven methods tested by many developers
	//	* For speed of programming
	//	* To use accurate methods
	
	
	/**Array Limitations*/
	//	*Fixed Size: Cannot be resized after creation
	//	*Uniform Data Type: All elements must share the same type
	//	*Initialization Requirements: Must specify the number of elements at creation
	//Example:
	String[] names = {"Matteo", "Lorenzo"};
	static String[] nullExample = new String[5];
	
	public static void stringArrayExample(){
		for(int i = 0; i < nullExample.length; i++) {
			System.out.print(nullExample[i] + " ");
		}
	}
	
		
	/**Iterate through arrays*/
	//	*For loop: Best for fixed iterations
	//	*While loop: Best for unknown number of iterations
	//	*Do-while loop: Ensures at least one execution (When at least one iteration is needed, then an unknown number of iterations)
	
	//Sorting arrays:
	//BUBLE SORT: is a coding question
	
	//Regular sorting
	public static void sortArray() {		
		System.out.println("\nSorting Array");
		int[] arr = {2, 4, 8, 1, 0};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//Calls the sort2D() method from this method
		sort2D();
	}
	
	//Bubble sort
	public static void bubbleSort(int[] array) {
		System.out.println("\nBubble Sorting");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void sort2D() {
		int arr[][] = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9},
				{0}
		};
		
		for(int row = 0; row < arr.length; row++) {
			for(int j = 0, i = 0; j < arr[row].length; j++, i++) {
				if(arr[row].length < arr[i].length) {
					int[] temp = arr[i];
					arr[i] = arr[row];
					arr[row] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//OOP: Involves programming using objects
	//Object represents an entity in the real world that can be distinctly identified. (Ex: a student, a button, or a desk)
	//The state of an object consists of a set of data fields (aka properties) with their current values.
	//The behavior of an object is defined by a set of methods (example: getRadius() can be used to change the behavior of object Circle):
	//		Ex:
	//				Circle c = new Circle();
	//				c.setRadius = 5.0;
	//				c.getRadius();		//Returns the value (as double) of the radius of Circle object c
	
	//Declaring/creating objects
	//ClassName objectRefVar = new ClassName
	//			Assign object of ref = create an object
	//	EX:		Circle c = new Circle();
	
	//Naming Conventions:
	//*Classes: PascalCase (e.g. Shoe)
	//*Vars and Methods: camelCase (e.g. sneaker1, setSize() )
	
	//Encapsulation:
	//*Use private data members with public getters and setters (accessors and mutators)
	
	//Modularity:
	//*Keeps classes focused on specific responsibilities
	
	
	/**Exception handling - Purpose of Exceptions:*/ 
	//Purpose: Mechanism to handle unexpected errors and allow program continuation or recovery
	
	/*Benefits: 
	 	*Improves program robustness
	 	*Facilitates error reporting and handling	
	*/
	
	/*Structure:
	 	*Try block: Code that might throw an exception (has risky code)
	 	*Catch block: Code to handle the exception (handles the exception)
	 */
	
	/**
	try {
		//Risky code
	}catch(ExceptionType e){
		//Handle exception
	}
	*/
	
	//Example:
	static int result;
	public static void exceptionExample() {
		try {
			result = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("\nCannot divide by zero");
		}
		
		//Note: ExceptionTypes
		/**
									 Object
										|
									Throwable
									/		\
								Error		Exception
								/				\
					*LinkageError				*ClassNotFoundException
					*VirtualMachineError		*IOException
					*Many more classes...		*RuntimeException--------------------->	*ArithmeticException
												*Many more classes...					*NullPointerException
																					 	*IndexOutOfBoundsException
																					 	*IllegalArgumentsException
																					 	*Many more classes...
		*/
	}
	
	//Text IO (Input/Output)	
	//It is a library for creating java console applications (It reads interactive input from the user)
	/**
	 		* Storing data: Persist data when the program is not running
	 		* Using storing data: Read and manipulate data during program execution
	 		* Manipulating data: Modify existing data and save the results.
	 */
	
	/**
		A File object encapsulates the properties of a file or a path, but does not contain the methods for reading/writing data from/to a file. 
		In order to perform I/O, you need to create objects using appropriate Java I/O classes. The objects contain the methods for reading/writing 
		data from/to a file. This section introduces how to read/write strings and numeric values from/to a text file using the Scanner and 
		PrintWriter classes.
	 */
}
