package ArrayExamples;

public class SearchArrayTest {

	public static void main(String[] args) {
		//array at 141 should return a value of 1 at index 1, however, 
		int[] list = {141, 145, 148, 150, 152};
		System.out.println(findWithinTolerance(list, 141, 1));
		System.out.println(findWithinTolerance(list, 145, 1));
		System.out.println(findIt2(list, 141, 1));
		System.out.println(findIt2(list, 145, 1));
		
	}
	
	public static int findWithinTolerance(int[] array, int target, int tolerance){
	    int low = 0;
	    int high = array.length - 1;
	    
	    if(target < array[tolerance]) {
	    	while(high >= low){
		        int middle = (low + high) / 2;
		        if(target < array[middle]){
		            high = middle - 1;
		        }else if (array[middle] == target){
		            return tolerance;
		        }else{
		            low = middle + 1;
		        }
		    }
		    return low - 1;
	    }else {
	    	return -1;
	    }	    
	}
	
	public static int findIt2(int[] array, int target, int tolerance) {
		int low = 0;
		int high = array.length - 1;
		while(high >= low){
			//int middle = (high + low) / 2;
			int middle = tolerance;
			if(target < array[middle]){
				high = middle - 1;
				return 1;
			}else if (array[middle] == target){
				return -1;
			}else{
				low = middle + 1;
				return -1;
			}
		}
		//return low + 1;
		return tolerance;
	}
	
	//Solution
	public static int findWithinToleranceSolution(int[] array, int target, int tolerance){
	    int low = 0;
	    int high = array.length - 1;

		while(high >= low){
		    int middle = (low + high) / 2;
			int currentValue = array[middle];
			if(Math.abs(currentValue - target) <= tolerance){
				return middle;
			}

		    if(currentValue >= target - tolerance){
		        high = middle - 1; //Search the left part
		    }else{
		        low = middle + 1; //Search the right portion
		    }
		}
		//return low + 1;
		return -1;
	}
}
