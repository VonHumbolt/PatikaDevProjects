package QuickSort;

public class AlgorithmQuickSort {

	public static void sortWithQuickSort(int[] arr, int low, int high) {
		
		if (low > high) {
			System.out.println("Hatalý deðerler...");
			return;
		}
		
		int middle = low + (high-low) /2;
		int pivotItem = arr[middle];
		int i = low;
		int j = high;
		
		while(i <= j) {
			while(arr[i] < pivotItem)
				i++;
			while(arr[j] > pivotItem) 
				j--;
			
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (low < j) {
			sortWithQuickSort(arr, low, j);
		}
		if (high > i) {
			sortWithQuickSort(arr, i, high);
		}
		
	}
}
