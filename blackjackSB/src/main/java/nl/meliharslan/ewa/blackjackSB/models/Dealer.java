package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dealer")
public class Dealer implements Serializable {
    // Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long id;
    private String name;
    @OneToOne(cascade = {CascadeType.ALL})
    private Hand hand;

    public Dealer() {}

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hand getHand() {
        return hand;
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
