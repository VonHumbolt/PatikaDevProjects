package KullaniciGirisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kullan�c� Ad�n�z: ");
		String username = sc.nextLine();
		
		System.out.print("�ifreniz: ");
		String password = sc.nextLine();
		
		if (username.equals("Patika") && password.equals("1234")) {
			System.out.println("Ho�geldiniz.");
		} else {
			if (!password.equals("1234")) {
				System.out.print("�ifre yanl��! �ifrenizi s�f�rlamak isterseniz 0 a bas�n! ");
				int input = sc.nextInt();
				
				if (input == 0) {
					System.out.print("Yeni �ifre: ");
					Scanner sc2 = new Scanner(System.in);
					String newPassword = sc2.nextLine();
					
					if (newPassword.equals("1234")) {
						System.out.println("�ifre olu�turulamad�! L�tfen ba�ka bir �ifre deneyiniz.");
					}
					else {
						System.out.println("�ifre Olu�turuldu.");
						
					}
				}
			}
			else {
				System.out.println("Giri� yap�lamad�.");
			}
		}
		
		
	}
}
