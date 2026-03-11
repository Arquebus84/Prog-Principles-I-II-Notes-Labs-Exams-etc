package ProtectedDataMethodsEx;
import java.util.ArrayList;

public class BookLibrary {
    // Attributes
    private String libraryName;
    protected ArrayList<Book> books;
    protected int totalBooks;

    // Constructor to initialize the library
    BookLibrary(String name) {
        libraryName = name;
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    protected void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    // Method to check if a book is in the library by title
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // Method to print all books in the library
    void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    // Method to update the library name
    protected void updateLibraryName(String newName) {
        libraryName = newName;
    }
}

class Book{
	private String title;
	private String details;
	
	Book(){
		
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}	
	
}