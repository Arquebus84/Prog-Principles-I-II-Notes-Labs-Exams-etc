
public class ConstructorChainingAndCallingSuperClass {
	
	/**Constructing an instance of a class invokes the constructors of all the superclasses along the inheritance chain:
	 	* Constructing an object of a subclass will make the subclass constructor first invoke its superclass constructor before 
			performing its own tasks.
	 */
	
	//A constructor may invoke an overloaded constructor or its superclass constructor. *If neither is invoked explicitly, the compiler
	//	will automatically put super() as the first statement in the constructor
	
	/**The Superclass' constructor is not inherited, rather it is always invoked*/
	
	//Here, the constructor explicitly calls its superclass' no-arg (default) constructor and convenience constructor
	/**
		public ClassName(){							public ClassName(parameters){
	 		super();	 								super();
	 		//Statements				
		}											}
	
	 */	
	
	//Constructor Chaining: Constructing an instance of a class invokes all the constructor chaining superclasses along the inheritance
	//	chain.
	//		-Constructor invocations chain backwards through all parent classes automatically
	/**
		class Dog extends Animal{
			//Implement dog class
		}
	*/
}

class CallingSuperclassMethods{
	
}
