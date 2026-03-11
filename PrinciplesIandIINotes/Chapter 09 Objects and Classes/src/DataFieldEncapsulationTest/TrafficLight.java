package DataFieldEncapsulationTest;

public class TrafficLight {
	
	//Parameters: all the data fields are encapsulated in order to ensure that they are not 
	private int durationInSeconds;
	private int yellowDelay;
	private String junctionId;
	private char state;

	//Getter method (accessor)
	public int getDurationInSeconds(){
	    return durationInSeconds;
	}
	
	//Setter method (mutilator)
	public void setDurationInSeconds(int newDurationInSeconds){
	    durationInSeconds = newDurationInSeconds;
	}

	public int getYellowDelay(){
	    return yellowDelay;
	}

	public void setYellowDelay(int newYellowDelay){
	    yellowDelay = newYellowDelay;
	}

	public String getJunctionId(){
	    return junctionId;
	}

	public void setJunctionId(String newJunctionId){
	    junctionId = newJunctionId;
	}

	public char getState(){
	    return state;
	}

	public void setState(char newState){
	    state = newState;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
