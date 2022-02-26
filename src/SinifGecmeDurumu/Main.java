package SinifGecmeDurumu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int math, physic, history, chemistry, music, turkish;
		int numberOfLessons = 6;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: ");
		math = scanner.nextInt();
		if (math < 0 || math > 100) {
			math = 0;
			numberOfLessons--;
		
		}
	
		System.out.print("Fizik Notunuz: ");
		physic = scanner.nextInt();
		if (physic < 0 || physic > 100) {
			physic = 0;
			numberOfLessons--;
		
		}
		
		System.out.print("Tarih Notunuz: ");
		history = scanner.nextInt();
		if (history < 0 || history > 100) {
			history = 0;
			numberOfLessons--;
		
		}
		
		System.out.print("Kimya Notunuz: ");
		chemistry = scanner.nextInt();
		if (chemistry < 0 || chemistry > 100) {
			chemistry = 0;
			numberOfLessons--;
		
		}
		
		System.out.print("Müzik Notunuz: ");
		music = scanner.nextInt();
		if (music < 0 || music > 100) {
			music = 0;
			numberOfLessons--;
		
		}
		
		System.out.print("Türkçe Notunuz: ");
		turkish = scanner.nextInt();
		if (turkish < 0 || turkish > 100) {
			turkish = 0;
			numberOfLessons--;
		
		}
		
		int sumOfGrades = math + physic + history + chemistry + music + turkish;
		double meanOfGrades = sumOfGrades / numberOfLessons;
		
		if (meanOfGrades >= 55) {
			System.out.println("Geçtiniz.");
		}
		else {
			System.out.println("Kaldýnýz :( ");
		}
	}
		
}
