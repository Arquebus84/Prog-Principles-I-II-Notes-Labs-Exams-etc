package Exams_Package;
import java.math.BigInteger;
import java.util.Random;

public class Exam2 {
	
	public static void main(String[] args){
		
		
		for(int i = 0; i < 20; i++) {
			int randInt = (int)(5 + (Math.random() * 5));		//Between 5 to 10 but less than 10
			System.out.println(randInt);
		}
		
		
//		java.util.ArrayList<TwoWheeledVehicle> vehicles = new java.util.ArrayList<>();
//		
//		try {
//			Motorcycle m1 = new Motorcycle();
//			Engine m1Engine = new Engine();
//			m1Engine.setDisplacement(250);
//			m1.setYear(2020);			
//			m1.setEngine(m1Engine);
//			
//			Motorcycle m2 = new Motorcycle();
//			Engine m2Engine = new Engine();
//			m2Engine.setDisplacement(375);
//			m2.setYear(2021);
//			m2.setEngine(m2Engine);
//			
//			TwoWheeledVehicle m3 = new TwoWheeledVehicle();
//			
//			vehicles.add(m1);
//			vehicles.add(m2);
//			vehicles.add(m3);
//			
//			for(int i = 0; i < vehicles.size(); i++) {
//				System.out.print(vehicles.get(i).toString());
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
	}
	
	
}

/**Motorcycle question*/
class TwoWheeledVehicle{
	
	private String frontWheelSize;
	private String rearWheelSize;
	private boolean powered;
	private int year;
	
	public TwoWheeledVehicle() {
		
	}
	
	//Mutator and Accessor: frontWheel
	public String getFrontWheelSize() {
		return frontWheelSize;
	}
	public void setFrontWheelSize(String frontWheelSize) {
		this.frontWheelSize = frontWheelSize;
	}

	//Mutator and Accessor: rearWheel
	public String getRearWheelSize() {
		return rearWheelSize;
	}
	public void setRearWheelSize(String rearWheelSize) {
		this.rearWheelSize = rearWheelSize;
	}

	//Mutator and Accessor: powered
	public boolean isPowered() {
		return powered;
	}
	public void setPowered(boolean powered) {
		this.powered = powered;
	}

	//Mutator and Accessor: year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return String.format("Front: %s %nRear: %s %nPowered: %b %nYear: %d%n", getFrontWheelSize(), getRearWheelSize(), isPowered(), getYear());
	}
}

class Motorcycle extends TwoWheeledVehicle {
	
	private String make;
	private String model;	
	private Engine engine;
	
	//Default Constructor
	public Motorcycle() {
		super.setPowered(true);
		super.setYear(2023);
	}
	
	//Convenience Constructor
	public Motorcycle(String make, String model, Engine engine) {
		this();
		super.setFrontWheelSize("120/70-17");
		super.setRearWheelSize("190/55-17");
		//this.make = make;
		try{
			setMake(make);
		}catch(InvalidMakeException e) {
			
		}
		setModel(model);
		setEngine(engine);
	}
	
	//Mutator and Accessor: make
	public String getMake() {
		return make;
	}
	public void setMake(String make) throws InvalidMakeException {
		if(make.length() < 3) {
			throw new InvalidMakeException();
		}else {
			this.make = make;
		}
	}
	
	//Mutator and Accessor: model
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	//Mutator and Accessor: engine
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//toString method
	@Override
	public String toString() {
		return super.toString() + String.format("Make: %s %nModel: %s %nEngine type: " + getEngine() + "%n", getMake(), getModel());
	}
		
}

class Engine{
	
	private int displacement;
	private String manufacturer;
	
	public Engine() {
		
	}
	
	//Mutator and Accessor: displacement
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	//Mutator and Accessor: manufacturer
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return String.format("%ncc from %s%n", getDisplacement(), getManufacturer());
	}
}

@SuppressWarnings("serial")
class InvalidMakeException extends Exception{
	private String make;
	
	public InvalidMakeException() {
		
	}
	
	public InvalidMakeException(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
}

/**Farm vehicle
class FarmVehicle{
	
}

class Tractor extends FarmVehicle{
	private Engine engine;
}
*/
