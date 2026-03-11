package ClassActivity;

public class DroneTest {
	public static void main(String[] args) {
		Drone drone1 = new Quadcopter();
		
		drone1.Fly();
	}
}

interface Rechargeable{
	public abstract String recharge();
}

abstract class Drone{
	private String type;
	private String color;
	private int propellers;
	private boolean isFlying;
	
	//Default Constructor
	public Drone() {
		this("Helicopter", "Gray", 2, false);
		Land();
	}
	//Convenience Constructor
	public Drone(String type, String color, int propellers, boolean isFlying) {
		setType(type);
		setColor(color);
		setPropellers(propellers);
		setIsFlying(isFlying);
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setPropellers(int propellers) {
		this.propellers = propellers;
	}
	public int getPropellers() {
		return propellers;
	}
	
	public boolean isFlying() {
		return isFlying;
	}
	public void setIsFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	public void Land() {
		if(isFlying == true) {
			System.out.println("The Drone is landing...");
			isFlying = false;
			System.out.println("Land Successful");
		}else {
			System.out.println("Drone is already on land");
		}
	}
	
	//Abstract Method
	public abstract void Fly();
	public abstract String toString();
}

class Quadcopter extends Drone implements Rechargeable{
	//Default Constructor
	public Quadcopter() {
		super("Quadcopter", "Black", 4, true);
	}
	
	@Override
	public String toString() {
		return String.format("Drone of type: %s %nColor: %s %nPropellers: %d %nIs "
				+ "Flying: %b%n", super.getType(), super.getColor(), super.getPropellers(), super.isFlying());
	}
	
	@Override
	public void Fly() {
		System.out.printf(toString());
		super.Land();
	}
	
	@Override
	public String recharge() {
		return "Quadcopter: Recharging";
	}
}
