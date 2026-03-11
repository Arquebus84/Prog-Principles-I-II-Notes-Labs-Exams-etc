
public class ConstructingObjectsUsingConstructors {
	
	//A constructor is invoked to create an object using a 'new' operator
	//Constructors are a special kind of method that inhibit 3 peculiarities:
	//	* A constructor must have the same name as the class itself
	//	* Constructors do not have a return type-not even a void type
	//	* Constructors are invoked with the 'new' operator when an object is created, and they play a role in initializing objects
	
	//**Like regular methods, constructors can be overloaded* (multiple constructors can have the same name, but different signatures)
	
	/**Parameterized Constructors are the same as Default Constructors*/
	
	//In this case the Circle() is a method, not a constructor:
	//		public void Circle(){
	
	//However, this is a constructor:
	//		public Circle(){ 
	
	/**To construct an object from a class, invoke a constructor of the class using the new operator: 	*/
	//		new ClassName(arguments);
	
	
	/**No Argument Constructors	*/
	
	//For example, 'new Circle()' creates an object of the Circle class using the first constructor defined in the Circle class, 
	//	and 'new Circle(25)' creates an object using the second constructor in the Circle class.
	
	//**In this case, Circle() is a no-argument constructor, b/c it has not arguments in the parenthesis.
	
	/**Default Constructors*/
	//If a class is not defined with any constructors explicitly, a no-argument constructor with an empty body is implicitly defined in the class.
	/**A default constructor is provided only if there are no constructors that were explicit defined in the class*/
	
	//Example 1: Write a no-arg constructor *for the class GardenKey, that prints in each line "Created a new garden key."
	/*
	 	public GardenKey(){
    		System.out.println("Created a new garden key.");
		}
	  
	 */
	
	//Example 2: The class ActivityTracker that has three instance variables: one of type int called steps, another 
	//				of type boolean called isActive, and the last one of type int called goalSteps.
	
	//			Task: Write two constructors for the class ActivityTracker. The first is a no-arg constructor that initializes steps to 0, isActive to false,
	//				and goalSteps to 1000. The second takes  three parameters — an int for steps (newSteps), a boolean for isActive (isItActive), and  
	//				another int for goalSteps (newGoalSteps) — and uses them to initialize the instance variables:	
	/*
		public ActivityTracker(){
			steps = 0;
			isActive = false;
			goalSteps = 1000;
		}
	
		public ActivityTracker(int newSteps, boolean isItActive, int newGoalSteps){
			steps = newSteps;
			isActive = isItActive;
			goalSteps = newGoalSteps;
		}
	*/
	
	//Example 3: Write a constructor for the class Recipe, that takes a reference to an existing Recipe object as a parameter. This constructor should copy the
	//			ingredients and isVegetarian values from the provided object to the new object being created
	/*
		Recipe(Recipe other) { 
			ingredients = new String[other.ingredients.length];
		
			//Write your code to copy the contents of other.ingredients to ingredients
			for(int i = 0; i < ingredients.length; i++){ 
				ingredients[i] = other.ingredients[i]; 
			}
		
			isVegetarian = other.isVegetarian; 
		}
	 */

	
}
