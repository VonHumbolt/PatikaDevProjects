package MaxVeMinBulma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ka� tane say� gireceksiniz: ");
		int count = sc.nextInt();
		
		int i = 0;

		System.out.print("Say�: ");
		int number = sc.nextInt();
		int max = number;
		int min = number;
		
		while (i < count-1) {
			System.out.print("Say�: ");
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
