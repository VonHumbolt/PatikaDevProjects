package GirilenSayiyaKadarOlanCiftSayilariBulanProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi Giriniz: ");
		int number = sc.nextInt();
		
		List<Integer> numberList = new ArrayList<Integer>();
		int result = 0;
		
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				numberList.add(i);
				result += i;
			}
		}
		
		double meanOfNumber = result / numberList.size();
		System.out.println("Ortalama: " + meanOfNumber);
	}
}
