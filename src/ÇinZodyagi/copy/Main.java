package �inZodyagi.copy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do�um y�l�n�z� giriniz: ");
		int bornYear = sc.nextInt();
		
		switch (bornYear % 12) {
		case 0: {
			System.out.println("Maymun");
			break;
		}
		case 1: {
			System.out.println("Horoz");
			break;
		}
		case 2: {
			System.out.println("K�pek");
			break;
		}
		case 3: {
			System.out.println("Domuz");
			break;
		}
		case 4: {
			System.out.println("Fare");
			break;
		}
		case 5: {
			System.out.println("�k�z");
			break;
		}
		case 6: {
			System.out.println("Kaplan");
			break;
		}
		case 7: {
			System.out.println("Tav�an");
			break;
		}
		case 8: {
			System.out.println("Ejderha");
			break;
		}
		case 9: {
			System.out.println("Y�lan");
			break;
		}
		case 10: {
			System.out.println("At");
			break;
		}
		case 11: {
			System.out.println("Koyun");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + bornYear % 12);
		}
	}
}
