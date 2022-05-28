package QuickSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,6,3,8,12,7,5,1};
		
		AlgorithmQuickSort.sortWithQuickSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}
	
}
