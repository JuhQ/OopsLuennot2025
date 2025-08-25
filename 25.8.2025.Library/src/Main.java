import Book.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book animalFarm = new Book("George Orwell", "Animal Farm", 1945);
        Book akuAnkka = new Book("Aku Ankka", "Mikki kiipelissä", 1975);

        library.addBook(animalFarm);
        library.addBook(akuAnkka);

        library.displayBooks();

        System.out.println();

        library.findBooksByAuthor("George Orwell");

    }
}