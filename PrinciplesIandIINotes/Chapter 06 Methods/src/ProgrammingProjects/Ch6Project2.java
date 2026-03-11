package ProgrammingProjects;

public class Ch6Project2 {
	//Write a method to compute the series:
	//		m(i) = 1/2 + 2/3 + ... + i/(1+i)

	public static void main(String[] args) {
		//Print the headline and separate each iteration by a tab
		System.out.println("i\tm(i)");
		seriesM(20);
	}
	
	public static void seriesM(int i) {
		//Initial value for the summation
		double sum = 0.0;
		
		//Loop and use the formula for finding each new term in the series
		for(double j = 1.0; j <= i; j++) {
			//Calculate the sum of each term
			sum += (j / (1 + j));
			
			//Print the sum of each term after an iteration
			System.out.printf((int)j + "\t%.4f%n",sum);
		}
		
	}

}
