
public class ArrayOfObjects {
		
	//An array can hold objects as well as primitive data types 
	
	//Can create an array of objects such as an array of Circle objects:
	/**Circle[] circleArray = new Circle[10];		*/
	
	//To initialize the circleArray, use a for loop:
	/**
		for(int i = 0; i < circleArray.length; i++){
			circleArray[i] = new Circle();
		}
	*/
	
	/**An array of objects is actually an array of reference variables. Thus, invoking the circleArray[1].getArea() involves two levels of referencing:
		circleArray references the entire array, circleArray[1] references a Circle object
	*/	
	
	//In an array of objects, an element of the array contains a reference to an object:
	/*
		circleArray (reference) ----->	(circleArray[0]) ----->	Circle object 0
										(circleArray[1]) -----> Circle object 1
											...
										(circleArray[9]) -----> Circle object 9
	*/
	
	/**NOTE: When an array of objects is created using the 'new' operator, each element in the array is a reference variable 
		with a default value of null
	*/
	
	//Check the CircleArray class in the ArrayOfObjectsTest package
	
	//Example:
	public static void main(String[] args) {
		java.util.Date[] dates = new java.util.Date[10];
		
		System.out.println(dates[0]);
		//System.out.println(dates[0].toString());	//The issue with this code is that the value of dates[0] is null, and there is a
													//	NullPointerException since it invokes a toString() method from a null reference
		
		java.util.Arrays.copyOf(dates, 2);
	}
	
	
	
	
}
