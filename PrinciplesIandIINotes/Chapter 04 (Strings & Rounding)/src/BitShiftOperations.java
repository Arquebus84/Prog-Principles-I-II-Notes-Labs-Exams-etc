
public class BitShiftOperations {

	public static void main(String[] args) {
		// Bit Shifting allows the manipulation of bits in integer or long data type values
		/** The purpose is to save performance since shifting is faster than 
		 * 		multiplication and division by powers of two	*/
		
		/*								Notation:
		 * 
		 * (Left Shift): doubles the value				(Right Shift): divides the value by a half
		 * 			
		 * 			x << n									x >> n
		 *	 
		 *	Left Shift Example (in bits)				Right Shift Example
		 *			0110 is 6									1101 is 13
		 *
		 *		6 << 1 (shift left 1 bit)					13 >> 2 (shift right 2 bits)
		 *
		 *		will be:	 01100							will be:	11
		 *		which is:	  12							which is:	3
		 *
		 */
		
		System.out.println("Shift 2 positions left: 100 << 2 is " + (100 << 2)); // Results in 100 * 2 * 2 will be 400		
		System.out.println("Shift 5 positions right: 100 >> 5 is " + (222 >> 5)); // will be:
		//															222 / (2^5) will be rounded down to 6
		
		System.out.println("Shift 2 positions right: 13 >> 2 is " + (13 >> 2));
	}

}
