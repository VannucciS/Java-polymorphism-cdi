package lab6;

public class Magazine extends Book{

	public Magazine(String title, String author, String date) {
		super(title, author, date);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("This book is not a book, it is a magazine");		
	}

	

}
