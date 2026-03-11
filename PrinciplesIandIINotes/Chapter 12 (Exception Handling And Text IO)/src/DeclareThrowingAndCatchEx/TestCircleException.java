package DeclareThrowingAndCatchEx;

public class TestCircleException {

	public static void main(String[] args) {
		
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);
			
			c1.getClass();
			c2.getClass();
			c3.getClass();
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);				//Prints ex.toString()
		}
		
		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
	}

}
