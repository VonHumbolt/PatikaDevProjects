package TekSayilarinToplaminiBul;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int number = sc.nextInt();
		int totalNumber = 0;
		
		while (number > 0) {
			
			if (number % 4 == 0) {
				totalNumber += number;
			}
			System.out.print("Sayi giriniz: ");
			number = sc.nextInt();
		}
		System.out.println("Toplam: " + totalNumber);
	}
}
