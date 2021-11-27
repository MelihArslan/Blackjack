package nl.meliharslan.ewa.blackjackSB.models;

public class Dealer {
    // Declaring variables
    private String name;
    private Hand hand;

    public Dealer(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void stand() {
        // Stand with the current cards
    }
    public Hand hit() {
        // Getting a new card and returning the current hand
        return null;
    }
}
