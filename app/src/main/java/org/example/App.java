/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       Library library = new Library();

       //adding a book 
       library.addBook(new Book("2024","Mensah Anni","1234567891023"));
       library.addBook(new Book("Java Made simple","Mensah Anni","098765432123"));
       library.addBook(new Book("Code With Me","Mensah Anni","675894032123"));

       //adding the patrons
       Patron patron1 = new Patron("Dr Nassy", "P001");
       Patron patron2 = new Patron("Mr Green", "P002");

       library.addPatron(patron1);
       library.addPatron(patron2);

       //operartions
       library.displayAvailableBooks();
       library.checkoutBook("1234567891023", patron1);
       library.displayAvailableBooks();
       library.returnBook("1234567891023");
       library.displayAvailableBooks();
    }

}
