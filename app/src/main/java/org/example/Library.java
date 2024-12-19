import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    //library constructor
    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    //method for adding a book
    public void addBook (Book book) {
        books.add(book);
    }

    //method for adding a patron
    public void addPatron (Patron patron) {
        patron.add(patron);
    }

    //a book needs to be checked out
    public void checkoutBook (String isbn, Patron patron) {
        for (Book book : books) {
            if (boof.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.printf("%s checked out%s.%n",patron.getName(),book.getTitle());
                return;
            }
        }
    }
    System.out.pritnln("The book is not available");
}

//a method for returning a book
public void returnBook (String isbn) {
    for (Book book : books) {
        if (book.getIsbn().equals(isbn)) {
            book.setAvailable(true);
            System.out.printf("%s has been returned.%n", book.getTitle());
            return;
        }
    }
    System.out.println("This book is not avialable in this library.");
} 

//the method for displaying the available books 
public void displayAvailableBooks () {
    System.out.println("The books available: ");
    for (Book book : books) {
        if (book.isAvailable() {
            System.out.printf("%s by %sn",  book.getTitle(), book.getAuthor());
        })
    }
}