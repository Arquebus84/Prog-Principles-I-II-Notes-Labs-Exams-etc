
public class CastingObjectsAndinstanceofOperator {
	//One object reference can be typecast into another object reference; this is called casting object
	
	//*In DynamicBindingEx package, the statement m(new Student()); assigns the object new Student() to a parameter
	//	of Object type; this is called object casting
	
	/**Casting Objects: Converting an object of one object type into another object type. The contents of the object are not changed*/
	
	//The statement m(new Student()) is equivalent to:
	//			Object o = new Student(); //Implicit casting (**Student object is already a subclass (an instance) of the superclass, Object**)
	//			m(o);
	
	
	//If you want to assign the object reference o to a variable of Student type, Don't use the following statement:
	//			Student b = o;
	//	This creates a compile error, b/c **Student object is always an instance of Object, but an Object is not necessarily an 
	//		instance of Student
	
	//			Student b = (Student)o //Explicit casting (*Instance of Object, o, is casted explicitly as a Student instance*)
	
	/**It's possible to cast an instance of a subclass to a varibale of the superclass, called *Upcasting* b/c an instance of a
			subclass is **always** an instance of its superclass.
		When casting an instance of a superclass to a variable in its subclass, called *downcasting*, explicit casting must be used to 
			confirm your intention to the compiler with the (SubclassName) cast notation
	 
	NOTE: *For casting to be successful, make sure the object to be cast is an instance of the subclass. If the superclass object is NOT
	 	and instance of the subclass, a runtime ClassCastException occurs.
	 			-Example: If an object is not an instance of Student, it cannot be cast into variable of Student
	 		NOTE: It's better to ensure that the object is an instance of another object before attempting a casting:
	 			Using a method with instanceof keyword as an operator	
	*/	
	//instanceof Operator: (Java keyword) An operator that checks whether an object is an instance of a class
	
	
	
	//Example:
	
	//The following shows polymorphism and casting: program creates two objects, one of type CircleBasic and another of RectangleBasic, both
	//	are instances, and invoke the checkInstance() method to display them. checkInstance() displays circle diameter and rectangle area.	
	public static void main(String[] args) {
		CircleBasic c1 = new CircleBasic();
		Object c2 = new Object();
		//CircleBasic c3 = (CircleBasic)c2;	//Causes runtime error ClassCastException b/c c2 is not an instance of CircleBasic
		Object c3 = (Object)c2;
		Object r1 = new RectangleBasic();
		
		checkInstance(c1);	//c1 is instanceof CircleBasic
		checkInstance(c2);	//c2 (type Object) is instanceOf CircleBasic
		//checkInstance((CircleBasic)c2);	//Runtime error: ClassCastException
		checkInstance(c3);
		checkInstance(r1);
	}
	
	/**The variable myObject is declared Object (meaning that declared type decides which method to match at compile time)*/
	public static void checkInstance(Object myObject) {
		
		//NOTE: Using myObject.getDiameter would cause a compiler error b/c Object class doesn't have getDiameter method
		
		//The java compiler cannot find a match for myObject.getDiameter(), so it's necessary to cast myObject to CircleBasic
		if(myObject instanceof CircleBasic) {
			System.out.println("Circle diameter is " + ((CircleBasic)myObject).getDiameter()); //The myObject is casted as CircleBasic type
		}else if(myObject instanceof RectangleBasic){
			System.out.println("Rectangle area is " + ((RectangleBasic)myObject).getArea());
		}else {
			System.out.println("Not of type Shape");
		}
	}
}

//Circle test class
class CircleBasic{
	private double radius;
	
	public CircleBasic() {
		this.radius = 1.0;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
}

//Rectangle test class
class RectangleBasic{
	double length;
	double height;
	public RectangleBasic(){
		this(1, 2);
	}
	
	public RectangleBasic(double length, double height){
		this.length = length;
		this.height = height;
	}
	
	public double getArea() {
		return (length * height);
	}
}
