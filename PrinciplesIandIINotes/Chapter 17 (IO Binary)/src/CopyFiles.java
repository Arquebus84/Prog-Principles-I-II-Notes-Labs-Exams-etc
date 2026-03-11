import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFiles {
	
	//NOTES:
	/**
	 	* For binary input, you need to know exactly how data files were written in order to read them in the correct type and order
	 	* Encoding and decoding are automatically performed by text I/O
	 	* Text I/O is built upon binary I/O to provide a level of abstraction for character encoding and decoding
	 	* All files are stored in binary format, therefore all files are essentially binary files
	 */

	public static void main(String[] args) throws IOException{
		DataOutputStream output = new DataOutputStream(
				new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\CopyFilesTest.txt"));
		//output.writeChars("ABCD");
		output.writeUTF("ABCD");		//Switch between writeChars and writeUTF to see the total amount of bytes written in the file
		
		System.out.println(output.size());	//Get the number of bytes
	    output.close();	//Close the DataOutputStream to prevent memory leakage
	}

}