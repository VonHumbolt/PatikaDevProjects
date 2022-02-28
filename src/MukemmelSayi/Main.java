package MukemmelSayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayý: ");
		int number = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i < number; i++) {
			if (number % i == 0) {
				result += i;
			}
		}
		
		if (result == number) {
			System.out.println(number + " mükemmel sayýdýr.");
		}
		else {
			System.out.println(number + " mükemmel sayý deðildir.");
		}
	}
}
