package GirilenSayidanKücükKuvvetBulanProgram;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		int number = sc.nextInt();
		
		for(int i = 0; i<number; i++) {
			int a = (int) Math.pow(4, i);
			int b = (int) Math.pow(5, i);
			
			if ( a < number) {
				System.out.println(a);				
			}
			if (b < number) {
				System.out.println(b);				
			}
		}
		
			
	}
}
