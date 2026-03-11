

import java.io.*;

public class BufferedInputStreamBufferedOutputStream {
	//BufferedInputStream/BufferedOutputStream can be used to speed up input and output by 
		//	reducing the number of disk reads and writes
	
	
	/**NOTE: A buffer is a temporary storage area used to hold data while it's being moved from place to place, or when
	 			the rate of the data consumption or production is different
	 */
		
	/**
				java.io.InputStream
						△
						|
						|
			java.io.FilterInputStream
						△
						|
						|
			java.io.BufferedInputStream
		+BufferedInputStream(in: InputStream)
		+BufferedInputStream(in: InputStream, bufferSize: int)
	 */
	
	/**
				java.io.OutputStream
						△
						|
						|
			java.io.FilterOutputStream
						△
						|
						|
			java.io.BufferedOutputStream
		+BufferedOutputStream(out: OutputStream)
		+BufferedOutputStream(out: OutputStream, bufferSize: int)
	 */
	
	//Refer to BinaryIOClasses.java for this
	/*
	 	* BufferedOutputStream: Used to wrap an output stream to perform buffered output
	 	* ObjectOutputStream: Can write primitive data-type values
	 	* OutputStream: Used as the base class for performing binary output
	 	* DataOutputStream: Used to output primitive values and string in binary
	 	* FileOutputStream: Used to associate a file with an output stream
	 */
	
	//Example:
	public static void main(String[] args) {
		
		//creates a BufferedInputStream for an InputStream object named in.
		try {
			InputStream in = new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\InputStreamTest.txt");
			BufferedInputStream bInStream = new BufferedInputStream(in);
			System.out.println(bInStream.read());	//Should return a -1
			
			bInStream.close();	//Close the BufferedInputStream to prevent memory leak
			
			DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\InputStreamTest.txt")));
			output.writeChar('A');
			System.out.println(output.size());
			
			output.close();
		}catch(Exception ex) {
			
		}
	
	}

}
