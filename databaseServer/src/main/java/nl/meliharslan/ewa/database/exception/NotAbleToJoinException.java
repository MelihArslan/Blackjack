package nl.meliharslan.ewa.database.exception;

public class NotAbleToJoinException extends Exception {
    public NotAbleToJoinException() {
        this("The deck is full.");
    }

    public NotAbleToJoinException(String message) {
        super(message);
    }
}
