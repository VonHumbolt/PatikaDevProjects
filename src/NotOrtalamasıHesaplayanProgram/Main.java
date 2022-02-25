package NotOrtalamasýHesaplayanProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int math, physic, history, chemistry, music, turkish;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz: ");
		math = scanner.nextInt();
	
		System.out.println("Fizik Notunuz: ");
		physic = scanner.nextInt();
		
		System.out.println("Tarih Notunuz: ");
		history = scanner.nextInt();
		
		System.out.println("Kimya Notunuz: ");
		chemistry = scanner.nextInt();
		
		System.out.println("Müzik Notunuz: ");
		music = scanner.nextInt();
		
		System.out.println("Türkçe Notunuz: ");
		turkish = scanner.nextInt();
		
		int sumOfGrades = math + physic + history + chemistry + music + turkish;
		double meanOfGrades = sumOfGrades / 6;
		
		System.out.println("Ortalamanýz: " + meanOfGrades);
		
	}
}
