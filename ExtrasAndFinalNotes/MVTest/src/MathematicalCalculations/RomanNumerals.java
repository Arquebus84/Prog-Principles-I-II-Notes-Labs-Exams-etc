package MathematicalCalculations;

public class RomanNumerals {
	/**
	 * 		Given a string of Roman Numerals, translate them into integers and find the full integer:
	 * 
	 * 		I = 1
	 * 		V = 5
	 * 		X = 10
	 * 		L = 50
	 * 		C = 100
	 * 		D = 500
	 * 		M = 1000
	 * 
	 * 		If there is a smaller numeral attached before the larger numeral, it's the larger numeral minus the value of that smaller numeral
	 * 		Ex:
	 * 			IV	=> 4
	 * 			XL	=> 40
	 * 			XC	=> 90
	 * 			MCM	=> 1000 + (1000 - 100) = 1900
	 * 			DM => 1000 - 500 = 500
	 * 
	 */
	
	public static void main(String[] args) {
		String number = "MCMXCIV";		//1994	M + CM + XC + IV 
		//String number = "LVIII";	//58
		//String number = "MMCDXXV"; //2425
		//String number = "VII"; //7
		//System.out.println(RomanToInt(number));
		
		/**Integer to Roman Numerals*/		//	3749 => MMMDCCXLIX
		//IntegerToRoman(1994);
		System.out.println(IntegerToRoman(3749));
		System.out.println(intToRomanFaster(3749));
		
	}
	
	public static int RomanToInt(String roman) {
		char[] strArray = roman.toCharArray();
		
		int n = 0;
		
		for(int c = 0; c < strArray.length; c++) {
			if(c+1 < strArray.length) {
				if(strArray[c] == 'I') {
					switch(strArray[c+1]) {
						case 'V': n +=4; c += 1;break;
						case 'X': n += 9; c += 1;break;
						case 'L': n += 49; c += 1;break;
						case 'C': n += 99; c += 1;break;
						case 'D': n += 499; c += 1;break;
						case 'M': n += 999; c += 1;break;
						default: n += 1; break;
					}
				}else if(strArray[c] == 'V' || (strArray[c] == 'V' && c-1 >= 0 && strArray[c-1] != 'I')) {
					n += 5;
				}else if(strArray[c] == 'X') {
					switch(strArray[c+1]) {
						case 'L': n += 40; c += 1;break;
						case 'C': n += 90; c += 1;break;
						case 'D': n += 490; c += 1;break;
						case 'M': n += 990; c += 1;break;
						default: n += 10;break;
					}
				}else if(strArray[c] == 'L') {
					switch(strArray[c+1]) {
						//case 'C': n += 50;	// L - C will be 50
						case 'D': n += 400; c += 1; break;
						case 'M': n += 900; c += 1; break;
						default: n += 50; break;
					}
				}else if(strArray[c] == 'C') {
					switch(strArray[c+1]) {
						case 'D': n += 400; c += 1; break;
						case 'M': n += 900; c += 1;break;
						default: n += 100; break;
					}
				}else if(strArray[c] == 'D') {
					n += 500;	//Even if c+1 is 1000, it will be 500
				}else if(strArray[c] == 'M') {
					n += 1000;
				}
			}else {
				switch(strArray[c]) {
					case 'I': n+= 1; break;
					case 'V': n += 5; break;
					case 'X': n += 10; break;
					case 'L': n += 50; break;
					case 'C': n += 100; break;
					case 'D': n += 500; break;
					case 'M': n += 1000; break;
					//default: n += 1; break;
				}
			}
		}
		
		return n;
	}

	public static String IntegerToRoman(int number) {
		int timesCount = 1;
		StringBuilder builder = new StringBuilder();
		
		//System.out.println(number);
		
		while(number > 0) {
			//System.out.println((int)(number % 10 * Math.pow(10, n)) + " : " + romanSimple((int)(number % 10 * Math.pow(10, n))));
			//System.out.println(number%10 + " " + timesCount);
			//System.out.println(romanSimple(number, timesCount));	//Won't work if it's a full number
			
			//System.out.println(romanSimple(builder, number%10, timesCount));
			romanSimple(builder, number%10, timesCount);
			number /= 10;
			
			timesCount *= 10;
		}
		return builder.toString();
	}
	
	public static String romanSimple(StringBuilder builder, int num, int count) {
		
		//System.out.println(count);
		if(count == 1) {			// 0, 1, ... 5, ... 9
			builder.append("V");
			switch(num) {
				case 1: builder.replace(0, 1, "I"); break;
				case 2: builder.replace(0, 1, "II"); break;
				case 3: builder.replace(0, 1, "III"); break;
				case 4: builder.replace(0, 0, "I"); break;	//Replaces V's first spot
				case 6: builder.append("I"); break;
				case 7: builder.append("II"); break;
				case 8: builder.append("III"); break;
				case 9: builder.replace(0, 1, "IX"); break;	//Replaces X's first spot
				case 0: builder.replace(0, 1, ""); break;	//Will be empty if the first number is 0
			}
		}else if(count == 10) {		// 10, 20, 30, 40 ,50, 60, 70, 80, 90
			builder.replace(0, 0, "L");		// 50 must be checked as the dividing point
			switch(num) {
				case 1: builder.replace(0, 1, "X"); break;
				case 2: builder.replace(0, 1, "XX"); break;
				case 3: builder.replace(0, 1, "XXX"); break;
				case 4: builder.replace(0, 0, "X"); break;	//Replaces X's first spot
				case 6: builder.replace(1, 1, "X"); break;
				case 7: builder.replace(1, 1, "XX"); break;
				case 8: builder.replace(1, 1, "XXX"); break;
				case 9: builder.replace(0, 1, "XC"); break;	//Replaces C's first spot
				case 0: builder.replace(0, 1, ""); break;	//Will be empty if the first number is 0
			}
		}else if(count == 100) {	// 100, ... 500, ... 900 
			builder.replace(0, 0, "D");		// 500 must be checked as the dividing point
			switch(num){
				case 1: builder.replace(0, 1, "C"); break;
				case 2: builder.replace(0, 1, "CC"); break;
				case 3: builder.replace(0, 1, "CCC"); break;
				case 4: builder.replace(0, 0, "C"); break;	//Replaces L's first spot
				case 6: builder.replace(1, 1, "C"); break;
				case 7: builder.replace(1, 1, "CC"); break;
				case 8: builder.replace(1, 1, "CCC"); break;
				case 9: builder.replace(0, 1, "CM"); break;	//Replaces C's first spot
				case 0: builder.replace(0, 1, ""); break;	//Will be empty if the first number is 0
			}
		}else if(count == 1000) {	// 1000, ... 3999
			builder.replace(0, 0, "M");	
			switch(num) {
				case 2: builder.replace(0, 1, "MM"); break;
				case 3: builder.replace(0, 1, "MMM"); break;
			}
		}
		
		return builder.toString();
	}
	
	public static String intToRomanFaster(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        
        // Iterate through the values and symbols arrays
        for (int i = 0; i < values.length && num > 0; i++) {
            // Repeatedly append the symbol and subtract its value as long as the number is greater than or equal to the current value
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        
        return result.toString();
    }
}
