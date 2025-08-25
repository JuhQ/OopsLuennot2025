package Book;

public class Book {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int year) {
        this.author = author;
        this.publicationYear = year;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
}
