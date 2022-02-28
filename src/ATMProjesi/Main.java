package ATMProjesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullan�c� Ad�n�z :");
            userName = sc.nextLine();
            System.out.print("Parolan�z : ");
            password = sc.nextLine();
            
            if (userName.equals("Patika") && password.equals("1234")) {
                System.out.println("Merhaba, Ho�geldiniz!");
                
                System.out.println("1-Para yat�rma\n" +
                        "2-Para �ekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-��k�� Yap");
                System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                int select = sc.nextInt();
                switch (select) {
				case 1: {
					System.out.print("Para miktar� : ");
                    int price = sc.nextInt();
                    balance += price;
					break;
				}
				case 2: {
					System.out.print("Para miktar� : ");
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
					System.out.println("Tekrar G�r��mek �zere. �yi G�nler!");
					break;
				}
				default:
					System.out.println("Ge�erli i�lem giriniz.");
					break;
				}
            } else {
            	right--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
                } else {
                    System.out.println("Kalan Hakk�n�z : " + right);
                }
            }
        }
	}
}
