package TaksimetreProgram�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int km;
		double priceForPaid = 10;
		int minPrice = 20;
		double kmForTaksimetre = 2.20;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ka� km gideceksiniz: ");
		km = scanner.nextInt();
		
		priceForPaid = priceForPaid + km * kmForTaksimetre;
		double result = priceForPaid > 20 ? priceForPaid : 20;
		System.out.println("�denecek Tutar: " + result);
		
	}
}
