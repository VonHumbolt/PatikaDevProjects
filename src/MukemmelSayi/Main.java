package MukemmelSayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Say�: ");
		int number = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i < number; i++) {
			if (number % i == 0) {
				result += i;
			}
		}
		
		if (result == number) {
			System.out.println(number + " m�kemmel say�d�r.");
		}
		else {
			System.out.println(number + " m�kemmel say� de�ildir.");
		}
	}
}
