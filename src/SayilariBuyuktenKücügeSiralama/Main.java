package SayilariBuyuktenKücügeSiralama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a: ");
        a = sc.nextInt();
        
        System.out.print("b: ");
        b = sc.nextInt();
        
        System.out.print("c: ");
        c = sc.nextInt();
        
        if (b < a && c < a) {
            if (c < b) {
                System.out.println("c < b < a");
            }else {
                System.out.println("b < c < a");
            }
        } else if (a < b && c < b) {
            if (c < a) {
                System.out.println("c < a < b");
            }else {
                System.out.println("a < c < b");
            }
        } else {
            if (b < a) {
                System.out.println("b < a < c");
            }else {
                System.out.println("a < b < c");
            }
        }
    }
	
}
