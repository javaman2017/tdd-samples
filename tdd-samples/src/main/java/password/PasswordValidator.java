package password;

import java.util.regex.Pattern;

public class PasswordValidator {

    public void validate(String string) {
       if(string.length() < 8)
           throw new IllegalArgumentException("Passwords must contain at least 8 characters");
                  
       if (!Pattern.matches("[0-9]{3,}", string))
           throw new IllegalArgumentException("Passwords must contain at least 3 digits");
    }

}
