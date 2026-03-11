
public class AccessingObjectsViaReferenceVars {
	//**An object's data and methods can be accessed through the dot (.) operator via the objects reference variable (Ex in CircleTest: c1.getArea())
	
	
	//Newly created objects are allocated in the memory
	
	/**Objects are accessed via *reference variables* (a variable of a class type), which contain references to the objects. Such variable are declared as:
				ClassName objectRefVar;
	*/
	
	/**A class is essentially a programmer-defined type; it is a *reference type* (a data type that is a class or an interface), meaning that a variable of the 
		class type can reference an instance of the class. 
		For example, the following statement declares the variable myCircle of the Circle type:
				Circle myCircle;
				
		The variable myCircle can reference a Circle object, however, the following statement creates an object and assigns its reference to myCircle:
		 		myCircle = new Circle();	**In this case, the Circle object is created with its no-arg constructor
	*/

	//Can combine the declaration of an object reference variable, the creation of an object, and the assigning of an object reference
	//	to the variable in one single statement:
	//			ClassName objectRefVar = new ClassName();
	
	/**	Ex:		Circle myCircle = new Circle();		The myCircle variable holds a reference to a Circle object	
		
		Ex2:	Circle x = new Circle(5.5);			This creates an object x, with a radius of 5.5 (this is not a no-arg constructor)
		
		Ex3		x.getArea();						This invokes the getArea method of object x an returns its calculated area 
	*/
	
	//An *object reference variable and an *object are very different; although, in most cases, their distinction can be ignored
	
	/**Arrays are treated as objects in Java. Arrays are created using the 'new' operator; an array variable actually contains a reference 
		to the array object.
		An array can contain elements of an object type. The default value for the elements of an array is 0 for numeric, false for 
			boolean, '\u0000' for char, null for object element type*/
	
	//In this case, since these two share the same package:
	
	//DefinigClassesForObjects x; **This alone creates a compiler error
	StateAndBehaviorDefiningClassesForObjects c2 = new StateAndBehaviorDefiningClassesForObjects(); //This does not cause a compiler error
	
}
