package ArrayExamples;

public class AnalyzeNumbers {
	//Program starts in main method
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Shifting numbers
		//Method 1
		double list[] = {1, 2, 3, 4, 5, 6}; //From 0 to 5
		for(int i = list.length - 1; i > 0; i--) {
			//Generate index j randomly from 0 to 5
			int j = (int)(Math.random() * (i + 1));
			
			//Swap list[i] with list[k]
			double temp = list[i];
			list[i] = list[j];
			list[j] = temp;			
			System.out.print(temp + " ");
		}
		System.out.println();
		
		//Method 2 prints out 6 of the numbers in the list
		for(int i = 0; i < list.length; i++) {
			int p = (int)(Math.random() * list.length);
			
			//Switch the numbers
			double temp = list[i];
			list[i] = list[p];
			list[p] = temp;
			
			System.out.print(temp + " ");
		}
		
		System.out.println();
		//An array is prompted to be given an element size:
		System.out.print("Enter the numnber of items: ");
		int n = input.nextInt();
		double numbers[] = new double[n];
		
		double sum = 0;
		//Prompt user to enter the numbers in the array list
		System.out.print("Enter the numbers: ");
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		//Calculate the average
		double avg = sum / n;
		
		//The number of elements above the average
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(numbers[i] > avg) {
				count++;
			}
		}
		
		System.out.println("The average is " + avg);
		System.out.println("The number of elements above the average is " + count);

		
		//Close scanner
		input.close();
	}

}
