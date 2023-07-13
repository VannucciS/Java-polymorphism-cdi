package lab6;

public class Book {
	private String title, author, date;
	

	/**
	 * @param title of the book
	 * @param author of the book
	 * @param date of publishing the book
	 */
	public Book(String title, String author, String date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public void displayDetails() {
		// TODO Auto-generated constructor stub
		
		System.out.println("This book is made from paper");
	}
	
	

}
