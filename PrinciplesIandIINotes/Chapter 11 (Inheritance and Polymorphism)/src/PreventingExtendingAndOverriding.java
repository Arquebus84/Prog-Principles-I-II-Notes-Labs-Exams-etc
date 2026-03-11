
public class PreventingExtendingAndOverriding {
	//A final class cannot be extended. A final method cannot be overridden. A final data field is a constant.
	
	//To prevent a class from being extended, the final modifier is used to indicate that a class is final, and cannot be a parent class.
	
	/**The Math class, String class, StringBuilder and BigDecimal classes, and all wrapper classes for primitive data types 
		are also final classes.	
	*/
	
	//NOTE: the public, protected, private, static, abstract, and final are used on classes and class members (data fields and methods), 
	//	except, the final modifier can be used on local variables in a method. 
	/**A final local variable is a constant inside a method*/
	
	public static void main(String[] args) {
		//final double PI = 3.14159;
		
	}
	
	/**A final method and private method cannot be overridden by its subclass, but can be overloaded by subclasses*/
	public final void finalExample() {
		System.out.println("Final");
	}
}

final class CSharp extends PreventingExtendingAndOverriding{
	public CSharp() {
		
	}
	/**
	@Override
	public void finalExample() {	//Cannot work
		
	}*/
}
