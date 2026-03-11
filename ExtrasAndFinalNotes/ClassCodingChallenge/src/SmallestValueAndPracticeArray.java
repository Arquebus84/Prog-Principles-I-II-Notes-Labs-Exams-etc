
public class SmallestValueAndPracticeArray {

	public static void main(String[] args) {
		//Array
		int[] array = new int[15];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 101);
		}

		int min = array[0];
		int valuesDivisibleBy3And9 = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0 && array[i] % 9 == 0) {
				valuesDivisibleBy3And9++;
				System.out.printf("%4d is divisible by 3 and 9%n", array[i]);
			}else {
				System.out.printf("%4d is not divisible by 3 and 9%n", array[i]);
			}
			
			if (min > array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("\nThe min is " + min + "\n");
		System.out.println("There are " + valuesDivisibleBy3And9 + 
				((valuesDivisibleBy3And9 > 1)? " elements that are divisible by 3 and 9." : " element that is divisible by 3 and 9."));
		
		
	}

}
