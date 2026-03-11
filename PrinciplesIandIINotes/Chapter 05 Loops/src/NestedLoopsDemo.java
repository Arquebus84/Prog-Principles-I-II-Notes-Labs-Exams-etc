
public class NestedLoopsDemo {
	public static void main(String[] args) {
		
		//Create a right grid pattern:
		//5x5 square:
		for(int i = 1; i <= 5; i++) { //Affects vertical columns*
			for(int j = 1; j <= 5; j++) { //Affects horizontal rows*
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Triangles
		//Decreasing right triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Inverse decreasing right triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 * 	Second Inverse decreasing right triangle
		 * for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 */
						
		//Increasing right triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Inverse increasing right triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
		//Isosceles triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
