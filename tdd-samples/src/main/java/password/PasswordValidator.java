package password;

public class PasswordValidator {

    public void validate(String string) {
       if(string.length() < 8)
           throw new IllegalArgumentException("Passwords must contain at least 8 characters");
       
       int digitCount = 0;
       int specialCharCount = 0;
       for(int i = 0; i < string.length(); i++)
           if (Character.isDigit(string.charAt(i)))
               digitCount++;
           
       if (digitCount < 3)
           throw new IllegalArgumentException("Passwords must contain at least 3 digits");
       
       
       
       
       
        
    }

}
