import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
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
        if (this.countBooks() >= this.capacity) {
            return true;
        }
        return false;
    }

}

