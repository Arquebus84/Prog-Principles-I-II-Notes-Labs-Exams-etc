package PrintWriterTest;

import java.util.*;
import java.io.*;
public class TargetTextFile {

	public static void main(String[] args) {
		//Can change this directory to suit computer system
		File targetFile = new File("C:\\Users\\matte\\TargetGoalTextExample\\TargetText.txt");
		
		System.out.println(targetFile.exists());
		try {
			/**In the following statement, GoalText was already create as a .txt file, but GoalText2 was created in Eclipse*/
			//PrintWriter output = new PrintWriter("C:\\Users\\matte\\TargetGoalTextExample\\GoalText.txt");
			
			PrintWriter output = new PrintWriter(new File("C:\\Users\\matte\\TargetGoalTextExample\\GoalText2.txt"));
			Scanner scanner = new Scanner(targetFile);
			
			while(scanner.hasNext()) {
				output.print(scanner.nextLine() + "\nAdditional content will be added");
			}
			
			output.close();
			
			File file = new File("C:\\Users\\matte\\TargetGoalTextExample\\GoalText2.txt");
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
			
			scanner.close();
		}catch(Exception ex) {
			System.out.println("Conversion Unsuccessful");
		}
		
		/**try {
			
			File file = new File("C:\\Users\\matte\\TargetGoalTextExample\\GoalText2.txt");
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
		}catch(Exception ex) {
			System.out.println("File not found");
		}*/
		
	}

}
