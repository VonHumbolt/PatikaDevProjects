package �sl�SayiHesap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�s al�ncak sayi: ");
		int n = sc.nextInt();
		
		System.out.println("�s olacak say�: ");
		int k = sc.nextInt();
		
		int result = 1;
		
		for (int i = 0; i < k; i++) {
			result *= n;
		}
		System.out.println("Sonu�: " + result);
	}
}
