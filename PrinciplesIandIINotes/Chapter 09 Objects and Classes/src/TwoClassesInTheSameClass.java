
public class TwoClassesInTheSameClass {
	//This class references the algorithm in the Circle3 class
	private double radius;
	private static int numOfObj;
	
	public TwoClassesInTheSameClass() {
		radius = 1;
		numOfObj++;
	}
	public TwoClassesInTheSameClass(double newRadius) {
		radius = newRadius;
		numOfObj++;
	}
	public static int getNumberOfObjects() {
		return numOfObj;
	}
	public double getRadius() {
		return radius;
	}
		
}

class Test{
	
	public static void main(String[] args) {
		TwoClassesInTheSameClass c1 = new TwoClassesInTheSameClass();
		TwoClassesInTheSameClass c2 = new TwoClassesInTheSameClass(2);
		
		System.out.println(c1.getRadius() + " \n" + c2.getRadius());
		System.out.println(TwoClassesInTheSameClass.getNumberOfObjects());
		
	}
}
