
public class InheritanceSuperClassAndSubClass { //extends A
	
	//OOP allows programmers to define new classes from existing classes: this is called inheritance
	
	/**Inheritance: Defining a new class by extending an existing class; Feature for reusing software */
	//Inheritance allows you to define a general class (superclass), and later extend it to more specialized classes (subclasses)
		
	/**Inheritance models an "is-a-relationship"***, meaning that it defines a relationship where a class is defined/based on
	 	another class
	 		-For example: IntegratedVideoCard is a VideoCard
	 */
	
	/**A class C1 extended from another class C2 is called a SubClass, and C2 is called SuperClass*/
	//**NOTE: A subclass is not a subset of the superclass, rather, it's an extension of the superclass
	
	//In SubAndSuperClassEx package, the Circle and Rectangle are subclasses of GeometryObject; GeometryObject is the superclass
	//	for both Circle and Rectangle
	
	
	/**NOTE: A Class defines a type*/
	//A type defined by subclass is called a subtype; a type defined by its superclass is called a supertype
	
	/**The subclass and its superclass is said to form an is-a relationship*/
	//Ex: Rectangle class inherits all accessible data fields and methods from GeometryObject class
	
	//Syntax:
	/**Public class SubClassName extends SuperClassName*/
	
	
	
	//Multiple Inheritance: Capability for the programming languages to derive a subclass from multiple classes
	//	Class can extend several subclasses; ***However Java does not allow multiple inheritance
	
	//Single Inheritance: A class can only extend to one superclass
	//	Java allows a subclass to inherit from only one superclass
	
	//Examples:
	/**		public class Car extends vehicle{
	    
			}*/
	
	//Array Notes
	public static void main(String[] args) {
		//getArray(new int[] { 4, 5 });
		
		//forClassA();
		
		A aTest = new A("Print Test");
	}

	public static void getArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
	}
	
	/**Super keyword: */
	//*super* refers to the SuperClass and can be used to invoke the SuperClass' methods and constructors
	
	//Syntax:		super();		or		super(arguments);
	
	//There is a use in the Circle class in the package	SubAndSuperClassEx:
	/**
		public Circle(double radius, String color, boolean filled){
			super(color, filled);
			this.radius = radius;
		}
	*/
	
	
	//Note, for this you want to try changing this class title to ...extends A
	public static void forClassA() {
		//SuperClassAndSubClass test = new SuperClassAndSubClass();
		//test.print();
	}
}


//Examples:

/***		//This does not work, because class B is suppose to extend class A
class A extends B{
	B test = new B();
	test.print();
}

class B{
	String a;
	public B(String a) {
		this.a = a;
	}
	
	public void print() {
		System.out.println(a);
	}
}*/

class A extends B{
	String a;
	public A(String a) {
		//this.a = a;
		super(a);		//Invokes the superclass B (Initializes everything in B's constructor)
	}
	
//	public void print() {
//		System.out.println(a);
//	}
}

class B{
	public B(String a){
		print(a);
	}
	public void print(String a) {
		System.out.println(a);
	}
}
