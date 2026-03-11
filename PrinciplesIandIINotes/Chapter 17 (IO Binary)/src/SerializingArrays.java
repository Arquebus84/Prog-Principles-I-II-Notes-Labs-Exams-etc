
import java.io.*;

@SuppressWarnings("serial")
public class SerializingArrays implements Serializable{
	//An array is serializable if all its elements are serializable:
	
	/**An entire array can be saved into a file using writeObject, and later be restored using readObject*/
	
	
	//Example: Code stores an array of five int values and an array of three strings, and reads them back to display on the console
	
	public static void main(String[] args){
	    // Create an output stream for file array.dat
	    try {
	    	int[] numbers = {1, 2, 3, 4, 5};
		    //String[] strings = {"John", "Susan", "Kim"};

		    ObjectOutputStream output = new ObjectOutputStream(
	    			new FileOutputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\SerializableArraysTest.txt", true));
	    
		    // Write arrays to the object output stream
		    //output.writeObject(numbers);
		    //output.writeObject(strings);
		    
		    for(int i = 0; i < numbers.length; i++) {
		    	output.writeInt(numbers[i]);
		    }
	      
		    output.close();
	    }catch(Exception ex) {
	    	System.out.println("File not found in Output");
	    }

	  //Create an input stream for file SerializableArraysTest (originally called "array.dat")
	    try {
	    	ObjectInputStream input = new ObjectInputStream(
		    		  new FileInputStream("C:\\Users\\matte\\Chapter 17 (IO Binary) Text Examples\\SerializableArraysTest.txt"));
	    	
	    	//int[] newNumbers = (int[])(input.readObject());		//Careful, error occurs when reading integer array
	    	
	    	//String[] newStrings = (String[])(input.readObject());
	        
	    	System.out.println(input.readInt());
	        
	    	// Display arrays
//	    	for (int i = 0; i < newNumbers.length; i++)
//	    		System.out.print(newNumbers[i] + " ");
//	    	System.out.println();
	    	
//	    	for (int i = 0; i < newStrings.length; i++)
//	    		System.out.print(newStrings[i] + " ");
	    	
	    	input.close();
	    }catch(Exception ex) {
	    	System.out.println("File not found in Input");
	    }
	}
}
