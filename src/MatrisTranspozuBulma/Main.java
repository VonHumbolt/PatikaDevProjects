package MatrisTranspozuBulma;

public class Main {
	public static void main(String[] args) {
		int[][] matris = {
				{2,3,4},
				{5,6,4},
				{1,8,0}
		};
		
		int[][] transpose = new int[matris[1].length][matris.length]; 
		
		for (int i = 0; i<matris.length; i++) {
			for (int j = 0; j<matris[1].length; j++) {
				transpose[j][i] = matris[i][j];
			}
		}
		
		for (int[] row: transpose) {
			for (int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}
