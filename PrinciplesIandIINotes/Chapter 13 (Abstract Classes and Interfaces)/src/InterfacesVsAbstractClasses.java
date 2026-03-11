
public class InterfacesVsAbstractClasses {
	//A class can implement multiple interfaces, but can only extend one superclass
	
	/**
							Vars					Constructors								Methods
	Abstract class:		No restrictions			Constructors are invoked by					No restrictions
												subclasses through constructor 
												chaining. Abstract class cannot
												be instantiated using new operator
												(Unless it's an array so you can write
												*AbsClass list = new AbsClass[n]*, but this
												means that you need to manually initialize
												each individual element as one of the subclasses)
	
	
	Interface:			All vars must be 		No constructors; Interface cannot be		May contain public abstract instance
						public static final		instantiated using new operator				methods, public default, and public static
																							methods
	 */
	
	//NOTES:
	//	* If you compile an interface without errors, a .class file will be created for the class.
	//	* If you compile an interface without errors, but with warnings, a .class file will still be created for the class.
	//	* If you compile a class without errors, but with warnings, a .class fill will be created, but
	//	if you compile a class with errors, a .class file won't be created.
	
}
