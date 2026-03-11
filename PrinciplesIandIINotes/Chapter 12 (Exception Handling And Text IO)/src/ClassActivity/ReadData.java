package ClassActivity;

import java.util.Scanner;
public class ReadData {
	public static void main(String[] args) throws Exception {
		// Create a File instance
		//java.io.File file = new java.io.File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\scores.txt");
		java.io.File file = new java.io.File("C:\\Users\\matte\\ProgPrinciplesJavaCodeDownloads\\textFileIO\\pricelist.txt");
		// Create a Scanner for the file
		try (Scanner input = new Scanner(file)) {
			// Read data from a file
			while (input.hasNext()) {
				
				//input.nextLine();
				System.out.println(input.nextLine());
				
				/**String firstName = input.next();
				String mi = input.next();
				String lastName = input.next();
				int score = input.nextInt();
				System.out.println(
						firstName + " " + mi + " " + lastName + " " + score);*/
			}

			// Close the file stream
			input.close();
		}
	}
}