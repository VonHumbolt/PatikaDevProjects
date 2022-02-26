package KullaniciGirisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kullanýcý Adýnýz: ");
		String username = sc.nextLine();
		
		System.out.print("Þifreniz: ");
		String password = sc.nextLine();
		
		if (username.equals("Patika") && password.equals("1234")) {
			System.out.println("Hoþgeldiniz.");
		} else {
			if (!password.equals("1234")) {
				System.out.print("Þifre yanlýþ! Þifrenizi sýfýrlamak isterseniz 0 a basýn! ");
				int input = sc.nextInt();
				
				if (input == 0) {
					System.out.print("Yeni þifre: ");
					Scanner sc2 = new Scanner(System.in);
					String newPassword = sc2.nextLine();
					
					if (newPassword.equals("1234")) {
						System.out.println("Þifre oluþturulamadý! Lütfen baþka bir þifre deneyiniz.");
					}
					else {
						System.out.println("Þifre Oluþturuldu.");
						
					}
				}
			}
			else {
				System.out.println("Giriþ yapýlamadý.");
			}
		}
		
		
	}
}
