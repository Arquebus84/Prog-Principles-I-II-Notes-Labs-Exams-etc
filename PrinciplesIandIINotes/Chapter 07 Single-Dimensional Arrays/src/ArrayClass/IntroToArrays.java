package ArrayClass;

public class IntroToArrays {

	public static void main(String[] args) {
	/* Activity 1
			- int array named x with a size of 5
			- double array named y with a size of 10
			- boolean array named verify with a size of 20
			- string array name roster with a size of 30
		*/
		//datatype[] arrayRefVar = new datatype[arraySize]		
		int[] x = new int[5];		
		
		double[] y = new double[10];
		
		boolean[] verify = new boolean[20];
		
		String[] roster = new String[30];
		
		
	/* Activity 2
		 Print the length of the above arrays 
	*/
		// arrayRefVar.length
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(verify.length);
		System.out.println(roster.length);
						
		
	/*Activity 3
		Initialize array x with these int values, (4, 12, 7, 54, 25).
		Declare, Create Initialize xPrime using shorthand with the first 5 prime numbers. 
		Shorthand color to be size of 5 with these colors (red, yellow, blue, green, orange).
	 	*/
		
		//Initialize x
		x[0] = 4; 
		x[1] = 12;
		x[2] = 7;
		x[3] = 54;
		x[4] = 25;
		
		//Declare, Create Initialize xPrime using shorthand with the first 5 prime numbers
		int xPrime[] = {2, 3, 5, 7, 11};
		xPrime[2] = 13;
		
		//color
		String color[] = {"red", "yellow", "blue", "green", "orange"};
		color[3] = "purple";
		
	/*Activity 4
		Write a for loop that iterates through array x and find the sum of the array
	 */		
		// For loop
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
		
		//Find the largest element in the array x:
		int max = x[0];
		for(int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("The largest value in list x is " + max);
		
		//Enhanced for-loop (foreach-loop):
		for(int z: x) {
			z = 2;
			x[0] = z;
		}
		System.out.println("The first element in x is now " + x[0]);
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		double myList[] = new double[5];
		System.out.print("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		}
		System.out.println("Your list is: ");
		for(int j = 0; j < myList.length; j++) {
			System.out.print(myList[j] + " ");
		}
		
		
		
		//Close scanner
		input.close();
	}

}