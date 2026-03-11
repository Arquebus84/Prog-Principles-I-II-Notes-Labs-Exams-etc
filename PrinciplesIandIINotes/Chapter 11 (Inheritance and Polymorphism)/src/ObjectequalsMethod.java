
public class ObjectequalsMethod {
	//Similar to the toString() method, the equals(Object) method is another useful method defined in the Object class
	
	//Signature:
	/**
	 * 		public boolean equals(Object obj)
	 */
	//*The method tests whether two objects are equal. To invoke it:

	//		object1.equals(object2);
	
	/**		Default implementation:
	 * 	public boolean equals(Object obj){
	 * 		return this == obj;
	 * 	}
	 * 
	 */
	
	//**This method can be overridden in any class:
	
	/**		Here, you can override the equals method in Circle class to compare whether two circles have the same radius
	 * 
	 * @Override
	 * 	public boolean equals(Object obj){
	 * 		if(obj instanceof Circle){
	 * 			return radius == ((Circle)obj).radius;
	 * 		}else{
	 * 			return false;
	 * 		}
	 * 	}
	 */
	
	//NOTE: the == operator is used to compare two primitive data type values or determine whether two objects have the same references. The
	//			equals method is intended to test whether two objects have the same contents, provided the method is overridden in the
	//			defining class of the objects.
	
	//Special Note: Common Mistake with the method signature is to write equals(someObject o) or equals(Circle c). 
	//					***Put only equals(Object o) in order to override the equals method
	
	
	
	public static void main(String[] args) {
	    Object a1 = new ATest();
	    Object a2 = new ATest();
	    System.out.println(a1.equals(a2));
	    
	    ATest a3 = new ATest();
	    ATest a4 = new ATest();
	    System.out.println(a3.equals(a4));
	    
	    
	    Object b1 = new BTest();
	    Object b2 = new BTest();
	    System.out.println(b1.equals(b2));
	    
	    System.out.println(((BTest)b1).equals((BTest)b2));
	  }
	
}

class ATest{
	int x;

	public boolean equals(Object a) { // This method overrides the Object class' equals method
		return this.x == ((ATest) a).x;
	}
}

class BTest{
	int x;

	public boolean equals(BTest b) {
		return this.x == b.x;
	}
}
