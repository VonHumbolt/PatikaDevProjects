package DizidekiTekrarEdenCiftSayilariBulma;

public class Main {
	public static void main(String[] args) {
		
		int[] list = {1,23,3,4,5,1,2,5,35,2,2,2,4,5,5,16,13,16};
		int[] resultList = new int[list.length];
		int startIndex = 0;
		
		for (int i = 0; i<list.length; i++) {
			for (int j = 0; j < list.length ; j++) {
				if (i != j && list[i] == list[j]) {
					if (list[i] % 2 == 0) {

						if (!isFind(resultList, list[i])) {
							
							resultList[startIndex++] = list[i];
							break;
						}
					}
				}
			}
		}
		
		for (int i : resultList) {
			if (i != 0)
				System.out.print(i + " ");
 		}
	}
	
	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}
}
