import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

public class UsefulMethodsForLists {
	//Java provides methods for creating a list from an array, for sorting a list, and for finding maximum and minimum element
	//	on a list
	
	//Check the Java API to see all the methods
	
	/**Use the static method asList() in Arrays class to return a list that is passed to the ArrayList constructor for creating an ArrayList
	
		Ex: 
		Integer[] array = {2, 5, 8, 11};
		ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(array)); 	 
	 */
	
	/**Use the static method toArray() in Arrays class to create an array of objects from an array list
		
		Ex:
		ArrayList<String> listB = new ArrayList<>();
		String[] array1 = new String[listB.size()];
		listB.toArray(array1);
	*/
	//Invoking listB.toArray(array1) copies the contents from listB to array1.
	//	If the elements in a list are comparable, such as Integer, Double, or String, you can use the static sort() method in the
	//		java.util.Collections
	
	//Could also access the max() and min() methods in the java.util.Collections package
	
	public static void main(String[] args) {
		String[] array = {"red", "green", "blue"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		list.add(0, "red");
		System.out.println(list);
		
		//Double[] array2 = {1, 2, 3};		//Incorrect: casts the array to an Integer
		Double[] array2 = {1.0, 2.0, 3.0};
		double[] array3 = {1.0, 2.0, 3.0};
		ArrayList<Double> list2 = new ArrayList<>(Arrays.asList(array2));
		//ArrayList<Double> list3 = new ArrayList<>(Arrays.asList(array3));	//Incorrect: asList(array) requires that the elements are objects 
		System.out.println(list2);
		System.out.println(java.util.Arrays.toString(array3));
		
		//Sort method
		Double[] dArray = {2.3, (double)-4, 9.5, (double)7}; 	//Notice the type casting
		ArrayList<Double> sortArray = new ArrayList<>(Arrays.asList(dArray));
		java.util.Collections.sort(sortArray);
		System.out.println(sortArray);
		
	}
}
