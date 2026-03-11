
public class MultiDimArrayMethodEx {

	public static void main(String[] args) {
	    int[][] x = {{2, 1}, {1, 7, 1}};
	    //Prints the result from the *second row of array x (x[1])
	    System.out.println(m(x[1]));
	    
	    //This does not print the array in method p
	    for(int i = 0; i < p().length; i++) {
	    	for(int j = 0; j < p()[i].length; j++) {
	    		System.out.print(p());
	    	}
	    	System.out.println();
	    }
	    System.out.println(p());
	  }

	  public static int m(int[] m) {
	    int result = 0;
	    //at x[1], the length is 3
	    for (int i = 0; i < m.length; i++)
	      result += m[i];
	    return result;
	  }
	  
	  //This is a valid method
	  public static int[][]p(){
		  return new int[][] {
			  {1, 2, 3},
			  {2, 4, 6}
		  };
	  }
}
