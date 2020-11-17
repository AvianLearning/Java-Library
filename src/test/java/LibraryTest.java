import org.junit.Before;

public class LibraryTest {

    Library library;
    Book bookOne;
    Book bookTwo;
    Book bookThree;

    @Before
    public void setUp() {
        library = new Library(10);
        bookOne = new Book("The Exorcist", "William Peter Blatty", "Horror");
        bookTwo = new Book("Solaris", "Stanislaw Lem", "Science fiction");
        bookThree = new Book("The Snowman", "Jo Nesbo", "Crime fiction");
    }

}
