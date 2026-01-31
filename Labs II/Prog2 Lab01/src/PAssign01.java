/**
* File: PAssign01.java
* Class: CSCI 1302
* Author: Ventura
* Created on: Jan 17, 2025
* Last Modified: Jan 23, 2025
* Description: Display 5 desks with specific information.
*/
public class PAssign01 {

	public static void main(String[] args) {
		//Desk objects array
		Desk[] desks = new Desk[5];
		
		//Desk 1
		desks[0] = new Desk();
		desks[0].setNumDrawers(5);
		desks[0].setSurfaceHeight(43.5);
		desks[0].isStanding(true);
		desks[0].setMaterialType("Birch");
		desks[0].setManufactureState("Tennessee");
		
		//Desk 2
		desks[1] = new Desk();
		desks[1].setNumDrawers(8);
		desks[1].setSurfaceHeight(29.2);
		desks[1].isStanding(false);
		desks[1].setMaterialType("Mahogany");
		desks[1].setManufactureState("California");
		
		//Desk 3 (Modify for testing)
		desks[2] = new Desk();
		desks[2].setNumDrawers(12);
		desks[2].setSurfaceHeight(40.1);
		desks[2].isStanding(true);
		desks[2].setMaterialType("Pine");
		desks[2].setManufactureState("Florida");
		
		//Desk 4 (Modify for testing)
		desks[3] = new Desk();
		desks[3].setNumDrawers(0);
		desks[3].setSurfaceHeight(67);
		desks[3].isStanding(false);
		desks[3].setMaterialType("Maple");
		desks[3].setManufactureState("New York");
		
		//Desk 5 (Modify for testing)
		desks[4] = new Desk();
		desks[4].setNumDrawers(2);
		desks[4].setSurfaceHeight(28.1);
		desks[4].isStanding(false);
		desks[4].setMaterialType("Ma");
		desks[4].setManufactureState("Washington");
		
		printDesks(desks);
	}

	public static void printDesks(Desk[] desk) {
		
		for(int i = 0; i < desk.length; i++) {
			System.out.println("Desk " + (i + 1) + desk[i].getInfo());
		}		
	}
}

class Desk{
	
	//Parameters
	int numDrawers;
	double surfaceHeight;
	boolean standing;
	String materialType;
	String manufactureState;
	static int numDesks;
	
	//No-arg Constructor
	public Desk() {
		numDrawers = 4;
		surfaceHeight = 27.0;
		standing = false;
		materialType = "Pine";
		manufactureState = "North Carolina";
		numDesks++;
	}
	
	//Constructor with numDrawers argument
	public Desk(int numDrawers) {
		this.numDrawers = numDrawers;
		surfaceHeight = 27.0;
		standing = false;
		materialType = "Pine";
		manufactureState = "North Carolina";
		numDesks++;
	}
	
	/**Accessor and Mutator methods*/
	
	//numDrawers: Accessor Method and Mutator Method
	public int getNumDrawers() {
		return numDrawers;
	}
	public void setNumDrawers(int numDrawers) {
		//Constraint: Drawers have to have a max of 8 desks, otherwise, set it to 4
		if(numDrawers <= 8 && numDrawers >= 0) {
			this.numDrawers = numDrawers;
		}else {
			this.numDrawers = 4;
		}		
	}
	
	//surfaceHeight: Accessor Method and Mutator Method
	public double getSurfaceHeight() {
		return surfaceHeight;
	}
	public void setSurfaceHeight(double surfaceHeight) {
		//Constraint: surface height must be in range from 24.0" - 45.0", else reset to 27.0"
		if(surfaceHeight > 24.0 && surfaceHeight < 45.1) {
			this.surfaceHeight = surfaceHeight;
		}else {
			this.surfaceHeight = 27.0;
		}		
	}
	
	//standing: Accessor Method and Mutator Method
	public boolean getStanding() {
		return standing;
	}
	public void isStanding(boolean standing) {
		this.standing = standing;
	}
	
	//materialType: Accessor Method and Mutator Method
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		//Constraint: if materialType is not at least 3 characters long, the material should reset to Oak
		if(materialType.length() > 2) {
			this.materialType = materialType;
		}else {
			this.materialType = "Oak";
		}
	}
	
	//manufactureState: Accessor Method and Mutator Method
	public String getManufactureState() {
		return manufactureState;
	}
	public void setManufactureState(String manufactureState) {
		//Constraint: if manufactureState is not at least 4 characters long, state should be reset to Iowa
		if(manufactureState.length() > 3) {
			this.manufactureState = manufactureState;
		}else {
			this.manufactureState = "Iowa";
		}		
	}
	
	//numberOfDesks: Accessor method
	public static int getNumDesks() {
		return numDesks;
	}
	
	/**Display Desk Info*/
	public String getInfo() {
		return String.format("%nDesk Information%nNumber Drawers:\t%d%nSurface Height:\t%.2f inches%nStanding:\t%b%nMaterial:\t%s"
				+ "%nManufactured:\t%s%n", getNumDrawers(), getSurfaceHeight(), getStanding(), getMaterialType(), getManufactureState());		
	}
}
