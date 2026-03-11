package ArrayExamples;

public class PassValueInputTemperatures {

	public static void main(String[] args) {
		
		double[] tempArray = new double [7];			
		recordTemperatures(tempArray);
		double[] newArray = findExtremes(tempArray);
		
		System.out.printf("Average temperature: %.2f%n", calculateAverage(tempArray));		
	    System.out.println("Lowest temperature: " + newArray[0]);
	    System.out.println("Highest temperature: " + newArray[1]);
	    System.out.println("Uniform within 5 degrees: " + isUniform(tempArray, 5));
	    System.out.println("Uniform within 10 degrees: " + isUniform(tempArray, 10));
		
		
	}
	
	public static void recordTemperatures(double[] array) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Print temperatures");
	    for(int i = 0; i < array.length; i++){
	        array[i] = input.nextDouble();
	    } 
	    
	    //Close scanner
	    input.close();
	}
	
	public static double calculateAverage(double[] array){
	    double sum = 0.0;
	    double avg = 0.0;
	    for(int i = 0; i < array.length; i++){
	        sum += array[i];
	    }
	    avg = sum/array.length;
	    return avg;
	}
	
	//Returns a new array
	public static double[] findExtremes(double[] array){
		double high = array[0];
	    double low = array[0];

	    for(int i = 0; i < array.length; i++){
	        if(array[i] > high){
	            high = array[i];
	        }
	        if(array[i] < low){
	            low = array[i];
	        }
	    }
	    double newList[] = {low, high};

	    return newList;
	}
	
	public static boolean isUniform(double[] array, double range){
	    boolean inRange = true;
	    double maxList[] = findExtremes(array);
	    
	    if((maxList[1] - maxList[0]) > range) {
	        inRange = false;
		}else{
	        inRange = true;
	    }
	    return inRange;  
	}
	
	
}
