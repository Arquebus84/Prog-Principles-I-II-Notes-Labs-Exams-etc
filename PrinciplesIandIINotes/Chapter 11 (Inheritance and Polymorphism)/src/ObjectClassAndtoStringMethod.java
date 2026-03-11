
public class ObjectClassAndtoStringMethod {
	/**Every java class is descendant of the java.lang.Object class	*/
	
	//If no inheritance is specified when a class is defined, the superclass of the class is object by default:
	/*
		public class ClassName{
		
		}
		* Extends object is omitted in this code
	
	
		public class ClassName extends Object{
		
		}
		* Extends object is explicitly used in this code
	*/
	
	/**Classes such as String, StringBuilder, Loan, and GeometryObject (SubAndSuperClassEx package) are implicitly subclasses
		of Object (as are all the main classes).		
	*/
	
	//toString() method:
	//		public String toString()
	
	/**Invoking the toString() method returns a string that describes the object: by Default, returns string consisting of class name
		of which the object is by an instance, an at sign (@), and the object's memory address in hexadecimal	
	*/
	
	//Example for an array of String class
	public static void ReturnToString() {
		String stringExample[] = new String[5];
		System.out.println(stringExample);		//Prints out [Ljava.lang.String;@4517d9a3
		System.out.println(stringExample.toString());		//Prints out [Ljava.lang.String;@4517d9a3
	}
	/** If x is a reference to an object, the statement *System.out.println(x) is the same as *System.out.println(x.toString())
	*/
	
	public static void main(String[] args) {
		ReturnToString();
		ToStringEx b = new ToStringEx();
		System.out.println(b.toString());	//**The toString() method is not defined, so it will print ToStringEx@2f92e0f4
		
		Building build = new Building(10, 20, 30);
		System.out.println("\n" + build.toString() + "\n");
		
		//Last example (bottom)
		Object a1 = new Aclass();
	    Object a2 = new Object();
	    System.out.println(a1);	//Prints the toString() method in the Aclass class is invoked
	    System.out.println(a2);	//Prints the toString() method in the Object class is invoked
	}
}

class ToStringEx{
	public ToStringEx() {
		
	}
}


//Example: inheriting Object class
class Building extends Object{		/**Could also be rewritten as just class Building*/
	private double length, width, height;

	public Building(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

	@Override
	public String toString() {
		//The super.toString() prints the Object name (but not Object, rather, it prints Building)
		return super.toString() + ("\nlength: " + length + "\nwidth: " + width + "\nheight: " + height);
	}
}

class Aclass {
	int x;

	@Override
	public String toString() {
		return "A's x is " + x;
	}
}
