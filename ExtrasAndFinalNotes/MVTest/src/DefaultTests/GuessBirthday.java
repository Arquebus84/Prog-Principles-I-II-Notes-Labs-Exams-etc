package DefaultTests;
import java.util.Scanner;

public class GuessBirthday {
	//5 sets, if the user answers yes to any one of the sets, their birth day increments by 2^n from 0-4 (1-5)
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int[] set1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };
		int[] set2 = { 2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31 };
		int[] set3 = { 4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31 };
		int[] set4 = { 8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31 };
		int[] set5 = { 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
		

		displayNumbers(set1);
		int answer;
		int day = 0;
		int n = 1;
		System.out.print("\nIs your birthday in set " + n + "? (Enter 1 for Yes or 0 for No): ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 1;
		}
		n++;
		
		displayNumbers(set2);
		System.out.print("\nIs your birthday in set " + n + "? (Enter 1 for Yes or 0 for No): ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 2;
		}
		n++;
		
		displayNumbers(set3);
		System.out.print("\nIs your birthday in set " + n + "? (Enter 1 for Yes or 0 for No): ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 4;
		}
		n++;
		
		displayNumbers(set4);
		System.out.print("\nIs your birthday in set " + n + "? (Enter 1 for Yes or 0 for No): ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 8;
		}
		n++;
		
		displayNumbers(set5);
		System.out.print("\nIs your birthday in set " + n + "? (Enter 1 for Yes or 0 for No): ");
		answer = input.nextInt();
		
		if(answer == 1) {
			day += 16;
		}
		n++;
		
		System.out.println("Your birthday is on the " + day);
		
	}
	
	
	public static void displayNumbers(int[] set) {
		
		for(int i = 0; i < set.length; i++) {
			if((i + 1) % 4 == 0) {
				System.out.printf("%2d \n", set[i]);
			}else {
				System.out.printf("%2d ", set[i]);
			}
		}
	}
}
