package ArmstrongSayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi: ");
		int number = sc.nextInt();
		int sum = 0;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("Basamaklar Toplamý: " + sum);
	}
}
