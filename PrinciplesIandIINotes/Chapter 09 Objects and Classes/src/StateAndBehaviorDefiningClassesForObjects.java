
public class StateAndBehaviorDefiningClassesForObjects {
	/**	Introduction:
	Object Oriented Programming (OOP) is a technology for developing reusable software (approach to programming that involves organizing 
		objects and their behavior into classes of reusable components).	
	Using OOP is reliable for creating a Graphical User Interface (GUI) and even large-scale softwares
	*/
	
	//NOTES:
	//A class defines the properties and behaviors of objects (This class is called DefiningClassesForObjects)
	
	//Private constructor (private is the modifier)
	private double radius;//This is a member variable (any object that we create has a copy of this variable, meaning that we can create 
							//as many objects as we want, and they have their own radius (value for this variable)).
	
	//Public constructor (*the constructor is similar to a method, but is has the class name)
	public StateAndBehaviorDefiningClassesForObjects() {
		setRadius(1.0);
	}//**More on this in the Circle class under the ObjAndClassEx Package
	
	public void setRadius(double radius) {	//This mutator (getter) method will change the behavior of the object property radius
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	//**A class is a template, a blueprint, or a contract for an object (You can create many instances of a class)
	//		*It describes the data an object has, and the methods it contains, and its behaviors
	//**An object is an instantiation of a class
	//		*For EX, 3 circles, each with a different radius, all constructed from the Circle class
	//**Can represent classes using UML class diagrams (Unified Modeling Language)
	
	/**An object represents an entity in the real world that can be distinctively identified (EX: a student, a desk, or a circle)
			*A State of an object (aka its Properties or **Attributes (a variable that stores a value for an object)) is represented by data fields.
				-A circle, for example, has a data field radius, which is the property that characterizes a circle.
				-A rectangle has data fields width and height, which are the properties that characterize a rectangle
				
				
			*A Behavior of an object (also called its Actions (that can be called by an object)) is defined by methods. 
				-To invoke a method on an object is to ask the object to perform an action.
				-For example (in the Circle class), you may defined methods named getArea() and getPerimeter() for circle objects. 
					a circle may invoke getArea() to return its area and getPerimeter() to return its perimeter. 
					**You may also define the setRadius(radius) method.				
	*/
	
	/**
		Objects of the same type are defined using a common class. A class is a template that define what an object's data fields and methods will be.
			* An object is an instance of a class; you can create many instances of a class.
		 
		Creating an instance is referred to as instantiating (process of creating an object in a class); an *instance is an object of a class
		
		
		A Java class uses variables to define data fields and methods to define actions, however, a class also provides methods of a special type, 
			called constructors, which are invoked to create a new object.
		Constructor: A special method for initializing objects when creating objects using the new operator. The constructor has exactly the same name as
			its defining class. They can be overloaded, making it easier to construct objects with different initial data values.
	*/
	
	//UML (Unified Modeling Language) is a graphical notation for describing classes and their relationships (this notation is called UML Class Diagram). 
	//In the class diagram, the data field is denoted as:
	//					dataFieldName: dataFieldType
	//						   radius: double
	
	//The constructor is denoted as:
	//					ClassName(parameterName: parameterType)
	
	//The method is denoted as:
	//					methodName(parameterName: parameterType): returnType
	
	
	//Example: If you wanted to create a class called Item2D, and have an int instance variable quantity, and a constructor that takes no parameters and 
	//	initializes quantity to 0. Both the constructor and instance variables should have **no visibility**.
	
	/**
	 public class Item2D{
    	int quantity;

    	Item2D(){
        	quantity = 0;
    	}
	 }
	 */
	
	//Example 2: Specifying the naming conventions:
	/**
	 public class Circle{
	 	double radius = 1;	//Declared the Data Field as radius and the Data Field Type is double
	 	
	 	Circle(){	//This first constructor has no argument (no-argument constructor) which means that it creates a Circle object radius 1
	 	
	 	}
	 	
	 	Circle(double newRadius){	//This second constructor creates a Circle object with the specified radius.
	 		this.radius = newRadius;
	 	}	 
	 }
	 */
	
	public void Update() {
		radius += 1;
	}
	
}
