import java.util.*;
import java.io.*;

public class TryWithResourcesForClosingResourcesAutomatically {
	//try-with-resource has this syntax:
	/**
		try(declare and create resources){
			Use the resource to process the file
		}
	 */
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\Users\\matte\\TextFiles\\output.txt");
		try(
			Scanner input = new Scanner(file); 
			PrintWriter output = new PrintWriter("C:\\Users\\matte\\TextFiles\\newText.txt");	//**The semi-colon (;) may be omitted from this statement 
		){
			//System.out.println(input.nextLine());
			while(input.hasNext()) {
				output.println(input.nextLine());
			}
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		//newText file
		try(Scanner reader = new Scanner(new File("C:\\Users\\matte\\TextFiles\\newText.txt"))){
			
			while(reader.hasNext()) {
				System.out.println(reader.nextLine());
			}
		}catch(Exception e) {
			System.out.println("File not found");
		}
		
		/**
		 * In the statement (Scanner input = new Scanner(file);) the input variable is declared to reference resource Scanner object
		 * The next expression (new Scanner(file)) is used to create the resource object of type Scanner 
		 */
			
		
		
	}
	
}
