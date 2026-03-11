package MathematicalCalculations;

public class FastInverseSqrtTest {
	public static void main(String[] args) {
		
		Double a = Double.valueOf(2);
		double x = FastInvSqrt.inv(a);
		
		System.out.println(x);
		
		System.out.println(Q_rt(22));
	}
	
	/**
	 * Return 1/Sqrt(x)
	 */
	
	public static int Q_rt(int n) {
		return n >> 1;
	}
	
	private static class FastInvSqrt {
//		public static FastInvSqrt(double x) {
//			inv(x);
//		}
		
		public static double inv(double x) {
			return 1.0 / returnSqrt(x);
		}
		
		public static double returnSqrt(double x) {
			return Math.sqrt(x);
		}
	}
}