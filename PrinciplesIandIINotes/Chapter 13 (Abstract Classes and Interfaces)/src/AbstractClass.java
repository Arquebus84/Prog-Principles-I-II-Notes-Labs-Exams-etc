
public class AbstractClass {
	//An abstract class cannot be used to create objects; it can contain abstract methods that are implemented in concrete subclasses
	
	//Used for generalizing behaviors for a subclass: more specifically, 
	//			***used to specify the common behavior between related classes
	
	//In the inheritance hierarchy, classes become more specific and concrete with each new subclass*
	//If you moved back up to a superclass, classes become more general and less specific. Class design should ensure that a
	//	superclass contains common features of its subclasses
	
	/**Abstract class: When designing classes, the superclass contains the common features of its subclasses. Sometimes, a
		superclass becomes so abstract that it cannot have, or be used to create, any specific instances.
		- Declared using the abstract modifier
			* Abstract classes are like regular classes with data types and methods, however, you cannot create
				instances of abstract classes using the new operator.
				
			Syntax:
				public abstract class AbstractClassName {}
	 */
	
	/**Abstract Methods: Method signature without implementation. It's implementation is provided by its subclasses. Abstract method
		is denoted with an abstract modifier and must be contained in the abstract class
		
			Syntax (for void and String method):
			
				public abstract void abstractVoidMethodName();
				
				public abstract String abstractStringMethodName();
	 
	NOTES: 
	 	* A data field cannot be declared as abstract
	 	* An abstract class can be used as a data type (composition)
	 	* An abstract class can be extended
	 	* An abstract class cannot have instances created using the abstract class' constructor
	 	* An abstract class cannot be contained in a non-abstract class
	 	***Abstract class cannot be instantiated using the 'new' operator (cannot create instance from an abstract class), but
	 		abstract class can be used as a data-type***
	 	
	 	* Subclass can override an abstract method from its superclass
	 	* Subclass can be abstract even if it's superclass is concrete
	 	
	 */
	
	
	
	/* These are how an abstract class' method should look like (they will be defined in the subclasses)

	abstract class A {
		protected void unfinished();	//Incorrect method
	}

	abstract class A {
		abstract void unfinished();		//Correct method
	}

	abstract class A {
		abstract int unfinished();		//Correct method
	}
	
	 */
	
	public static void main(String[] args) {
		//absOne a = new absOne();	//Cannot create instance of abstract class with 'new' operator*
		/**absOne a = new absSub();	//Can reference the abstract class if absSub is subclass of absOne*/
		//absSub b = new absOne();	//Cannot create instance of abstract class
		/**absSub b = new absSub();	//This works*/
		
		new absSub();
	}
}

abstract class absOne{
	protected absOne() {
		System.out.print("A");
	}
	
	protected absOne(int a) {
		System.out.print("B");
	}
}

class absSub extends absOne{		//Extension is inheritance
	
	public absSub() {
		this(1);
		System.out.print("C");
	}
	
	public absSub(int a) {
		this(1, 2);
		System.out.print("D");
	}
	
	public absSub(int a, int b) {
		super(2);
		System.out.print("E");
	}
	
}
