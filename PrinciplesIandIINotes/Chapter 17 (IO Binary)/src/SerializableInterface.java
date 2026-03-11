

public class SerializableInterface {
	//Not every object can be written to an output stream; objects that can be written are said to be serializable.
		//A serializable object is an instance of the java.io.Serializable interface**, so the object class 
		//	must implement Serializable
	
	/**Serializable interface is a marker interface (contains no methods), so you DON'T need to add 
		additional code in your class to implement the interface:
	 		* Implementing this interface enables Java serialization mechanism to automate the process of storing objects and arrays
	 */
	
	//Object Serialization: The process of writing an object to a stream (It's implemented in ObjectOutputStream**)
	
	//Object Deserialization: The process of restoring an object that was previously serialized (It's implemented in ObjectInputStream**)

	
	/**Many classes in Java API implement java.io.Serializable include:
			* All wrapper classes for primitive-type values (Integer, Decimal, etc.)
			* java.math.BigDecimal and java.math.BigInteger 
			* java.lang.String, java.lang.StringBuilder, and java.lang.StringBuffer
			* java.util.Date and java.util.ArrayList
	 */
	
	//Attempting to store an object that does not support Serializable interface would cause a NotSerializableException
	
	public static void main(String[] args) {
		
	}

}

	/**	NOTE ON SERIALIZABLE FIELDS
	**If an object is an instance of Serializable, but contains non-serializable instance data fields, then it CANNOT be serialized!!
		
		* To enable an object to be serialized, mark these data fields with the transient* keyword to tell the JVM to ignore
			them when writing the object to an object stream.
	Look at the class below as an example:
	*/

//NOTE on Non-serializable fields Example
@SuppressWarnings({"serial", "unused"})
class C implements java.io.Serializable{
	private int v1;
	private static double v2;
	private transient A v3 = new A();
	
	/**
		* When class C is serialized, only v1 is serialized.
		* v2 is not serialized b/c it's a static variable
		* v3 is not serialized because it's marked as transient; **If it was not marked transient, then 
			a java.io.NotSerializableException would occur
	 */
}

class A{
	
}
	/**
		NOTES:
		* A static variable is not serialized
		* An object must be an instance of Serializable for it to be serialized
		* A transient variable is not serialized.
	 */
	
	//IMPORTANT EXAMPLE: In the class Foo, the class Loan does NOT implement java.io.Serializable
	/**
	public class Foo implements java.io.Serializable {  
		private int v1;
		private static double v2;
		private Loan v3 = new Loan();  
	}
	
	The following are true:
		* An instance of Foo cannot be serialized b/c Foo contains a non-serializable instance variable v3
		* If you mark v3 as transient, then an instance of Foo is serializable
		* If v3 is declared static, an instance of Foo is serializable	 
	 */
	
