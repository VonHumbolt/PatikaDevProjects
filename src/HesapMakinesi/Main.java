package HesapMakinesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		double number1 = sc.nextDouble();
		
		System.out.println("�kinci sayi: ");
		double number2 = sc.nextDouble();
		
		System.out.println("1-Toplama \n 2-��karma \n 3-�arpma \n 4-B�lme");
		System.out.println("��lem se�iniz: ");
		int operator = sc.nextInt();
		
		switch (operator) {
		case 1: {
			
			System.out.println("Toplam: " + (number1 + number2));
			break;
		}
		case 2: {
			System.out.println("��karma: " + (number1- number2));
			break;
		
		}
		case 3: {
			System.out.println("�arpma: " + (number1* number2));
			break;
		}
		case 4: {
			System.out.println("B�lme: " + (number1 / number2));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}
}
