package KitapSiralayici;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		// Ýsmine göre sýrala !
		Set<Book> set = new TreeSet<Book>();
		
		set.add(new Book("Frankestein", 279, "Marry Shelly", 1897));
		set.add(new Book("Bülbülü Öldürmek", 375, "Harper Lee", 1960));
		set.add(new Book("Gurur ve Önyargý", 450, "Jane Austen", 1865));
		set.add(new Book("Suyu Arayan Adam", 395, "Þevket Süreyya Aydemir", 1942));
		set.add(new Book("Semerkant", 249, "Amin Maalouf", 1996));
		
		for (Book book : set) {
			System.out.println(book.getBookName());
		}
		
		
		// Sayfa sayýsýna göre sýrala !
		Set<Book> pageSet = new TreeSet<>(new Comparator<Book>() {
		
			@Override
			public int compare(Book o1, Book o2) {
				
				return o1.getPageNumber() - o2.getPageNumber();
			}
		});
		
		pageSet.add(new Book("Frankestein", 279, "Marry Shelly", 1897));
		pageSet.add(new Book("Bülbülü Öldürmek", 375, "Harper Lee", 1960));
		pageSet.add(new Book("Gurur ve Önyargý", 450, "Jane Austen", 1865));
		pageSet.add(new Book("Suyu Arayan Adam", 395, "Þevket Süreyya Aydemir", 1942));
		pageSet.add(new Book("Semerkant", 249, "Amin Maalouf", 1996));
		
		for (Book book : pageSet) {
			System.out.println(book.getPageNumber());
		}
	}
}
