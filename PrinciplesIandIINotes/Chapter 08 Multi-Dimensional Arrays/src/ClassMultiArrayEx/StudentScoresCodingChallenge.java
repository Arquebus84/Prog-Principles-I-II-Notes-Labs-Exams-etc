package ClassMultiArrayEx;

public class StudentScoresCodingChallenge {

	public static void main(String[] args) {
		//Create 2D array of integers of student exam scores (5 by 5)
		//**scores[students][subjects]
		int scores[][] = new int[5][5];
		
		double sum = 0;
		
		for(int i = 0; i < scores.length; i++) {			
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100);
				
				sum += scores[i][j];
			}
			//Average scores for each student
			System.out.println("Student " + (i + 1) + " has an average of " + sum / 5.0);
		}
		
		System.out.println();
		
		//Total scores by students 1 to 5		
		for(int row = 0; row < scores.length; row++) {
			System.out.print("Student " + (row + 1) + " scores are: ");
			
			for(int column = 0; column < scores[row].length; column++) {
				System.out.print(scores[row][column] + " ");
			}
			System.out.println();
		}				
		System.out.println();
		
		//Total scores by subject
		
		
	}
}
