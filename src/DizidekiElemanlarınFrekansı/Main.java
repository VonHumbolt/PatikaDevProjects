package DizidekiElemanlarýnFrekansý;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] dublicateList = new int[arr.length];
		int startIndex = 0;
		
		System.out.println("Tekrar Sayýlarý");
		
		for (int i = 0; i <arr.length ; i++) {
			int item = arr[i];
			int count = 1;
			for (int j = 0; j<arr.length; j++) {
				if ( i != j && item == arr[j]) {
					count += 1;
				}
			}
			if (!isExist(dublicateList, item)) {				
				dublicateList[startIndex++] = item;
				System.out.println(item + " Sayýsý " + count + " kere tekrar etti!");
			}
		}
	}
	
	static boolean isExist(int[] arr, int value) {
		for (int i : arr) {
			if (value == i) 
				return true;
		}
		return false;
	}
}
