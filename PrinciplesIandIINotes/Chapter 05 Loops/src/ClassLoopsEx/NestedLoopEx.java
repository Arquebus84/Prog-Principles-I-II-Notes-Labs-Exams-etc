package ClassLoopsEx;

public class NestedLoopEx {

	public static void main(String[] args) {
		//Use counter to debug the code
		int counter = 0;
		//Outer loop
		for(int i = 0; i < 3; i++) {
			//Inner loop
			for(int j = 0; j < 5; j++) {
				System.out.printf("%d, %d%n", i, j);
				//Toggle the counter as a debug by double-clicking the line on the left (should be a blue dot)
				counter++;
			}
			//This is for inner loop
			System.out.println();
		}/*
		
		//Multiplication Table
		System.out.print("    ");
		for(int j = 1; j <= 10; j++) {
			System.out.print("   " + j);
		}
		
		System.out.println("\n-----------------------------------------");
		for(int i = 1; i <= 10; i++) {
			//Print row and vertical bars
			System.out.print(i + " | ");
			for(int j = 1; j <= 10; j++) {
				//Display product
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}*/
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		//The top nested loop is the same as:
		int i = 0;
		while(i < 5) {
			i++;
			int j = 0;
			while(j < i) {
				j++;
				System.out.print("  ");
			}
			int k = i;
			while(k <= 5) {
				k++;
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
