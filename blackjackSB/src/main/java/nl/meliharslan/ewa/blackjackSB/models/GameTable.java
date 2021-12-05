package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GameTable implements Serializable {
    // Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Dealer dealer;
    private int totalPlayers;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Player> players = new ArrayList<>();
    @OneToOne(cascade = {CascadeType.ALL})
    private Deck deck;



    public GameTable() {}

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long tableId) {
        this.id = tableId;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public Dealer getDealer() {
        return dealer;
    }
    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
    public int getTotalPlayers() {
        return totalPlayers;
    }
    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "GameTable {" +
                "id = " + id +
                ", totalPlayers = " + totalPlayers +
                '}';
    }
}
