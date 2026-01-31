package Exams_Package;

public class Exam1 {
	
	

	
	
	public static void main(String[] args) {
		//Exam1Test a = new Exam1Test();
		
		//System.out.println(a.getB());
		
		/*Scooter scoot1 = new Scooter();		
		System.out.println(Scooter.getMaxSpeed());*/
		
		//Array of books
		Book[] book = new Book[3];
		
		//Book 1
		book[0] = new Book("First Impressions", "Jane Austen", 1796);
		book[0].setTitle("Pride and Prejudice");
		
		//Book 2
		book[1] = new Book("Animal Farm", "George Orwell", 1945);
		
		//Book 3
		book[2] = new Book("Catch 22", "Joseph Heller", 1961);
		
		//Print each book's description
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i].getSynopsis());
		}
		//Display the total amount of books in the library
		System.out.println("There are currently " + Book.getTotalNumBooks() + " books in the library");
	}
}

class Exam1Test{
	/*private int a;
	private static int b;
	
	public Exam1Test() {
		this.a = 2;
		b++;
	}
	
	public static int getB() {
		return b;
	}*/
}

class Scooter{
	
	public Scooter() {
		
	}
	
	public static double getMaxSpeed() {
		return 2.0;
	}
}

class Book{
	//Parameters
	private String title;
	private String author;
	private int year;
	private static int totalNumBooks;
	
	//Convenience constructor
	public Book(String title, String author, int year) {
		setTitle(title);
		this.author = author;
		this.year = year;
		totalNumBooks++;
	}
	
	//Mutator and Accessor methods: title
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	/*
	//Mutator and Accessor methods: author
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	//Mutator and Accessor methods: year
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}*/
	
	//return the title, author, and date of the book
	public String getSynopsis() {
		return String.format("%s by %s (%d)", getTitle(), author, year);
	}
	
	//Return the total number of books
	public static int getTotalNumBooks() {
		return totalNumBooks;
	}
	
}
