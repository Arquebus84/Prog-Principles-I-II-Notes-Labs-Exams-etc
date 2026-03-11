package ClassActivity;

import java.io.*;

public class WriteData {
	public static void main(String[] args) throws java.io.IOException {
		File file = new File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\scores.txt");

		// Create a file
		PrintWriter output = new PrintWriter(file);
		
		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		
		// Close the file
		output.close();
		
		System.out.println("File written, program terminated.");

	}
}