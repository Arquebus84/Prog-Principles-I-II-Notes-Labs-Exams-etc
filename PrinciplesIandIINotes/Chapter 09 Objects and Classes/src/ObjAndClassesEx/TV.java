package ObjAndClassesEx;

public class TV {
	int channel = 1; // Default channel is 1	This represents the current channel (1 to 120) of this TV 
	int volumeLevel = 1; // Default volume level is 1	This represents the current volume (1 to 7) of this TV
	boolean on = false; // By default TV is off		This represents the indication whether the TV is turned on/off
	
	//Constructs a default TV object
	public TV() {  
		
	}
	
	//Turns on the TV
	public void turnOn() {
		on = true;
	}
	
	//Turns off the TV
	public void turnOff() {
		on = false;
	}
	
	//This sets a new channel for the TV	public void setChannel(int newChannel) {		if (on && newChannel >= 1 && newChannel <= 120)			channel = newChannel;	}	
	//This sets a new volume for the TV 	public void setVolume(int newVolumeLevel) {		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)			volumeLevel = newVolumeLevel;	}	
	//This increases the channel number by 1	public void channelUp() {		if (on && channel < 120)			channel++;	}	
	//This decreases the channel number by 1	public void channelDown() {
		if (on && channel > 1)
			channel--;	}	
	//This increases the volume level by 1	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;	}
	//This decreases the volume level by 1	public void volumeDown() {
		if (on && volumeLevel > 1)
			volumeLevel--;	}
}
