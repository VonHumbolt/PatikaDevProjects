package PalindromikKelimeBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kelimeyi giriniz: ");
		String str = sc.nextLine();
		
		String[] strList = str.split("");
		
		String reverseStr = "";
		
		for (int i = strList.length - 1 ; i>=0; i-- ) {
			reverseStr += strList[i];
		}
		
		if (str.equals(reverseStr)) {			
			System.out.println("Palindromik Kelimedir!");
		} else {
			System.out.println("Palindromik Kelime Deðildir!");
		}
	}

}
