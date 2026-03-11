
public class ClassRelationships {
	/**To design classes, you need to explore the relationships among classes,. The common relationships among classes are association, 
	 		aggregation (combine), composition, and inheritance.*/
	
	/**Aggregation models "has-a-relationship"*/
	/**Inheritance models an "is-a-relationship" (More in chapter 11)*/
	//		IntegratedVideoCard is a VideoCard (PAssign03)
	/**Composition models "exclusive contained relationship"*/
	/**		When you create a property that is an instance of another class, it's called Composition*/
	//		*For example, in the class Dog, your create an object collar of type Collar (references another class) 
	//		*More detail in the InheritanceAndComposition package in chapter 11
	
	//NOTE: Since both aggregation and composition relationships are represented using classes in the same way. There is no need to differentiate between 
	///		them, thus they will both be called compositions.** 
	
	/**Association: A general binary relationship that describes an activity between two classes.*/
	//	Ex: The association between Student class and the Course class, as well as Faculty class and the Course class (represented with the UML
	//			chart below)
	
	/**Student amount is from 5-60 students; a faculty member can teach at least 3 courses; a course is taught by one professor*/
	//		5...60		Take-->				1..3		<--Teach		1
	//	Student-------------------------Course-------------------------Faculty
	//																Teacher
	
	
	//Multiplicity: It could be a number or an interval that specifies how many of the class s objects are involved in the relationship
	
	//Aggregation and Composition
	
	/**Aggregation: (Represented as ◇ in UML) Special form of association that represents an ownership relationship between two objects. 
	 * 				Aggregation models a "has-a" relationship: the owner object is called an aggregating object, and its class is called 
 						an aggregating class: 
					The subject object is the aggregating object and its class is the aggregating class. 
					*	i.e. The owner object is the aggregating object and its class is the aggregating class; the subject object is the 
							aggregated object and its class is the aggregated class
					**An object can be owned by several other aggregating objects.*/
	//			*Represented as a data-type in an aggregating class; this describes a containment relationship;
	//				>Also: represents "whole-part" relationship where the part can exist independently of the whole
	
	/**Composition: (Represented as ◆ in UML) An aggregation between two objects if the existence of an aggregated object is dependent on the 
						aggregating object. An object consists of other objects.
					Models a "has-a-relationship with exclusion"
	 					**If an object is exclusively owned by an aggregating object, the relationship between the object and its aggregating 
	 					object is referred to as a composition*/
	//			Composition means that a class contains a data field that references a different object
	//				*Describes an "exclusive containment" relationship
	//					>Also: represents "whole-part" relationship where part cannot exist without the whole.
	
	//Each student has a name and an address and each address can be shared by up to 3 students
	
	//		1						1		1							1
	//	Name------------------------◆Student◇---------------------------Address
	//								↑		↑
	//						Composition		Aggregation
	
	/**The <Student> has a <Name>, meaning a <Name> cannot exist separately without the <Student>*/
	/**The <Student> has an <Address>, but the <Address> can exist independently from the <Student>*/
	
	/**
		public class Student{}
		
		public class Name extends Student{}
		
		
	 */
	
		
	//Aggregation may exist in objects of the same class, for example:
	//										1
	//								Person◇------
	//								 1	|		 | Supervisor
	//									---------
	/**
	 * 								public class Person{
	 * 									//Type for the data to be of class itself
	 * 									private Person supervisor;
	 * 
	 * 								}
	 */
	
	//Person can have many supervisors
	//										1
	//								Person◇------
	//								 m	|		 | Supervisor
	//									---------
	/**
	 * 								public class Person{
	 * 									private Person[] supervisor;
	 * 
	 * 								}
	 */
	
	
}
