//import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListVsArray {
	/**
		Operation:									Array:										ArrayList:
	*Creating an array/ArrayList		String[] array = new String[10];			ArrayList<String> list = new ArrayList<>();
	*Accessing an element						array[index];								list.get(index);
	*Updating an element						array[index] = "London";					list.set(index, "London");
	*Returning size								array.length;								list.size();
	*Adding new element																		list.add("London");
	*Inserting new element																	list.add(index, "London");
	*Removing an element																	list.remove(index);
	*Removing an element																	list.remove(Object);
	*Removing all element																	list.clear();
	
	*/
	//Once an array is created, it's size is fixed. When an ArrayList is created, its size is 0.
	
	/***Note: can utilize the java.util.Arrays.sort(array) method to sort an array.

	 ***NOTE: To sort an ArrayList, use the java.util.Collections.sort(arrayList) method
	 */
	
	
	//Example:
	public static void main(String[] args) {
		//Sorting example
		java.util.Random rand = new java.util.Random();
		
		//ArrayList<int>		//Cannot be done b/c its primitive data type and not object
		
		ArrayList<Integer> sortThis = new ArrayList<>();
		//Adding an element into the array
		for(int i = 0; i < 10; i++) {
			sortThis.add(rand.nextInt(10));
		}
		System.out.println(sortThis);
		java.util.Collections.sort(sortThis);	//Sorting ArrayList
		System.out.println(sortThis);	
		
		//Regular Array
		int[] sortRegular = new int[10];
		for(int i = 0; i < sortRegular.length; i++) {
			sortRegular[i] = rand.nextInt(10);
		}
		for(int i = 0; i < sortRegular.length; i++)
			System.out.print(sortRegular[i] + " ");
		System.out.print("\n" + java.util.Arrays.toString(sortRegular) + "\n");
		
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("red");
		colors.add("green");
		System.out.println("\n" + colors);
		colors.remove("red");
		System.out.println(colors);
		
		//User input test with ArrayList
		/*
	    ArrayList<Integer> list = new ArrayList<>();	    
	    Scanner input = new Scanner(System.in);   
	    System.out.println("Enter integers (input ends with 0): ");
	    int value;
	    
	    do {
	      value = input.nextInt(); // Read a value from the input
	      
	      if (!list.contains(value) && value != 0) 
	        list.add(value); // Add the value if it is not in the list
	    } while (value != 0);

	    // Display the distinct numbers
	    System.out.print("The distinct integers are: ");
	    for (int i = 0; i < list.size(); i++) 
	      System.out.print(list.get(i) + " ");
	    
	    input.close();
	    */
	 }
}
