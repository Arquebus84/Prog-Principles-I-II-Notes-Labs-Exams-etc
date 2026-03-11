
public class ConvertToHexadecimal {

	public static void main(String[] args) {
		//To convert a decimal number d to a hexadecimal number is to find the hexadecimal digits hn, h(n-1), h(n-2), ..., h2, h1, and h0, such that:
		//		d = hn * 16^n + h(n-1) * 16^(n-1) + h(n-2) * 16^(n-2) + ... + h(2) * 16^(2) + h(1) * 16^(1) + h(0) * 16^(0)
		
		//These hexadecimal digits can only be successfully found by dividing d by 16 until the quotient is 0. The remainders
		//are h0, h1, h2, ..., h(n-2), h(n-1), and hn
		/*Example
		 * 			   _0__					   _7__
		 * 			16/7					16/123
		 * 			   0					   112
		 * 			h1=	7 = remainder		h0=	11 = remainder
		 */
		
		//Decimal value
		int decimal = 128; 
		//Convert decimal to hex
		String hex = "";
		while(decimal != 0) {
			int hexValue = decimal % 16;
			
			//Convert a decimal value to a hex digit
			char hexDigit = (0 <= hexValue && hexValue <= 9)? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			
			hex = hexDigit + hex;
			decimal = decimal / 16;
		}
		System.out.println("The hex number is " + hex);
		//Program converts a decimal value between 0 to 16 into a hex character. If the hex value is between 0 and 9, it is converted into
		//a (char)(hexValue + '0'). REMEMBER when adding a character with an integer, the character's Unicode is used in the evaluation.
		
		//If the hex value is 5, it is converted to (char)(hexValue + '0'); which returns 5
		//If hex value is 11 (>9) it is converted to (char)(hexValue - 10 + 'A'); which returns B
		
		//If the input is 0, it will display nothing if the input is 0; to fix this, replace line 30 with: 
		/*
		 *	if (hex.length() == 0)
  		 *		System.out.println("The hex number is 0");
		 *	else
  		 *		System.out.println("The hex number is " + hex);
		 */
		
	}
}
