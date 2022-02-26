package ManavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Armut kaç kg? : ");
		double armutKg = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Elma kaç kg? : ");
		double elmaKg = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Domates kaç kg? : ");
		double domatesKg = sc3.nextDouble();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Muz kaç kg? : ");
		double muzKg = sc4.nextDouble();

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Patlýcan kaç kg? : ");
		double patlicanKg = sc5.nextDouble();
		
		double result = armut * armutKg + elma * elmaKg + domates * domatesKg + muz * muzKg + patlican * patlicanKg;
		System.out.println("Toplam Tutar: " + result);
	}
}
