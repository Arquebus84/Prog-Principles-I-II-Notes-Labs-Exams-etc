
public class ExponentDemo {

	public static void main(String[] args) {
		//Math.exp(x) returns e raised to the power of x (e^x)
		//Math.log(x) returns the natural logarithm of x (ln(x) = log_e(x) or [log(x)/log(e)])
		//Math.log10(x) returns the base 10 logarithm of x (log(x) = log_10(x))
		//Math.pow(a,b) returns value of a raised to the b power
		//Math.sqrt(x) returns the square root of x (Note: could also be dynamic by doing Math.pow(x, 0.5))
		//Math.E parameter value E is approx. 2.7183
		System.out.println(Math.log(Math.E)); // ln(e) is 1.0 because it is normally a floating-point data type 
		
		System.out.println(Math.exp(2)); //Returns e^2
		System.out.println(2.7183 * 2.7183);
		
	}

}
