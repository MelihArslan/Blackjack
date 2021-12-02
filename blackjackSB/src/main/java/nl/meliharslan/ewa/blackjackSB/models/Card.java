package nl.meliharslan.ewa.blackjackSB.models;

import nl.meliharslan.ewa.blackjackSB.models.card.CardType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "card")
public class Card implements Serializable {
    // Declaring variable
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long cardId;
    private String cardRank;
    private String suit;

    public Card() {}

    public Card(CardType c) {
    }

    public Long getCardId() {
        return cardId;
    }
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public String getCardRank() {
        return cardRank;
    }
    public void setCardRank(String cardRank) {
        this.cardRank = cardRank;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
}
