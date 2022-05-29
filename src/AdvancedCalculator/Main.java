package AdvancedCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("------------ Hesap Makinesi -----------------");
		System.out.println("Ýþlem Seçiniz");
		System.out.println("--------------");
		System.out.println("1- Toplama");
		System.out.println("2- Çýkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		System.out.println("5- Üs Alma");
		System.out.println("6- Faktoriyel");
		System.out.println("7- Mod");
		System.out.println("8- Mutlak Deðer");
		System.out.println("9- Türev");
		System.out.println("10- Ýntegral");
		
		System.out.println("------------------------------------------");
		System.out.print("Seçim: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int x,y;
		switch (choice) {
		case 1:
			System.out.print("Sayý-1: ");
			x = sc.nextInt();
			System.out.print("Sayý-2: ");
			y = sc.nextInt();
			System.out.println(calc.add(x,y));
			break;

		case 2:
			System.out.print("Sayý-1: ");
			x = sc.nextInt();
			System.out.print("Sayý-2: ");
			y = sc.nextInt();
			System.out.println(calc.substract(x,y));
			break;
		case 3:
			System.out.print("Sayý-1: ");
			x = sc.nextInt();
			System.out.print("Sayý-2: ");
			y = sc.nextInt();
			System.out.println(calc.multiply(x,y));
			break;
		case 4:
			System.out.print("Sayý-1: ");
			x = sc.nextInt();
			System.out.print("Sayý-2: ");
			y = sc.nextInt();
			System.out.println(calc.divide(x,y));
			break;
		case 5:
			System.out.print("Sayý: ");
			x = sc.nextInt();
			System.out.print("Üs: ");
			y = sc.nextInt();
			System.out.println(calc.pow(x,y));
			break;
		case 6:
			System.out.print("Sayý: ");
			x = sc.nextInt();
			System.out.println(calc.factorial(x));
			break;
		case 7:
			System.out.print("Sayý: ");
			x = sc.nextInt();
			System.out.print("Mod: ");
			y = sc.nextInt();
			System.out.println(calc.mood(x,y));
			break;
		case 8:
			System.out.print("Mutlak Deðer: ");
			x = sc.nextInt();
			System.out.println(calc.abs(x));
			break;
		case 9:
			System.out.print("Katsayý: ");
			x = sc.nextInt();
			System.out.print("Derece: ");
			y = sc.nextInt();
			System.out.println(calc.derivate(x,y));
			break;
		case 10:
			System.out.print("Katsayý: ");
			x = sc.nextInt();
			System.out.print("Derece: ");
			y = sc.nextInt();
			System.out.println(calc.integral(x,y));
			break;
	
		default:
			System.out.println("Hatalý iþlem seçtiniz.");
			break;
		}
		
	}

}
