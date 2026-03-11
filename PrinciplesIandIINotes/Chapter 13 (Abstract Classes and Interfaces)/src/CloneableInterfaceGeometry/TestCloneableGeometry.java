package CloneableInterfaceGeometry;

//import AbstractGeometryClass.*;


public class TestCloneableGeometry {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		GeometryObject c2 = (Circle)(c1.clone());
		System.out.println(c1 + "\n" + c2);
		
		
		
		/**NOTES:
		 	* To enable a Circle object to be cloned, Circle class must override the clone() method, and implement java.lang.Cloneable interface
		 	* If GeometryObject implements Cloneable and Circle overrides clone() method, the clone() method will work fine to clone
		 		Circle objects
		 	* Normally, the program will have a COMPILER error b/c the clone() method is protected in the Object class
		 	* After overriding the clone() method, and make it public in the Circle class, the program can compile and run, but 
				y is null if Circle doesn't implement the Cloneable interface
		 */
	}

}
