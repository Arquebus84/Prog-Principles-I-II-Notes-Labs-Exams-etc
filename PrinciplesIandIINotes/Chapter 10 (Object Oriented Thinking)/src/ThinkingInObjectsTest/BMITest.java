package ThinkingInObjectsTest;

public class BMITest {

	/**The BMI class is immutable: its instance data fields cannot be altered
	*/
	
	
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Person 1", 18, 145, 70);
		
		System.out.println("The Body-Mass-Index of " + bmi1.getName() + " of age " + bmi1.getAge() + ", is " + bmi1.getBMI() + " " + bmi1.getStatus());
	}

}
