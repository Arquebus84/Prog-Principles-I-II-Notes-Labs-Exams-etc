/**
* File: PAssign03.java
* Class: CSCI 1302
* Author: Matteo Ventura
* Created on: Feb 3, 2025
* Last Modified: Feb 6, 2025
* Description: Display the properties of 5 different computers with different specifications: two of the machines will have discrete
				graphics cards, but the others will have integrated cards with varying features; include the aggregated class, VideoCard, and the 
				composition IntegratedVideoCard and DiscreteVideoCard classes (subclasses of VideoCard)
*/
public class PAssign03 {
	public static void main(String[] args) {
		
		//Arrays of computers and video cards
		Computer computers[] = new Computer[5];
		VideoCard videoCards[] = new VideoCard[5];
		
		// Computer 1
		videoCards[0] = new IntegratedVideoCard();
		computers[0] = new Computer();
		//computers[0].setVideoCard(videoCards[0]); Check for later
		computers[0].setVideoCard(new VideoCard());
		
		// Computer 2
		videoCards[1] = new DiscreteVideoCard("PCIEx16", "8-pin");
		computers[1] = new Computer();
		computers[1].setVideoCard(new VideoCard("discrete", 575, 24));
		computers[1].setBrandAndModel("Dell", "Optiplex");
		
		// Computer 3
		videoCards[2] = new IntegratedVideoCard();
		computers[2] = new Computer();
		computers[2].setBrandAndModel("Lenovo", "IdeaCentre");
		computers[2].setVideoCard(new VideoCard("integrated", 120, 4));
		
		// Computer 4
		videoCards[3] = new DiscreteVideoCard();
		computers[3] = new Computer(new VideoCard("discrete", 150, 8));
		computers[3].setBrandAndModel("HP", "Omen Obelisk");
		
		// Computer 5
		videoCards[4] = new IntegratedVideoCard();
		computers[4] = new Computer(new VideoCard("integrated", -110, 3));
		computers[4].setBrandAndModel("Lenovo", "IdeaCentre");
		
		for(int i = 0; i < computers.length; i++) {
			System.out.println(computers[i].toString() + videoCards[i]);
		}
	}
}

class Computer{
	//Parameters
	private String brand;
	private String model;
	private VideoCard videoCard;
	
	//Default Constructor
	public Computer() {
		setBrand("OEM");
		setModel("Basic");
		setVideoCard(new IntegratedVideoCard());
	}
	//Convenience Constructor: VideoCard argument
	public Computer(VideoCard videoCard) {
		setBrand("OEM");
		setModel("Basic");
		setVideoCard(videoCard);
	}
	
	//Mutator Method: Brand and Model
	public void setBrandAndModel(String brand, String model) {
		setBrand(brand);
		setModel(model);
	}
	//Accessor and Mutator Methods: Brand and Model
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//Accessor and Mutator Methods: Video Card
	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}	
	public VideoCard getVideoCard() {
		return videoCard;
	}
	
	//Returns the brand, model, and information from the VideoCard getInfo method as a String
	public String toString() {
		return String.format("%s %s%nVideo Card Info:%n" + getVideoCard().toString(), brand, model);
	}
}

//VideoCard class
class VideoCard {
	//Parameters
	private String type;				//integrated, discrete, etc.
	private int powerRequirement;		//voltage in Watts 1-500W (default 400 if above 500, 75 if below 1)
	private int memorySize;				//memory size in GBs; should be kept between 1-16 GB (default 16 if above 16, 1 if below 1)
	
	//By default, a VideoCard should be of type “integrated”, a power requirement of 100 watts, and 1GB of memory
	//Default Constructor
	public VideoCard() {
		this("integrated", 100, 1);
	}
	//Convenience Constructor
	public VideoCard(String type, int powerRequirement, int memorySize) {
		//Video card type
		setType(type);
		
		// Power Requirements: voltage in Watts 1-500W (default 400 if above 500, 75 if below 1)
		setPowerRequirement(powerRequirement);
		
		// Memory: 1-16 GB (default 16 if above 16, 1 if below 1)
		setMemorySize(memorySize);
	}
	
	//Accessor and Mutator Methods: Video Card Type
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
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
	
	//Return the Information of the VideoCard's current state
	public String toString() {
		return String.format("Type: %s%nPower: %d W%nMemory: %d GB%n", getType(), getPowerRequirement(), getMemorySize());		
	}
}

/**class Subclass extends Superclass*/
//Integrated VideoCard class (subclass extends from VideoCard)
class IntegratedVideoCard extends VideoCard{
	private int sharedMemory;		//In Watts (by default has 2)
	private boolean usesComputerRAM;	//Boolean (by default it's F)
	
	public IntegratedVideoCard() {
		this(2, false);
	}
	
	public IntegratedVideoCard(int sharedMemory, boolean usesComputerRAM) {
		setSharedMemory(sharedMemory);		
		setUsesComputerRAM(usesComputerRAM);
	}
	
	//Accessor and Mutator methods: Shared Memory
	public int getSharedMemory() {
		return sharedMemory;
	}
	public void setSharedMemory(int sharedMemory) {
		if(sharedMemory > 0) {
			this.sharedMemory = sharedMemory;
		}else {
			this.sharedMemory = 2;
		}
	}
	
	//Accessor and Mutator methods: Shared Memory
	public boolean getUsesComputerRAM() {
		return usesComputerRAM;
	}
	public void setUsesComputerRAM(boolean usesComputerRAM) {
		this.usesComputerRAM = usesComputerRAM;
	}
	
	/**Use super keyword to reference the toString() from VideoCard class*/
	//Return the Information (from both the VideoCard and this class)
	public String toString() {
		//return String.format(super.toString() + "%nShared Memory: %d GB%nComputer RAM: %b%n", getSharedMemory(), getComputerRAM());
		return String.format("%nShared Memory: %d GB%nComputer RAM: %b%n", getSharedMemory(), getUsesComputerRAM());
	}
	
}

//Discrete VideoCard class (subclass extends from VideoCard)
class DiscreteVideoCard extends VideoCard{
	private String connectionType;		//PCIEx4, PCIEx8, etc. – discrete only (by default uses PCIEx8)
	private String usesExternalPower;	//6-pin, 8-pin, 12-pin, dual, etc. – discrete only (by default uses 6-pin)
	//private int usesExternalPower;
	//Include memorySize (int), and power
	
	//Default Constructor
	public DiscreteVideoCard(){
		this(100, 1, "PCIEx8", "6-pin");
	}
	
	//Convenience Constructors
	public DiscreteVideoCard(String connectionType, String usesExternalPower){
		this(100, 1, "PCIEx8", "6-pin");
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}
	public DiscreteVideoCard(int powerRequirement, int memorySize, String connectionType, String usesExternalPower) {
		super("discrete", powerRequirement, memorySize);
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}
	
	// Accessor and Mutator Methods: Connection Type
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getConnectionType() {
		return connectionType;
	}

	// Accessor and Mutator Methods: External Power Type
	public void setUsesExternalPower(String usesExternalPower) {
		this.usesExternalPower = usesExternalPower;
	}	
	public String getUsesExternalPower() {
		return usesExternalPower;
	}
	
	//Return the Information (from both the VideoCard and this class)
	public String toString() {
		//return String.format(super.toString() + "%nConnection: %s%nExternal Power: %s%n", getConnectionType(), getExternalPower());
		return String.format("%nConnection: %s%nExternal Power: %s%n", getConnectionType(), getUsesExternalPower());
	}
}