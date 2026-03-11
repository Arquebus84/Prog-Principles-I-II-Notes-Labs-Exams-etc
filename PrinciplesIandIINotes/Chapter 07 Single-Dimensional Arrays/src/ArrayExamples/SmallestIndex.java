package ArrayExamples;

public class SmallestIndex {

	public static void main(String[] args) {
		//Should print index 1 since it is the first 5
		
		double[] myList = {1, 5, 5, 5, 5, 1};
		double max = myList[0];
		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) {
		  if (myList[i] > max) {
		    max = myList[i];
		    indexOfMax = i;
		  }
		}
		System.out.println(indexOfMax);
		
		
		int[] x = {120, 200, 16}; 
		//Starts the loop at the first value, and decrements i by 1 until it reaches a value that is less than 0
	    for (int i = x.length - 1; i >= 0; i--) {
	      System.out.print(x[i] + " ");
		}
	    
	    System.out.println();
	    
	    int list[] = {1, 2, 3, 4, 5, 6};
	    int list2[] = {1, 2, 3, 4, 5, 6};
	    
	    //Starts at index 1 (1 - 1)
	    for (int i = 1; i < list.length; i++) {
	    //If you start at i = 1, list[1] = [1 - 1] = 0; which is carried out for the rest of the values 
	      list[i] = list[i - 1];
		}
	    
	    //Starts at index 2 (2 - 1)
	    for (int i = 2; i < list2.length; i++) {
	    	list2[i] = list2[i - 1]; //Prints 1 because it is not affected by i, but starts at index 1 (2)
	    }
	    
	    //Print the lists list and list2
	    for (int i = 0; i < list.length; i++) {
	    	System.out.print(list[i] + " ");
	    }
	    System.out.println();	    
	    for (int i = 0; i < list2.length; i++) {
	    	System.out.print(list2[i] + " ");
	    }
	    
	}
}
