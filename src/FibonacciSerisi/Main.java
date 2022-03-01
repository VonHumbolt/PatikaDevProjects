package FibonacciSerisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Fibonacci Serisinin Eleman Sayýsý: ");
		int number = sc.nextInt();
		
		int firstItem = 0;
		int secondItem = 1;
		
		for (int i=1; i<number; i++) {
			int result = firstItem+secondItem;
			System.out.println(firstItem + " + " + secondItem + " = " + result);
			firstItem = secondItem;
			secondItem = result;
		}
	
	}
}
