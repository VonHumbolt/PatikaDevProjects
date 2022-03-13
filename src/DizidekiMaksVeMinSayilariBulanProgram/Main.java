package DizidekiMaksVeMinSayilariBulanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] array = {-331, 123, 12, 43, -5};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		int number = sc.nextInt();
		
		int max  = 1000;
		int min = -1000;
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] < number && array[i] > min) {
				min = array[i];
			}
			if (array[i] > number && array[i] < max) {
				max = array[i];
			}
		}
		
		System.out.println("Girilen say�dan b�y�k en yak�n say�: " + max);
		System.out.println("Girilen say�dan k���n en yak�n say�: " + min);
	}
}
