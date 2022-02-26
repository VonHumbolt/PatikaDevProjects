package BurcBulanProgram.copy;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Hangi ayda doðdunuz?  : ");
	        int month=sc.nextInt();
	        System.out.print("Hangi günde doðdunuz? : ");
	        int day=sc.nextInt();

	        if(month==1) {
	            if (day <= 21)
	                System.out.println("Oðlak burcusunuz");
	            else
	                System.out.println("Kova burcusunuz");
	        }
	        if(month==2){
	            if(day<=19)
	                System.out.println("Kova burcusunuz");
	            else
	                System.out.println("Balýk burcusunuz");
	        }
	        if(month==3){
	            if (day<=20)
	                System.out.println("Balýk burcusunuz");
	            else
	                System.out.println("Koç burcusunuz");
	        }
	        if(month==4){
	            if(day<=20)
	                System.out.println("Koç burcusunuz");
	            else
	                System.out.println("Boða burcusunuz");
	        }
	        if(month==5){
	            if(day<=21)
	                System.out.println("Boða burcusunuz");
	            else
	                System.out.println("Ýkizler burcusunuz");
	        }
	        if(month==6){
	            if(day<=22)
	                System.out.println("Ýkizler burcusunuz");
	            else
	                System.out.println("Yengeç burcusunuz");
	        }
	        if(month==7){
	            if(day<=22)
	                System.out.println("Yengeç burcusunuz");
	            else
	                System.out.println("Aslan burcusunuz");
	        }
	        if(month==8){
	            if(day<=22)
	                System.out.println("Aslan burcusunuz");
	            else
	                System.out.println("Baþak burcusunuz");
	        }
	        if(month==9){
	            if(day<=22)
	                System.out.println("Baþak burcusunuz");
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
	                System.out.println("Oðlak burcusunuz");
	        }
	    }
}
