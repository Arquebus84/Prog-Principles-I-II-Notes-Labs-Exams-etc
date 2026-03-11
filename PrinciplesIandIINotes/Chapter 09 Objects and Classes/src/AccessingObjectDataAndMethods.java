
public class AccessingObjectDataAndMethods {

	//In OOP terminology, an object's 'member' refers to its data fields an methods. After an object is created, its data can be accessed and its methods
	//	can be invoked using the dot operator (.), also known as the object member access operator.
	
	//	Dot Operator: Used to access members of an object. If the member is static, it can be accessed through the class name using the dot operator:
	//		* objectRefVar.dataField			//references the data field in the object
	//		* objectRefVar.method(arguments)	//invokes a method on the object

	
	//Ex: 	myCircle.radius 	//References the radius (if the radius is not private)
	
	/**	The data field, radius, is referred to as an instance variable because it's dependent on a specific instance. Similarly, the getArea() method
	 		is referred to as an instance method, b/c you can invoke it only on a specific instance.
	*/
	//Instance variable: a non-static data member of a class. An instance variable belongs to the instance of the class
	//Instance method: a method that must be invoked from a specific object. 
	//		*Example: The Getter methods are used to define the behavior of an object
	
	/**The object on which an instance method is invoked is called a calling object*/
	
	/**Anonymous Object: an object that is created without being explicitly assigned a name; for example: 	*/
	//	new Circle();		or			System.out.println("The circle's area is " + new Circle(5).getArea());
	
	
	//Can you invoke Circle.getArea() like Math.toRadians(45)? The answer is no b/c the Math class has static methods, and getArea() is an instance method,
	//	therefore, it's non-static
	
	
	//Ex1: Declare a reference variable controller and initializes it to an instance of IrrigationController. Then, set its number of faucets to 4, and 
	//	its water storage to 100.50 liters. It has an int variable numberOfFaucets and a double variable waterStorage:
	
	/*
		IrrigationController controller = new IrrigationController();
		controller.numberOfFaucets = 4; 
		controller.waterStorage = 100.50;
	*/
	
	
	//Ex2: There is a fertilizerLogger object which can invoke a method called endDay (takes two arguments: a boolean argument that shows if the field was 
	//		fertilized, and an int argument that counts the days since the last fertilization). Returns true if you should not fertilize (or already did), 
	//		allowing the day to end. But if the garden needs fertilization and it has not been done, the method will return false:
	
	/*
	//Assume fertilizerLogger already declared and created Scanner input = new
	Scanner(System.in);
	
	boolean didFertilize; 
	int lastFertilization;
	
	while (true) { 
		didFertilize = input.nextBoolean(); 
		lastFertilization = input.nextInt(); 
		if (fertilizerLogger.endDay(didFertilize, lastFertilization)) { 
			System.out.println("Day Ended."); break; 
		} else {
			System.out.println("Fertilization Needed."); 
		}
	}
	 */
}
