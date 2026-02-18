package viikko7;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Ei lisättyjä kirjoja.");
            return;
        }
        for (Book book : books) {
            book.displayInfo();
            System.out.println("Kirjan kategoria: " + book.categorize());
        }
    }
}
