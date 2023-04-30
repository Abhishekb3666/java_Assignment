package myExceptions;

public class myNumberFormatException extends Exception{
    private String s;

    public myNumberFormatException(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "NumberFormatException: " + this.s + " is not a number.";
    }
}
