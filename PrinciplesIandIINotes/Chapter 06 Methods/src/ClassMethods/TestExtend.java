package ClassMethods;

//Calling a different class in this class
public class TestExtend {

	public static void main(String[] args) {
		int x = 7;
		int y = 9;
		//Class is TestMax, and it uses the max method in this TestExtend.
		int z = TestMax.max(x, y);
		int k = (int) Math.random() * 10;
		
		//***NOTE: Can only call the class that belongs to the same package***
		//int w = MethodDemo.
	}

}
