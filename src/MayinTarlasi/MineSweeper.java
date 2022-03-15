package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	int row;
	int column;
	String[][] gameArea;
	String[][] minedArea;
	int spaces;
	
	public MineSweeper(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		
		this.gameArea = new String[row][column];
		this.minedArea = new String[row][column];
		
		this.spaces = (row * column) - ((row * column) / 4);  
				
		this.prepareGameBoard(row, column);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Satýr Giriniz: ");
			int rowFromUser = sc.nextInt();
			System.out.print("Sütun Giriniz: ");
			int colFromUser = sc.nextInt();
			
			if (!this.isValidInput(rowFromUser, colFromUser)) {
				System.out.println("Lütfen sýnýrlar içerisinde deðer giriniz!");
				continue;
			}
	
			if(isGameOver(rowFromUser, colFromUser)) {
				System.out.println("GameOver!");
				this.printMinedBoard();
				break;
			}
			
			// Kullanýcýnýn girebileceði boþluk kalmadýysa kazanýr!
			if (this.spaces == 1) {
				System.out.println("You Win!");
				break;
			}
			
			this.writeBoard(rowFromUser, colFromUser);
			this.spaces--;
			this.printGameBoard();
		}
	}
	
	public void writeBoard(int row, int col) {
		int count = 0;
		
		if (this.isValidInput(row -1 , col)) {
			
			if (this.minedArea[row-1][col] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row -1 , col -1)) {
			if (this.minedArea[row-1][col -1] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row -1 , col+1)) {
			if (this.minedArea[row-1][col+1] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row , col-1)) {
			if (this.minedArea[row][col-1] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row , col+1)) {
			if (this.minedArea[row][col+1] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row +1  , col -1)) {
			if (this.minedArea[row+1][col -1] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row + 1 , col)) {
			if (this.minedArea[row+1][col] == "*") {
				count++;
			}
		}
		
		if (this.isValidInput(row + 1 , col + 1)) {
			if (this.minedArea[row+1][col+1] == "*") {
				count++;
			}
		}
		
		
		this.gameArea[row][col] = String.valueOf(count);
	}
	
	public boolean isValidInput(int row, int col) {
		return (row >= this.row || col >= this.column ||row < 0 || col < 0) ? false : true;
	}
	
	public boolean isGameOver(int row, int col) {
		
		if (this.minedArea[row][col] == "*" ) {
			return true;
		}
		
		return false;
	}
	
	public void prepareGameBoard(int row, int col) {
		Random rand = new Random();
		int countOfMine = (row * col) / 4;
		
		for (int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				this.gameArea[i][j] = "-";
				this.minedArea[i][j] = "-";
			}
		}
		
		for(int i = 0; i<countOfMine; i++) {
			int randRow = rand.nextInt(row);
			int randCol = rand.nextInt(column);
			
			this.minedArea[randRow][randCol] = "*";
		}
		
	}
	
	public void printGameBoard() {
		for (String[] row : this.gameArea) {
			for (String column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
	
	public void printMinedBoard() {
		for (String[] row : this.minedArea) {
			for (String column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

	
	
}
