package HesapMakinesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		double number1 = sc.nextDouble();
		
		System.out.println("Ýkinci sayi: ");
		double number2 = sc.nextDouble();
		
		System.out.println("1-Toplama \n 2-Çýkarma \n 3-Çarpma \n 4-Bölme");
		System.out.println("Ýþlem seçiniz: ");
		int operator = sc.nextInt();
		
		switch (operator) {
		case 1: {
			
			System.out.println("Toplam: " + (number1 + number2));
			break;
		}
		case 2: {
			System.out.println("Çýkarma: " + (number1- number2));
			break;
		
		}
		case 3: {
			System.out.println("Çarpma: " + (number1* number2));
			break;
		}
		case 4: {
			System.out.println("Bölme: " + (number1 / number2));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}
}
