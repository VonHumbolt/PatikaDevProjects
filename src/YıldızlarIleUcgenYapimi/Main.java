package YýldýzlarIleUcgenYapimi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int number= sc.nextInt();
		
		for (int i = 1; i <= number; i++ ) {
			for (int j = 1; j<= (number - i) ; j++) {
				System.out.print(" ");
				
			}
			for (int k = 1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = number-1; i >= 1; i-- ) {

			for (int j = (number-i); j >= 1 ; j--) {
				System.out.print(" ");
				
			}
			for (int k = (2*i)-1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
