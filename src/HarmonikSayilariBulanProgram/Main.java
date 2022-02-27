package HarmonikSayilariBulanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayýyý Giriniz: ");
		int number = sc.nextInt();
		double result = 0;
		
		for (int i = 1; i <= number; i++) {
			result += (double) (1.0/i);
			
		}
		
		System.out.println("Harmonik Seri: " + result);
	}
}
