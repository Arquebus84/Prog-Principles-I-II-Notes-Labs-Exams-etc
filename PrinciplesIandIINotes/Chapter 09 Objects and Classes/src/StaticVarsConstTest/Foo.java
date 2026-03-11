package StaticVarsConstTest;

public class Foo {
	int i;
	static int s;
	
	java.util.Date date;
	public static void main(String[] args) {
		/*Foo f1 = new Foo();
		System.out.println("f1.i is " + f1.i + " f1.s is " + f1.s);
		Foo f2 = new Foo();
		System.out.println("f2.i is " + f2.i + " f2.s is " + f2.s);
		Foo f3 = new Foo();
		System.out.println("f3.i is " + f3.i + " f3.s is " + f3.s);*/
		
		Foo test = new Foo();
		System.out.println(test.date);
	}

	public Foo() {
		/*i++;
		s++;*/
	}
}
