
public class ImmutableObjAndClasses {
	/**It is an object/class whose data fields or properties cannot be changed*/
	
	//You can define immutable classes to create immutable objects. The contents of immutable objects cannot be changed
	
	//Normally, you would create an object and allow its contents to changed later, however, it is desirable to create objects whose contents cannot be 
	//	changed once the object has been created. This object will be called an immutable object, and its class as immutable class.
	
	/**Immutable class: A class is immutable if it contains all private data fields and no mutator methods and no accessor methods that would return a 
	 					reference to a mutable data field object*/
	
	/**For example: The String class is immutable because once you create a string, you cannot change it afterwards (you can modify the string,
			but you are not actually changing it; rather, you are making a derivative of the same String object that you created).
	*/
	
	//*If you deleted the setter method in the Circle class, then Circle would be an immutable class 
	
	
	/**If a class is immutable, then all of its instance data fields must be private and it cannot contain public setter methods (mutator) for 
		any data fields. A class with all private data fields and no mutators is not necessarily immutable.
	*/
	
	//Ex:
	public static void main(String[] args) {
		Student student = new Student(111223333, "Jamal");
		System.out.println("Student was created on " + student.getDateCreated());
		java.util.Date dateCreated = student.getDateCreated();
		dateCreated.setTime(200000); // Now dateCreated field is changed!
		System.out.println("Student's new time is " + student.getDateCreated());
	}
}

class Student{
	private int id;
	private String name;
	private java.util.Date dateCreated;
	
	//This creates a new student with the formal parameters: ssn and newName
	public Student(int ssn, String newName) {
		id = ssn;
		name = newName;
		dateCreated = new java.util.Date();
	}

	//Returns the student id.
	public int getId() {
		return id;
	}

	//returns the student name
	public String getName() {
		return name;
	}

	//Returns the date
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
}