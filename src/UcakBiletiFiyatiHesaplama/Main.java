package UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int km, age, typeOfFly;
		double pricePerKm = 0.10;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		km = sc.nextInt();
		
		System.out.print("Yaþýnýzý giriniz: ");
		age = sc.nextInt();
		
		System.out.print("Yolculuk tipini seçiniz ( Tek Yön => 1 , Çift Yön => 2 ): ");
		typeOfFly = sc.nextInt();
		
		double totalPrice = km * pricePerKm;
		
		if (km > 0 && age > 0 && (typeOfFly == 1 || typeOfFly == 2)) {
			if (age < 12) {
				totalPrice *= 0.5; 
			}
			else if (age >= 12 && age <= 24) {
				totalPrice = totalPrice - totalPrice * 0.10;
			}
			else if (age > 65) {
				totalPrice = totalPrice - totalPrice * 0.30;
			}
			if (typeOfFly == 2) {
				totalPrice = 2*(totalPrice - totalPrice * 0.20);
			}
			
			System.out.println("Toplam Tutar: " + totalPrice + " TL");
		}
		else {
			System.out.println("Hatalý veri girdiniz!");
		}
	}
}
