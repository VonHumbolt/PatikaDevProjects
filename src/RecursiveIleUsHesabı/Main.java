package RecursiveIleUsHesab�;

import java.util.Scanner;

public class Main {
	static int pow(int num1, int num2) {
		
		if (num2 == 1) {
			return num1;
		}
		if (num2 == 0)
			return 1;
		
		return num1 * pow(num1, num2-1);
		
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban de�er: ");
        int number1 = sc.nextInt();
        
        System.out.print("�s de�eri: ");
        int number2 = sc.nextInt();
        
        System.out.println("Sonu�: " + pow(number1, number2));
	}
}
