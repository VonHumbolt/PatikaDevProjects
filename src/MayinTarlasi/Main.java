package MayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dizinin Sat�r Say�s�: ");
		int row = sc.nextInt();
		
		System.out.print("Dizinin S�tun Say�s�: ");
		int column = sc.nextInt();
		
		MineSweeper mineSweeper = new MineSweeper(row, column);
		
		mineSweeper.printMinedBoard();
		mineSweeper.run();

	}

}
