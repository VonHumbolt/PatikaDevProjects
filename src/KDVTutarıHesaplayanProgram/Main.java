package KDVTutarıHesaplayanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double input, result, kdvTutar;
		double kdv;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen fiyat giriniz: ");
		input = scanner.nextDouble();
		
		kdv = input > 0 && input < 1000 ? 0.18 : 0.08;
		
		result = input + input* kdv;
		kdvTutar = result - input;
		
		System.out.println("KDV'siz Fiyat: " + input);
		System.out.println("KDV'li Fiyat: " + result);
		System.out.println("KDV Tutarı: " + kdvTutar);
	}
}
