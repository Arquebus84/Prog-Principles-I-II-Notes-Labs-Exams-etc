
public class CloneableInterface {
	//Cloneable interface specifies whether an object can be cloned
	
	/**Check bottom for example on shallow and deep copy*/
	
	//Shallow Copy: When cloning an object, all its fields are copied	
	//Deep Copy: When cloning an object, all its fields are cloned recursively
	
	//NOTE: clone() method is protected in the Object class
	
	/**
		package java.lang;
		
		public interface Cloneable {
		
		}
	 */	
	//An interface with an empty body is known as a marker interface
	/**
	Marker interface: Empty interface used to denote that all the classes implementing the interface share the same properties
		* Does not include any methods
	 */
	
	
	/**Examples of cloneables are Calendar and Date classes*/
	
	
	/**	Syntax for methods in Cloneable interface:

		Override the protected clone method defined in the Object class, and strengthen its accessibility
		@Override  
  		public Object clone() {
    		try {
      			return super.clone();
    		}
    		catch (CloneNotSupportedException ex) {
      			return null;
    		}
  		}

	 */
	
	
	//Examples
	public static void main(String[] args) {
		java.util.Date x = new java.util.Date();
		x.getClass();
		//java.util.Date y = x.clone();
		//System.out.println(x = y);
		
		ListTest();
		
		ToClone c1 = new ToClone();
		Object c2 = c1.clone();
		System.out.println(c2.toString());	//Creates a clone of c1 (ToClone object)
	}
	
	@SuppressWarnings("unchecked")
	public static void ListTest() {
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("New York"); 
		java.util.ArrayList<String> list1 = (java.util.ArrayList<String>)(list.clone());	//Creates clone of the last existing line of list
		list.add("Atlanta"); 
		list1.add("Dallas"); 
		System.out.println(list1);
	}
}

class ToClone implements Cloneable{
	public ToClone() {
		
	}
	
	@Override
	public String toString() {
		return "Object of type ToClone is now cloned";
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}catch(Exception e) {
			System.out.println("Not valid to clone");
			return null;
		}
		
	}
}

//Class that implements Cloneable, but returns new object of itself
class newClone implements Cloneable{
	public newClone(){
		System.out.println("Successfully cloned itself");
	}
	
	@Override
	public newClone clone() {
		try {
			return (newClone)super.clone();
		}catch(Exception ex) {
			return null;
		}
	}
}

interface ObjectName extends Cloneable{
	
}

/**
		In the code below, you can create an object of the House class, and create an identical copy of it:
		
		House house1 = new House(120, 31322);
		House house2 = (House)house1.clone();
 */

/**
		The clone method in the Object class copies each field from the original object to the target object. 
			* If the field is of primitive type, its value is copied
				-Ex: The value area(double type) is copied from house1 to house2
			
			* If the field is of an Object type, the reference of the field is copied
				-Ex: The field whenBuilt is of the Date class, so its reference is copied into house2:
						
						**This means that house1.getWhenBuilt == house2.getWhenBuilt is True***
				
				**Shallow Copy means that if the field is of an object type, the reference of the object is copied 
					rather than its contents
 */


/**				Shallow Copy in UML
																			(house2 = (House)house1.clone())
		[house1: House	]			↱----->	[whenBuilt: Date]<------↰			[house2: House	]
		[ id = 1		]			|		[ Date object	]		|			[ id = 1		]
		[ area = 31322	]			|		[ content		]		|			[ area = 31322	]
		[ whenBuilt		]-----------⬏								⬑----------	[ whenBuilt		]
 */
				//In Shallow, the reference of whenBuilt (Date) is copied
				//Shallow Copy: When cloning an object, only the primitive type objects are copied 


/**				Deep Copy in UML

																	(house2 = (House)house1.clone())
		[house1: House	]			↱----->	[whenBuilt: Date]					[house2: House	]
		[ id = 1		]			|		[ Date object	]					[ id = 1		]
		[ area = 31322	]			|		[ content		]					[ area = 31322	]
		[ whenBuilt		]-----------⬏									⬐------	[ whenBuilt		]
																		|
																		|
											[whenBuilt: Date]<----------↵
											[ Date object	]
											[ content		]
 */
				//To perform a Deep Copy for House object, replace the clone() method with:
				/**
						public Object clone() {
							try {
								return super.clone();
							}catch(CloneNotSupportedException ex){
								return null;
							}
						}
				 */
				//Deep Copy: When cloning an object, all its fields are cloned recursively (repeats itself)
				//				Meaning that both primitive and reference type objects are copied


class House implements Cloneable, Comparable<House> {
	private int id;
	private double area;
	private java.util.Date whenBuilt;

	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	public int getId() {
		return id;
	}
	public double getArea() {
		return area;
	}
	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}

	//To perform a deep copy, 
	@Override /**Override the protected clone method defined in the Object class, and strengthen its accessibility*/
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}

	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(House o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else
			return 0;
	}
}
