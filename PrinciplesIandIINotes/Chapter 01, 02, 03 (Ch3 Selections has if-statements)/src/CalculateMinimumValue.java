public class CalculateMinimumValue {
	public static void main(String[] args) {		
		int num1 = 1;
		int num2 = 3;
		
		int minValue = (num1 < num2)? num1 : num2;
		System.out.print(minValue);
		
		boolean t = ((2 + 3 > 5*2) || (3+3 > 6 / 2));
		System.out.println(t);
		
		int n1[] = {2, 5, 7, 3, 8, -1, 9};
		int min = n1[0];
		for(int i = 0; i < n1.length; i++) {
			if(min > n1[i]) {
				min = n1[i];
			}
		}
		System.out.printf("The min value is %d", min);
	}
}
