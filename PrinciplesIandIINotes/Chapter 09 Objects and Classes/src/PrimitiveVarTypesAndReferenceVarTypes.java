
public class PrimitiveVarTypesAndReferenceVarTypes {
	
	//A variable of a primitive type holds a value of the primitive type, and a variable of a reference type holds a reference to where an 
	//	object is stored in memory
	
	//**An object that was previously referenced by the current object is no longer useful and is now known as garbage 
	//Garbage collection: A process that the Java Runtime System uses to collect the garbage (that is occupying memory space), and reclaim the memory space.
			
	public static void main(String[] args) {
		double radius;
		final double PI = 3.15169;
		//double area = radius * radius * PI;		//There will be a compiler error because radius is not initialized
		//System.out.println("Area is " + area);
	}
}
