package exceptions;

public class Phone {
    private String number;

    public Phone(){
    }

    public void setNumber(String number){
        if (number == null || "".equals(number)){
            throw new IllegalArgumentException("number cannot be null or empty");
        }

        if (number.startsWith("+")){
            throw new IllegalArgumentException("numbers cannot start with + number:[" + number +"]");
        }

        this.number = number;
    }
}
