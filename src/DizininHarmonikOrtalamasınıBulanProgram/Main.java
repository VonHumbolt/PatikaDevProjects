package DizininHarmonikOrtalamasýnýBulanProgram;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		double harmonik = 0;
		
		for (int i = 0; i<array.length ; i++) {
			harmonik += (1 / array[i]);
		}
		
		double result = array.length / harmonik;
		
		System.out.println("Harmonik Ortalama= " + result);
	}
}
