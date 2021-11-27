package nl.meliharslan.ewa.blackjackSB.models;

import java.util.ArrayList;

public class Table {
    // Declaring variables
    private int tableId;
    private ArrayList<Player> players;
    private Dealer dealer;
    private int totalPlayers;

    // Hard coding for now
    Card card1 = new Card("10", "hearts");
    Card card2 = new Card("Ace", "Spades");
    private final ArrayList<Card> cardsArray = new ArrayList<>();


    public Table(int tableId) {
        this.tableId = tableId;

        // Hard coding the cards and setting it in the dealers hand
        this.cardsArray.add(this.card1);
        this.cardsArray.add(this.card2);
        Hand dealersHand = new Hand(this.cardsArray);

        this.dealer = new Dealer("Jan", dealersHand);
    }

    // Getters and setters
    public int getTableId() {
        return tableId;
    }
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
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

    public static Table createTable() {
        // Hard coding a table
        return new Table(0);
    }
}
