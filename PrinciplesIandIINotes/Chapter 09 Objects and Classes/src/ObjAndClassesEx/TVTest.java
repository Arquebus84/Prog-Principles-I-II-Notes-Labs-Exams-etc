package ObjAndClassesEx;

public class TVTest {

	public static void main(String[] args) {
		//Objects
		
		TV tv1 = new TV(); //Create a TV
		tv1.turnOn();	//Turn on the TV
		tv1.setChannel(30);	//Set the initial channel
		tv1.setVolume(3);	//Set the initial volume

		TV tv2 = new TV(); //Create a new TV
		tv2.turnOn();
		tv2.channelUp(); //The channel is initially 1 for the new TV, but is incremented by 1 here
		tv2.channelUp(); //The channel is incremented by 1 again, so it would be on channel 3
		tv2.volumeUp(); //The volume is initially 1, but is incremented by 1 here, and thus the volumeLevel is 2
		
		
		System.out.printf("tv1's channel is %d and volume level is %d%n", tv1.channel, tv1.volumeLevel);
		System.out.printf("tv2's channel is %d and volume level is %d%n", tv2.channel, tv2.volumeLevel);
	}

}
