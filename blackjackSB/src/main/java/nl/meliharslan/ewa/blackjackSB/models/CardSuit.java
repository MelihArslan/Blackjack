package nl.meliharslan.ewa.blackjackSB.models;

public enum CardSuit {
    PADES("Spades"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts");

    private final String name;

    CardSuit(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
