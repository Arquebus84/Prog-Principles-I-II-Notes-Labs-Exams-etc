
public class MathTrigDemo {
	public static void main(String[] args) {
		//Math.sin(radians) or Math.cos(radians) or Math.tan(radians) returns a sin/cos/tan value in radians.
		//Math.toRadians(degrees) or Math.toDegrees(radians) returns a converted value from degrees to radians or radians to degrees
		//Math.asin(radian) or Math.acos(radian) or Math.atan(radian) returns the inverse value of sin/cos/tan in radians
		
		System.out.println((int)(Math.cos(Math.PI * 2))); //cos(pi/2) returns 1.0 by default, but this has int type cast, so it's 1
		double degreeToRad = Math.toRadians(47); //47 degrees in radians is ~ 0.8203... or (pi/180 * 47)
		double toDeg = Math.toDegrees(Math.PI / 2.0); // pi/2 is 90.0 degrees
		double sinInDegrees = Math.sin(Math.toRadians(36.5)); // returns the sine of 36.5 degrees from a degree value
		System.out.println(degreeToRad);
		System.out.println(toDeg);
		System.out.println(sinInDegrees);
	}
}
