package lab6;

public class FictionBook extends Book{
	
	private String genre;

	public FictionBook(String title, String author, String date, String genre) {
		super(title, author, date);
		
		
	}
	
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("This book is fiction");		
	}

	

}
