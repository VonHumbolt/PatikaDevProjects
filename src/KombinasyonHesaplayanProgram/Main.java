package KombinasyonHesaplayanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();
		System.out.print("r: ");
		int r = sc.nextInt();
		
		if (n >= 0 && r >= 0 && r <= n) {
			int result = factorial(n) / (factorial(r) * factorial(n-r));
			System.out.println("Kombinasyon: " + result);
		}else {			
			System.out.println("Lütfen geçerli deðerler giriniz.");
		}
	}
	
	public static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i<=number; i++) {
			fact *= i;
		}
		return fact;
	}
}
