package BurcBulanProgram.copy;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Hangi ayda do�dunuz?  : ");
	        int month=sc.nextInt();
	        System.out.print("Hangi g�nde do�dunuz? : ");
	        int day=sc.nextInt();

	        if(month==1) {
	            if (day <= 21)
	                System.out.println("O�lak burcusunuz");
	            else
	                System.out.println("Kova burcusunuz");
	        }
	        if(month==2){
	            if(day<=19)
	                System.out.println("Kova burcusunuz");
	            else
	                System.out.println("Bal�k burcusunuz");
	        }
	        if(month==3){
	            if (day<=20)
	                System.out.println("Bal�k burcusunuz");
	            else
	                System.out.println("Ko� burcusunuz");
	        }
	        if(month==4){
	            if(day<=20)
	                System.out.println("Ko� burcusunuz");
	            else
	                System.out.println("Bo�a burcusunuz");
	        }
	        if(month==5){
	            if(day<=21)
	                System.out.println("Bo�a burcusunuz");
	            else
	                System.out.println("�kizler burcusunuz");
	        }
	        if(month==6){
	            if(day<=22)
	                System.out.println("�kizler burcusunuz");
	            else
	                System.out.println("Yenge� burcusunuz");
	        }
	        if(month==7){
	            if(day<=22)
	                System.out.println("Yenge� burcusunuz");
	            else
	                System.out.println("Aslan burcusunuz");
	        }
	        if(month==8){
	            if(day<=22)
	                System.out.println("Aslan burcusunuz");
	            else
	                System.out.println("Ba�ak burcusunuz");
	        }
	        if(month==9){
	            if(day<=22)
	                System.out.println("Ba�ak burcusunuz");
	            else
	                System.out.println("Terazi burcusunuz");
	        }
	        if(month==10){
	            if(day<=22)
	                System.out.println("Terazi burcusunuz");
	            else
	                System.out.println("Akrep burcusunuz");
	        }
	        if(month==11){
	            if(day<=21)
	                System.out.println("Akrep burcusunuz");
	            else
	                System.out.println("Yay burcusunuz");
	        }
	        if(month==12){
	            if(day<=21)
	                System.out.println("Yay burcusunuz");
	            else
	                System.out.println("O�lak burcusunuz");
	        }
	    }
}
