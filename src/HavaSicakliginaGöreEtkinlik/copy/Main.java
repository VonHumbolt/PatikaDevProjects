package HavaSicakliginaG�reEtkinlik.copy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("S�cakl��� giriniz: ");
		int heat = sc.nextInt();
		
		if (heat < 5) {
			System.out.println("Kayak yapabilirsin.");
		}
		if (heat > 5 && heat < 15) {
			System.out.println("Sinemaya gidebilirsin.");
		}
		if (heat > 10 && heat < 25) {
			System.out.println("Pikni�e gidebilirsin.");
		}
		if (heat > 25) {
			System.out.println("Y�zmeye gidebilirsin.");
		}
	}
}
