package PalindromSayi;

import java.util.Scanner;

public class Main {
	public static boolean isPalindrome(int number) {
		int temp = number,lastNumber, reversedNumber = 0;
		
		while (temp != 0) {
			lastNumber = temp % 10;
			reversedNumber = (10*reversedNumber) + lastNumber;
			temp /= 10;
		}
		
		if (number == reversedNumber)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int num = sc.nextInt();
		
		System.out.println(isPalindrome(num));
		
	}
}
