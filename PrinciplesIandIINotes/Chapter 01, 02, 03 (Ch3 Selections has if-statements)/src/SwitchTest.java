import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		/*
		System.out.print("Type any number from 1 to 10: ");
		int x = input.nextInt();
		
		//Switch statement with arrow (no need for break)
		switch(x) {
			case 1 -> System.out.println("It is one");
			case 3 -> System.out.println("It is three");
			default -> System.out.println("Neither one or three");
		}
		
		//Switch statement with break needed
		switch(x) {
			case 1: System.out.println("And it exists");
				break;
			case 2: System.out.println("2");
			case 3: System.out.println("3");
			case 4: System.out.println("4");
			case 5: System.out.println("5");
			case 6: System.out.println("6");
			case 7: System.out.println("7");
			case 8: System.out.println("8");
			case 9: System.out.println("9");
			case 10: System.out.println("10\n"); break;
		}
		
		//switch with for loop
		int n;		
		for(n = 4; n > 0; n--);
		//In this case it works if the switch is backwards
		switch(n){
			case 0: System.out.println("Here she is");
			case 1: System.out.println("Here she was");
			case 2: System.out.println("Here she goes");
			case 3: System.out.println("Here she drowns");
			case 4: System.out.println("Here she dies");
		}
		
		//This one only prints case 0
		switch(n){
		case 4: System.out.println("Here she is");
		case 3: System.out.println("Here she was");
		case 2: System.out.println("Here she goes");
		case 1: System.out.println("Here she drowns");
		case 0: System.out.println("Here she dies");
		}
		*/
		
		System.out.println("Write your first Name: ");
		String name = input.next();
		
		switch(name) {
			case "Matteo": System.out.println("Hey, no way! That's also my name.\n"); break;
			case "matteo": System.out.println("Hey, no way! That's also my name.\n"); break;
			case "Matt": System.out.println("Hey, no way! That's also my name.\n"); break;
			case "matt": System.out.println("Hey, no way! That's also my name.\n"); break;
			default: System.out.println();
		}
		
		System.out.println("Nice to meet you, " + name);
		
		input.close();
	}

}
