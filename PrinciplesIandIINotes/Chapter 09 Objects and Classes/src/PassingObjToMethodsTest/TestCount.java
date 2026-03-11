package PassingObjToMethodsTest;

public class TestCount {
	public static void main(String[] args) {
		Count myCount = new Count();
		int times = 0;

		for (int i = 0; i < 100; i++)
			increment(myCount, times);

		System.out.println("myCount.count = " + myCount.count);
		System.out.println("times = " + times);
	}

	public static void increment(Count c, int times) {
		c.count++;
		times++;
	}
}
