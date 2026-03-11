import java.util.Random;

public class RandomNumClass {

	//The Random class returns a random double from 0.0 to 1.0
	/*
			java.util.Random
		+Random()
		+Random(seed: long)
		+nextInt(): int
		+nextInt(n: int): int		//If n = 2, generates random number between 0 and 1
		+nextLong(): long
		+nextDouble(): double
		+nextFloat(): float
		+nextBoolean(): boolean
	*/
	
	public static void main(String[] args) {
		
		//Random integer from math class (generates a random decimal number between 0 and 1)		
		int randomINT;
		for(int i = 0; i < 10; i++) {
			randomINT = (int)(Math.random() + 0.5); //Adding 0.5 will produce 0 or 1 b/c it will round the number down***
			
			System.out.print((i < 9)? randomINT + " " : randomINT + "\n");
		}
		
		double randomFLO;
		for(int i = 0; i < 10; i++) {
			randomFLO = (Math.random()); //Adding 0.5 will round the number up***
			
			System.out.printf((i < 9)? "%.2f " : "%.2f%n", randomFLO, randomFLO);
		}
		
		//After importing the Random class, create a parameter:
		Random random = new Random();
		
		//Generates a random integer from 0 to 9 (10 different integers)
		int randomInt = random.nextInt(10);		
		System.out.println("Random integer from 0 to 9: " + randomInt);
		double randomDouble = random.nextDouble(10);
		System.out.printf("Random double from 0 to 9: %5.2f %n", randomDouble);

		
		/**Remember that the decimal value from a to z is 97 to 122 (from 0 to 25)*/
		
		//Random characters: total characters from index 0 ('a') to 25 ('z' - 'a' + 1 total of 26 characters)
		char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		
		System.out.printf("Random lowercase character from a to z: %c %n", randomChar);
		
		for(int i = 0; i < 20; i++) {
			int randInt = (int)(5 + (Math.random() * 5));		//Between 5 to 10 but less than 10
			System.out.print(randInt + " ");
		}
	}

}
