package lab6;

public class ReferenceBook extends Book{

	public ReferenceBook(String title, String author, String date) {
		super(title, author, date);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("This book is a reference book");		
	}

	

}
