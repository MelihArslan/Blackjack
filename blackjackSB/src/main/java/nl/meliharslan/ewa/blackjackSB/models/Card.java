package nl.meliharslan.ewa.blackjackSB.models;

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
    private CardValue cardRank;
    private CardSuit suit;

    public Card(CardSuit suit, CardValue cardRank) {
        this.suit = suit;
        this.cardRank = cardRank;
    }

    public Long getCardId() {
        return cardId;
    }
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public CardValue getCardRank() {
        return cardRank;
    }
    public void setCardRank(CardValue cardRank) {
        this.cardRank = cardRank;
    }
    public CardSuit getSuit() {
        return suit;
    }
    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }
}
