package presentPackage;



public class PresentMain {

	public static void main(String[] args) {
		//The PresentMain class invokes the Present class
		
		UserID usersID = new UserID();
		Present p = new Present(usersID.getUserInfo());
		p.getClass();
	}

}