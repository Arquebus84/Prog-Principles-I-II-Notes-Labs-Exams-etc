package ArrayClass;

//import java.util.Random;
public class ClassCodingChallengeRoster {
	//Shuffle the an array of 10 names
		
	public static void main(String[] args) {
		 
		
		//Array roster
		String[] roster = {"Matteo", "Sean", "Joshua", "Steven", "Aiden", "Gaben", "William", "John", "Benjamin", "Sam"};
		
		//System.out.println("Random student is ");
		//randomStudent(roster);
		
		randomShuffle(roster);
		for(int i = 0; i < roster.length; i++) {
			System.out.print((i < roster.length - 1)? (roster[i] + ", "): (roster[i]));						
		}
		
		int randomNum = (int)(Math.random() * roster.length - 1);
		System.out.println("\nThe randomly selected student is " + roster[randomNum]);
	}
	
	public static int randomStudent(String[] array) {
		int number = (int)(Math.random() * (array.length - 1));	
				
		return number;
	}
	
	public static void randomShuffle(String[] array) {
		int index = 0;
		for(int i = 0; i < array.length; i++) {
			index = randomStudent(array);
			String temp = array[i];
			array[i] = array[index];
			array[index] = temp;			
		}
	}

}
