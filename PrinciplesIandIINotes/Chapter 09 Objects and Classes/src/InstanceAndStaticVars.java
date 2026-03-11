
public class InstanceAndStaticVars {
	//Scope of Instance variables and Static variables **Check the class StaticVarsConstantsAndMethods for some other info
	
	/**Class Variables are shared by every instance of a class*/
		
	/**	Feature				|			Static Member					|		Instance Member
	 * 						|											|
	 	Belongs to			|	The class itself						|	Each object (instance)
	 						|											|
	 	Memory Allocation	|	Allocated once in memory				|	New copy is created for each object
	 						|											|
	 	Access				|	Accessed using ClassName.memberName		|	Accessed using objectName.memberName
	*/
	
	//The scope of instance and static variables is the entire class, regardless of where the variables are declared
	
	//**Local variables are declared and used inside a method locally.
	
	/**
	Instance and static variables are referred to as class variables (variables declared in a class) or *data fields.
		* A variable declared inside a method is referred to as a local variable. The scope of a class' variables is the entire class, 
			regardless of where the variables are declared.
		* A class' variables and methods can be declared in any order as shown in **Example 1. The exception is when a data field is initialized based on 
			a reference to another data field. In such cases, the other data field must be declared first, as shown in **Example 2.
	
	*/
	
	//You can declare a class' variable only once, but you can declare the same variable name in a method many times in different non-nesting blocks
	/**If a local variable has the same name as a class' variable, the local variable takes precedence, and the class' variable with the same name 
		is hidden. For example, in class F, x is defined both as an instance variable and static variable in the method*/
	
	
}

//Example 1)**The variable radius and method getArea() can be declared in any order
class CircleTest{
	public double getArea() {
		return radius * radius * Math.PI;
	}
	private double radius = 1;
}

class A{	//i has to be declared before j
	private int i;
	private int j = i;
}

class F{
	private int x = 0;
	private int y = 0;
	
	public void p(){
		int x = 1;
		System.out.println(x);
		System.out.println(y);
	}
}