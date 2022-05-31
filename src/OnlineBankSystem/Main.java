package OnlineBankSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		
		// Default System Users
		customerManager.register("1234214213124", "password", 1500.232);
		customerManager.register("523523523", "123", 2200.652);
		customerManager.register("652465896", "sifresifre", 500.0);
		
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			
			System.out.println("--------------Online Bank------------------");
			System.out.println("--------------Ho�geldiniz------------------");
			System.out.println("1 - Giri� Yap");
			System.out.println("2 - Hesap Olu�tur");
			System.out.println("3 - ��k�� Yap");
			int choice = sc.nextInt();
			
			if (choice == 3) {
				System.out.println("��k�� yap�ld�! �yi g�nler!");
				break;
			} else if (choice == 2) {
				System.out.println("--------------Hesap Olu�tur------------------");
				System.out.print("Kimlik Numaras�: ");
				String identityNumber = sc.next();
				System.out.print("�ifre: ");
				String password = sc.next();
				System.out.print("Para: ");
				double money = sc.nextDouble();				
				
				customerManager.register(identityNumber, password, money);
				
				System.out.println("               Hesap Olu�turuldu!                ");
			} else if (choice == 1) {
				
				System.out.println("--------------Giri� Yap------------------");
				System.out.print("Kimlik Numaras�: ");
				String identityNumber = sc.next();
				System.out.print("�ifre: ");
				String password = sc.next();
				
				customerManager.login(identityNumber, password);
				System.out.println("               Giri� ��lemi Ba�ar�l�                ");
				System.out.println("--------------��lemler------------------");
				System.out.println("1 - Para Transferi");
				System.out.println("2 - Kart Borcu �de");
				System.out.println("3 - Kredi Borcu �de");
				System.out.println("4 - ��k�� Yap");
				
				int selected = sc.nextInt();
				
				switch (selected) {
				case 1:
					System.out.println("--------------Para Transferi------------------");
					System.out.print("Hesap Numaras�: ");
					String fromAccount = sc.next();
					System.out.print("Hangi Hesaba: ");
					String toAccount = sc.next();
					System.out.print("G�nderilecek Tutar: ");
					double money = sc.nextDouble();
					
					customerManager.moneyTransfer(fromAccount, toAccount, money);
					break;
					
				case 2:
					System.out.println("--------------Kart Borcu �de------------------");
					System.out.print("Hesap Numaras�: ");
					String account = sc.next();
					
					customerManager.payCardDebt(account);
					break;
				case 3:
					System.out.println("--------------Kredi Borcu �de------------------");
					System.out.print("Hesap Numaras�: ");
					String accountNum = sc.next();
					
					customerManager.payDebt(accountNum);
					break;
				case 4:
					break;
					
				default:
					System.out.println("Ge�ersiz ��lem");
					break;
				}

			} else {
				System.out.println("L�tfen Ge�erli bir i�lem se�iniz!");
			}
			
		}
		
	}

}
