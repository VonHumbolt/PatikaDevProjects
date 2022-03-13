package DiziyiKucuktenBuyugeSiralama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizinin Boyutu: ");
		int dimension = sc.nextInt();
		
		int[] list = new int[dimension];
		
		for (int i = 0; i<dimension; i++) {
			System.out.print(i + ". Elemaný Giriniz:");
			list[i] = sc.nextInt();
			
			for (int j = 0; j < i; j++) {
				if (list[i] < list[j]) {
					int temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		
		for (int i : list) 
			System.out.print(i + " ");
	}
}
