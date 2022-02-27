package ÜslüSayiHesap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Üs alýncak sayi: ");
		int n = sc.nextInt();
		
		System.out.println("Üs olacak sayý: ");
		int k = sc.nextInt();
		
		int result = 1;
		
		for (int i = 0; i < k; i++) {
			result *= n;
		}
		System.out.println("Sonuç: " + result);
	}
}
