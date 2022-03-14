package SayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] predictions = new int[5];
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		int i = 0;
		
		while (i < 5) {
			System.out.print("Tahmininiz(0-100): ");
			int predict = sc.nextInt();
			
			if (predict < number) {
				System.out.println("Tahmininiz gizli sayýdan küçüktür!");
				predictions[i] = predict;
			}
			else if (predict > number) {
				System.out.println("Tahmininiz gizli sayýdan büyüktür!");
				predictions[i] = predict;
			}else {
				System.out.println("Tebrikler Sayiyi buldunuz -> " + number + "!" );
			}
			System.out.println("Kalan hakkýnýz: " + (5-i));
			i++;
		}
		
		System.out.println("Üzgünüz sayýyý -> " + number + " bulamadýnýz :(");
		System.out.println("Girdiðiniz deðerler: " + Arrays.toString(predictions));
	}
}
