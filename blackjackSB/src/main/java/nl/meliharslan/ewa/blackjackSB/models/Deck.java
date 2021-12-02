package nl.meliharslan.ewa.blackjackSB.models;

import nl.meliharslan.ewa.blackjackSB.models.card.CardType;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    // Declaring variables
    private Stack<Card> cards;
    private Hand hand;


    /**
     * Instantiates a stack of cards and fills this list with all
     * the cards from the enum CardType 6 times - so there are 312 Cards in total.
     * All the cards will be shuffled when the list is created.
     *
     * @see CardType
     * @see Card
     */
    public Deck() {
        this.cards = new Stack<>();
        for (int i = 0; i < 6; i++) {
            Arrays.stream(CardType.values()).forEach(c -> cards.add(new Card(c)));
            Collections.shuffle(cards);
        }
    }

    public Deck(Stack<Card> cards, Hand hand) {
        this.cards = cards;
        this.hand = hand;
    }

    // Getters and setters
    public Stack<Card> getCards() {
        return cards;
    }

    public void setCards(Stack<Card> cards) {
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

    /**
     * @return removes the first card from the stack.
     */
    public Card getCard() {
        return this.cards.pop();
    }

    /**
     * @return the number of cards still available in the deck.
     */
    public int getNumberOfCards() {
        return cards.size();
    }
}
