package AdvancedCalculator;

public class Calculator {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int substract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		
		if (y == 0) {
			System.out.println("Payda sıfır olamaz!");
			return 0;			
			
		}
		return x / y;
	}
	
	public int pow (int x, int y) {
		return (int) Math.pow(x, y);
	}
	
	public int factorial(int x) {
		int toplam = 1;
		
		for (int i = 1; i <= x; i++) {
			toplam *= i;
		}
		return toplam;
	}
	
	public int mood(int x, int y) {
		return x % y;
	}
	
	public int abs(int x) {
		return Math.abs(x);
	}
	
	public String derivate(int katsayi, int derece) {
		
		System.out.println("İfade -> f(x) = " + katsayi + "x^" + derece);
		
		if (katsayi == 0) {
			return "f'(x) = 0";
		} else {
			return "f'(x)= " + (derece*katsayi) + "x^" + (derece-1);
		}
	}
	
	public String integral(int katsayi, int derece) {
		if ( derece != 0) {			
			System.out.println("İfade -> f(x) = ʃ " + katsayi + "x^" + derece);
		} else
			System.out.println("İfade -> f(x) = ʃ " + katsayi);
		
		if (katsayi != 0) {
			return katsayi + "(x^" + (derece+1) + ")" + "/" + (derece+1);
		} else 
			return "0";
	}
}
