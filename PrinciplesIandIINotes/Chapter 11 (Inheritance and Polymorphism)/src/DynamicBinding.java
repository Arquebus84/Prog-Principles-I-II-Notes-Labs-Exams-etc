
public class DynamicBinding {
	//A method can be implemented in several classes along the inheritance chain. 
	//The JVM decides which method **is invoked at runtime**
	
	//Dynamic Binding enables runtime polymorphism
	
	/**Recall, the toString() method in the Object class can be overridden by the toString() method in its 
	//	subclass (AKA GeometryObject class):

			Object obj = new GeometryObject();
			System.out.println(obj.toString());	
	 */
	//But, which toString() method is invoked by obj? This is done by knowing the declared type and the actual type
	//***A variable must be declared a type
	
	//Declared type: The type that declares a variable is called the variable's declared type
			/**	NOTE: The declared type decides which method to match at compile time
			 * 
			 * Above, obj's declared type is Object.
			 * A variable of a reference type can hold a null value or a reference to an instance of the declared type
			 * The instance may be created using the constructor of the declared type or its subtype
			 */
	
	//Actual type: The type that is the actual class for the object referenced by the variable at runtime
			/**
			 * Above, obj's actual type is GeometryObject, b/c obj references an object created using new GeometryObject()
			 */
	
	//**Which toString() method is invoked by o is determined by o's actual type; this is known as Dynamic Binding
	
	//**Dynamic binding occurs at runtime
	/**Dynamic Binding: A method may be implemented in several classes along the inheritance chain. The 
						JVM decides which method is invoked at runtime
						
		NOTE on Dynamic Binding: A method may be defined in a superclass, but is overridden in a subclass. Which implementation
			of the method is used on a particular call will be determined dynamically by the JVM at runtime.
	 */
	
		
	//Examples
	public static void main(String args[]) {
		new PersonA().printPerson();
		new StudentA().printPerson();
	}
}

class StudentA extends PersonA {
	/*@Override
	public String getInfo() {
		return "Student";
	}*//*	
	private String getInfo() {	//Setting this to private will give a warning, but will only print the getInfo() from PersonA class
		return "Student";
	}*/
}

class PersonA {
	/*public String getInfo() {
		return "Person";
	}*/
	private String getInfo() {
		return "Person";
	}

	public void printPerson() {
		System.out.println(getInfo());
	}
}
