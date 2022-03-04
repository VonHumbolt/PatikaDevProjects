package Recursive›leAsalSayi;

import java.util.Scanner;

public class Main {
	
	static int isPrime(int num, int halfOfNum) {
		
		if (num < 2)
			return 0;
		if (halfOfNum == 1)
			return 1;
		else  {
			if (num % halfOfNum == 0)
				return 0;
			else
				return isPrime(num, halfOfNum-1);
		}
		
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi: ");
        int number = sc.nextInt();
        
        if (isPrime(number, number / 2) == 0)
        	System.out.println(number + " Asal Say˝ Deildir!");
        else
        	System.out.println(number + " Asal Say˝d˝r.");
        
        
	}
}
