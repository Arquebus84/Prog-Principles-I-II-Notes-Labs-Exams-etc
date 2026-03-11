

import java.io.*;

public class FileInputStreamFileOutputStream {
	//FileInputStream/FileOutputStream are for reading/writing bytes from/to files.
	
	//FileInputStream inputs a stream of bytes from a file
	/**
			java.io.InputStream
					△
					|			
					|
			java.io.FileInputStream
		+FileInputStream(file: File)
		+FileInputStream(filename: String)
	 */

	
	//FileOutputStream outputs a stream of bytes to a file
	/**
			java.io.OutputStream
					△
					|
					|
			java.io.FileOutputStream
		+FileOutputStream(file: File)
		+FileOutputStream(filename: String)
		+FileOutputStream(file: File, append: boolean)
		+FileOutputStream(filename: String, append: boolean)

	 */	
	/**NOTE: If the file does not exist,  a new file will be created; if the file already exists, the first two constructors in 
		FileOutputStream will delete the current content of the file.
			**To retain the current content and append new data into the file, use the last two constructors and pass
				true to the append parameter
	 */
	
	/**Exception NOTE!!*/
	//NOTE: A java.io.FileNotFoundException would NOT occur if you attempt to create a FileOutputStream with a nonexistent file.
	//	However, it will occur if you attempt to create a **FileInputStream with a nonexistent file
	
	
	//NOTE: Append an existing data file named "out.dat" 
	//			* Use new FileOutputStream("out.dat", true); to create construct a FileOutputStream
	
	
	//NOTE: In the following code, a new FileInputStream is created for test.dat, if test.dat exists
	//		* FileInputStream fis = new FileInputStream("test.dat");
	
	public static void main(String[] args) throws IOException{
		
		try (
				// Create an output stream to the file
				FileOutputStream output = new FileOutputStream(
						"C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\FileIOStreamTest.txt");) {
			// Output values to the file
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}

		try (
				// Create an input stream for the file
				FileInputStream input = new FileInputStream(
						"C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\FileIOStreamTest.txt");) {
			
			// Read values from the file
			int value;								/**NOTE: The input value -1 signifies the end of the file*/
			while ((value = input.read()) != -1) //Reads a byte from input.read(), assigns it to value, and checks whether it's -1
				System.out.print(value + " ");
		}
		
		/**
		 NOTE: You can create a PrintWriter to append text using:
		  	new PrintWriter(new FileOutputStream("temp.txt", true));
		  	
		  	//If temp.txt does not exist, it's created, otherwise new data are appended to the file
		 */
	}
	
}
