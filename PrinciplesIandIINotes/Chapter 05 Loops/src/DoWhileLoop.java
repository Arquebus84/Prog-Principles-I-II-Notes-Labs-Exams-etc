import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int count = 0;
		do{
			System.out.println("Welcome to Java");
			count++;
		}while(count < 10); //*In the case of the do-while loop, the semicolon at the end of the while condition is required!
		
		//The do-while loop is similar to the while loop, except it executes the loop body first then checks the loop continuation condition
		//It is a variation of the while loop; here is the syntax:
		/*	
		 * do{
		 * 		//loop body
		 * 		statements;
		 * }while(loop-continuation-condition);
		 */
		
		//Here is the SentinelValue changed with the do-while loop
		/*System.out.println("Enter an integer (the input ends if the integer is 0): ");
		int data = input.nextInt();
		int sum = 0;
				
		do {
			sum += data;
			System.out.println("Enter an integer (the input ends if the integer is 0): ");
			data = input.nextInt();
		}while(data != 0);
		System.out.printf("The sum is %d%n", sum);
		
		//Use a do-while loop if you have statements inside a loop that must be executed at least once, as in the case of the while-loop
		/*int i = 1;
	    do {
	      i += 3;
	    } while (i < 5); //In this example, the loop will run twice ((5 - 1)/3 which is ceiling of 1.33 or 2), and i will become 7
		
	    //Do-while loop to display "Hello, World!" 50 times, with each 11th line displaying "Good-Bye, World!"
	    int step = 0;
	    do 
	    {
	    	step++;
	        System.out.println("Hello, World!");
	    } while (step < 10);
	    System.out.println("Good-bye, World!");
	    do 
	    {
	    	step++;
	        System.out.println("Hello, World!");
	    } while (step < 20);
	    System.out.println("Good-bye, World!");
	    do 
	    {
	    	step++;
	        System.out.println("Hello, World!");
	    } while (step < 30);
	    System.out.println("Good-bye, World!");
	    do 
	    {
	    	step++;
	        System.out.println("Hello, World!");
	    } while (step < 40);
	    System.out.println("Good-bye, World!");
	    do 
	    {
	    	step++;
	        System.out.println("Hello, World!");
	    } while (step < 50);
	    System.out.println("Good-bye, World!");*/
	    
	    long totalElevation = 0;
	    long step = 1;
	    do{	    	
	    	step *= Math.pow(2, step);
	        totalElevation += step * 2;	 
	        step++;
	    }while(step < 50);
	    System.out.println(totalElevation);
		
	    //Difference between Do While and While Loops
	    /*
	    //While and Do-while loop or postincrements
		int e = 0; //While loop
		while(e++ < 10) {
			System.out.println("This is repeated 10 times");
		}
		System.out.println("\n");
		
		int y = 0; //Do while loop
		do {
			System.out.println("This is repeated 11 times");
		}while(y++ < 10);
		System.out.println("\n");
		
		//While and Do-while loop for preincrements
		int x = 0;
		while(++x < 10){
			System.out.println("This is repeated 9 times because x is already set to 1, and it is repeated until it reaches 10; 10-1 = 9");			
		}
		System.out.println("\n");
		
		int a = 0;
		do {
			System.out.println("This is repeated 10 times");
		}while(++a < 10);*/
		
	
	}
}
