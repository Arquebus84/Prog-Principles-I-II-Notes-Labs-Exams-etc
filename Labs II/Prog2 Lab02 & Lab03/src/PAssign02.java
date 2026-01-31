/**
* File: PAssign02.java
* Class: CSCI 1302
* Author: Matteo Ventura
* Created on: Jan 27, 2025
* Last Modified: Jan 27, 2025
* Description: Assignment will display the properties of 5 different computers with different specifications: two of the machines will have discrete
				graphics cards, but the others will have integrated cards with varying features
*/
public class PAssign02 {

	public static void main(String[] args) {
		//5 computers array
		Computer computers[] = new Computer[5];
		
		//Specifying each computer cards
		//Computer 1
		computers[0] = new Computer(new VideoCard());
		
		//Computer 2
		computers[1] = new Computer();
		computers[1].setBrandAndModel("Dell", "Optiplex");
		computers[1].setVideoCard("discrete", "PCIEx16", 575, "8-pin", 24);
		
		//Computer 3
		computers[2] = new Computer();
		computers[2].setBrandAndModel("Lenovo", "IdeaCentre");
		computers[2].setVideoCard("integrated", null, 120, null, 4);
		
		//Computer 4
		computers[3] = new Computer();
		computers[3].setBrandAndModel("HP", "Omen Obelisk");
		computers[3].setVideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
		
		//Computer 5
		computers[4] = new Computer();
		computers[4].setBrandAndModel("Lenovo", "IdeaCentre");
		computers[4].setVideoCard("integrated", null, -110, null, 2);
		
		for(int i = 0; i < computers.length; i++) {
			System.out.println(computers[i].getInfo());
		}
	}

}

class Computer{
	//Parameters
	private String brand;
	private String model;
	private VideoCard videoCard;
	
	public Computer() {
		brand = "OEM";
		model = "Basic";
		videoCard = new VideoCard();
	}
	public Computer(VideoCard videoCard) {
		brand = "OEM";
		model = "Basic";
		this.videoCard = videoCard;
	}
	
	//Mutator Method: Brand and Model
	public void setBrandAndModel(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	//Accessor Methods: Brand and Model
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	
	//Accessor and Mutator Methods: Video Card
	public void setVideoCard(String type, String connectionType, int powerRequirements, String externalPowerType, int memory) {
		this.videoCard = new VideoCard(type, connectionType, powerRequirements, externalPowerType, memory);
	}	
	public VideoCard getVideoCard() {
		return videoCard;
	}
	
	//Returns the brand, model, and information from the VideoCard getInfo method as a String
	public String getInfo() {
		return String.format("%s %s%nVideo Card Info:%n" + videoCard.getInfo(), brand, model);
	}
}

class VideoCard{
	//Parameters
	private String type;				//integrated, discrete, etc.
	private String connectionType;		//CIEx4, PCIEx8, etc. – discrete only
	private int powerRequirement;		//voltage in Watts 1-500W (default 400 if above 500, 75 if below 1)
	private String externalPower;		//6-pin, 8-pin, 12-pin, dual, etc. – discrete only
	private int memorySize;				//memory size in GBs; should be kept between 1-16 GB (default 16 if above 16, 1 if below 1)
	
	//By default, a VideoCard should be of type “integrated”, with a motherboard connection type of “N/A”, a power requirement of 100 watts, an 
	//	external power type of “N/A”, and 1GB of memory
	//Default Constructor
	public VideoCard() {
		this("integrated", "N/A", 100, "N/A", 1);
	}
	//Convenience Constructor
	public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {
		//Video card type
		this.type = type;
		
		//Connection type
		//this.connectionType = connectionType; (original)
		if(connectionType == null) {
			this.connectionType = "N/A";
		}else {
			this.connectionType = connectionType;
		}
		
		// Power Requirements: voltage in Watts 1-500W (default 400 if above 500, 75 if below 1)
		if(powerRequirement > 0 && powerRequirement <= 500) {
			this.powerRequirement = powerRequirement;
		}else if (powerRequirement < 1) {
			this.powerRequirement = 75;
		}else {
			this.powerRequirement = 400;
		}
		
		// External Power Type
		//this.externalPowerType = externalPowerType; (original)
		if(externalPower == null) {
			this.externalPower = "N/A";
		}else {
			this.externalPower = externalPower;
		}
		
		// Memory: 1-16 GB (default 16 if above 16, 1 if below 1)
		if(memorySize > 0 && memorySize <= 16) {
			this.memorySize = memorySize;
		}else if(memorySize < 1) {
			this.memorySize = 1;
		}else {
			this.memorySize = 16;
		}
	}
	
	//Accessor and Mutator Methods: Video Card Type
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	//Accessor and Mutator Methods: Connection Type
	public void setConnectionType(String connectionType) {
		if(connectionType == null) {
			this.connectionType = "N/A";
		}else {
			this.connectionType = connectionType;
		}
	}
	public String getConnectionType() {
		return connectionType;
	}

	//Accessor and Mutator Methods: Power Requirements
	public void setPowerRequirement(int powerRequirement) {
		//voltage in Watts 1-500W (default 400 if above 500, 75 if below 1)
		if(powerRequirement > 0 && powerRequirement <= 500) {
			this.powerRequirement = powerRequirement;
		}else if (powerRequirement < 1) {
			this.powerRequirement = 75;
		}else {
			this.powerRequirement = 400;
		}		
	}
	public int getPowerRequirement() {
		return powerRequirement;
	}
	
	//Accessor and Mutator Methods: External Power Type
	public void setExternalPower(String externalPower) {
		if(externalPower == null) {
			this.externalPower = "N/A";
		}else {
			this.externalPower = externalPower;
		}
	}
	public String getExternalPower() {
		return externalPower;
	}
	
	//Accessor and Mutator Methods: Memory Size
	public void setMemorySize(int memorySize) {
		// Memory: 1-16 GB (default 16 if above 16, 1 if below 1)
		if(memorySize > 0 && memorySize <= 16) {
			this.memorySize = memorySize;
		}else if(memorySize < 1) {
			this.memorySize = 1;
		}else {
			this.memorySize = 16;
		}
	}
	public int getMemorySize() {
		return memorySize;
	}
	
	public String getInfo() {
		return String.format("Type: %s%nConnection: %s%nPower: %dW%nExt Power: %s%n"
				+ "Memory: %sGB%n", getType(), getConnectionType(), getPowerRequirement(), getExternalPower(), getMemorySize());
	}
}