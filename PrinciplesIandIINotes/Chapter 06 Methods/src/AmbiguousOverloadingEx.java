
public class AmbiguousOverloadingEx {	
	public static void main(String[] args) {
		
		//System.out.println(max(2,6));
	}
	public static double max(int num1, double num2) { 
	    if (num1 > num2)
	      return num1;
	    else
	      return num2;
	  }
	  
	  public static double max(double num1, int num2) {
	    if (num1 > num2)
	      return num1;
	    else
	      return num2;     
	  }
	  
	  //This has a compile error because they both have the same method signature
	  /*public static int m(int num) {
		  return num;
	  }
	  
	  public static void m(int num) {
		  System.out.println(num);
	  }*/

}
