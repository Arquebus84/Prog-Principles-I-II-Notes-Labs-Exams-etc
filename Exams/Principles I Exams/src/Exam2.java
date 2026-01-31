import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		/*int value = 2;
		int result = 0;
		switch(value) {
			case 1:
				result = 10; break;
			case 2:
			case 3:
				result = 20; break;
			case 4:
				result = 40; break;
			default:
				result = 50; break;
		}
		System.out.println(result);*/
		
		/*int i = 81;
		do {
			if(i % 2 == 1 && i != 73) {
				System.out.printf("%d ", i);
			}
			i--;
		}while(i >= 70);
		
		System.out.println();
		
		for(int a = 81; a >= 70; a--) {
			if(a % 2 == 1 && a != 73) {
				System.out.printf("%d ", a);
			}
		}
			
		System.out.println();
		
		int j = 81;
		while(j >= 70) {
			if(j % 2 == 1 && j != 73) {
				System.out.printf("%d", j);
			}
			j--;
		}
		System.out.println();*/
		
		int intValue = 12;
		int outputValue = (intValue >= 0)? 100 : -50;
		System.out.println(outputValue + "\n");
		
		for(int i = 3; i >= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		
		int k = 1;
		boolean isDone = false;
		
		while(k < 100 && !isDone) {
			System.out.print(k + " ");
			if(k % 5 == 0) {
				isDone = true;
			}
			k += 3;
		}
		
		Scanner input = new Scanner(System.in);
		
		int odds = 0;
		int evens = 0;
		int value = 0;
		System.out.println("Enter any whole numbers (stop at 999): ");		
		
		while(value != 999) {						
			value = input.nextInt();
			
			if(value % 2 == 0) {
				evens++;
			}else if(value == 999) {
				continue;
			}else{
				odds++;
			}
		}
		
		System.out.println("There were " + odds + " odd numbers and " + evens + " even numbers entered.");
		
		input.close();
				
		/*double sum = 0;
		System.out.println("Enter five floating-point numbers: ");
		
		int count = 0;
		while(count < 5) {
			double value = input.nextDouble();
			count++;
			
			sum += value;
		}
		
		System.out.printf("The average is %.4f", sum / count);*/
		
		
	}
	
}
