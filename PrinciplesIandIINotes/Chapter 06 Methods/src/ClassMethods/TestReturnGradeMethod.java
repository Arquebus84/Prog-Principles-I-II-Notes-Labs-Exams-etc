package ClassMethods;

public class TestReturnGradeMethod {

	public static void main(String[] args) {
		
		//Student 1: Shakil, 45.2
		//Student 2: Josh, 78.5
		
		System.out.println("The grade of student 1 is " + getGrade(45.20) + "\nThe grade of student 2 is " + getGrade(78.50));
	}
	
	//want to return character (A, B, C, D, F)
	public static char getGrade(double score) {
		if(score >= 90)
			return 'A';
		else if(score >= 80)
			return 'B';
		else if(score >= 70)
			return 'C';
		else if(score >= 60)
			return 'D';
		else
			return 'F';
		
	}

}
