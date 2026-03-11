package ClassMultiArrayEx;

public class StudentScoreWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[][] = new int[5][5];
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100);
			}
		}		
		
		System.out.println("Total Score: " + (int)totalScores(scores));
		System.out.println("Total Average Score: " + averageScore(scores));
		System.out.println("Average by Subject:");
		averageSubjectScore(scores);
		System.out.println("Average by Student:");
		averageStudentScore(scores);
			
	}
	
	public static double totalScores(int[][] array) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {			
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 100);
				
				sum += array[i][j];
			}			
		}
		return sum;
	}
	
	public static double averageScore(int[][] array) {
		totalScores(array);
		double sum = 0.0;
		int totalLength = array[array.length - 1].length * array.length;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		double avg = sum / totalLength;
		return avg;
	}
	
	public static void averageSubjectScore(int[][] array) {
		double sum = 0;
		double avg = 0;
		for(int column = 0; column < array[0].length; column++) {			
			for(int row = 0; row < array.length; row++) {
				sum += array[row][column];
				avg = sum / array[row].length;
			}
			//Average scores for each subject
			int currentSubject = column + 1;
			System.out.printf("Subject %d: %.2f%n", currentSubject, avg);
			sum = 0;
			avg = 0;
		}	
		
	}
	
	public static void averageStudentScore(int[][] array) {
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < array.length; i++) {			
			for(int j = 0; j < array[i].length; j++) {				
				sum += array[i][j];
				avg = sum / array[i].length;
			}
			//Average scores for each student
			int currentStudent = i + 1;
			System.out.printf("Student %d: %.2f%n", currentStudent, avg);
			sum = 0;
			avg = 0;
		}	
	}

}
