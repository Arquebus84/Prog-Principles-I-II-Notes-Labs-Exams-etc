
public class OverridingVsOverloading {
	
	//Overridden methods are in different classes related by inheritance; overloaded methods can be either in the same class, or
	//	in different classes related by inheritance
	
	//Overridden methods have the same signature; overloaded methods have the same name but different parameter list
	
	
	//**CANNOT override static methods (override a method with the same signature), but can overload static methods
	//	(provide the same name, but different method signature)
	
	/**To avoid mistakes, use a special Java syntax, called override notation (@Override), and place it before the overriding method
			in the subclass:
			
	public class Circle extends GeometryObject{
		//Other methods and parameters
	
		@Override
		public String toString(){
			return return super.toString() + "/nRadius: " + getRadius();
		}
	}
	*/
	
	//**The @Override annotation forces the compiler to check the signature of the overridden method to ensure that the method 
	//	is defined correctly.
}
