package nl.meliharslan.ewa.database.domein;

import nl.meliharslan.ewa.database.Constant.CONSTANT;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Deck implements Serializable {
    //    @Id // give primaire key id zie logo bij id
//    @GeneratedValue(strategy = GenerationType.AUTO) // pass the strategy
//    @Column(nullable = false, updatable = false) // column aanpassen of regels opstellen
//    private Long id;
//    @OneToMany
//    private Set<Player> playerSet = new LinkedHashSet<>();
//    @OneToMany
//    private Set<Card> cards = new HashSet<>();
//
//    public Object getId() {
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @JsonManagedReference
//    @OneToMany(targetEntity = Player.class, mappedBy = "deck", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
//   @OrderBy("name asc")
    @OneToMany
    private Set<Player> playerList = new LinkedHashSet<>();

    //    @OneToMany(targetEntity = Card.class,mappedBy = "deck", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
////    @JsonManagedReference
//    @JsonIgnore
    @OneToMany
    private Set<Card> cards = new HashSet<>();


    public Deck() {
        generateCards();
    }


    /**
     * This returns the ID of the deck object
     *
     * @return
     */
    public Long getId() {
        return id;
    }


    /**
     * setting an id for the deck object
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * To add a user to the deck
     *
     * @param newPlayer
     */
    public void addPlayer(Player newPlayer) {
        // TODO: check player amount if more then 4
        playerList.add(newPlayer);
        newPlayer.setDeck(this);
    }

    public void removePlayer(Player player) {
        playerList.remove(player);
        player.setDeck(null);
    }

    /**
     * This returns player lists
     *
     * @return List
     */

    public Set<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayer(Set<Player> playerList) {
        this.playerList = new LinkedHashSet<>();
        playerList.forEach(p -> addPlayer(p));
    }

    /**
     * This returns all cards
     *
     * @return List
     */
    public Set<Card> getCards() {
        return cards;
    }

    /**
     * generate cards for each deck;
     */
    private void generateCards() {
        int cardsCreated = 0;
        cards = new HashSet<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : CardValue.values()) {
                if (cardsCreated < CONSTANT.CARD_SIZE) {
                    cards.add(new Card(suit, value, this));
                    cardsCreated++;
                }
            }
        }
    }

    /**
     * Shuffle the cards
     */
    public List<Card> shuffle() {
        List<Card> shuffleMe = new ArrayList<>(cards);
        Collections.shuffle(shuffleMe);
        return shuffleMe;
    }

    public void removeCard(Card card) {
        getCards().remove(card);
        card.setDeck(null);
    }

    public String toString() {
        return getId() + " has " + getPlayerList().size() + " players and " + getCards().size() + " cards left";
    }
//
//    /**
//     * This returns amount of deal cards.
//     *
//     * @return Integer
//     */
//    public int getCardsDealted() {
//        return cardsDealted;
//    }
//
//    /**
//     * Set amount deal of cards
//     *
//     * @param cardsDealted
//     */
//    public void setCardsDealted(int cardsDealted) {
//        this.cardsDealted = cardsDealted;
//    }
//
//    /**
//     * Set boolean for able to join the deck.
//     *
//     * @param ableToJoin
//     */
//    public void setAbleToJoin(boolean ableToJoin) {
//        isAbleToJoin = ableToJoin;
//    }
//

//
//    /**
//     * Deal card for a player
//     */
//    protected void dealCard(Player player) {
//        if (cardsDealted == cards.size())
//            throw new IllegalStateException("No cards are left in the deck.");
//        Card random = cards.get(cardsDealted++);
//        player.addCard(random);
//        cards.remove(random);
//    }
}


