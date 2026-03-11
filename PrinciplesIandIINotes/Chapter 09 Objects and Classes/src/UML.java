
public class UML {
	//Unified Modeling Language: *Note: the static members of the class Circle should be indicated with an underline
	// it would look like:
	//			+getNumOfObjects(): int
	//			-----------------------
	/**Generalization (+, -, #): These typically denote visibility modifiers (public +, private -, protected #)*/
	
	//Modifiers are implied using +/-, in this case, public is + and private is -
			
	/**
			Circle
		-radius: double
		-numberOfObjects: int				(static)
		+Circle()
		+Circle(radius: double)
		+getRadius(): double
		+setRadius(radius: double): void
		+getNumberOfObjects(): int			(static)
		+getArea(): double
	 */
	
	/**
			SuperClass◁_________________SubClass	 Straight line indicates extends from SuperClass (could be abstract) 
			
			<<interface>>◁--------------Class	dashed line indicates implements interface
			
	 */	
	
	//abstract classes and modifiers are denoted in italics (cannot show here)
	/**
			GeometricObject				(abstract is italicized)
		-color: String
		-filled: boolean
		-dateCreated: java.util.Date
		#GeometricObject()
		#GeometricObject(color: string, filled: boolean)
		+getColor(): String
		+setColor(color: String): void
		+isFilled(): boolean
		+setFilled(filled: boolean): void
		+getDateCreated(): java.util.Date
		+toString(): String
		
		+getArea(): double				(abstract)
		+getPerimeter(): double			(abstract)
	 */
	
	//interface	is also italicized, but unlike the abstract class, when implementing interfaces, 
	//	you indicate it with dashed lines and hollow triangles
	/**
		<<interface>>
			Edible
		+howToEat(): String

	 */
	
}
