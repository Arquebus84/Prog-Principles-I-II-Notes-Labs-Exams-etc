
public class TestWaterBottle {
	
	public static void main(String[] args) {
		WaterBottle w1 = new StandardWaterBottle(8, 4);
		WaterBottle w2 = new Thermos(400, 90);
		
		System.out.println(w1.getInfo());
		System.out.println(w2.getInfo());
	}	
}
