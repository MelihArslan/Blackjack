package nl.meliharslan.ewa.blackjackSB.exceptions;

public class UserNotFoundException extends RuntimeException {
    // Call the constructor of RuntimeException and pass the message
    public UserNotFoundException(String message) {
        super(message);
    }
}

