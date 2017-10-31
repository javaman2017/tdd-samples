package exceptions;

import org.junit.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneIAETest {
    private Phone phone = new Phone();

    @Test
    public void shouldThrowIAEForEmptyNumber(){
        catchException(phone).setNumber(null);

        assertTrue(caughtException() instanceof  IllegalArgumentException);
        assertEquals("number cannot be null or empty", caughtException().getMessage());
    }

    @Test
    public void shouldThrowIAEForPlusPrefixedNumber(){
        catchException(phone).setNumber("+123");

        assertTrue(caughtException() instanceof  IllegalArgumentException);
        assertEquals("numbers cannot start with + number:[+123]", caughtException().getMessage());
    }
}
