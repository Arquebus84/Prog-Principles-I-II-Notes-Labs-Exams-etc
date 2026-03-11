//import AbstractGeometryClass.GeometryObject;

public class ComparableInterface {
	//The Comparable interface defines the compareTo() method for comparing objects
		
	//Every class implements the Comparable interface:
	//		Date, Double, BigInteger, BigDecimal, and String classes
	
	/** compareTo method
	 * 
		@Override // Implement the compareTo method defined in Comparable
  		public int compareTo(ClassName o) {
    		if (this.getParameterMethod() > o.getParameterMethod())
      			return 1;
    		else if (this.getParameterMethod() < o.getParameterMethod())
      			return -1;
    		else
      			return 0;
  		}  
	 */
	
	/**
			implementing the Comparable interface in a class with this syntax:
			
			public class ClassName implements Comparable<ClassName>
	 */
	
	/**		Example: ComparableRectangle extends Rectangle and implements Comparable
 
				[GeometricObject]														«interface»
						△												java.lang.Comparable<ComparableRectangle>
						|												+compareTo(o: ComparableRectangle): int
						|																△
					[Rectangle]	*extends geometricObj									:
						△																:
						|																:
						|																:
				[ComparableRectangle]--------------------------------------------------⬏
	 */
	
	public static void main(String[] args) {
		
		//Both Car IDs are generated randomly
		Car c1 = new Car();
		System.out.println(c1.toString());
		Car c2 = new Car();
		System.out.println(c2.toString());		
		System.out.println("Both cars are different by: " + (c1.compareTo(c2))); //Utilize their interface's compareTo method
		
		Truck t1 = new Truck();
		System.out.println(t1.toString());	
		Truck t2 = new Truck();
		System.out.println(t2.toString());	
		//System.out.println("Trucks both differ by " + (t1.compareTo(t2)));	//Undefined because Truck does not implement compareTo method	
	}
	
}

//Example
class Car implements Comparable<Car>{	
	private int id;
	
	public Car() {
		this.id = (int)(1 + Math.random() * 11);
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int compareTo(Car c) {
		if(this.getId() == c.getId()) {
			return 0;
		}			
		else if (this.getId() > c.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d", getId());
	}
}

//Example 2 (Without the Comparable interface implementation)
class Truck {	
	private int id;
	public Truck() {
		id = (int)(1 + Math.random() * 11);
	}
	
	public int getId() {
		return id;
	}

	@Override // Implement the toString method in GeometricObject
	public String toString() {
		return String.format("ID: %d", getId());
	}
}

