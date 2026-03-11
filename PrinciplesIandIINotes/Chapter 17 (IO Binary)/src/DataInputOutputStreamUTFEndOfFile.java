

import java.io.*;
public class DataInputOutputStreamUTFEndOfFile {
	//DataInputStream reads bytes from the stream and converts them into appropriate primitive-type values or strings.
	//DataOutputStream converts primitive-type values or strings into bytes and outputs the bytes to the stream
	
	//DataInputStream extends FilterInputStream and implements the DataInput interface
	/**

			[InputStream]					:----------------▷	«interface»
				△							:				java.io.DataInput
				|							:			+readBoolean(): boolean
				|							:			+readByte(): byte
		[FilterInputStream]					:			+readChar(): char
				△							:			+readFloat(): float
				|							:			+readDouble(): double
				|							:			+readInt(): int
	[	DataInputStream					]---			+readLong(): long
	[+DataInputStream (in: InputStream)	]				+readShort(): short
														+readLine(): String
														+readUTF(): String
	 */
	
	/**
			[OutputStream]					:----------------▷	«interface»
				△							:				java.io.DataOutput
				|							:			+writeBoolean(b: boolean): void
				|							:			+writeByte(v: int): void
		[FilterOutputStream]				:			+writeBytes(s: String): void
				△							:			+writeChar(c: char): void
				|							:			+writeChars(s: String): void
				|							:			+writeFloat(v: float): void
	[	DataOutputStream				]---			+writeDouble(v: double): void
	[+DataOutputStream (in: OutputStream)]				+writeInt(v: int): void
														+writeLong(v: long): void
														+writeShort(v: short): void
														+writeUTF(s: String): void
	 */
	
	/**Characters and Strings in Binary I/O
			* A Unicode consists of two bytes
			* The writeChar(char c) method writes the Unicode of character c to the output.
			* The writeChars(String s) method writes the Unicode for each character in the string s to the output.
			* The writeBytes(String s) method writes the lower byte of the Unicode for each character in the string s to output.
				- The high byte of the Unicode is discarded
				- This method is suitable for strings that consist of ASCII characters, since an ASCII code is stored only in
					the lower byte of a Unicode.
				- If string consists of non-ACSII characters, then use the writeChars(String s) method
				
			* The WriteUTF(String s) method writes a string using UTF coding scheme. 
				- UTF is more efficient for compressing a string with Unicode characters
	 */
	
	/**UTF Notes (UTF-8 Uniform Transformation Format 8-bit)	**Almost every web page is stored in UTF-8
	 		* Binary I/O uses UTF-8 for characters/strings
	 		* UTF-8 is a coding scheme that allows systems to operate with both ASCII and Unicode efficiently
	 		* Most operating systems use ASCII while java uses Unicode (**ASCII is a subset of Unicode)
	 		* Most applications only need ASCII character set, space is wasted when representing 8-bit ASCII char as 16-bit Unicode char
	 		* UTF-8 is an alternative scheme that stores a character using 1, 2, or 3 bytes
	 		* ASCII (less than 0x7FF) are coded in one byte
	 		* Unicode less than 0x7FF are coded in two bytes
	 		* Other Unicode values are coded in three bytes
	 */
	
	/**Creating DataInputStream/DataOutputStream
			* DataInputStream/DataOutputStream are created using the following constructors:
					public DataInputStream(InputStream inStream);					
					public DataOutputStream(OutputStream outStream);
					
			* The following statements create data streams; the first creates an input stream for the file testIn.dat, and the 
				second creates an output stream for the file testOut.dat:					
					DataInputStream input = new DataInputStream(new FileInputStream("testIn.dat"));
					DataOutputStream output = new DataOutputStream(new FileOutputStream("testOut.dat"));
	 */
	
	// How many bytes are written to the data file DataInputAndOutputStreamTest.txt?
	public static void main(String[] args) {
		//Example 1
		DataOutputStream output;
		try {
			output = new DataOutputStream(new FileOutputStream("C:\\Users\\matte\\DataInputAndOutputStreamTest.txt"));
			output.writeShort(1234);
			output.writeShort(5678);

			System.out.println("Output Size: " + output.size()); // The size is measured in Bytes**
			output.close();
		} catch (IOException ex) {
			ex.getMessage();
		}
		
		//Example 2: Test data stream
		/**NOTE: create a DataOutputStream first before an input stream, because this is being read from a 
					file that may or may not exist*/
		
		// Create an output stream for file ClassDataTest.txt
		try (DataOutputStream output2 = new DataOutputStream(
				new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\ClassDataTest.txt"));) {
			// Write student test scores to the file
			output2.writeUTF("Liam");
			output2.writeDouble(85.5);
			output2.writeUTF("Susan");
			output2.writeDouble(185.5);
			output2.writeUTF("Chandra");
			output2.writeDouble(105.25);
		} catch (Exception e) {
			System.out.println("File not found");
		}
		
		// Create an input stream for file ClassDataTest.txt
		try (DataInputStream input = new DataInputStream(
				new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\ClassDataTest.txt"));) {
			// Read student test scores from the file
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		} catch (Exception e) {
			System.out.println("File not found");
		}
		
		System.out.println("\nNew File:");
		/**Detect the end of a file*/
		//If you keep reading data at the end of an InputStream, and EOFException will occur (Exception is used to detect the end of the file)
		/**After you comment out this*/
//		try {
//			DataOutputStream output3 = new DataOutputStream(
//					new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\EndOfFileTest.dat"));
//			
//			output3.writeUTF("Matteo");
//			output3.writeDouble(2.5);
//			output3.writeUTF("Leonardo");
//			output3.writeDouble(3.6);
//			output3.writeUTF("Lorenzo");
//			output3.writeDouble(4.7);			
//		}catch(Exception ex) {
//			System.out.println("Not working");
//		}
		//Read the file
		try {
			DataInputStream input3 = new DataInputStream(
					new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\EndOfFileTest.dat"));
			
			/**Reading all the Strings and doubles in the file*/
			//Could use while(true) {}
			//	but, this is more stable
			int value = 0;
			while(value < input3.available()) {
				System.out.println(input3.readUTF());
				System.out.println(input3.readDouble());
			}
			
			input3.close(); //Close the DataInputStream to prevent memory leakage
		}catch(Exception ex) {
			System.out.println("Reached end of file");
		}
		
	}

}
