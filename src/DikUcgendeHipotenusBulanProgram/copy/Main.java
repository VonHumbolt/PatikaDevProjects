package DikUcgendeHipotenusBulanProgram.copy;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int firstInput, secondInput;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�lk dik kenar� giriniz: ");
		firstInput = scanner.nextInt();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�kinci dik kenar� giriniz: ");
		secondInput = scanner1.nextInt();
		
		int hipotenus = (int) Math.sqrt( Math.pow(firstInput, 2) + Math.pow(secondInput, 2));
		System.out.println("Hiipoten�s: " + hipotenus);
		
		int u = (firstInput + secondInput + hipotenus) / 2;
		double area = Math.sqrt(u * (u-firstInput) * (u- secondInput) * (u-hipotenus));
		System.out.println("Alan: "+ area);
		
	}
}
