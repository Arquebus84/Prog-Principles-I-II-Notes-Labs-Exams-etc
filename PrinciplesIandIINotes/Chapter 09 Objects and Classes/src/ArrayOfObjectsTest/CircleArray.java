package ArrayOfObjectsTest;

public class CircleArray {

	public static void main(String[] args) {
		//Circle[] circleArray = new Circle[5];	//Create a new array of Circle objects with size 5 (0 - 4)
		
		//Declare circleArray
		Circle[] circleArray;
		
		//Create circleArray
		circleArray = createCircleArray(); 
		
		//print the circleArray and total areas of the circles
		printCircleArray(circleArray);
		
	}
	
	//Create an array of Circle objects (***More specifically, returns an array of reference type Circle)
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];	
		
		for(int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 11);	//The radius will be a random number between 0 and 10
		}
		
		//Return circleArray
		return circleArray;
	}
	
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%18s%20s", "Radius", "Area");
		for(int i = 0; i < circleArray.length; i++) {
			//Print the radius and area of the circle (remember that the radius is private, so use the getRadius method)
			System.out.printf("%n%18.4f %21.4f", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		
		System.out.println("\n\t______________________________________");
		
		System.out.printf("%n\tSum of the areas in the circle array: %.4f", sumOfAreas(circleArray));
		
	}
	
	//Add circle areas
	public static double sumOfAreas(Circle[] circleArray) {
		double sum = 0;
		for(int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}
