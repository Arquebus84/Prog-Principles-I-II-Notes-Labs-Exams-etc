
public class StaticVarsConstantsAndMethods {
	//A static variable is shared by all objects of the class. A static method cannot access instance members (i.e. data fields and methods) of the class
	
	/**Check the Circle2 class since it has the numberOfObjects*/
	//For example, if you create an object that references the Circle class, each circle object has its own radius. However, there is also a static 
	//	variable that keeps track of the number of objects we have created. 
	
	//**The data field radius in the Circle2 class is an instance variable since it is tied to a specific instance of the class; it's not shared among 
	//		objects of the same class. For example:
	//			Circle circle01 = new Circle();
	//			Circle circle02 = new Circle(5);	
	//The radius of circle01 is independent of the radius in circle02 and is stored in a different memory location
	
	/**Class Variables are shared by every instance of a class*/
	
	//Static vars vs Instance vars:
	
	/**	Key Differences

	 * An instance method can invoke another instance method and a static method, and it can 
		access an instance data field and a static data field
	 * A static method, however, can only invoke another static method and access a static data 
		field; it cannot invoke and access instances
	*/
	
	/**
		Instance variables belong to the object
			*Each obj gets its own copy of the variable
			*EX: Each circle has its own radius (Circle c1 = new Circle(2); )
	
		Static variables are shared between all objects of the same class
			*Only one copy of the variable, no matter how many objects we have
			*EX: A static var to count the number of objects we have (static int numOfObjects = 0; //Initially equal to 0 unless using setMethods or constructors)
		
		If you want all the instances of a class to share data, use static variables, also called class variables
			Static variables: Store values for the vars in a common memory location. It is a data member declared using the static modifier. A static 
			variable is shared by all instances of that class. They are used to communicate between different objects of the same class and to handle
			global states among these objects.
		*/	
	/*	**Because static vars have a common location, if one object changes the value of a static variable, all objects of the same class are affected
		For Example:		
			public class Alter{
				int i = 1;
				static int j = 1;
				
				Alter(){
					i++;
					j++;
				}
			}			
			public class Test{
				public static void main(String[] args){
					Alter a1 = new Alter();
					Alter a2 = new Alter();
					
					System.out.println(a1.i);
					System.out.println(" " + a2.i);
				}		
			}
	*/
	//Testing it
	int i = 1;
	static int j = 1;
	
	StaticVarsConstantsAndMethods(){
		i++;
		j++;
	}
	
	/**public static void test() {
		//For test01.i it prints 2 2, but for test01.j it prints 2 3
		StaticVarsConstantsAndMethods test01 = new StaticVarsConstantsAndMethods();		
		System.out.print(test01.j);
		StaticVarsConstantsAndMethods test02 = new StaticVarsConstantsAndMethods();
		System.out.print(" " + test02.j + "\n");		
		System.out.print(test01.j + " " + test02.j + "\n");//This only prints 3 3
		
	}*/
	
	
	//Constants
	/**Constants in a class are shared by all objects of the class; thus, constants should be declared a 'final static' or static final */
	
	//For example PI: 
	final static double SIMPLE_PI = 3.14;
	
	public static final double PI = 3.14159265358979323846;
	
	
	//Instance vs static methods
	/**
		Instance methods (e.g. getArea() from Circle2) and instance data (e.g. radius) belong to instances and can be used only after the instances are 
			created. They are accessed via reference variables. 
		Static methods (e.g getNumberOfObjects()) and static data (e.g. numberOfObjects) can be accessed from a reference variable or from their class
			name.
	*/
	
	//Use ClassName.methodName(arguments) to invoke a static method and ClassName.staticVariable to access a static variable. This improves readability
	//	b/c this makes the static method and data easy to spot.
	
	/**
	 * An instance method can invoke another instance method and a static method, and it can access an instance data field and a static data field
	 * A static method, however, can only invoke another static method and access a static data field; it cannot invoke and access instances
	*/
	
	//For example: h and m() are instance members
	
	int h = 5;
	static int k = 2;
	
	public static void main(String[] args) {
		//test();	//Used for previous example
		
		//Create an object from the ClassName
		//StaticVarsConstantsAndMethods a = new StaticVarsConstantsAndMethods();
		/**Create a StaticVarsConstantsAndMethods variable, and invoke it by referencing the static class m2()*/
		//StaticVarsConstantsAndMethods variableB = StaticVarsConstantsAndMethods.m3();
		
		//int j = a.h;	//a.i accesses the objects instance variable **Do not write int j = h (h is an instance variable)
		//a.m();			//a.m() invokes the object's instance method **Do not write m(); (m is an instance method)
		//a.m2(j, k);
		//System.out.println(a.m2(j, k));
		
		//System.out.println(StaticVarsConstantsAndMethods.m());	//Error because the main method can only invoke other static methods and data fields
		System.out.println("\n" + StaticVarsConstantsAndMethods.m2(2, 4));
		
	}
	
	public void m() {
		h = h + k + m2(h, k);
	}
	
	public static int m2(int a, int b) {
		return (int)(Math.pow(a, b));
	}
	
	public static StaticVarsConstantsAndMethods m3() {
		return new StaticVarsConstantsAndMethods();
	}
	
	//Which statements are correct? Let f be an instance of F
	/** 
	 public class F { 
	 	int i;
	 	static String s;
	  	
	 	void imethod() { 
	 	
	 	}
	  
	 	static void smethod() { 
	 	
	 	}
	 	
	 	static void main(String[] args){
	 		F f = new F();
	 	}
	 }	 
	 //These will be invoked in the main method:
	 System.out.println(f.i); 	//Correct since f.i accesses object i
	 System.out.println(f.s); 	//Correct
	 f.imethod();				//Correct since f is an instance object
	 f.smethod(); 				//Correct: f can access both static and instance methods 
	 System.out.println(F.i); 	//Incorrect: cannot access instance data fields
	 System.out.println(F.s); 	//Correct: can access static data fields
	 F.imethod();				//Incorrect: cannot access instance methods
	 F.smethod();				//Correct: can access static methods
	  
	 */
	 
	
	
}
