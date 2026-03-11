



import java.util.ArrayList;	//Use the ArrayList to store a collection of F (See bottom for details on class F)****

public class Interfaces {
	//Interface is a class-like construct for defining common operations for objects
	
	/**NOTE: Similar to abstract class, but it's intended to specify the common behavior for objects of related classes or unrelated classes.
		
		***Behavior of an object is defined by methods, state is defined by data fields (properties of the object)
	*/
	
	/**NOTE: Unlike the abstract classes, you can implement MORE THAN ONE interface:
			For example, in order to implement two different interfaces, separate them with commas:
			
		public class ClassName implements interface1, interface2, ... { }

	 */
	
	//Java only allows single relationships (with superclass)
	
	//Syntax:
	/**
		modifier interface InterfaceName {
			//Constant declarations
			//Abstract method signatures
		}
		
		
		//For example:
		public interface Edible {		
			//Describe how to eat
			public abstract String howToEat();
		}
		
		//Example 2:
		public interface Survey {
    		public abstract int getQuestionsCount();
    		public abstract Feedback submitResponse(String response);
    		public double calculateSatisfactionLevel();
		}
	 */
	
	/**Similar to abstract class, you cannot create an instance of it with 'new' operator*/
	//To implement an interface to a class, use the 'implements' keyword
	
	/**
	 * NOTES:
	 	* A primitive data type is not a reference type, but an interface is an instance type
	 */
	
	//Example:
	public static void main(String[] args) {
		TestSuper test1 = new TestSub1();		
		System.out.println(((TestInterface)test1).extension() + "\n");	//Cast the TestSuper into type TestInterface
		/**Could also not cast this, b/c of the following abstract class (TestSuper) already implements TestInterface*/
		
		TestSuper test2 = new TestSub2();
		System.out.println(test2.extension());
		test2.moreString();
		test2.newString();
		
		//Testing Polymorphism (at very bottom)
		System.out.println("\nPolymorphism Test:");
		B b = new B();
		if (b instanceof A)
			System.out.println("b is an instance of A");
		if (b instanceof C)
			System.out.println("b is an instance of C");
				
				
		/**Testing the ArrayList with the Interfaces*/
		ArrayList<F> objArray = new ArrayList<>();	//ArrayList of type F
		objArray.add(new F());
		//objArray.add((F)(new Object()));	//Explicitly cast
		
	}
}

//Implementing multiple interfaces
interface A {
}

interface E {
}

class C {  
}

class D extends C {  
}

class B extends D implements A {
	
}

class F extends D implements A, E {
	
}

//interfaces, similar to abstract classes, are capable returning values, or even void methods, and they can 
//	be overridden in their implements class
/**A package Private interface*/
interface Sensor{
    public abstract double getTemperature();
    public abstract double getHumidity();
    default boolean isCalibrationNeeded(){
        return true;
    }
    public static String displayActivationMessage(){
        return "Hello! The sensor is activating ...";
    }
}


/**This is a package-private interface*/
interface TestInterface{
	public abstract String extension();
	
	public default void newString() {
		System.out.println("Here is a new Array of characters");
	}
	
	public abstract void moreString();
}

abstract class TestSuper implements TestInterface{
	public TestSuper() {
		System.out.println("Test Complete");
	}
		
	public abstract void extraString();
}

class TestSub1 extends TestSuper{	//No need to put 'implements TestInterface' because it's a subclass of TestSuper meaning that it
	public TestSub1() {				//	already implements TestInterface
		
	}
	@Override
	public String extension() {
		return "But, there is more.";
	}	
	@Override
	public void moreString() {
		System.out.println("Almost done");
	}
	
	public void extraString() {
		System.out.println("Extra string");
	}
}

class TestSub2 extends TestSuper{
	public TestSub2() {
		
	}
	
	@Override
	public String extension() {
		return "And, there is no more.";
	}
	
	@Override
	public void moreString() {
		System.out.println("That is it");
	}
	
	public void extraString() {
		System.out.println("Another Extra string");
	}
}
