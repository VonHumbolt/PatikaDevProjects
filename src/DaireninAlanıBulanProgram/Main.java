package DaireninAlan�BulanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double pi = 3.14;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Yar��ap� giriniz: ");
		int r = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Merkez a��y� giriniz: ");
		int a = scanner2.nextInt();
		
		double area = (Math.pow(r, 2) * pi * a) / 360;
		System.out.println("Alan: " + area);
	}
}
