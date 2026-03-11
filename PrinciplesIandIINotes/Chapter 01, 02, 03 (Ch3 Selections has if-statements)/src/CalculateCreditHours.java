import java.util.Scanner;

public class CalculateCreditHours {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//User Variables
		int currentCreditHours;
		int degreeCreditHours;		
		
		String[] sentences = {"Hello.", "I am down here."};
		
		for(int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
		}
		
		//User Input
		System.out.println("Type the number of credit hours that you currently have accumulated:");
		currentCreditHours = input.nextInt();
		
		System.out.println("Type the number of credit hours that your degree requires:");
		degreeCreditHours = input.nextInt();
		
		//Calculated Variables
		double remainingCreditHours = (degreeCreditHours - currentCreditHours);
		double creditHrs1Semester = remainingCreditHours / 15;
		double creditHrs2Semesters = remainingCreditHours / (15 * 2);
		double creditHrs3Semesters = remainingCreditHours / (15 * 3);
		//Time
		long currentYears = (int) (remainingCreditHours % 15);
		long totalSemesters = (int) (remainingCreditHours % (15 * 2));
		long remainingSemesters = totalSemesters / 15;
		long totalCreditHrs = (int) (totalSemesters % 15);
		
		//Display Output
		System.out.println("You have " + currentCreditHours + " credit hour(s).");
		System.out.println("Your degree requires " + degreeCreditHours + " credit hour(s).");
		System.out.println("You have " + (int) remainingCreditHours + " credit hour(s) until graduation.");
		System.out.println("You have " + (creditHrs1Semester) + " semester(s) (@ 15 credit hours/semester) left until graduation.");
		System.out.println("You have " + (creditHrs2Semesters) + " year(s) (@ 2 semesters/year) left until graduation.");
		System.out.println("You have " + (creditHrs3Semesters) + " year(s) (@ 3 semesters/year) left until graduation.");
		System.out.println("You have " + currentYears + " year(s), " + remainingSemesters + " semester(s), and " + totalCreditHrs + " credit hour(s) (2 semesters/year) until graduation.");
	
		input.close();
	}
}
