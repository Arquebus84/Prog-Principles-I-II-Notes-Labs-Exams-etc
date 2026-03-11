package ClassActivity;

import java.io.*;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\scores.txt");

		try (
				// Create a file resource that will auto-close
				PrintWriter output = new PrintWriter(file);
		) {
			// Write formatted output to the file
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
			System.out.println("File written, program terminated.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}