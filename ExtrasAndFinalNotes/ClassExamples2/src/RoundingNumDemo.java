
public class RoundingNumDemo {
	public static void main(String[] args) {
		//Math.ceil(x) x is rounded up to its nearest integer (NOTE: the integer is returned as a double value) 
		//Math.floor(x) x is rounded down to its nearest integer (NOTE: the integer is returned as a double value)
		//Math.rint(x) x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double value
		//Math.round(x) returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double
		System.out.println("ceil rounded values\n");
		System.out.println(Math.ceil(2.1)); //Prints 3.0
		System.out.println(Math.ceil(2.0)); //Returns 2.0
		System.out.println(Math.ceil(-2.1)); //Returns -2.0
		System.out.println("floor rounded values\n");
		System.out.println(Math.floor(2.5)); // Returns 2.0
		System.out.println("rint rounded values\n");
		System.out.println(Math.rint(2.1)); //Returns 2.0
		System.out.println(Math.rint(2.6)); //Returns 3.0
		System.out.println(Math.rint(2.5)); //Returns 2.0
		System.out.println(Math.rint(-2.6)); //Returns -3.0
		System.out.println(Math.rint(-2.5)); //Returns -2.0
		System.out.println(Math.rint(2.5)); //Returns 2.0
		System.out.println(Math.rint(5.5)); //Returns 6.0 for some reason

		System.out.println("round rounded values (returns long values)\n");
		System.out.println(Math.round(2.6)); //Returns 3 b/c 2.6 + 0.5 is 3.4
		System.out.println(Math.round(4.5)); //Returns 5 b/c 4.5 + 0.5 is 5.0
		System.out.println(Math.round(-4.5)); //Returns -4 b/c -4.5 + 0.5 is -4.0 
		//(NOTE: Math.round(-4.3), the returned value (-4.0) is in range {-3.0>(x + 0.5)>=-4.0}
		System.out.println(Math.round(-4.2)); //Returns -4 b/c -4.2 + 0.5 is -3.7
		System.out.println(Math.round(-4.0)); //Returns -4 b/c -4.0 + 0.5 is -3.5
		System.out.println(Math.round(-3.0)); //Returns -3 b/c -3.0 + 0.5 is -2.5 (-2.5 (returned value of -3.0) is in range {-2.0>(x + 0.5)>=-3.0})
		System.out.println(Math.round(-3.9)); //Returns -4 b/c -3.9 + 0.5 is -3.4 (-3.0>(x+0.5)>=-4.0)
		System.out.println(Math.round(-3.5)); //Returns -3 b/c -3.5 + 0.5 is -2.5		
		System.out.println(Math.round(-2.5)); //Returns -2 b/c -2.5 + 0.5 is -1.5 (-1.5 is in range {-1.0>(x + 0.5)>=-2.0}) 
		System.out.println(Math.round(-4.6)); //Returns -5 b/c -4.6 + 0.5 is -4.1
		
		System.out.println(Math.round(-5.4)); //-5.4 + 0.5 = -4.9 returns -5
		System.out.println(Math.round(-5.5)); //-5.5 + 0.5 = -5.0 returns -5
		System.out.println(Math.round(-5.7)); //-5.7 + 0.5 = -5.2 returns -6 {-5.0>(x+0.5)>=-6.0 }
		System.out.println(Math.round(-6.6)); //-6.6 + 0.5 = -6.1 returns -7
		
		System.out.println(Math.round(2.5)); //2.5 + 0.5 = 3.0 returns 3
		System.out.println(Math.round(2.1)); //2.1 + 0.5 = 2.6 returns 2
		
		System.out.println("round values (returns int values)\n");
		System.out.println(Math.round(5.4f)); //returns int value (5.4 + 0.5 = 5.9) 5
		
		
	}
}
