package ArtýkYýlHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Yýlý Giriniz: ");
		int year = sc.nextInt();
		
		
		if (year % 400 == 0) {
			System.out.println(year + " bir artýk yýldýr !");
		}
		else {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + " bir artýk yýldýr !");
			}
			else {
				System.out.println(year + " bir artýk yýl deðildir !");
			}
		}
	}
}
