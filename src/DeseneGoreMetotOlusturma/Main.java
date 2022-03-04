package DeseneGoreMetotOlusturma;

import java.util.Scanner;

public class Main {
	static void f(int num) {
		System.out.print(num + " ");
        if (num <= 0) return;
        f(num - 5);
        
        System.out.print(num + " ");
		
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = sc.nextInt();
        
        f(number);
	}
}
