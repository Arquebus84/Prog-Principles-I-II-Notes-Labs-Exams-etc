
public class ChallengeMPH {

	public static void main(String[] args) {
		
		double dist = 90;
		double time = 4;
		double speed = calculateMPH(dist, time);
		System.out.println("The speed in MPH for a car traveling a total distance of " + dist + " miles in " + time + " hours is " + speed + " MPH");

		System.out.println((speed < 25)? "Very Slow!" : "Very Fast");
	}
	
	public static double calculateMPH(double dist, double time) {
		//60 miles is 1 min of travel-- 360 miles per hour		
		return (dist / time);
	}

}
