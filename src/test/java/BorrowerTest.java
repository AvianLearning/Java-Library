import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void setUp() {
        library = new Library(5);
        book = new Book("Lord of the Rings", "JRR Tolkein", "Fantasy");
        library.addBook(book);
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.numberBooksBorrowed());
        assertEquals(0, library.countBooks());
    }

}
