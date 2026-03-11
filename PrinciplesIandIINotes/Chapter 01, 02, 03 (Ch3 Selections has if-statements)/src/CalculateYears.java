import java.util.Scanner;
public class CalculateYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number of months bigger than 12: ");
		int month = input.nextInt();
				
		int years = month / 12;
		int remainderMonths = month % 12;
		int decade = month / 120;
		double yDecade = years / 10;
		int remainderYears = years % 10;
		
		System.out.println(month + " months gives us " + years + " years and " + remainderMonths + " months.");
		System.out.println("The number of decades is: " + decade + " and " + remainderYears + " years remaining.");
		System.out.println("The number of decades (divided by years) is: " + yDecade);
	}
}
