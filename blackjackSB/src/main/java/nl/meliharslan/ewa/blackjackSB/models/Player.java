package nl.meliharslan.ewa.blackjackSB.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Player implements Serializable {
    // Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String username;
    private String email;
    private String password;
    private int balance;
    @OneToOne(cascade = {CascadeType.ALL})
    private Hand hand;
    private int betAmount;

    public Player() {}

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public int getBetAmount() {
        return betAmount;
    }
    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    // Joining an available table
    public GameTable joinTable(List<GameTable> allTables) {
        for (GameTable table : allTables) {
            if (table.getPlayers().size() < 6) {
                table.addPlayer(this);
                return table;
            }
        }
        return null;
    }

    public void leaveTable() {
        // Leave the current table
    }
    public Hand hit() {
        // Getting a new card and returning the current hand
        return null;
    }
    public void stand() {
        // Standing with the current hand
    }
    public Hand doubleHand() {
        // Doubling the hand and returning the new hand
        return null;
    }
    public Hand splitHand() {
        // Splitting the current hand and returning the new hand
        return null;
    }
}
