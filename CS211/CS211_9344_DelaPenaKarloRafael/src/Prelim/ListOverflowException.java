package Prelim;

public class ListOverflowException extends RuntimeException {
    public  ListOverflowException(){}
    public ListOverflowException(String message){
        super(message);
    }

    public ListOverflowException(Throwable cause){
        super(cause);
    }

    public ListOverflowException(String message, Throwable cause){
        super(message, cause);
    }
}