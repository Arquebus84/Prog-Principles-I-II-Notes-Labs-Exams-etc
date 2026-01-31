/**
 * Redo of Lab11Prob01

 */
public class prob01Test {

	public static void main(String[] args) {
		//Display whether the cargo in the first array should be tossed if it weighs more than 100lb and has a value of less than $1500, otherwise keep
		
		//Array:
		int[][] pirateBooty = {
			{ 110, 1600 }, 
			{ 101, 1400 }, 
			{ 200, 50 }, 
			{ 322, 700 }, 
			{ 57, 500 },
			{ 625, 1500 }, 
			{ 300, 320 }, 
			{ 50, 210 }, 
			{ 100, 105 }, 
			{ 90, 400 },
			{ 30, 2000 }, 
			{ 200, 1300 },
		};
				
		for(int i = 0; i < pirateBooty.length; i++) {
			//If it is in the constraints, it's a keep
			if((pirateBooty[i][0] > 100) && (pirateBooty[i][1] < 1500)) {
				System.out.printf("Cargo %2d: toss%n", i + 1);
			//If it's not then toss
			}else {
				System.out.printf("Cargo %2d: keep%n", i + 1);
				
			}
		}
	}

}
