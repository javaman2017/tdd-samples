package matchers;

import org.fest.assertions.*;

public class BookAssert extends GenericAssert<BookAssert,Book>{

    public BookAssert(Book actual){
        super(BookAssert.class,actual);
    }

    public static BookAssert assertThat(Book actual){
        return new BookAssert(actual);
    }

    public BookAssert hasTitle(String title){
        isNotNull();
        String errorMessage = String.format("Expected books title to be" +
                " <%s> but was <%s>",title,actual.getTitle());
        Assertions.assertThat(actual.getTitle())
                .overridingErrorMessage(errorMessage)
                .isEqualTo(title);
        return this;
    }
}
