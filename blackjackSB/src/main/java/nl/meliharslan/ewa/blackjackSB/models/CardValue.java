package nl.meliharslan.ewa.blackjackSB.models;

public enum CardValue {
    TWO("", 2),
    THREE("", 3),
    FOUR("", 4),
    FIVE("", 5),
    SIX("", 6),
    SEVEN("", 7),
    EIGHT("", 8),
    NINE("", 9),
    TEN("", 10),
    ACE("ACE", 11),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10);

    private final String name;
    private final int value;

    CardValue(int v) {
        this("", v);
    }

    CardValue(String n, int v) {
        if (n != "")
            this.name = n;
        else
            this.name = "" + v;
        this.value = v;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
