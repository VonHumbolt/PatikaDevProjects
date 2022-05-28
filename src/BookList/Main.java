package BookList;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Lord of the rings", 90, "J.K. Rowling", new Date());
		Book book2 = new Book("Cengiz han", 200, "Harold Lamb", new Date());
		Book book3 = new Book("Þu çýlgýn Türkler", 750, "Turgut Özakman", new Date());
		Book book4 = new Book("Gazi Padiþahlar", 70, "Necdet Öztürk", new Date());
		Book book5 = new Book("Bozkurt", 150, "Amstrong", new Date());
		Book book6 = new Book("Semerkant", 250, "Amin Maalouf", new Date());
		Book book7 = new Book("Denemeler", 320, "Montaigne", new Date());
		Book book8 = new Book("Hayvan Çiftliði", 290, "George Orwell", new Date());
		Book book9 = new Book("Devlet", 360, "George Orwell", new Date());
		Book book10 = new Book("Timur", 450, "Samih Fethi", new Date());
		
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		bookList.add(book8);
		bookList.add(book9);
		bookList.add(book10);
		
		Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));
		
//		bookList.stream().forEach(b -> {
//			bookMap.put(b.getBookName(), b.getAuthorName());
//		});
		
		System.out.println(bookMap);
		
		List<Book> newList = bookList.stream().filter(b -> b.getBookPage() > 100).collect(Collectors.toList());
		
//		bookList.stream().filter(b -> b.getBookPage() > 100).forEach(b -> {
//			newList.add(b);f
//		});
//		
		System.out.println(newList);
	}

}
