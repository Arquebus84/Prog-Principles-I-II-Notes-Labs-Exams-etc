
public class ClassAbstractionAndEncapsulation {
	//Class abstraction is a separation of class implementation from the use of a class. The details of implementation are encapsulated and
	//	hidden from the user: this is called class encapsulation**
	
	/**ADT: Abstract Data Type; a class is an abstract data type*/
	
	
	/**Class abstraction: A software development technique that hides the implementation of the class from the client; if you decide to change the 
			implementation, the client program will not be affected. (**client program: test program)*/
	
	/**Class contract: Refers to the collection of methods and fields that are accessible from outside a class, together with the description of how
			these members are expected to behave. */
	
	/**Class encapsulation: The combination of methods and data into a single data structure. For example, you can create a Circle object, and find
	 		the area of the circle without knowing where the area is computed.*/
	
	/**Abstract data type: A class is known as an abstract data type.*/
	
	/*
	Class implementation is like a black box hidden from the clients
		|				
		↓
		Class									
	Class Contract (Signatures of					Clients use the contract
	public constructors,				---->		of the class
	methods, and fields)
	
	*/
	
	public ClassAbstractionAndEncapsulation() {
		this(23.4, 4);	//We are calling the other constructor in the default constructor
	}
	
	public ClassAbstractionAndEncapsulation(double amount, int number) {
		
	}
}
