package ATMProjesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanýcý Adýnýz :");
            userName = sc.nextLine();
            System.out.print("Parolanýz : ");
            password = sc.nextLine();
            
            if (userName.equals("Patika") && password.equals("1234")) {
                System.out.println("Merhaba, Hoþgeldiniz!");
                
                System.out.println("1-Para yatýrma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çýkýþ Yap");
                System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                int select = sc.nextInt();
                switch (select) {
				case 1: {
					System.out.print("Para miktarý : ");
                    int price = sc.nextInt();
                    balance += price;
					break;
				}
				case 2: {
					System.out.print("Para miktarý : ");
                    int price = sc.nextInt();
       
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                    }
					break;
				}
				case 3: {
					System.out.println("Bakiyeniz : " + balance);
					break;
				}
				case 4: {
					System.out.println("Tekrar Görüþmek Üzere. Ýyi Günler!");
					break;
				}
				default:
					System.out.println("Geçerli iþlem giriniz.");
					break;
				}
            } else {
            	right--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkýnýz : " + right);
                }
            }
        }
	}
}
