
public class DefiningMethod {
	//A method definition consists of a method name, parameters, return value type, and body
	//***In java, the main method is the entry point on where the program starts (entry point for executing code)
	
	//Syntax for a method: (5 parts)
	/*
	 * modifier returnValueType methodName(list of parameters){
	 *	Method body
	 * } 
	 */
	
	//Here is a method that returns the max between two numbers, num1 and num2
	//Define a method
	public static int max(int num1, int num2) { //**Modifier is 'public static'
		int result;
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		//Can be simplified as terniary operator return((num1 > num2)? num1 : num2);
		return result;
	}
	/**In this method:
	* The method name is max								*Parameters are variables defined in the method header
	* The formal parameters are num1 and num2 				*Formal parameters are the names of the variables
	* The parameter list is int num1, int num2				*Parameter list is the variables with their data types
	* The method signature is max(int num1, int num2)		*Local variables are the variables defined *inside* a method
	* The return value type is int
	* The method header is public static int max(int num1, int num2)
	* The method body implements the method
	* The method returns a value on line 20 (return result)
	* The actual parameters (or arguments) are x and y in the main method (to invoke max)
	*/
	//main method consists of String[] arguments (args)
	public static void main(String[] args) {
	//Invoke a method
		int x = 2;
		int y = 3;		//Actual parameters are x and y
		int z = max(x, y);		/**When a method is invoked, you pass a value to a parameter; this value is referred to as *actual parameter or argument*/
		System.out.println(z);
		
		
	}
	
	//The method header specifies the modifiers, return value type, method name, and parameters or the method. The static modifier is used
	// for all of these methods.
	//Modifier: A java keyword that specifies the properties of data, methods, and classes and how they can be used. Modifiers are public, private, or static
	
	//A method may return a value with the returnValueType (the data type of a value the method returns). Some methods perform desired operations without
	// returning a value. In this case, the returnValueType is the keyword void.
	//	For example, the returnValueType is void in the main method, as well as in the System.exit, and System.out.println.
	//***If a method returns a value it is called a value-returning method; otherwise, it is a void method
	//		In order for a value-returning method to return a value, a return statement using the keyword result is required. The method terminates when
	// a return statement is executed.
	
	//The variables defined in the method header are called formal parameters. A parameter is like a placeholder: when the method is invoked, you pass a value 
	// to the parameter. This value is referred to as the actual parameter (variables or data substitute formal parameters when invoking a method) or argument.
	
	//Method signature: The combination of the method name and the list of its parameters
	//Parameters are optional; a method may contain no parameters such as the Math.random() method.
	
	//NOTE: Some programming languages refer to methods as procedures and functions. In those languages, a value-returning method is called a function, and
	//	a void method is called a procedure.
	//Note: The list of parameters (int num1, int num2) have to be declared separately
	
	//When you define a method, you are defining what the defined item is. A declaration involves allocating memory to store data for the declared item.
}
