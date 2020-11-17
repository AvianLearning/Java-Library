import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!isStockFull()) {
            this.books.add(book);
        }
    }

    public int countBooks() {
        return this.books.size();
    }

    public boolean isStockFull() {
        return this.countBooks() >= this.capacity;
    }

    public Book lendBook() {
        Book bookToLend = null;
        if (this.countBooks() > 0) {
            bookToLend = this.books.remove(0);
        }
        return bookToLend;
    }

}

