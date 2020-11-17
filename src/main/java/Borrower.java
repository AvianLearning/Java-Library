import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> booksBorrowed;

    public Borrower() {
        this.booksBorrowed = new ArrayList<>();
    }

    public int numberBooksBorrowed() {
        return this.booksBorrowed.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book bookBorrowed = library.lendBook();
        this.booksBorrowed.add(bookBorrowed);
    }

}
