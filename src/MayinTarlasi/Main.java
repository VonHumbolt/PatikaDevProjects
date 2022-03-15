package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dizinin Satýr Sayýsý: ");
		int row = sc.nextInt();
		
		System.out.print("Dizinin Sütun Sayýsý: ");
		int column = sc.nextInt();
		
		MineSweeper mineSweeper = new MineSweeper(row, column);
		
		mineSweeper.printMinedBoard();
		mineSweeper.run();

	}

}
