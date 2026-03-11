package ClassLoopsEx;

public class TestBreak {

	public static void main(String[] args) {
		//Test break;
				int value = 0;
				int sum = 0;
				//0 - 10
				while(value < 10) {
					value++;
					if(value == 6) {
						continue;
					}
					sum += value;
					if(sum > 20) {
						//break;
					}
				}
				System.out.println(sum);// If break is added, then it is 22, but now it is 49
	}

}
