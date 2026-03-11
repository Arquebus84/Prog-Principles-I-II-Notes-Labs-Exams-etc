public class FormatDemo {
	public static void main(String[] args) { 
	    // Display the header of the table 
	    System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", 
	      "Radians", "Sine", "Cosine", "Tangent");

	    // Display values for 30 degrees
	    int degrees = 30;
	    double radians = Math.toRadians(degrees);
	    System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n", degrees, 
	      radians, Math.sin(radians), Math.cos(radians),
	      Math.tan(radians));

	    // Display values for 60 degrees
	    degrees = 60;
	    radians = Math.toRadians(degrees);
	    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
	      radians, Math.sin(radians), Math.cos(radians), 
	      Math.tan(radians));
	    
	  //Statements in lines 4 and 5 display the column names of the table (The column names are strings)
		//Each string is displayed using the specifier %-10s, which left-justifies the string
		//The statements 10 - 12 display the degrees as an integer and four float values. The integer is displayed using the %-10d, and each float is
		//displayed using the specifier %-10.4f, which specifies four digits after the decimal point
		
		//Example Samples:
		System.out.printf("%2d%.2f \n", 32, 32.5); //If the %.2f doesn't have anything > 7 between the % and the decimal point, it will combine the numbers
		System.out.printf("%2d%6.2f \n", 32, 32.5); //In this case, the result is spaced out, however, it is best to manually add spaces
		//Note: if you replaced the width of 32.5 %6.2f with %5.2f, it will be connected because the width 5 is rounded to 6, but the width 6 is rounded to 7
		//Remember that if the width (the number of digits before the decimal point in the item) is < 7, add spaces before the number
		System.out.printf("%-5.2f%-6.2f \n", 3.503, 4.355);
		System.out.printf("%3.1f \n", 1234.56);
		System.out.printf("%5d \n", 123456); 
		
		System.out.printf("%,-5.2f", 12456.2); //Displays 12,456.20
	  }
}
