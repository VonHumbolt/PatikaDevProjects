package MaxVeMinBulma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kaç tane sayý gireceksiniz: ");
		int count = sc.nextInt();
		
		int i = 0;

		System.out.print("Sayý: ");
		int number = sc.nextInt();
		int max = number;
		int min = number;
		
		while (i < count-1) {
			System.out.print("Sayý: ");
			number = sc.nextInt();
			
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
			i++;
		}
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
		
}
