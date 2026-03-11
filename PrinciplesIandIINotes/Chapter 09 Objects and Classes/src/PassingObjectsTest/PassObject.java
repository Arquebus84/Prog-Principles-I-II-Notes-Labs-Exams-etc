package PassingObjectsTest;

/**The value of n is passed to times, and the reference to myCircle is passed to c in the printAreas() method*/

public class PassObject {
	public static void main(String[] args) {
	    // Create a Circle object with radius 1
	    Circle myCircle = new Circle(1); // Circle defined in Listing 9.8

	    // Print areas for radius 1, 2, 3, 4, and 5.
	    int n = 5;
	    printAreas(myCircle, n);

	    // See myCircle.radius and times
	    System.out.println("\n" + "Radius is " + myCircle.getRadius());
	    System.out.println("n is " + n);
	  }

	  /** Print a table of areas for radius */
	  public static void printAreas(Circle c, int times) {
	    System.out.println("Radius\t\tArea");
	    //While times is greater than 1, it will reduce down to 1 and print 5 different areas for the radii 1 to 5 
	    while (times >= 1) {
	      System.out.println(c.getRadius() + "\t\t" + c.getArea());	//getRadius returns the value of the radius depending on the value of times
	      c.setRadius(c.getRadius() + 1);	//The radius will increment by 1 until times is equal to 1
	      times--;
	    }
	  }
}
