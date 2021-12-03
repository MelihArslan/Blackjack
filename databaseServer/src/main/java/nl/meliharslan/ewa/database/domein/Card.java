package nl.meliharslan.ewa.database.domein;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Card implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CardSuit suit;
    private CardValue cardValue;
    @OneToOne
    private Deck deck;
    @OneToOne
    private Hand hand;

    public Card() {
    }

    public Card(CardSuit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(CardSuit suit, CardValue cardValue, Deck deck) {
        this.suit = suit;
        this.cardValue = cardValue;
        this.deck = deck;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", suit=" + suit +
                ", cardValue=" + cardValue +
                ", deck=" + deck +
                ", hand=" + hand +
                '}';
    }
}
