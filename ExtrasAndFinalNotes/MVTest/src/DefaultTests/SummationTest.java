package DefaultTests;

public class SummationTest {
	//More work is needed to be done due to the sub-intervals consisting of decimal/fractional values; therefore, they cannot be added together in an
	//	iteration
	
	public static void main(String[] args) {
		TrapezoidalRule t = new TrapezoidalRule(1, 2, 5);
		
		
	}

}

	//Numeric Integration classes

//n = number of sub-intervals
/**DeltaX = (b - a) / n */

class SimpsonRule{
	//Sn = DeltaX/3 * (y1 + 4y2 + 2y3 + 4y4 + ... + 4y(n - 2) + 2y(n - 1) + yn)
	
	private int a; //First point
	private int b; //Last point
	
	public SimpsonRule() {
		
	}
}

/**DeltaX = (b - a) / n */

class TrapezoidalRule{
	//Tn = DeltaX/2 * (y1 + 2y2 + 2y3 + 2y4 + ... + 2y(n - 2) + 2y(n - 1) + yn)
		
	//Do it for equation 1 / x
	
	public TrapezoidalRule(int a, int b, int subInt) {
		double difference = (b - a);
		double deltaX = difference / subInt;
		double total = 0;
		//The first and last end points surround the subintervals, so it's subInt * a or b (a = 1 b = 2 w/ subInt = 5: 5, 6, 7, 8, 9, 10)
		for(int i = a; i <= subInt; i++) {
			if(i == a) {
				total += F(i);
			}else if(i == subInt) {
				total += F(i - 1 + deltaX);
			}else {
				total += 2 * F(i - 1 + deltaX);
			}
			
		}
		
		total *= deltaX / 2;
		System.out.println(total);
	}
	//Function is 1/x
	public double F(double x) {
		return 1.0 / x;
	}
	
	
}