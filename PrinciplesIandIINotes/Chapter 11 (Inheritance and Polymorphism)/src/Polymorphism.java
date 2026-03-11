
public class Polymorphism {
	//Polymorphism means that a variable of supertype can refer to a subtype object
	/**Polymorphism refers to the feature that an object of subclass can be used by any code designed to work
	 	with an object of its superclass*/
	
	/**Three pillars OOP: Encapsulation, Inheritance, and Polymorphism*/
	
	/**In terms of polymorphism, both abstract and interface classes can be used as the data type
	  	for any class extending/implementing them.
	 */
		
	
	public static void main(String[] args) {
		m(new GraduateStudent()); 	//GraduateStudent is Subclass of Student
		m(new Student()); 			//Student is Superclass of GraduateStudent, but subclass of Person
		//m(new Person());	//Causes error (not from Student)
		//m(new Object());	//Causes error (not from Student)
		
		//s(new Student());	//Causes error b/c variable has to be GraduateStduent type, Student object type is superclass not subclass 
	}

	public static void m(Student x) {	//Takes an object of type Student
		System.out.println(x.toString());
	}
	
	public static void s(GraduateStudent g) {
		System.out.println(g.toString());
	}
}

class GraduateStudent extends Student {	//Extends from Student
	
}

class Student extends Person { //Extends from Person
	@Override
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}