package CokBoyutluDizilerIleBHarfiCizdirenProgram;

public class Main {
	public static void main(String[] args) {
		int[][] letter = new int[7][4];
		
		for (int i=0; i<7; i++) {
			for (int j=0; j<4; j++) {
				if (i == 0 || i == 6) {
					System.out.print("*");
				} else if (i == 3) {
					System.out.print("*");
				}else if (j == 0 || j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}