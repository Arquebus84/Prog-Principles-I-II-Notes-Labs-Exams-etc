
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		//Greatest common divisor of two integers: 4 and 2 is 2, 24 and 16 is 8
		//Let two integers be n1 and n2, you know that n1 is a common divisor, but you don't know it it's the GCD. Therefore, you need to check 
		//whether k (for k = 1, 2, 3, and so on) is a common divisor for n1 and n2 until k is greater than n1 or n2
		//Initially, gcd is set to 1, whenever a new common divisor is found, it becomes the new gcd. 
		//When you have checked the all the possible common divisors from 2 up to n1 or n2, the value in variable gcd is the greatest common divisor
		
		int n1 = 24;
		int n2 = 16;
		int gcd = 1; //Greatest common divisor
		int k = 2; //possible divisor
		while(k <= n1 && k <= n2) {
			if(n1 % k == 0 && n2 % k == 0) {
				gcd = k; //Update gcd
			}
			k++; //Next possible gcd
		}
		System.out.println("The GCD is " + gcd);
		
		//Rewritten as a for-loop:
		int gcD = 1;
		for(int i = 2; i <= n1 && i <= n2; i++) {
			if(n1%i == 0 && n2%i == 0) {
				gcD = i;
			}
		}
		System.out.printf("%d", gcD);
		
		
		/*Here is a simple example of a common divisor
		int commonD;		
		for(commonD = 1; commonD <= n1 || commonD <= n2; commonD++) {
			if(n1%commonD == 0 && n1%commonD == 0) {
				System.out.println("24 and 16 are divisible by " + commonD);
			}
		}*/
	}
}
