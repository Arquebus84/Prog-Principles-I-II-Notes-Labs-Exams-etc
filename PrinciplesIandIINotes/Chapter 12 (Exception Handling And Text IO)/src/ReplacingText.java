
import java.io.*;
import java.util.*;
public class ReplacingText {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\matte\\TextFiles\\output.txt";
		File file = new File(fileName);
		//String[] array = new String[a.length()];
		String b = file.getAbsolutePath();
		int count = (int)b.length();		// = (int)fileEx.getAbsolutePath().length();
		
		System.out.println(count);
		
		Question3();
		Question4();
		
	}
	
	public static void Question3() {
		// Print the number of characters in File excluding \r and \n (carriage return and new line)

		String fileName = "C:\\Users\\matte\\TextFiles\\output.txt";
		
		
		int count = 0;
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
					
			while(scanner.hasNext()){
		        String s = scanner.nextLine();	//**The nextLine() returns the line-ending and line-separator String
		        
		        //Check each character in the array
		        for(char c = 0; c < s.toCharArray().length; c++) {		//Same as for(char c: s.toCharArray())
				    count++;
			    }
		        
		        /**Could also use this syntax:*/
		        for(char c: s.toCharArray()) {
		        	System.out.print(c + ",");
		        }
		    }			
			
			System.out.println("\nCharacter Count: " + count);
			scanner.close();

			throw new java.io.IOException();
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public static void Question4() {
		// Print the number of words in the file
		
		Scanner scanner = null;
		try {
			String fileName = "C:\\Users\\matte\\TextFiles\\output.txt";
			File file = new File(fileName);
			scanner = new Scanner(file);
			
			int wordCount = 0;
			while(scanner.hasNext()) {
				String s = scanner.next();	//**The next() returns the next token as a String from the Scanner, excluding \r and \n
				
				for(int i = 0; i < s.toCharArray().length; i++) {	//Do not put scanner.nextLine() for s
					System.out.print(s.toCharArray()[i]);
				}
				wordCount++;
			}
			
			System.out.println("\nWord Count: " + wordCount);
			scanner.close();
			
			throw new java.io.IOException();
		}catch(java.io.IOException Ex) {
			System.out.println(Ex);
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		
	}
	
}
