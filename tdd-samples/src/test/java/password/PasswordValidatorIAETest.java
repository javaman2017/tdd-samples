package password;

import junitparams.JUnitParamsRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(value = JUnitParamsRunner.class)
public class PasswordValidatorIAETest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    

    @Test
    public void passwordsShouldContainAtLeast8Characters() {  
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Passwords must contain at least 8 characters");
        
        PasswordValidator validator = new PasswordValidator();
        validator.validate("abc");
    }

    @Test
    public void passwordsShouldContainAtLeast3Digits() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Passwords must contain at least 3 digits");

        PasswordValidator validator = new PasswordValidator();
        validator.validate("abcdefg1");
    }
}