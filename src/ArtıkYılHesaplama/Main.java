package Art�kY�lHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Y�l� Giriniz: ");
		int year = sc.nextInt();
		
		
		if (year % 400 == 0) {
			System.out.println(year + " bir art�k y�ld�r !");
		}
		else {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + " bir art�k y�ld�r !");
			}
			else {
				System.out.println(year + " bir art�k y�l de�ildir !");
			}
		}
	}
}
