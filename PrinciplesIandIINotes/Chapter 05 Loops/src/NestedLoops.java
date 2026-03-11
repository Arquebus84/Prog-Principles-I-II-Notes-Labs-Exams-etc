
public class NestedLoops {

	public static void main(String[] args) {
		//Nested Loops consist of an outer loop and one or more inner loops. Each time the outer loop is repeated, the inner loops are reentered and
		//started anew
		
		/*/EX: Displaying a multiplication table
	    System.out.println("           Multiplication Table");

	    // Display the number title
	    System.out.print("    ");
	    for (int j = 1; j <= 9; j++)//Displays the horizontal numbers, followed by a horizontal line
	      System.out.print("   " + j);

	    System.out.println("\n-----------------------------------------");

	    // Print table body
	    for (int i = 1; i <= 9; i++) {//Outer loop displays the vertical numbers on the far-left
	      System.out.print(i + " | ");
	      for (int j = 1; j <= 9; j++) {//Inner loop displays horizontal numbers
	        // Display the product and align properly
	        System.out.printf("%4d", i * j);
	        //If you used print(i * j), it will be the same result, however, with printf, you can keep everything spaced-out
	      }
	      System.out.println();
	    }
	    //**In Lines 19-27, the loop is a nested for-loop with the control variable i in the outer loop and j in the inner loop. For each i, the product
	    // i * j is displayed on a line in the inner loop, with j being 1, 2, 3, ..., 9.
	    
	    /*	NOTE: Be aware that nested for loops may take a long time to run:
	     * 		for(int i = 0; i < 10000; i++){
	     * 			for(int j = 0; j < 10000; j++){
	     * 				for(int k = 0; k < 10000; k++){
	     * 					perform an action;		}}}
	     * 
	     * 	In this example, the loop will perform one-trillion times; If it takes 1 microsecond to perform the action, the total time to run the loop is > 277 hours
	     * Note: 1 microsecond = 10^-6 of a second
	     *
	    //Examples:
	    for (int i = 0; i < 10; i++) { 
	    	  for (int j = 0; j < i; j++)
	    	    System.out.println(i * j); //***When i = 0, the println statement is not executed, when i = 1, the println statement is executed once, when
	    	  //i = 2 the println statement is executed twice, ..., and when i is 9, the println statement is executed nine times.
	    }// The total times this loop is run is 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = *45 times*  
	    
	    for (int i = 1; i < 5; i++) {
	        int j = 0;
	        while (j < i) {
	          System.out.print(j + " "); //Displays 0 0 1 0 1 2 0 1 2 3 
	          j++;
	        }
	    }
	    /*
	     * Tip for tracing programs: Draw a table to see how variables change in the program. Consider the previous example.
				i      j          output 
				1      0          0 
				1      1           
				2      0          0           
				2      1          1           
				2      2                    
				3      0          0           
				3      1          1           
				3      2          2          
				3      3                    
				4      0          0           
				4      1          1           
				4      2          2          
				4      3          3         
				4      4         
	     */	    
	    
	    /*/Prints a matrix of 2x2 numbers separated by a space
	    for(int i = 0; i < 3; i++) {
	    	for(int j = 0; j < 2; j++) {
	    		System.out.println(i + " " + j);
	    	}
	    	System.out.println();
	    }//Read you notes or check out this video: https://www.youtube.com/watch?v=CwjSpUIFi7w 
	    
	    	
	    int i = 0;
	    while (i < 5) {
	      for (int j = i; j > 1; j--)
	        System.out.print(j + " ");
	      System.out.println("****");
	      i++;
	    }
	    */
	    for(int e = 1; e <= 5; e++) { //Affects vertical rows
	    	for(int j = 1; j <= 5; j++) { //Affects horizontal rows (REMEMBER to not mix i++ into the j++ for this for-loop)
	    		System.out.print(j * e + " ");
	    	}
	    	System.out.println();
	    }
	    
	    for(int x = 1; x <= 6; x++) {
	    	for(int y = 6; y >= 1; y--) {
	    		System.out.print((y <= x)? y + " " : " " + " ");	    		
	    	}
	    	System.out.println();
	    }
	    /*This displays the pattern:
	    			  1 
			        2 1 
			      3 2 1 
			    4 3 2 1 
			  5 4 3 2 1 
			6 5 4 3 2 1		*/
	    
	    for(int x = 1; x <= 4; x++) { //This code is executed 4*4 16 times
	    	for(int y = 4; y >= 1; y--) {
	    		System.out.print((y <= x)? x + " " : " " + " ");	    		
	    	}
	    	System.out.println();
	    }
	    
	    int n = 4;
	    for(int i = 1; i <= n; i++){//Vertical columns 
	    	for(int j = i; j < n; j++){//Horizontal rows (How many empty spaces)
	    		System.out.print(" ");
	    	}
	    	for(int j = 1; j <= i; j++){//Horizontal rows (How many characters to insert)
	    		System.out.print(i + "");
	    	}
	    	System.out.println();
	    }
	}

}
