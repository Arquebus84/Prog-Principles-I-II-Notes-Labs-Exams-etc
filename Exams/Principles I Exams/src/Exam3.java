
public class Exam3 {

	public static void main(String[] args) {
		
		double[] data = {2.3, 1.4, 6.7, 8.6};
		int[] data2 = {2, 4, 6, 8, 7};
		double smallest  = data[0];
		for(int i = 0; i < data.length; i++) {
			if(smallest  > data[i]) {
				smallest  = data[i];
			}
		}
		System.out.println(smallest);
		
		double[] milesTravelled = new double[5];
	    double[] gallonsUsed = new double[5];

	    System.out.println("Total cars: " + milesTravelled.length);
	    for(int i = 0; i < milesTravelled.length; i++){
	    	milesTravelled[i] = 1 + Math.random() * 101;
	    	gallonsUsed[i] = 1 + Math.random() * 101;
	    	System.out.printf("Car " + (i + 1) + " travelled %.2f miles with %.2f gallons of fuel, therefore"
	    			+ " travelling a total of %.2f miles for every gallon.%n", milesTravelled[i], gallonsUsed[i], calculateMPG(milesTravelled[i], gallonsUsed[i]));
	    }
		
	    System.out.println(linearSearch(data2, 7));
	    
	    int[] intArray = {4, 6, 24, 48};
	    printDivisFourSix(intArray);
	    
	    double[] sensorReadings = new double[25];
	    sensorReadings[sensorReadings.length - 2] = 7.6;
	    
	    System.out.println(sensorReadings[23]);
	    
	    
	    //Make exact copy of 1D array
	    int[] copyData = new int[data2.length];
	    for(int i = 0; i < copyData.length; i++){
	    	copyData[i] = data2[i];
	    	System.out.print(copyData[i] + " ");
	    }
	}
	
	
	public static double calculateMPG(double miles, double gallons){
		
		return (miles / gallons);
	}
	
	public static int linearSearch(int[] arr, double key){
		
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printDivisFourSix(int[] array){
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 4 == 0 && array[i] % 6 == 0) {
				System.out.print("Yes ");
			}else {
				System.out.print("No ");
			}
		}
	}

}
