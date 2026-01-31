package Exams_Package;

//import javafx.application.Application;
//import javafx.stage.Stage;

public class Exam3 {

	public static void main(String[] args) {
		
		/**LawnEquipment a = new LeafBlower();
		Repairable r = new LeafBlower();
		
		//Cloneable c;
		//Comparable com;
		
		LeafBlower[] arrB = new LeafBlower[8];
		arrB[0] = new LeafBlower();
		arrB[1] = (LeafBlower) new Object();
		arrB[2] = (LeafBlower) a;
		arrB[3] = (LeafBlower) r;*/
		//arrB[4] = (LeafBlower) c;
		//arrB[4] = (LeafBlower) com;
		
		
		//RPGCharacter c = new RPGCharacter("Matt", "Human");
		
//		System.out.println("CharLVL: " + c.levelUp(5));
//		System.out.println("CharLVL: " + c.levelUp(-5));
//		System.out.println("HealthPool: " + c.getHealthPool());
	}
}
/**
interface Repairable{
	
}
abstract class LawnEquipment{
	abstract void age();
}

class LeafBlower extends LawnEquipment implements Repairable{

	void age() {
				
	}
	
}*/


interface Levelable{
	default int levelUp(int numLevels) {
		return numLevels;
	}
}

abstract class RPGCharacter implements Levelable{
	
	private String name;
	private String type;
	private double healthPool;
	private int charLevel;
	private String specialSkill;
	
	public RPGCharacter(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	abstract void useSpecialSkill();
	
	//The charLevel must be raised or lowered by the specific numLevels parameter.
	/**Maximum charLevel is 100; cannot be negative >0*/
	// The Character's healthPool must increase or decrease	by 10% for every charLevel gained (+5 levels = 50% increase in health)
	//Method must return the character's new charLevel
	@Override
	public int levelUp(int numLevels) {
		if((charLevel + numLevels) <= 100 && (charLevel + numLevels) >= 0) {			
			charLevel += numLevels;
			
			healthPool += numLevels * (0.1);
		}else if((charLevel + numLevels) >= 100) {			
			charLevel = 100;
			healthPool = 1.0;
		}else if((charLevel + numLevels) < 1) {
			charLevel = 0;
			healthPool = 0.0;
		}
		return charLevel;		
	}
	
	public String getSpecialSkill() {
		return specialSkill;
	}
	
	public double getHealthPool() {
		return healthPool;
	}
}

class Warrior extends RPGCharacter{
	
	private int rageLevel;
	
	public Warrior(String name, String type) {
		super(name, type);
		setRageLevel(10);
	}
	
	public void setRageLevel(int rageLevel) {
		if(this.rageLevel + rageLevel < 100) {
			this.rageLevel = rageLevel;
		}
	}

	@Override
	public void useSpecialSkill() {
		setRageLevel(this.rageLevel + 50);
		System.out.println("Special skill: " + super.getSpecialSkill() + 
				"\nRageLevel: " + rageLevel + 
				"\nHealthPool: " + super.getHealthPool());
	}

}
