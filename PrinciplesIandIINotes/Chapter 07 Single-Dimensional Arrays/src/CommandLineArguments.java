
public class CommandLineArguments {
	
	public static void main(String[] args) {
		//You can pass arguments to a main method from the command line
		
		//You can also pass strings from the command line to the main method when you run the program
		
		//This command starts the program CommandLineArguments with three strings: arg1, arg2, arg3:
		//		java CommandLineArguments arg1 arg2 agr3
		
				//Would look like this in the Command Prompt:
				//C:\Users\matte\eclipse-workspace\Methods\src>java CommandLineArguments arg1 arg2 arg3
		
		//A string that contains a space must be enclosed with quotations:
		//		java CommandLineArguments "First Number" alpha 53
		//This starts the program with three strings: First Number, alpha, and 53.
		
		//If you invoke a program with n arguments, the Java interpreter creates an array such as:
		//		args = new String[n];
		
		
		//The main method can be replaced by:
		//public static void main(String args[])
		//public static void main(String[] x)
		//public static void main(String x[])
		
		//This code fragment would correctly identify the number of arguments passed via the command line to a Java application, excluding the name of the 
		//	class that is being invoked:
		//int count = args.length;
	}
	
}
