package DigitsTests;

public class SplittingIntegers {

	public static void main(String[] args) {
		int n = 123456;
		
		while(n != 0) {
			System.out.print(n + " ");
			int k = n % 10;
			System.out.println(k + " ");
			n /= 10;
		}
		
		lowest(54547);
		importString("This is it");
	}
	
	public static void lowest(int largest) {
		int lcp = largest;
	    int LCP = Integer.MAX_VALUE;
	    while(largest != 0){
	        int k = largest % 10;
	        if(LCP > k){
	            LCP = k;
	        }
	        largest /= 10;
	    }
	    System.out.println(LCP);
	}
	
	public static void importString(String s) {
		var m = s.toCharArray();
		//System.out.print(s.strip());
		for(int i = 0; i < m.length; i++) {
			System.out.print((m[i] != ' ')? m[i] : "");
		}
	}

}
