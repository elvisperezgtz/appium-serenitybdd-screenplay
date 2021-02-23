package gt.com.tigo.qa.exceptions;

public class ExceptionsError extends AssertionError {

    public ExceptionsError(String message,Throwable cause){
        super(message,cause);
    }


}
