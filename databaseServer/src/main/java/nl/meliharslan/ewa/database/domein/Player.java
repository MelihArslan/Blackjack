package nl.meliharslan.ewa.database.domein;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    @OneToOne
    private Deck deck;
    @OneToMany
    private Set<Hand> hands = new HashSet<>();

    private int cash = 200;
    private boolean isDealer = false;

    public Player(String name) {
        setName(name);
        addHand(new Hand());
    }

    public Player() {
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

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

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Set<Hand> getHands() {
        return hands;
    }

    public void setHands(Set<Hand> hands) {
        this.hands = hands;
    }

    public void addHand(Hand hand) {
        this.getHands().add(hand);
        hand.setPlayer(this);
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int totalBetAmounts() {
        return getHands()
                .stream()
                .mapToInt(Hand::getBetAmount)
                .sum();
    }

    public boolean beenSplit() {
        return getHands().size() == 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().equals(o.getClass())) return false;

        Player player = (Player) o;

        if (id != null ? !id.equals(player.id) : player.id != null) return false;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + name.hashCode();
        return result;
    }
}
