
public class FormattingConsoleOutput {
	public static void main(String[] args) {
		/**Could also use String.format("") as a return statement for a String returning method*/
		
		//Use the System.out.printf() method to display formatted output on the console
		//NOTE: It is desirable to display numbers in a certain format
		/*Example: the following code displays the interest
		double amount = 12618.98;
	    double interestRate = 0.0013;
	    double interest = amount * interestRate;
	    System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
	     */
		//The result displays $16.4, however, it is incorrect because we need to have it as 16.40
		//You can use the printf() method to fix this issue and display numbers with more digits
		//Can rewrite it as System.out.printf("Interest is $%4.2f", interest);
		
		//f in printf is formatting, the syntax is:
		//System.out.printf(format, item1, item2, ..., itemk)
		//Format specifier specifies how an item should be displayed; an item may be a numeric value, a character, a boolean value, or a string
		//*A simple format specifier consists of a % sign followed by a conversion code:
		/*
		 * Format Specifier		:		Output									:		Example
		 * 		%b				:	A Boolean value								:	True or false
		 * 		%c				:	A character									:	'a'
		 * 		%d				:	A decimal integer							:	200
		 * 		%f				:	A floating-point number						:	45.600000
		 * 		%e				:	A number in standard scientific notation	:	4.560000e+01
		 * 		%s				:	A string									:	"Java"
		 * 		%n				:	A new line									:	"%d%n" in the printf creates a new line for every following text
		 */
		//Example:
		int count = 5;
		double amount = 45.56;
		System.out.printf("The count is %d and the amount is %f" + "\n", count, amount); //*The % sign has to be inside the quotations
		//*printf(format, items); Items must match the format specifiers in order, in number, and in exact type
		//for example, the format specifier for count is %d and for amount is %f
		
		//Specify Width and Precision
		//By default, a floating-point value is displayed with six digits after the decimal point, however, you can specify the width and precision in a
		//format specifier:
		/*
		 * 	%5c		:	Output the character and add four spaces before the character item, because the width is 5
		 * 	%6b		:	Output the boolean value and add one space before the false value and two spaces before the true value
		 * 	%5d		:	Output the integer item with width 5. If the number of digits in the item is < 5, add spaces before the number. If the number of
		 * digits in the item > 5 the width is automatically increased.
		 * 	%10.2f	:	Output the floating-point item with width 10 including a decimal point and two digits after the point. Thus, there are seven 
		 * digits allocated before the decimal point. If the number of digits before the decimal point in the item is < 7, add spaces before the number. If the
		 * number of digits before the decimal point in the item is > 7, the width is automatically increased.
		 * 	%10.2e	:	Output the floating-point item with width 10 including a decimal point, two digits after the point, and the exponent part. If the
		 * displayed number in scientific notation has a width < 10, add spaces before the number
		 * 	%12s	:	Output the string with width 12 characters. If the string item has fewer than 12 characters, add spaces before the string. If the 
		 * string item has more than 12 characters, the width will automatically increase
		 */
		
		System.out.printf("%3d#%2s #%4.2f \n", 1234, "Java", 51.6653); //Displays 1234#Java #51.67
		//the width for 1234 is 3 (smaller than its initial size 4; the width automatically increased)
		//the width for "Java" is 2 (smaller again)
		//the width for the double 51.6653 is 4, but it needs a width of 5 to display 51.67, so the width is automatically increased by 5
		
		//Can display a number with a thousand separators by putting a comma after the %:
		System.out.printf("%,8d %,10.1f\n", 12345678, 123456.643);//Displays 12,345,678 123,456.6
		
		//Can pad a number with leading zeros instead of spaces by adding a 0 in front of a number specifier:
		System.out.printf("%08d %08.1f \n", 1234, 5.126); //%08d puts extra zeros to make 8 integers total
		
		//By default, the output is right justified. You can put the minus sign (-) in the format specifier to specify that the item is left justified in
		//the output within the specified field
		System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 51.63);//	Displays		1234	Java	51.6
		System.out.printf("%-8d%-8s%-8.1f\n", 1234, "Java", 51.63);//Displays 1234		Java	51.6
		
		//NOTE: when specifying a floating-point number, do not put a zero before the decimal point; Do this: %.2f Do NOT do this: %0.2f
		
		//To output a literal % in the format string, use %%
		System.out.printf("%.2f%% \n", 75.356); //Rounds up and displays 75.36%
		
	}

}
