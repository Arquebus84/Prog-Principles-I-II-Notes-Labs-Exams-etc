import java.util.Scanner;
public class ComparingCharacters {
	public static void main(String[] args) {
		//Two characters can be compared using relation operators (>, <, etc.) by using the Unicode values of the two characters
		//'a' < 'b' is true because a is 97 and b is 98
		//'a' < 'A' is false because a is 97 and A is 65
		//'1' < '8' is true because Unicode for 1 is 49 and 8 is 56
		
		//You can test whether a character ch is either an uppercase letter, a lowercase letter, or a numeric value with this code:
		char ch = (char)(Math.random() * 123); //randomly generates a character from 0 to 122
		if(ch <= 122 && ch >= 97) {
			System.out.println("ch is a lowercase character");
		}else if(ch <= 90 && ch >= 65) {
			System.out.println("ch is an uppercase character");
		}else if(ch <= 57 && ch >=48) {
			System.out.println("ch is a numeric character");
		}else {
			System.out.println("ch is " + ch);
		}
		
		//Or you could write it as the following code:
		if(ch >= 'A' && ch <='Z') {
			System.out.println("ch is an uppercase character");
		}else if(ch >= 'a' && ch <='z') {
			System.out.println("ch is an lowercase character");
		}else if(ch >= '1' && ch <='9') {
			System.out.println("ch is an numeric character");
		}
		
		//Code for encripting numbers that are either an ASCII code or Unicode:
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
        int num1 = input.nextInt();

        if(num1 > 122)
            System.out.println("Unicode - " + "'" + (char) num1 + "'");
        else
            System.out.println("ASCII - " + "'" + (char) num1 + "'");
		
		//Java provides methods in the Character class:
		//Ex: Character.isDigit(ch) returns true if it's a digit
		/*Method			:	Description
		isDigit(ch)			:	Returns true if the specific character is a digit
		isLetter(ch)		:	Returns true if the specific character is a letter
		isLetterOrDigit(ch)	:	Returns true if the specific character is either a digit or letter
		isLowerCase(ch)		:	Returns true if the specific character is a lowercase letter
		isUpperCase(ch)		:	Returns true if the specific character is an uppercase letter
		toLowerCase(ch)		:	Returns the lowercase of the specified character
		toUpperCase(ch)		:	Returns the uppercase of the specified character
		*/
        
		 input.close();
	}
}
