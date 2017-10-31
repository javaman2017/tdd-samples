package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneIAETest {
    private Phone phone = new Phone();

    @Test
    public void shouldThrowIAEForEmptyNumber(){
        try{
            phone.setNumber("");
        } catch (IllegalArgumentException iae){
            assertEquals("number cannot be null or empty",iae.getMessage());
        }
    }

    @Test
    public void shouldThrowIAEForPlusPrefixedNumber(){
        try{
            phone.setNumber("+123456789");
        } catch (IllegalArgumentException iae){
            assertEquals("numbers cannot start with + number:[+123456789]",iae.getMessage());
        }
    }
}
