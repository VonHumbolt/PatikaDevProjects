package TersUcgen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Basamak Sayýsý: ");
		int number = sc.nextInt();
		
		for(int i=number; i >= 1; i--) {
			
			for (int j = (number - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = (2*i)-1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
