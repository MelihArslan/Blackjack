package nl.meliharslan.ewa.blackjackSB.models;

import java.util.ArrayList;

public class Hand {
    // Declaring variable
    private ArrayList<Card> cards;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    // Getter and setter
    public ArrayList<Card> getCards() {
        return cards;
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        // Add a card to the hand
    }
    public int handValue() {
        // return the value of the hand
        return 0;
    }
    public void chooseAce() {
        // Choosing whether the ace should be 1 or 10 and setting it in the hand
    }
}
