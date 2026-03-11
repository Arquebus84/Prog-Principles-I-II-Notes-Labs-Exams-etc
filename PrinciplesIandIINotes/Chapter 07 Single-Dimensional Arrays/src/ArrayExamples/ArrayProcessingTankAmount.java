package ArrayExamples;

public class ArrayProcessingTankAmount {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double total = 0;
		System.out.println("Enter the number of fuel tanks:");
		//List fuel tank in liters
		double tanks[] = new double[input.nextInt()];

		for(int i = 0; i <= tanks.length - 1; i++){
		    //Repeat until answered enough
		    System.out.println("Amount of fuel in tank " + (i + 1) + ":");
		    tanks[i] = input.nextDouble();
		    total += tanks[i];
		}
				
		/*//Adjust the fuel so that each tank has the same amount (average of all the tanks) Ex: (tank1 + tank2) / 2 = (134 + 23) / 2 = 78.5
		for(int i = 0; i < tanks.length; i++) {			
			tanks[i] = total / tanks.length;
		}*/
		
		double thrusts[] = new double[tanks.length];

		for(int i = 0; i < thrusts.length; i++){
			
		    if(tanks[i] < 15){
		        thrusts[i] *= 0;
		    }else if(tanks[i] > 15 && tanks[i] < 100){
		        thrusts[i] = 5 * tanks[i];
		    }else{
		        thrusts[i] = 3 * tanks[i];
		    }
		}
		System.out.printf("Total tanks are %.2f%n", total);
		
		for(int i = 0; i < tanks.length; i++){
		    System.out.printf("Tank %d: %.1f liters of fuel providing %.1f of thrust%n", i + 1, tanks[i], thrusts[i]);
		}		
		//System.out.println(thrusts[0]);
		//System.out.println(thrusts[1]);		
		//System.out.println(tanks[0]);
		//System.out.println(tanks[1]);
				
		//Close scanner
		input.close();		
	}

}
