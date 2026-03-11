package ArrayExamples;

public class Test {
	public static void main(String[] args) {
	    int[] x = {1, 2, 3, 4, 5};
	    increase(x);

	    int[] y = {1, 2, 3, 4, 5};
	    increase(y[0]);

	    System.out.println(x[0] + " " + y[0]);
	    
	    int[] oldList = {1, 2, 3, 4, 5};
	    reverse(oldList);
	    for (int i = 0; i < oldList.length; i++)
	      System.out.print(oldList[i] + " ");
	    
	    xMethod(new double[]{3, 3});
	    xMethod(new double[5]);
	    //xMethod(new double[3]{1, 2, 3});
	    
	    
	    
	  }

	  public static void increase(int[] x) {
	    for (int i = 0; i < x.length; i++)
	      x[i]++;
	  }

	  public static void increase(int y) {
	    y++;
	  }
	  
	  public static void reverse(int[] list) {
		int[] newList = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		  
		}
		list = newList;
		
	  }
	  
	  public static void xMethod(double[] a) {
		  System.out.println(a.length);
	  }
	  
	  
	  
}
