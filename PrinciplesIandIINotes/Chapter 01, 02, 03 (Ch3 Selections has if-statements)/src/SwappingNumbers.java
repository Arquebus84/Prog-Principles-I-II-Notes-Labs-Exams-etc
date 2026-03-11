
public class SwappingNumbers {

	public static void main(String[] args) {
		//Swapping two numbers x and y ==> y and x
		/**
		int x = 12;
		int y = 16;
		int temp = x;
		x = y;
		y = temp;
		//System.out.println(x);
		*/
		//Swapping three numbers (x, y, z) ==> (y, z, x)
		int x = 1;
		int y = 2;
		int z = 3;
		System.out.printf("Before: (%d, %d, %d)%n", x, y, z);
		
		int temp = x;
		x = y;
		y = z;
		z = temp;
		System.out.printf("After: (%d, %d, %d)%n", x, y, z);		
		
	}

}
