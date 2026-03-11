import java.util.Scanner;
public class ClassExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Toy buildBlocks = new Toy();
		System.out.println("Enter an integer for how many toys you want: ");
		int numToys = input.nextInt();
		
		/*int sum = 0;
		int userInput = 1; */
		
		System.out.println("Give the toy a name: ");
		String name = input.next();
			
		System.out.println("Give the toy a color: ");
		String color = input.next();
			
		//name = "buildBlocks";
		/*Toy name1 = new Toy();
		userInput++;*/
		
		if(numToys <= 1) {
			System.out.println("You want " + numToys +  " toy. You named it " + name + " and you want it to be colored " + color + " .");
		}else if (numToys > 1) {
			System.out.println("You want " + numToys +  " toys. You named it " + name + " and you want it to be colored " + color + " ."); 	
		}
			
		
	}
}
