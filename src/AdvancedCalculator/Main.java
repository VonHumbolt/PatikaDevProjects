package AdvancedCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("------------ Hesap Makinesi -----------------");
		System.out.println("��lem Se�iniz");
		System.out.println("--------------");
		System.out.println("1- Toplama");
		System.out.println("2- ��karma");
		System.out.println("3- �arpma");
		System.out.println("4- B�lme");
		System.out.println("5- �s Alma");
		System.out.println("6- Faktoriyel");
		System.out.println("7- Mod");
		System.out.println("8- Mutlak De�er");
		System.out.println("9- T�rev");
		System.out.println("10- �ntegral");
		
		System.out.println("------------------------------------------");
		System.out.print("Se�im: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int x,y;
		switch (choice) {
		case 1:
			System.out.print("Say�-1: ");
			x = sc.nextInt();
			System.out.print("Say�-2: ");
			y = sc.nextInt();
			System.out.println(calc.add(x,y));
			break;

		case 2:
			System.out.print("Say�-1: ");
			x = sc.nextInt();
			System.out.print("Say�-2: ");
			y = sc.nextInt();
			System.out.println(calc.substract(x,y));
			break;
		case 3:
			System.out.print("Say�-1: ");
			x = sc.nextInt();
			System.out.print("Say�-2: ");
			y = sc.nextInt();
			System.out.println(calc.multiply(x,y));
			break;
		case 4:
			System.out.print("Say�-1: ");
			x = sc.nextInt();
			System.out.print("Say�-2: ");
			y = sc.nextInt();
			System.out.println(calc.divide(x,y));
			break;
		case 5:
			System.out.print("Say�: ");
			x = sc.nextInt();
			System.out.print("�s: ");
			y = sc.nextInt();
			System.out.println(calc.pow(x,y));
			break;
		case 6:
			System.out.print("Say�: ");
			x = sc.nextInt();
			System.out.println(calc.factorial(x));
			break;
		case 7:
			System.out.print("Say�: ");
			x = sc.nextInt();
			System.out.print("Mod: ");
			y = sc.nextInt();
			System.out.println(calc.mood(x,y));
			break;
		case 8:
			System.out.print("Mutlak De�er: ");
			x = sc.nextInt();
			System.out.println(calc.abs(x));
			break;
		case 9:
			System.out.print("Katsay�: ");
			x = sc.nextInt();
			System.out.print("Derece: ");
			y = sc.nextInt();
			System.out.println(calc.derivate(x,y));
			break;
		case 10:
			System.out.print("Katsay�: ");
			x = sc.nextInt();
			System.out.print("Derece: ");
			y = sc.nextInt();
			System.out.println(calc.integral(x,y));
			break;
	
		default:
			System.out.println("Hatal� i�lem se�tiniz.");
			break;
		}
		
	}

}
