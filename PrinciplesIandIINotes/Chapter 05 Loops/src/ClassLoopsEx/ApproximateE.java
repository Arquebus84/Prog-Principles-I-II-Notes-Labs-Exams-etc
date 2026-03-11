package ClassLoopsEx;

public class ApproximateE {

	public static double factorialN(int i1) {
		double sum = 1;
		for(int i = 1; i <= i1; i++) {
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//e ~ summation (i = 0 to n) (1/i!) = 1 + 1/1 + 1/(1*2) + 1/(1*2*3)+...+ 1/(i!)
		int n = 18;
		double factorial = 1.0;
		double approximateValue = 0.0;//The sum that we are calculating
		double approxV = 0.0;
		int x = 3;
		
		for(int i = 0; i < n; i++) {
			
			factorial = 1.0;
			for(int j = 1; j <= i; j++) {
				factorial *= j;
			}
			
			approximateValue += 1/factorial;
			//approximateValue += (Math.pow(x, i)/ factorial); //This results in 20.085536923187668
			approxV += 1/factorialN(i);
		}
		
		System.out.println(approximateValue);
		System.out.println(Math.exp(x)); //This results in 20.085536923187668
		System.out.println(Math.E);
		System.out.println(approxV);
		
		System.out.println(Math.cos(Math.PI/4.0));
		System.out.println(calculateE(5));
		
	}
	
	//Using another method
	public static double calculateE(int n) {
		double approximateValue = 0.0;//The sum that we are calculating
		double factorial;
		
		for(int i = 0; i < n; i++) {
			
			//Calculate factorial
			factorial = 1.0;
			for(int j = 1; j <= i; j++) {
				factorial *= j;
			}
			
			approximateValue += 1/factorial;
		}
		return n;
	}

}
