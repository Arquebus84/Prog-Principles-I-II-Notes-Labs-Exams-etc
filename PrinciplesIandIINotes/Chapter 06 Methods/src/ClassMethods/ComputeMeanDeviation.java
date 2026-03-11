package ClassMethods;

public class ComputeMeanDeviation {

	public static void main(String[] args) {
		//Mean: m = (sum from i = 1 to n times xi) / n
		//Standard Deviation: std = sqrt{((sum from i = 1 to n times xi^2) - m)/ n-1}
		//***Square sum is (sum from i = 1 to n times xi^2)
		
		double count = 10;
		double sum = 0;
		double squareSum = 0;
		int number = 0;
		
		for(int i = 0; i < count; i++) {
			number = (int)(Math.random() * 1000);
			sum += number;
			
			squareSum += Math.pow(number, 2);
		}
		
		double mean = sum/count;
		
		double deviation = Math.sqrt((squareSum = (sum * sum) / count)/(count - 1));
		
		System.out.printf("The mean of 10 random numbers is %.4f%nThe standard deviation of these numbers is %.4f", mean, deviation);

	}

}
