import Book.Book;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    private void displayBook(Book book) {
        System.out.println("Title: " + book.getTitle() + ", " + book.getAuthor() + ", Year " + book.getPublicationYear());
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int i = 1;
        for (Book book: this.books) {
            System.out.print(i + ". ");
            // System.out.println(book.getTitle() + ", " + book.getAuthor() + ", published in " + book.getPublicationYear());
            this.displayBook(book);
            i++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author \"" + author + "\":");
        for (Book book: this.books) {
            if (book.getAuthor().equals(author)) {
                this.displayBook(book);
            }
        }
    }
}
