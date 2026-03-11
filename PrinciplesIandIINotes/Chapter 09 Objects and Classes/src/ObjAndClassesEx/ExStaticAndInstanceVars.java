package ObjAndClassesEx;

public class ExStaticAndInstanceVars {

	java.util.Date date = new java.util.Date();
	
	public static ExStaticAndInstanceVars parameter1 = new ExStaticAndInstanceVars();
	
	int i = 12;
	static int j = 3;
	
	int a;
	static int b;
	
	public static void main(String[] args) {
		ExStaticAndInstanceVars a = new ExStaticAndInstanceVars();
		double area = 0;

		area = ExStaticAndInstanceVars.computeArea(a.i, j);
		System.out.println("Area is " + area);
		
		ExStaticAndInstanceVars A1 = new ExStaticAndInstanceVars();
		//System.out.println(A1.a + " " + A1.b);
		System.out.println(A1.a);
		ExStaticAndInstanceVars A2 = new ExStaticAndInstanceVars();
		//System.out.println(A2.a + " " + A1.b);
		System.out.println(A2.a);
		
		ExStaticAndInstanceVars test = new ExStaticAndInstanceVars();
		System.out.println(test.date);
		
		//Invoke the static object outside the main method
		parameter1.a = 10;
		System.out.println(parameter1.a);
	}
	
	public static double computeArea(int length, int width) {
		return length * width;
	}

	public ExStaticAndInstanceVars() {
		a++;
		b++;
	}
}
