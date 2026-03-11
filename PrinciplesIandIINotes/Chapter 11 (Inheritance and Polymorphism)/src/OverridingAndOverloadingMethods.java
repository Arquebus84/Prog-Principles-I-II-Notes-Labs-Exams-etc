
public class OverridingAndOverloadingMethods {
	//More on @Override in the OverridingVsOverloading class
	
	//The Notes will be in the following classes:
	public static void main(String[] args) {
		//Overriding Methods
		OverridingMethods riding1 = new OverridingMethods();
		riding1.getClass();
		
		//Overloading Methods
		OverloadingMethods loading1 = new OverloadingMethods();
		loading1.getClass();
	}	
}

/**Overriding*/
class OverridingMethods{
	/**To override a method, the method must be defined in the subclass using the same signature as in its superclass*/
	
	//Method Overriding: When its necessary for the subclass to modify the implementation of a method defined in the superclass
	
	//Overriding: Implement the method in a subclass that is declared in a superclass
	/**Cannot override static or private methods, but can overload them*/
	
	
	//In the SubAndSuperClassEx package, there is a modification on the Circle class that accounts overriding the 
	//	superclass' (GeometryObject) toString() method
	
	/**
	public class Circle extends GeometryObject{
		//Other methods and parameters
	
		public String toString(){
			return return super.toString() + "/nRadius: " + getRadius();
		}
	}
	*/	
	//**The toString() method is defined in the GeometryObject and modified in the Circle class. Both methods can be used in the Circle
	//		class; to invoke the toString() method defined in GeometryObject class *from Circle class, use super.toString();
	
	
	//Examples:
	//Which way is the getValue() method overridden correctly?	
	/**Test 1 Incorrect (the getValue() method that returns a type Object returns "A string" instead)
	public class Test1 { 
		public static void main(String[] args) { 
			A a = new A();
			System.out.println(a.getValue()); } }
	
	class B { 
		public String getValue() { return "Any object"; } }
	
	class A extends B { 
		public Object getValue() { return "A string"; } }
		

	//Test 2: Correct way to override method (The method getValue() of return type Object correctly returns "Any object")
	public class Test2 {
		public static void main(String[] args) { 
			A a = new A(); 
			System.out.println(a.getValue()); } }
		 
	class B { 
		public Object getValue() { return "Any object"; } }
	
	class A extends B { 
		public String getValue() { return "A string"; } }

	 */
	
	public OverridingMethods() {
		BOverride b = new BOverride();
		b.m(5);
		System.out.println("b.i is " + b.i);
	}
}
class AOverride{
	int i;
	
	public void m(int i) {
		this.i = i;
	}
}
class BOverride extends AOverride{	
	public void m(int i) {	//The method m is overridden in class BOverride
		this.i = i;
	}
}

/**
	This is an example of not overriding a method
class AOverride{
	int i;
	
	public void m(int i) {
		this.i = i;
	}
}
class BOverride extends AOverride{	
	public void m(String s) {	//The method m is NOT overridden in class Next
		
	}
}*/

/**Overloading*/
class OverloadingMethods{
	
	/**
		Overloading means to define multiple methods with the same name but different signatures. 
		Overriding means to provide a new implementation for a method in the subclass
	*/
	
	//Cannot override static methods (override a method with the same signature), but can overload static methods
	//	(provide the same name, but different method signature)
	
	public OverloadingMethods() {
		BOverload b = new BOverload();
		b.p(2);
	}	
}

class AOverload{
	public void p(double i) {
		System.out.println("Double i is: " + i * 2);
	}
}
class BOverload extends AOverride{
	public void p(int i) {
		System.out.println("Integer i is: " + i);
	}
}