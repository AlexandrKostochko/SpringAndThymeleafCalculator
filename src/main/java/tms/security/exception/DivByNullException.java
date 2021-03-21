package tms.security.exception;

public class DivByNullException extends RuntimeException{

    public DivByNullException() {
    }

    public DivByNullException(String message) {
        super(message);
    }
}
