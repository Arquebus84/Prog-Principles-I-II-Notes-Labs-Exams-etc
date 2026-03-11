package ClassLoopsEx;

public class FutureTuition {

	public static void main(String[] args) {
		//Suppose that tuition for a university is $10,000 this year and the tuition increases 7% every year. In how many years will tuition be doubled?
		
		double tuition = 10000;
		int year = 1;
		
		while(tuition < 20000) {
			tuition *= 1.07;
			year++;
		}
		System.out.println(year);

	}

}
