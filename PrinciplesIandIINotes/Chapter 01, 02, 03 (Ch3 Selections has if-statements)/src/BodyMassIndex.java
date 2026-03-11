import java.util.Scanner;
public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//BMI is calculated by taking your weight in kilograms and dividing it by the square of your height in meters
		//BMI < 18.5 (underweight); BMI < 25 (normal); BMI < 30 (overweight); BMI >= 30 (obese)
		//lb to kg (1lb ~ 0.45359237kg); in to meter (1in ~ 0.0254m) Set both of these as constants
		final double METERS_PER_INCH = 0.0254;
		final double KILOGRAM_PER_POUNDS = 0.45359237;
		
		//User enters weight in pounds and their height in inches.
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter your heigh in inches: ");
		double height = input.nextDouble();

		double weightInKilograms = height * KILOGRAM_PER_POUNDS;
		double heightInMeters = height * METERS_PER_INCH;
		
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		System.out.println("BMI is " + bmi);
		
		if(bmi < 18.5)
			System.out.println("BMI < 18.5 (underweight)");
		else if(bmi < 25)
			System.out.println("18.5 <= BMI < 25 (normal)");
		else if(bmi < 30)
			System.out.println("25 <= BMI < 30 (overweight)");
		else
			System.out.println("BMI > 30 (obese)");
	}
}
