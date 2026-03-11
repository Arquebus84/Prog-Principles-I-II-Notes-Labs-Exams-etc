package CastingStaticVarsEx;

public class CastingStaticVarsAndMethod {
	
	public static void main(String[] args) {
		Double doub1 = Test02.IterateProcess(23, 34);
		Object ob1 = Test01.IterateProcess(new Test01());
		
		double ob2 = new Test02().TestReturn(23, 45);
		
		System.out.println(doub1.toString() + "\n" + ob1.toString() + "\n" + ob2);
	}
	
}

class Test01{
	private static double x;
	
	public static double IterateProcess(double pos, double rot) {
		return (pos + rot) + x;
	}
	
	public static Test01 IterateProcess(Object obj) {
		return (Test01)obj;
	}
}

class Test02 extends Test01{
	public double TestReturn(double pos, double rot) {
		return (pos + rot);
	}
}
