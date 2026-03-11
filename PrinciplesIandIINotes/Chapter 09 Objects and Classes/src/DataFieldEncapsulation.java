
public class DataFieldEncapsulation {
	//Making data fields private protects data and makes the class easy to maintain
	
	//Data field encapsulation: To prevent direct modifications of properties through the object reference, you can declare the field private, using
	//	the private modifier.
	
	//A private data field cannot be accessed by an object outside the class that defines the private data field. However, to make a private field
	//	accessible, provide a getter* method to return its value. To enable a private data field to be updated, provide a setter* method to set a new
	//	value
	
	/**	Getter and Setter methods
	 * 
			*getter, also called the Accessor
				//Syntax:
				public returnType getPropertyName()
				
				//Syntax for boolean type
				public boolean isPropertyName()
			
			*setter, also called the Mutator
				//Syntax:
				public void setPropertyName(dataType propertyValue)
			
	*/
	
	public static void main(String args[]) {
		T projectT = new T();
		projectT.setNumber(-2);
		System.out.println(projectT.getNumber());
	}
	
}

class T{
	private int numberOfProjects;
	
	public T() {
		numberOfProjects = 1;
	}
	
	public int getNumber() {
		return numberOfProjects;
	}
	
	public void setNumber(int numberOfProjects) {
		if(numberOfProjects > 0) {
			this.numberOfProjects = numberOfProjects;
		}else {
			this.numberOfProjects = 1;
		}
	}
}
