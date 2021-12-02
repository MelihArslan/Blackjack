package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dealer")
public class Dealer implements Serializable {
    // Declaring variables
    @Id
    @Column(nullable = false, updatable = false)
    private String name;
    @OneToOne(cascade = {CascadeType.ALL})
    private Hand hand;
    private Deck deck;
    private boolean mustDraw = true;
    public Dealer() {
        this.deck = new Deck();
        this.hand = new Hand();
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

    public Card draw(){
        return null;
    }
    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
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
