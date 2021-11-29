package nl.meliharslan.ewa.database.domein;

public enum CardSuit {
    SPADES("Spades"),
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
