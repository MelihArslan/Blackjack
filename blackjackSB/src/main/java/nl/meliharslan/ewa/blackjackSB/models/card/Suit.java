package nl.meliharslan.ewa.blackjackSB.models.card;

import lombok.Getter;

@Getter
public enum Suit {
    CLUBS("CLUBS"),
    DIAMONDS("DIAMONDS"),
    HEARTS("HEARTS"),
    SPADES("SPADES");

    /**
     * Short string representation of the suit (one letter symbol).
     */
    private final String name;

    Suit(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the suit.
     */
    @Override
    public String toString() {
        return name;
    }
}
