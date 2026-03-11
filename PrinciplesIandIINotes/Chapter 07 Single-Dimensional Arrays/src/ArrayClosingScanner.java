import java.util.Scanner;
public class ArrayClosingScanner {

	public static void main(String[] args) {
		//Scanner declaration
		Scanner input = new Scanner(System.in);
		
		double list[] = new double[5];
		
		for(int i = 0; i < list.length; i++) {
			System.out.print((i + 1) + " out of " + list.length + ": ");
			list[i] = input.nextDouble();
		}
		
		for(int i = 0; i <  list.length; i++) {
			System.out.print((i < list.length - 1)? list[i] + ", " : list[i]);
		}
		
		
		//Close the Scanner in order to prevent a resource leak:
		input.close();
	}

}
