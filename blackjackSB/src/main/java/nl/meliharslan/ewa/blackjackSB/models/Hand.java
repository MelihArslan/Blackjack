package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hand")
public class Hand implements Serializable {
    // Declaring variable
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Card> cards = new ArrayList<>();

    public Hand() {}

    // Getter and setter
    public List<Card> getCards() {
        return cards;
    }
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
}
