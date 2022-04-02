package BookList;

import java.util.Date;

public class Book {

	private String bookName;
	private int bookPage;
	private String authorName;
	private Date publishedDate;
	
	public Book(String bookName, int bookPage, String authorName, Date publishedDate) {
		super();
		this.bookName = bookName;
		this.bookPage = bookPage;
		this.authorName = authorName;
		this.publishedDate = publishedDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPage() {
		return bookPage;
	}

	public void setBookPage(int bookPage) {
		this.bookPage = bookPage;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
}
