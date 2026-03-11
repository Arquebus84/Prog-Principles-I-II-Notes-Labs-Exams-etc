

import java.io.*;

public class BinaryIOClassesAndStream {
	//The abstract InputStream is the root class for reading binary data;
	//	The abstract OutputStream is the root class for writing binary data
	
	/**NOTE: An exception will NOT occur if you create a FileOutputStream with a nonexistent file because it will create a new file 
	 			and names it to the one you called it.
	 */

	/**
											[FileInputStream]		------[DataInputStream]
					---[InputStream]◁------	[FilterInputStream]◁----
					|						[ObjectInputStream]		------[BufferedInputStream]
					|
		[Object]◁----
					|
					|						[FileOutputStream]		------[DataOutputStream]
					---[OutputStream]◁-----	[FilterOutputStream]◁----
											[ObjectOutputStream]	------[BufferedOutputStream]
								
								
	 */
	//NOTE: All methods in the binary I/O classes are declared to throw java.io.IOException or a subclass of java.io.IOException
	
	//Abstract InputStream class defines methods for the input stream of bytes
	/**
			java.io.InputStream
		+read(): int							//Reads the next byte of data from input stream (the value byte is returned as an int in
													range from 0 to 255). The value -1 is returned if no byte is available after end of stream
		+read(b: byte[]): int
		+read(b: byte[], off: int, len: int): int
		+available(): int							//Used to get an estimated number of the bytes in a file
		+close(): void
		+skip(n: long): long
		+markSupported(): boolean
		+mark(readlimit: int): void
		+reset(): void
	 */
	//The return value -1 from the read() method signifies the end of file.
	
	//Abstract OutputStream class defines methods for the output stream of bytes
	/**
			java.io.OutputStream
		+write(int b): void
		+write(b: byte[]): void
		+write(b: byte[], off: int, len: int): void
		+close(): void
		+flush(): void
	 */
	
	public static void main(String[] args) {
		try {
			InputStream output = new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\FileIOStreamTest.txt");
			
			System.out.println(output.available());
			output.close();
		}catch(Exception ex) {
			System.out.println("Exception Occured");
		}
	}
	
}
