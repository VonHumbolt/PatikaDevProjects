package V�cutKitleEndeksiHesap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("L�tfen boyunuzu (metre cinsinden) giriniz: ");
		double boy = scanner1.nextDouble();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("L�tfen kilonuzu giriniz: ");
		double kilo = scanner2.nextDouble();
		
		double result = kilo / Math.pow(boy, 2);
		System.out.println("V�cut Kitle Endeksiniz: " + result);
	}

}
