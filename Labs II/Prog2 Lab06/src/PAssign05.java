/**File: PAssign05.java
 * Class: CSCI 1302
 * Author: Matteo Ventura
 * Created on: Mar 2, 2025
 * Last Modified: Mar 3, 2025
 * Description: Create an abstract class, two subclasses, and one interface to provide basic functionality for a car-rating system
 * 
*/
public class PAssign05 {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Car("Ford", "Expedition", 2020, 8);
		vehicles[0].addReview("Big, spacious, and handy, the Expedition is a workhorse but falls short of more appealing rivals.");
		
		vehicles[1] = new Car("Toyota", "Camry", 2019, 5);
		
		vehicles[2] = new Car("Mazda", "MX5", 2018, 2);
		vehicles[2].addReview("A more characterful four-cylinder makes one of our favorites even better.");
		
		vehicles[3] = new Truck("Ford", "F-150", 2016, 10400);
		vehicles[3].addReview("Turns out there is a replacement for displacement.");
		
		vehicles[4] = new Truck("Dodge", "Ram 1500", 2020, 7730);
		vehicles[4].addReview("When only a pickup truck will do, the Ram 1500 is the one to choose.");
		
		//vehicles[5] = new Truck();
		
		System.out.println("All Vehicles:");
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].toString());
		}
	}
}

//Interface class
interface Reviewable{
	public abstract void addReview(String reviewText);
}

//Abstract class
abstract class Vehicle implements Reviewable{
	private String make;
	private String model;
	private int year;
	private String review;
	private String type;
	
	//By default, review should be "No review,"
	protected Vehicle() {
		this("undefined", "undefined", 0);
		addReview("No review.");
		setType("undefined");
	}
	//Convenience Constructors
	protected Vehicle(String make, String model, int year) {
		setMake(make);
		setModel(model);
		setYear(year);
		addReview("No review.");
		setType("undefined");
	}
	
	//Accessor & Mutator: make
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	//Accessor & Mutator: model
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//Accessor & Mutator: year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//Accessor & Mutator: review
	public String getReview() {
		return review;
	}
	@Override
	public void addReview(String review) {
		this.review = review;
	}
	
	//Accessor & Mutator: type
	public String getType() {
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	//getDeatiled info
	public abstract String getDetailedInfo();
	
	//toString method should return the year, make, and model
	@Override
	public String toString() {
		return String.format("%d %s %s (%s)", getYear(), getMake(), getModel(), getType());
	}
}

//Extension of Vehicle: Car
class Car extends Vehicle{
	private int seatingCapacity;
	
	//Default Constructor
	public Car() {
		super();
		super.setType("Car");
		setSeatingCapacity(0);
	}
	
	//Convenience Constructor
	public Car(String make, String model, int year, int seatingCapacity) {
		super(make, model, year);
		super.setType("Car");
		setSeatingCapacity(seatingCapacity);
	}
	
	//Accessor & Mutator: seatingCapacity
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	//Get Detailed Info for type Car
	@Override
	public String getDetailedInfo() {
		return String.format("%s%nSeating Capacity: %d people%n%s%n", super.toString(), getSeatingCapacity(), super.getReview());
	}
	
	//Override and return the toString() method
	@Override
	public String toString() {
		return getDetailedInfo();
	}
}

//Extension of Vehicle: Truck
class Truck extends Vehicle{
	private double maxTowWeight;
	
	//Default Constructor
	public Truck() {
		super();
		super.setType("Truck");
		setMaxTowWeight(0);
	}
	
	//Convenience Constructor
	public Truck(String make, String model, int year, double maxTowWeight) {
		super(make, model, year);
		super.setType("Truck");
		setMaxTowWeight(maxTowWeight);
	}
	
	//Accessor & Mutator: maxTowWeight
	public double getMaxTowWeight() {
		return maxTowWeight;
	}
	public void setMaxTowWeight(double maxTowWeight) {
		this.maxTowWeight = maxTowWeight;
	}

	//Get Detailed Info for type Truck
	@Override
	public String getDetailedInfo() {
		return String.format("%s%nMax Tow Weight: %,.2f lbs%n%s%n", super.toString(), getMaxTowWeight(), super.getReview());
	}
	
	//Override and return the toString() method
	@Override
	public String toString() {
		return getDetailedInfo();
	}
}
