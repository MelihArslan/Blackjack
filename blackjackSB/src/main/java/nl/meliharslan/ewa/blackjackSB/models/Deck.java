package nl.meliharslan.ewa.blackjackSB.models;

import nl.meliharslan.ewa.blackjackSB.Config.CONSTANT;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Deck implements Serializable {
    // Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Card> cards = new HashSet<>();

    public Deck() {
        generateCards();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Set<Card> getCards() {
        return this.cards;
    }
    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    private void generateCards() {
        int cardsCreated = 0;
        cards = new HashSet<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : CardValue.values()) {
                if (cardsCreated < CONSTANT.CARD_SIZE) {
                    cards.add(new Card(suit, value));
                    cardsCreated++;
                }
            }
        }
    }

    public Deck shuffle() {
        // Shuffle the deck and places the cards in a random order. Returns the deck
        return null;
    }
}
