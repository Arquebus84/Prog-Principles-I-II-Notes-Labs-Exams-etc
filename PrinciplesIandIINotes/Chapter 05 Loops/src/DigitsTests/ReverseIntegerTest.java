package DigitsTests;

/**
 * 	Reverse any integer that is limited between 2^31 - 1 and -2^31 (Integer.MAX_VALUE and Integer.MIN_VALUE)
 */
public class ReverseIntegerTest {

	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		//System.out.println("1534236469");
		//System.out.println("-1563847412");
		//System.out.println(ReverseInteger(-2147483412));
//		System.out.println(ReverseInteger(1534236469));
//		System.out.println(ReverseInteger(1563847412));
		System.out.println(ReverseIntegerAlt(123));
	}
	
	public static int ReverseInteger(int num) {
		if(Math.abs(num) > (Math.pow(2, 31) - 1)) {return 0;}
		
		int total = 0;
		int temp = num;
		int temp2 = num;
		int p = 1;
		while(Math.abs(temp) != 0) {
			//total += num % 10 * Math.pow(10, p);
			//System.out.println(temp % 10 + " " + p);
			temp /= 10;
			p *= (temp == 0)? 1 : 10;
		}
		//System.out.println(p);
		while(Math.abs(num) != 0) {
			if(((long)total + (num%10) * p) > Integer.MAX_VALUE || ((long)total + (num%10) * p) < Integer.MIN_VALUE || ((long)(num%10) * p) > Integer.MAX_VALUE) {return 0;}
			//System.out.println(((num%10) * p));
			
			//System.out.println(((long)total + (num%10) * p));
			//if( (-((long)total + (num%10) * p)) < Integer.MIN_VALUE) {return 0;}
			total += (num % 10) * p;
			//System.out.println(total);
			//total *= p;
			num /= 10;
			p /= (num == 0)? 1 : 10;
		}
		return total;
	}

	
	public static int ReverseIntegerAlt(int num){		//Alternative approach with only one while loop
		int reverse = 0;
		int current = 0;
		
		while(num != 0) {
			current = num%10;	//Obtain the last digit
			num /= 10;			//Remove last digit
			
			//Check for overflow
			if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE)
				return 0;
			
			if((reverse == Integer.MAX_VALUE/10 && current > 7) || (reverse < Integer.MIN_VALUE/10 && current < -8))
				return 0;
			
			reverse = reverse * 10 + current;
		}
		return reverse;
		
	}
}
