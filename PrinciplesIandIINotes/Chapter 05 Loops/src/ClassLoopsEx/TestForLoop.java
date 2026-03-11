package ClassLoopsEx;

import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		//Use for-loop to print a string of characters
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			System.out.println(temp);
		}//Code separates each character in each word on every new line
		

	}

}
