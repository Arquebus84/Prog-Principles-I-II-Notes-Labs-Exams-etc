import java.util.ArrayList;

public class ArrayListClass {
	
	//ArrayList can be used to store an unlimited amount of objects
	
	/**
			java.util.ArrayList<E>
		+ArrayList()
		+add(e: E): void
		+add(index: int, e: E): void	//list.add(3, e); //Adds element e in 3rd position of ArrayList list
		+clear(): void
		+contains(o: Object): boolean
		+get(index: int): E
		+indexOf(o: Object): int
		+isEmpty(): boolean
		+lastIndexOf(o: Object): int
		+remove(o: Object): boolean		//Removes first element in the list; returns true if an element was removed
		+size(): int
		+remove(index: int): E
		+set(index: int, e: E): E		//Sets the element at the specified index, then returns the element being replaced
	 */
	
	//ArrayList is also known as a generic class with a generic type E. Can specify a concrete type to replace E when creating
	//	an ArrayList. For example, the following statement creates an ArrayList and assigns its reference to variable "cities". 
	//	This ArrayList object can be used to assign Strings:
	/*		ArrayList<String> cities = new ArrayList<String>();
	 * 
			cities.add("London");	// cities now contains [London]
    		cities.add("Denver");	// cities now contains [London, Denver]
    		cities.add("Paris");	// cities now contains [London, Denver, Paris]	
	*/
	
	//The following creates an ArrayList and assigns its reference to variable "dates". Can be used to store dates:
	java.util.ArrayList<java.util.Date> dates = new java.util.ArrayList<java.util.Date>();
	
	
	//In newest verison of Java, the statement:
	//		ArrayList<AConcreteType> list = new ArrayList<AConcreteType>();
	
	//Can be replaced with:
	//		ArrayList<AConcreteType> list = new ArrayList<>();
	//This is due to Type Inference*
	
	/**Type Inference: The concrete type is not longer required in the constructor. The compiler is able to infer the type from the
						variable declaration. */
	
	public static void main(String[] args) {
		ArrayList<java.util.Date> datesList = new ArrayList<>();
		java.util.Date d = new java.util.Date();
		datesList.add(d);
		datesList.add(d);
		System.out.println(datesList);
		
		System.out.println((datesList.get(0) == datesList.get(1)) + " " 
				  + (datesList.get(0)).equals(datesList.get(1)));
		
		ArrayList<String> list = new ArrayList<>();
		String s1 = new String("Java");   
		String s2 = new String("Java");   
		list.add(s1);
		list.add(s2);    
		System.out.println((list.get(0) == list.get(1)) + " " 
		  + (list.get(0)).equals(list.get(1)));
	}
}
