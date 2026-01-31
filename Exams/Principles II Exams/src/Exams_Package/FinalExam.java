package Exams_Package;

import javafx.application.Application;
import javafx.scene.control.*;

import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;

public class FinalExam extends Application{

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		TextField txtNum1 = new TextField("2");
		TextField txtNum2 = new TextField("3");
		TextField txtResult = new TextField();
		
		Button btnCompute = new Button();
		
		btnCompute.setOnAction(e ->{
			int result = (Integer.parseInt(txtNum1.getText()) * Integer.parseInt(txtNum2.getText()));
			txtResult.setText(result + "");
			//System.out.println(txtResult.getText());
		});
		pane.getChildren().add(btnCompute);
		Scene scene = new Scene(pane, 200, 300);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		//launch(args);
		
		//System.out.println(enigma(2));
		
		//Create 5 bicycles:
		Bicycle[] bike = new Bicycle[5];
		bike[0] = new Bicycle("Trek", "Emonda", 58, 50);
		bike[1] = new Bicycle("Canyon", "Aeroad", 54, 30);
		bike[2] = new Bicycle("Giant", "Propel", 56, 40);
		bike[3] = new Bicycle("Specialized", "Tarmac", 54, 65);
		bike[4] = new Bicycle("Cannondale", "SystemSix", 56, 70);
		
		int avgCost = 0;
		
		for(int i = 0; i < bike.length; i++) {
			avgCost += bike[i].getMonthlyMaintenanceFee() / 5;			
		}
		//String[] sortedBikes = new String[bike.length];
		
		System.out.println("Average Monthly Cost: " + avgCost + "\n");
		
		Bicycle[] sortedBikes = new Bicycle[bike.length];
		
		//Sorting
		for(int i = 0; i < bike.length; i++) {
			for(int j = 0; j < bike.length; j++) {
				if(bike[i].getRating() > bike[j].getRating()) {
					Bicycle temp = bike[i];
					bike[i] = bike[j];
					bike[j] = temp;
				}
				sortedBikes[i] = bike[j];
			}
		}
		
		for(int i = 0; i < bike.length; i++) {
			System.out.print(sortedBikes[i].toString());
		}
		
	}
	
//	public static double enigma(int n) {
//		if(n == 0) {
//			return 2;
//		}else if(n == 1) {
//			return 9;
//		}else {
//			return n + enigma(n-2) / n * enigma(n-1);
//		}
//	}

}

interface Rateable{
	public void rate(double stars, double possibleStarsTotal);
	public double getRating();
}

abstract class Vehicle implements java.lang.Comparable<Vehicle>, Rateable{

	@Override
	public abstract int compareTo(Vehicle o);
	
}

class Bicycle extends Vehicle{
	
	private String manufacturer;
	private String model;
	private double monthlyMaintenanceFee;
	private double totalStars;
	private double totalPossibleStars;
	
	private Wheel[] wheels;
	private double size; //Size in cm
	
	public Bicycle(String manufacturer, String model, double size, double monthlyMaintenanceFee) {
		setManufacturer(manufacturer);
		setModel(model);
		setSize(size);
		setMonthlyMaintenanceFee(monthlyMaintenanceFee);
		
		setWheels(new Wheel[2]); //creates two wheels
	}
	
	//Setter And Getter: Manufacturer
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	//Setter And Getter: Model
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//**Setter And Getter: MonthlyMaintenanceFee
	public double getMonthlyMaintenanceFee() {
		return monthlyMaintenanceFee;
	}
	public void setMonthlyMaintenanceFee(double monthlyMaintenanceFee) {
		//MaintenanceFees must not be negative
		if(monthlyMaintenanceFee < 0) {
			this.monthlyMaintenanceFee = 0;
		}else {
			this.monthlyMaintenanceFee = monthlyMaintenanceFee;
		}
	}
	//Return the annual maintenance fee using the monthly maintenance fee
	public double getAnnualMaintenaceFee() {	//**NOTE: Mentenance is mispelled in the directions
		//monthly * 12 = annual
		double annualFee = getMonthlyMaintenanceFee() * 12;
		
		if(annualFee > 2000) {
			return 2000;
		}else if (annualFee < 50) {
			return 50;
		}else {
			return annualFee;
		}
	}
	
	//Setter And Getter: totalStars
	public double getTotalStars() {
		return totalStars;
	}
	public void setTotalStars(double totalStars) {
		this.totalStars = totalStars;
	}
	//Setter And Getter: TotalPossibleStars
	public double getTotalPossibleStars() {
		return totalPossibleStars;
	}
	public void setTotalPossibleStars(double totalPossibleStars) {
		this.totalPossibleStars = totalPossibleStars;
	}

	//Setter And Getter: wheel size
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public int compareTo(Vehicle o) {
		//If the bicycle to compare to this bike has greater rating, then return -1
		if(((Bicycle)o).getRating() > this.getRating()) {
			return -1;
		}else if(((Bicycle)o).getRating() == this.getRating()) {
			return 0;
		}else {
			return 1;
		}
	}
	
	//Override Rateable interface methods
	@Override
	public void rate(double stars, double possibleStarsTotal) {
		this.totalStars = stars;
		this.totalPossibleStars = possibleStarsTotal;
	}
	@Override
	public double getRating() {
		return (getTotalStars()/getTotalPossibleStars());
	}
	
	@Override
	public String toString() {
		return String.format("Manufacturer: %s %nModel: %s %nSize: %.2f "
				+ "%nAnnual Maintenance Costs: %.2f%n", getManufacturer(), getModel(), getSize(), getAnnualMaintenaceFee());
	}

	//Setter And Getter: Wheels
	public Wheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
}

class Wheel{
	
}

///*public*/ abstract class KitchenEquipment implements java.lang.Comparable<KitchenEquipment>{
//	
//}
//interface ChildLockable{
//	
//}
//
//class Refrigerator extends KitchenEquipment implements ChildLockable{
//
//	private CompressorMotor motor;
//	
////	@Override
////	public int compareTo(KitchenEquipment o) {
////		if((CompressorMotor)o > motor ){
////			return 1;
////		}else if((Refrigerator)o < (new Refrigerator()){
////			return -1;
////		}else {
////			return 0;
////		}
//	}
//	
//}
///*public*/ class CompressorMotor {
//	Refrigerator refrigerator;
//}
