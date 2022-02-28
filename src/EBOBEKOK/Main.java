package EBOBEKOK;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi-1: ");
		int number1 = sc.nextInt();
		
		System.out.print("Sayi-2: ");
		int number2 = sc.nextInt();
		
		int i = 1;
		int ebob = 1;
		int ekok = 1;
		
		while (i < number1 * number2) {
			
			if (i % number1 == 0 && i % number2 == 0) {
				ekok = i;
			}
			if (number1 % i == 0 && number2 % i == 0) {
				ebob=i;
			}
			i++;
		}
		System.out.println("EBOB: " + ebob);
		System.out.println("EKOK: " + ekok);
	}
}
