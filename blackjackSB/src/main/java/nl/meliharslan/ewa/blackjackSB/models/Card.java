package nl.meliharslan.ewa.blackjackSB.models;

public class Card {
    // Declaring variable
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getters and setters
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int cardValue() {
        // Return the value of the card
        return 0;
    }
}
