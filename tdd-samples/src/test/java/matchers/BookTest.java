package matchers;

import org.junit.Test;

import static matchers.BookAssert.assertThat;

public class BookTest {

    private static final String TITLE = "Hanzel and Grettle";

    @Test
    public void constructorShouldSetTitle(){
        Book book = new Book(TITLE);

        assertThat(book).hasTitle(TITLE);
    }
}
