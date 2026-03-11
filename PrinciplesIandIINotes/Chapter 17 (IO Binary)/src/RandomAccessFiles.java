

import java.io.*;

public class RandomAccessFiles {
	//Java provides RndomAccessFile class to allow data to be read from and written to at any locations in the file
	
	/**
		All of the streams that were used thus far are known as read-only or write-only streams: also called Sequential Streams
			* File that is opened using sequential stream is called a sequantial-access file
			* The contents of sequential-access file cannot be updated, but random access files can be updated**
			
		**Java provides RandomAccessFile to allow data to be read from and written to any locations in the file
			
		Random-Access Files: A file that can be read and written in any order. **Provides direct access to any part of the file
	 */
	
	//RandomAccessFile class implements the DataInput and DataOutput interfaces
	
	
	/**
			«interface»				«interface»
		java.io.DataInput		java.io.DataOutput
					△				△
					|				|
					|				|
				java.io.RandomAccessFile
		+RandomAccessFile(file: File, mode: String)
		+RandomAccessFile(name: String, mode: String)
		+close(): void
		+getFilePointer(): long
		+length(): long
		+read(): int
		+read(b: byte[]): int
		+read(b: byte[], off: int, len: int): int
		+seek(pos: long): void
		+setLength(newLength: long): void
		+skipBytes(int n): int
		+write(b: byte[]): void
		+write(b: byte[], off: int, len: int): void

	 */

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\RandomAccessFileTest.txt", "r");
			int i = raf.readInt();
			
			System.out.println(i);
		} catch (IOException ex) {
			System.out.println("IO exception");
		}
	}

}
