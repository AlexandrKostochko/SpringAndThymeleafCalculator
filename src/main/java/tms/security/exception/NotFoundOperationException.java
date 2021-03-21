package tms.security.exception;

public class NotFoundOperationException extends RuntimeException{

    public NotFoundOperationException() {
    }

    public NotFoundOperationException(String message) {
        super(message);
    }
}
