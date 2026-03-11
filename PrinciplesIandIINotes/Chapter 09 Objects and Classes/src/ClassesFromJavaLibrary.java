import java.util.Date;
import java.util.Random;
//import java.awt.geom.Point2D;
//import javafx.geometry.Point2D;

public class ClassesFromJavaLibrary {

	
	//Date class
	
	//Instead of using the System.currentTimeMillis(), which used the divisor and moduli operators to obtain the current time, you could use the Date
	//	class; which is an independent system for encapsulating date and time in java.util.Date.
	
	/*
					java.util.Date
		+Date()
		+Date(elapseTime: long)
		+toString(): String
		+getTime(): long
		+setTime(elapseTime: long): void
	*/
	
	//Can use the no-arg constructor for Date class to create an instance for the current date and time, the getTime() method to return the current time
	//	since Jan 1, 1970, GMT, and toString() method to return the date and time as a string.
	
	public static void displayTime() {
		Date date = new Date();		//Could also not import and just write: java.util.Date date = new java.util.Date();
		
		System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
		System.out.println("The current time is " + date.toString() + ". ");
				
	}	
	
	//Random class	
	/*
					java.util.Random
		+Random()
		+Random(seed: long)
		+nextInt(): int
		+nextInt(n: int): int		//If n = 2, generates random number between 0 and 1
		+nextLong(): long
		+nextDouble(): double
		+nextFloat(): float
		+nextBoolean(): boolean
	*/
	
	//In this case, two random numbers with the same seed do not result in the same number
	public static void displayRandom() {
		
		//Both random and random2 have a default seed, but if they had the same seed, it would be the same random number
		Random random = new Random();
		Random random2 = new Random();		
		int a = random.nextInt(), b = random2.nextInt();	//random.nextInt() returns a random int value from the object (random)
		System.out.println("Int 1 is " + a + "\nInt 2 is " + b);
		
		//Here, the two random integers have the same seed
		// Create a Random object with seed 3
	    java.util.Random generator1 = new java.util.Random(3);
	    System.out.print("From generator1: ");
	    for (int i = 0; i < 10; i++)
	      System.out.print(generator1.nextInt(1000) + " ");
	  
	    java.util.Random generator2 = new java.util.Random(3);
	    System.out.print("\nFrom generator2: ");
	    for (int i = 0; i < 10; i++)
	      System.out.print((i < 9)? generator2.nextInt(1000) + " " : generator2.nextInt(1000) + "\n");
	    
	    /**Display Random integer from 0 to 1 (2 numbers total)*/
	    java.util.Random clamp01 = new java.util.Random();
	    for(int i = 0; i < 10; i++)
	    	System.out.print((i < 9)? clamp01.nextInt(2) + " " : clamp01.nextInt(2) + "\n");
	    
	    /**Display Random integer from -1 to 1 (3 numbers total)*/
	    java.util.Random clampN1P1 = new java.util.Random();
	    for(int i = 0; i < 10; i++)
	    	System.out.print((i < 9)? (clampN1P1.nextInt(3) - 1) + " " : (clampN1P1.nextInt(3) - 1) + "\n");
	}	
	
	/*		Key Concepts for the Random Class:
		* The nextInt() method in the Random class returns the next random int value.
		* If two Random objects have the same seed, the sequence of the random numbers obtained from these two objects are identical.
		* The nextDouble() method in the Random class returns the next random double value.
		* When creating a Random object, you have to specify the seed or use the default seed.
	*/
	
	/**Could also generate random numbers using the java.security.SecureRandom class; the numbers are non-deterministic and secure*/
	
	
	//Point2D class ***Ask instructor about this problem
	
	/**The Point2D class is in the javafx.geometry package. You can use it by writing import javafx.geometry.Point2D at the top window */
	
	/*
					javafx.geometry.Point2D
		+Point2D(x: double, y: double)			//Constructs a new Point2D object with specific points at x and y (ex: Point2D p1 = new Point2D(x, y))
		+distance(x: double, y: double): double	//Returns the distance between this point (p1) and the specified x and y coordinates (ex: p1.distance(x, y))
		+distance(p: Point2D): double			//Returns the distance between this point (p1) and the other point (ex: p1.distance(p2))
		+getX(): double							//Returns x-coordinate at the point (ex: p1.getX())
		+getY(): double							//Returns y-coordinate at the point (ex: p1.getY())
		+midpoint(p: Point2D): Point2D			//Returns the midpoint between this point and the other point (ex: p1.midpoint(p2))
		+toString(): String	
	*/
		
	double x1 = 25.3;
	double y1 = 34.6;
	double x2 = 55.4;
	double y2 = 87.0;
	
	//Point2D p1 = new Point2D(x1, y1);
	//Point2D p2 = new Point2D(x2, y2);
	
	//p1.distance(p2);
	
	
	
	//Display all three classes
	public static void main(String[] args) {
		displayTime();
		displayRandom();
	}
	
}
