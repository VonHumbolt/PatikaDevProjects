package KitapSiralayici;

public class Book implements Comparable<Book>{

	private String bookName;
	private int pageNumber;
	private String authorName;
	private int publishedDate;
	
	
	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public int getPageNumber() {
		return pageNumber;
	}



	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public int getPublishedDate() {
		return publishedDate;
	}



	public void setPublishedDate(int publishedDate) {
		this.publishedDate = publishedDate;
	}



	public Book(String bookName, int pageNumber, String authorName, int publishedDate) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.publishedDate = publishedDate;
	}



	@Override
	public int compareTo(Book o) {
	
		return this.getBookName().compareTo(o.getBookName());
	}
	

}
