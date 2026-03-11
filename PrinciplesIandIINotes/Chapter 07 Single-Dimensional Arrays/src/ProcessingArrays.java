
public class ProcessingArrays {
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in); 
		//When processing array elements, for loops are often used for two reasons:
		//	1) The elements in the array are of the same type; they are evenly processed in the same way through each iteration
		//	2) Since the size of the array is known, it would make sense to use a for loop
				
		//Examples of processing arrays and how useful they are to code:
		
		double myList[] = new double[10]; //Limited to 10 elements in the array
		
			//Initialize arrays with input values
		System.out.print("Enter " + myList.length + " values: ");
		for(int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		}		
		double myList2[] = new double[10];
		
			//Initialize arrays with random values (values between 0.0 and 100.0, but less than 100.0)
		for(int i = 0; i < myList2.length; i++) {
			myList2[i] = Math.random() * 100;
		}
		
			//Displaying arrays: To print an array, you have to print each element in the array using a loop
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.println();
		//For a character type, it could be printed using one statement:
		char city[] = {'D', 'a', 'l', 'l', 'a', 's'};
		System.out.print(city);
		
		//Summing all elements: use variable total to store the sum, initialize it to 0, and add each element in the array list
		double total = 0;
		for(int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("\nSum is " + total);
		
		
		//Finding the largest element: initialize the max to be the first element in the array list, then if the next element is greater than the previous,
		//	change the max to the next element.
		double myNewList[] = {1, 5, 2, 3, 5, 5};
		double max = myNewList[0];
		for(int i = 0; i < myNewList.length; i++) {
			if(max > myNewList[i])
				max = myNewList[i];
			
		}
		
		//Find the smallest index of max element: use the code above, but create a variable named indexOfMax to denote the index value of the max number
		double indexOfMax = 0;
		for(int i = 0; i < myNewList.length; i++) {
			if(max > myNewList[i]) {
				max = myNewList[i];
				indexOfMax = i;
			}
		}
		System.out.println("\nMax index is " + indexOfMax);
		
		//Random Shuffling: In order for this to work, foreach element in the list[i], randomly generate an index j and swap list[i] with list[j]
		double list[] = {1, 2, 3, 4, 5, 6}; //From 0 to 5
		for(int i = list.length - 1; i > 0; i--) {
			//Generate index j randomly from 0 to 5
			int j = (int)(Math.random() * (i + 1));
			
			//Swap list[i] with list[k]
			double temp = list[i];
			list[i] = list[j];
			list[j] = temp;			
		}
		
		
		//Shifting Elements: Sometimes, you need to shift elements left or right. Here is an example of shifting elements one position to the left and filling
		//	the last element with the first element
		double list1[] = {4, 5, 6, 7, 8, 9};
		double temp = list1[0]; //Retain the first element
		//Shift elements left
		for(int i = 1; i < list1.length; i++) {
			list1[i - 1] = list[i];
		}
		//Move first element to last element position
		list1[list1.length - 1] = temp;
		
		
		//Simplifying coding: For example, if you want to obtain a given month by its number
		String months[] = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "Novemeber", "December"};
		System.out.print("Enter a month number (1 to 12): ");
		int monthNum = input.nextInt();
		
		if((monthNum > months.length - 1) || monthNum < 0) {
			System.out.println("Invalid Month Number!");
		}else {
			System.out.println("The month is " + months[monthNum - 1]);
		}
				
		input.close();
	}

}
