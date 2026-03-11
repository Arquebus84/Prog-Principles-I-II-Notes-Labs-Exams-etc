package TimeInSeconds;

import java.math.*;
public class DelayLoopCountInMillis {

	public static void main(String[] args) {
		
		double s = 0;
		
		for(int i = 0; i < 10; i++) {
			s = i;
			System.out.println("Second: " + s);
			delay(1);
		}
	}
	
	public static void delay(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		}catch(Exception ex) {
			ex.getMessage();
		}
	}

}
