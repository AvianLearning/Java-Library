import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {

    Library library;
    Book bookOne;
    Book bookTwo;
    Book bookThree;

    @Before
    public void setUp() {
        library = new Library(5);
        bookOne = new Book("The Exorcist", "William Peter Blatty", "Horror");
        bookTwo = new Book("Solaris", "Stanislaw Lem", "Science fiction");
        bookThree = new Book("The Snowman", "Jo Nesbo", "Crime fiction");
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
    }

    @Test
    public void canCountNumberOfBooksInLibrary() {
        assertEquals(3, library.countBooks());
    }

    @Test
    public void canCheckIfStockIsFull() {
        assertFalse(library.isStockFull());
    }

    @Test
    public void canAddABookIfCapacity() {
        Book bookFour = new Book("Bleak House", "Charles Dickens", "Classic fiction");
        library.addBook(bookFour);
        assertEquals(4, library.countBooks());
    }

    @Test
    public void cannotAddBookIfOverCapacity() {
        Book bookFour = new Book("Bleak House", "Charles Dickens", "Classic fiction");
        Book bookFive = new Book("Python Crash Course", "Eric Matthes", "Computing");
        Book bookSix = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "Classic fiction");
        library.addBook(bookFour);
        library.addBook(bookFive);
        library.addBook(bookSix);
        assertEquals(5, library.countBooks());
    }

}
