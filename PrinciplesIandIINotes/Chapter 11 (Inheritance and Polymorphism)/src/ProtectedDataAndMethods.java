
public class ProtectedDataAndMethods {
	//A protected member of a class can be accessed from a subclass
	
	//**Private members can only be accessed from inside of the class, and Public members can be accessed from any other classes
	
	//It's desirable to allow subclasses to access data fields or methods defined in superclass, but not to allow nonsubclasses
	//	in different packages to access these data fields and methods
	
	//Protected: Modifier that can be used in the class in which it's declared or any subclass derived from that class:
	//				**Allows you to access protected data fields or methods in the superclass from the subclass
	
	
	/**			Visibility/Accessibility modifiers

						-- Visibility Increases -->
			Private, Default (no modifier), Protected, Public	
	 */
	
	//Table
	/**Modifier			Accessed from		Accessed from		Accessed from subclass			Accessed from 
	 * 					same class			same package		in different package			different package
	 * 
	 * Public:				True				True					True						True
	 * 
	 * Protected:			True				True					True						False
	 * 
	 * Default:				True				True					False						False
	 * 
	 * Private:				True				False					False						False
	 * 
	 */
	
	//Table visualized (**NOTE: C1 extends to C3 and C4)
	/**
	 package p1;	⬐---------------------------------------------------------------↰
	 				↓																|
	 	public class C1{				public class C2{				public class C3 extends C1{
	 		public int x					C1 obj = new C1();				//can access x;
	 		protected int y;				//can access obj.x;				//can access y;
	 		int z;							//can access obj.y;				//can access z;
	 		private int u;					//can access obj.z;				//cannot access u;
	 										//cannot access obj.u;			
	 										
	 		protected void m(){}			//can invoke obj.m();			//can invoke m();
	 	}								}								}
	 				↑
	 package p2;	|
	 	public class C4 extends C1{						public class C5{
	 		//can access x;									C1 c = new C1();	//**Can only access one of the parameters in a different package
	 		//can access y;									//can access c.x;
	 		//cannot access z;								//cannot access c.y;
	 		//cannot access u;								//cannot access c.z;
	 														//cannot access c.u;
	 		//can invoke m();								
	 														//cannot invoke m();
	 	}												}
	 */
	
	
	//Examples:
	//A particular member variable be accessible only by subclasses of this class and classes in the same package: protected
	
	//The color data field can be accessed by classes that extend Cursor without having to use a public getter: protected
	//The moveTo method can be used only by classes that extend Cursor and classes in the same package: protected
	
	public static void main(String[] args) {
		ClassB b = new ClassB();	//Object Class B contains i, j, k, m
		
		ClassA a = new ClassA();	//Can access j
		
		a.getClass();
		b.getClass();
	}
	
}

class ClassA {
	private int i;
	protected int j;
	
	public int getI(){
		return i;
	}
}

class ClassB extends ClassA { //Object Class B contains i, j, k, m
	private int k;
	protected int m;
	
	//Instance Method	
	public int getK(){
		return k;
	}
}
