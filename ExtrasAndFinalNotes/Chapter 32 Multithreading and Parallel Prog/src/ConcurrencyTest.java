
public class ConcurrencyTest {

	public static void main(String[] args) {
		myThread m1 = new myThread();
		
		myRunnable runnable1 = new myRunnable();
		
		//myThread2 m2 = new myThread2();
		Thread m2 = new Thread(runnable1);
		
		/**Multithreading*/
		m1.start();
		m2.start();
	}

	private static class myThread extends Thread{
		
		@Override
		public void run() {
			for(int i = 10; i > 0; i--) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {
					System.out.println("Unable to continue");
				}
			}
			System.out.println("Thread finished");
		}
	}
	private static class myThread2 extends Thread{
		
		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {
					System.out.println("Unable to continue");
				}
			}
			System.out.println("Thread finished");
		}
	}

	private static class myRunnable implements Runnable{

		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {
					System.out.println("Unable to continue");
				}
			}
			System.out.println("Thread finished");			
		}
		
	}
}
