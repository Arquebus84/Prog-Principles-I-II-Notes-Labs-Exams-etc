package ObjAndClassesEx;

public class StudentTest {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		System.out.printf("Student %nName: %s%nAge: %d %nGender: %c %nIs Science Major: %b", student.name, student.age, student.gender, student.isScienceMajor);
	}
	
}
