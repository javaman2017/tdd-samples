package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PhoneIAETest {
    private Phone phone = new Phone();

    @Test
    public void shouldThrowIAEForEmptyNumber(){
        try{
            phone.setNumber("");
            fail("Should have thrown an illegalArgumentException");
        } catch (IllegalArgumentException iae){
            assertEquals("number cannot be null or empty",iae.getMessage());
        }
    }

    @Test
    public void shouldThrowIAEForPlusPrefixedNumber(){
        try{
            phone.setNumber("+123456789");
            fail("Should have thrown an illegalArgumentException");
        } catch (IllegalArgumentException iae){
            assertEquals("numbers cannot start with + number:[+123456789]",iae.getMessage());
        }
    }
}
