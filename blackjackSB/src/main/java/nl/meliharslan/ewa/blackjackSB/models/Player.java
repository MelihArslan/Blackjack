package nl.meliharslan.ewa.blackjackSB.models;

public class Player {
    // Declaring variables
    private String username;
    private String email;
    private String password;
    private int balance;
    private Hand hand;

    public Player(String username, String email, String password, int balance, Hand hand) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.hand = hand;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void joinTable() {
        // Joining an available table
    }
    public void leaveTable() {
        // Leave the current table
    }
    public Hand hit() {
        // Getting a new card and returning the current hand
        return null;
    }
    public void stand() {
        // Standing with the current hand
    }
    public Hand doubleHand() {
        // Doubling the hand and returning the new hand
        return null;
    }
    public Hand splitHand() {
        // Splitting the current hand and returning the new hand
        return null;
    }


}
