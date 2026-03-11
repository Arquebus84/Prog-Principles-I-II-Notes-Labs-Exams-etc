package DefaultTests;

public class MultiplesOfThreeOrFive {

	//This class tests the solution
	public static void main(String[] args) {
		// TODO Print the specified sum of the integers if they are factors of 3 or 5
		System.out.println(new Solution().solution(10));
	}

}

class Solution{
	
	//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23
	
	//In this case, if we obtain a number n, the Solution constructor should return the sum of all factors of 3 or 5
	public int solution(int number){
		int sum = 0;
		for(int i = 0; i < number; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
