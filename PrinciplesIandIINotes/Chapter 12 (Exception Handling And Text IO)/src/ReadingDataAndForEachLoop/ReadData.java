package ReadingDataAndForEachLoop;

import java.io.*;
import java.util.*;

public class ReadData {
	public static void main(String[] args) throws Exception {
		
		String fileName = "C:\\Users\\matte\\TextFiles\\RecursiveInputText.txt";
		File file = new File(fileName);
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			System.out.println(input.toString());
		}		
		
		input.close();
		
		
		//Used to list each character in the fileList
		/**
		char[] fileList = fileName.toCharArray();		
		try {
			for(char c : fileList) {				can be written as for(char c = 0; c < fileList.length; c++)
				System.out.print(c + " ");
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}**/
		
	}
}
