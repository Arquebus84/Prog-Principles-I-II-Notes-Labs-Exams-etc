
public class MergeSortTest {

	public static void main(String[] args) {
		int[] unsorted = {2, 0, -45, -22, -1, 36, 9, 24, 15};
		printArray(unsorted);
		MergeSort(unsorted, 0, unsorted.length - 1);
		System.out.println();
		printArray(unsorted);
		
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void MergeSort(int[] array, int l, int r) {
		if(l >= r) {
			return;
		}
		
		int mid = (l + r)>>1;
		
		MergeSort(array, l, mid);
		MergeSort(array, mid+1, r);
		Merge(array, l, r, mid);
	}
	
	public static void Merge(int[] array, int l, int r, int mid) {
		int Nl = mid - l + 1;
		int Nr = r - mid;
		
		int[] L = new int[Nl];
		int[] R = new int[Nr];
		
		for(int i = 0; i < Nl; i++) {
			L[i] = array[l + i];
		}
		for(int i = 0; i < Nr; i++) {
			R[i] = array[mid + i + 1];
		}
		
		int leftIndex = 0, rightIndex = 0, index = l;
		while(leftIndex < Nl && rightIndex < Nr) {
			if(L[leftIndex] < R[rightIndex]) {
				array[index] = L[leftIndex];
				leftIndex++;
			}else {
				array[index] = R[rightIndex];
				rightIndex++;
			}
			index++;
		}
		
		while(leftIndex < Nl) {
			array[index]=L[leftIndex];
			leftIndex++;
			index++;
		}
		
		while(rightIndex < Nr) {
			array[index] = R[rightIndex];
			rightIndex++;
			index++;
		}
	}

}
