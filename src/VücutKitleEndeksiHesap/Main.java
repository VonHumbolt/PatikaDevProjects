package VücutKitleEndeksiHesap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		double boy = scanner1.nextDouble();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen kilonuzu giriniz: ");
		double kilo = scanner2.nextDouble();
		
		double result = kilo / Math.pow(boy, 2);
		System.out.println("Vücut Kitle Endeksiniz: " + result);
	}

}
