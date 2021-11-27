package nl.meliharslan.ewa.blackjackSB.models;

import java.util.ArrayList;

public class Deck {
    // Declaring variables
    private ArrayList<Card> cards;
    private Hand hand;

    public Deck(ArrayList<Card> cards, Hand hand) {
        this.cards = cards;
        this.hand = hand;
    }

    // Getters and setters
    public ArrayList<Card> getCards() {
        return cards;
    }
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Deck shuffle() {
        // Shuffle the deck and places the cards in a random order. Returns the deck
        return null;
    }
}
