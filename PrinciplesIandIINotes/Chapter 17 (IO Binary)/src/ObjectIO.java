
import java.io.*;

public class ObjectIO {
	
	//ObjectInputStream and ObjectOutputStream classes can be used to read and write serializable objects***
	
	//**DataInputStream/DataOutputStream enables you to perform I/O for primitive-type values and strings.
	
	/**ObjectInputStream/ObjectOutputStream enables you to perform I/O for objects in addition to primitive-types and strings*/
	
	//ObjectInputStream
	/**
 											--------------------▷	«interface»
											:					ObjectStreamConstants
 											:
			[java.io.InputStream]			:						«interface»
				△							:					java.io.DataInput
				|							:							△
				|							:							:
				|							:							:
				|							:				[		«interface»		]
		[	java.io.ObjectInputStream			]---------▷	[	java.io.ObjectInput	]	/****Reads an object
		[+ObjectInputStream (in: InputStream)	]			[	+readObject: Object	]
	 */
	
	//ObjectOutputStream
	/**
											--------------------▷	«interface»
											:					ObjectStreamConstants
											:
			[java.io.OutputStream]			:						«interface»
				△							:					java.io.DataOutput
				|							:							△
				|							:							:
				|							:							:
				|							:				[		«interface»		 ]
		[	java.io.ObjectOutputStream			]---------▷	[	java.io.ObjectOutput ]	/****Writes an object
		[+ObjectOutputStream (in: OutputStream)	]			[	+readObject: Object	 ]
*/
	
	
	//You can wrap an ObjectInputStream/ObjectOutputStream on any InputStream/OutputStream using these constructors:
	/***
		public ObjectInputStream(InputStream in)
		
		public ObjectOutputStream(OutputStream out)
	 */
	
	
	//NOTES:
	/**
	 	* To write an object x on ObjectOutputStream output, invoke output.writeObject(x)
	 	* Since ObjectInputStream/ObjectOutputStream contains all the methods of DataInputStream/DataOutputStream, 
			you can *replace* DataInputStream/DataOutputStream completely by ObjectInputStream/ObjectOutputStream

	 	* To read an object on ObjectInputStream input, invoke input.readObject()
	 	* ObjectInputStream/ObjectOutputStream enable you to perform I/O for objects in addition for primitive type values and string
	 */

	public static void main(String[] args) {
		//Use try-catch blocks
		
		/**NOTE: Separate the OutputStream and InputStream into different try-catch blocks*/
		
		try {
			
			/**Remember that OutputStream is abstract class (FileOutputStream is subclass of OutputStream)*/
			ObjectOutputStream output = new ObjectOutputStream(
					new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\ ObjectIOTest.dat"));
			
			output.writeUTF("ObjectTest");
			output.writeDouble(306090.0);
			output.writeObject(new java.util.Date());
			
			output.close();
			
		}catch(Exception ex) {
			System.out.println("File not found");
		}
		
		//
		try {
			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\ ObjectIOTest.dat"));
			
			System.out.println("UTF: " + input.readUTF() + "\nDouble: " + input.readDouble() + "\nDate Object: " + input.readObject());
			
			input.close();
		}catch(Exception ex) {
			System.out.println("File not found");
		}
		
	}

}
