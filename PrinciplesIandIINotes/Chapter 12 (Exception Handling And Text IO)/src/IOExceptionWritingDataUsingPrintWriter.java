
public class IOExceptionWritingDataUsingPrintWriter {
	
	//IOException is caused when the file is misread or does not exist:
	//	Ex:		File file = new File("de");		//Causes IOException b/c file de does not exist
	
	//InputMismatchEception is caused when scanner detects input that does not match the data type:
	//	Ex:		input.nextInt() 	enter "a"	//Causes InputMismatchException
	
	//Use Scanner class for reading text data from a file, and use PrintWriter class for writing text data to a file
	
	
	/**NOTE: Using the PrintWriter object can write text onto a text file using the print, println, or printf methods*/
	/**
				java.io.PrintWriter
			+PrintWriter(file: File)			//Creates a PrintWriter object for specified File object
			+PrintWriter(filename: String)		//Creates a PrintWriter object for the specified file-name string
			+print(s: String): void				//Writes a String to the file
			+print(c: char): void				//Writes an int value to the file
			+print(cArray: char[]): void
			+print(i: int): void
			+print(l: long): void
			+print(f: float): void
			+print(d: double): void
			+print(b: boolean): void
			**Also contains the overloaded +println methods.	**Adds similar to print, but each new line is accounted
			**Also contains the overloaded +printf methods.		**Adds similar to print, but can format it
	*/
	
	//Examples:
	public static void IOTest() throws java.io.IOException {
		//Creates a new file in the directory and names it message.txt
	    java.io.PrintWriter output = new java.io.PrintWriter(new java.io.File("C:\\Users\\matte\\message.txt"));
	    
	    output.printf("amount is %f %e\r\n", 32.32, 32.32);
	    output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
	    output.printf("%6b\r\n", (1 > 2));
	    output.printf("%6s\r\n", "Java");
	    System.out.println(output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32));
	    output.close();
	  }
	
		
	public static void main(String[] args) {
				
		/*try {
			IOTest();
		}catch(java.io.IOException IOEx) {
			System.out.println(IOEx);
		}*/
		
		try {
			java.io.File file = new java.io.File("C:\\Users\\matte\\ReadingDataTest.txt");
			
			//**This creates a new text file in matte
			java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File("C:\\Users\\matte\\NewText.txt"));
			
			/**NOTE: The next two lines are a warning (DO NOT USE THESE TWO ULESS YOU WANT TO REPLACE THE CONTENTS OF A file)*/
			//java.io.PrintWriter writer = new java.io.PrintWriter(file); //This along with the next line*v will modify the ReadingDataTest.txt file
			//System.out.println(writer.printf(""));	//With last statement*^ it replaces the ReadingDataTest.txt to an empty String ("")
			
			java.util.Scanner reader1 = new java.util.Scanner(file);
						
			while(reader1.hasNext()) {
				//If you looked at the NewText file after this next line, then it would have changed to the same contents as ReadingDataTest
				writer.print(reader1.nextLine());	/**Copy the contents of file to writer's NewText.txt*/
				
				//System.out.println("ReadingDataTest.txt file contents: " + reader1.nextLine());
				
				//reader1.close(); //If you close the Scanner here, you will get an exception ("File not found")
			}
			
						
			writer.close();
			reader1.close();	//close Scanner
		}catch(Exception ex) {
			System.out.println("File not found");
		}
		
		//**This references the newly created text file (NewText.txt) from the directory						
		java.util.Scanner reader2 = new java.util.Scanner("C:\\Users\\matte\\NewText.txt");
		
		while(reader2.hasNext()) {
			System.out.println("ReadingDataTest.txt file contents: " + reader2.nextLine());
			//System.out.println("NewText.txt file contents: " + reader2.nextLine());
		}
		reader2.close();
		
		/*
		//Method used to create a PrintWriter object for file "temp.txt"		
		try {
			//First technique with new File() constructor
			@SuppressWarnings({"resource", "unused"})
			java.io.PrintWriter pr1 = new java.io.PrintWriter(new java.io.File("temp.txt"));
			
			//Second with PrintWriter constructor
			@SuppressWarnings({"resource", "unused"})
			java.io.PrintWriter pr2 = new java.io.PrintWriter("temp.txt");
		}catch(java.io.FileNotFoundException ex){
			System.out.println("File not found");
		}*/
	}

}
