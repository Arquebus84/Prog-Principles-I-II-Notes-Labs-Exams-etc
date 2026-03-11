import java.util.Scanner;
public class SubtractionQuiz {
	public static void main(String[] args) {		
		//Loop design strategies: 3 steps
		//1) Identify the statements that need to be repeated
		//2) Wrap these statements in a while-loop:
		//		while(true)
		//			Statements;
		//3) Code the loop-continuation-condition and add appropriate statements for controlling the loop
		//		while(loop-continuation-condition){
		//			Statements;
		//			Additional statements for controlling the loop
		//		}
		
		//*milliseconds to nanoseconds (10^3 to 10^9)
		
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		String output = "";
		
		while(count < NUMBER_OF_QUESTIONS) {
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
			//Swap the two numbers:
			if(num1 < num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			
			System.out.print("What is " + num1 + " - " + num2 + "? ");
			int answer = input.nextInt();
			if(answer == num1 - num2) {
				System.out.println("You are correct!");
				correctCount++;
			}else {
				System.out.println("Inorrect, your should be " + (num1 - num2));
			}
			count++;
			
			output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer)? " correct" : " incorrect");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = (endTime - startTime);
		
		System.out.println("The correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}
}
