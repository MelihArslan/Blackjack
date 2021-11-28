package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "game_table")
public class GameTable implements Serializable {
    // Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Dealer dealer;
    private int totalPlayers;
//    private List<Player> players;



    public GameTable() {}

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long tableId) {
        this.id = tableId;
    }

//    public ArrayList<Player> getPlayers() {
//        return players;
//    }
//    public void setPlayers(ArrayList<Player> players) {
//        this.players = players;
//    }


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

    @Override
    public String toString() {
        return "GameTable {" +
                "id = " + id +
                ", totalPlayers = " + totalPlayers +
                '}';
    }
}
