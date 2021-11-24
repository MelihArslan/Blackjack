package nl.meliharslan.ewa.database.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message); // call the constructor of RuntimeException and passing message
    }
}
