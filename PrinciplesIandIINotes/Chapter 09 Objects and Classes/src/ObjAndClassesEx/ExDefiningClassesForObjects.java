package ObjAndClassesEx;

public class ExDefiningClassesForObjects {
	
	/**Classes are definition for objects, and objects are created from classes*/
	
	//Can have multiple classes in one program, but one has to be public class!***
	
	//Declaring a reference variable for an object, the syntax is:
	//		ClassName v;
	
	//Create an object syntax is:
	//		new ClassName();
	
	/**		To declare an object, the full syntax is:
				ClassName v = new ClassName();
	*/
	
	//For example, if CircleTest.java is compiled successfully, then CircleTest.class and Circle.class are created
	
	
	/**The program that uses the class (for ex: using the class Test) is referred to as the client of that class*/
	public static void main(String[] args) {
		Test test1 = new Test(2);
		
		System.out.println(test1.getLength());
	}
	
	//Each class in the source code is compiled into a .class file by the Java Compiler
}

class Test{
	
	int length;
	
	public Test() {
		length = 1;
	}
	
	public Test(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
}
