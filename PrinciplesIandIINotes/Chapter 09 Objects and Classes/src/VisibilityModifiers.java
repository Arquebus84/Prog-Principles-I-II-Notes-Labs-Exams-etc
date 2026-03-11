
public class VisibilityModifiers {
	//Visibility modifiers can be used to specify the visibility of a class and its members (methods and objects) 
	
	/**Package-Private: (aka: package-access) If public or private modifiers are not used, then by default the classes, methods, and data fields are
			accessible by any class in the same package.
	*/
	
	//Packages can be used to organize classes, to do so, add the following line as the first non-comment and non-blank statement in the class:
	//		package packageName;
	
	//If a class is defined without a package statement, then it's in the default package.
	/**It's recommended to place the classes in defined packages rather than the default package in order to be more organized.*/
	
	
	//In addition to the public and default modifiers, Java provides private and protected modifiers for class members
	//Private modifier restricts access to its defining class; default modifier restricts access to a package; public modifier enables unrestricted access
	
	/*
	 package p1;						package p1;													package p2;
	 
	 public class C1 { 					public class C2{											public class C3{
	 	public int x; 						void aMethod(){												void aMethod(){
	 	int y; 									C1 c1 = new C1();											C1 c1 = new C1();
	 	private int z;							c1.x;														c1.x;
	 											c1.y;														c1.y;	//Cannot access
	 	public void m1() { } 					c1.z;	//Cannot access because it's private				c1.z;	//Cannot access
	 	void m2() { } 							c1.m1();													c1.m1();
	 	private void m3() { } 					c1.m2();													c1.m2();	//Cannot invoke
	 }											c1.m3();//Cannot invoke this method							c1.m3();	//Cannot invoke
	 										}															}
	 									}															}
	 */			
	
	//An object can access its private members if they are defined in its own class 
	/**
	public class C {
		private boolean x;

  		public static void main(String[] args) {
    		C c = new C();
    		System.out.println(c.x);
    		System.out.println(c.convert());  
  		}

  		private int convert() {
    		return x ? 1 : -1;
  		}
	}
	
	//In this class, there will be compiler errors at *
	public class Test {
  		public static void main(String[] args) {
    		C c = new C();
    		System.out.println(c.x);			//*x is a private object in the class C
    		System.out.println(c.convert());	//*convert is a private method in class C
  		}
	}
	*/
	
	//Private constructor: Prevents constructing objects from the class (prevents the user from creating an instance of a class)	
	//Ex:
	//		private Math(){}
	
	
	
	//Examples
	/*EX 1:
	public class Test {
  		public static void main(String args[]) {
    		NClass nc = new NClass();
    		nc.t = nc.t++;
  		}
	}

	class NClass {
  		int t;
  		private NClass() {
  		
  		}
	}
	*/
	//**The program has a compile error because the NClass class has a private constructor.
	
	/*EX 2:
	public class Test {
  		private int t;

  		public static void main(String[] args) {
    		int x;
    		System.out.println(t);
  		}
	}
	*/
	//t is non-static and it cannot be referenced in a static context in the main method.
	
	/*
	public class Foo {
  		private int x;

  		public static void main(String[] args) {
    		Foo foo = new Foo();
    		System.out.println(foo.x);
  		}
	}
	*/
	//Since x is an instance variable, it cannot be directly used inside a main method. However, it can be accessed through an object 
	//	such as foo in this code.
	
	
	
}

