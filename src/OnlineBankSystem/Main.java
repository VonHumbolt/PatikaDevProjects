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
			System.out.println("--------------Hoþgeldiniz------------------");
			System.out.println("1 - Giriþ Yap");
			System.out.println("2 - Hesap Oluþtur");
			System.out.println("3 - Çýkýþ Yap");
			int choice = sc.nextInt();
			
			if (choice == 3) {
				System.out.println("Çýkýþ yapýldý! Ýyi günler!");
				break;
			} else if (choice == 2) {
				System.out.println("--------------Hesap Oluþtur------------------");
				System.out.print("Kimlik Numarasý: ");
				String identityNumber = sc.next();
				System.out.print("Þifre: ");
				String password = sc.next();
				System.out.print("Para: ");
				double money = sc.nextDouble();				
				
				customerManager.register(identityNumber, password, money);
				
				System.out.println("               Hesap Oluþturuldu!                ");
			} else if (choice == 1) {
				
				System.out.println("--------------Giriþ Yap------------------");
				System.out.print("Kimlik Numarasý: ");
				String identityNumber = sc.next();
				System.out.print("Þifre: ");
				String password = sc.next();
				
				customerManager.login(identityNumber, password);
				System.out.println("               Giriþ Ýþlemi Baþarýlý                ");
				System.out.println("--------------Ýþlemler------------------");
				System.out.println("1 - Para Transferi");
				System.out.println("2 - Kart Borcu Öde");
				System.out.println("3 - Kredi Borcu Öde");
				System.out.println("4 - Çýkýþ Yap");
				
				int selected = sc.nextInt();
				
				switch (selected) {
				case 1:
					System.out.println("--------------Para Transferi------------------");
					System.out.print("Hesap Numarasý: ");
					String fromAccount = sc.next();
					System.out.print("Hangi Hesaba: ");
					String toAccount = sc.next();
					System.out.print("Gönderilecek Tutar: ");
					double money = sc.nextDouble();
					
					customerManager.moneyTransfer(fromAccount, toAccount, money);
					break;
					
				case 2:
					System.out.println("--------------Kart Borcu Öde------------------");
					System.out.print("Hesap Numarasý: ");
					String account = sc.next();
					
					customerManager.payCardDebt(account);
					break;
				case 3:
					System.out.println("--------------Kredi Borcu Öde------------------");
					System.out.print("Hesap Numarasý: ");
					String accountNum = sc.next();
					
					customerManager.payDebt(accountNum);
					break;
				case 4:
					break;
					
				default:
					System.out.println("Geçersiz Ýþlem");
					break;
				}

			} else {
				System.out.println("Lütfen Geçerli bir iþlem seçiniz!");
			}
			
		}
		
	}

}
