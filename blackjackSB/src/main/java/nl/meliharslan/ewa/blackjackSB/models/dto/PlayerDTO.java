package nl.meliharslan.ewa.blackjackSB.models.dto;

import nl.meliharslan.ewa.blackjackSB.models.Hand;
import org.springframework.lang.NonNull;

import java.util.List;

public class PlayerDTO {

    @NonNull
    private int playerId;
    private String name;
    private int seatNumber;
    private double balance;
    private double bet;
    private List<Hand> hands;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public List<Hand> getHands() {
        return hands;
    }

    public void setHands(List<Hand> hands) {
        this.hands = hands;
    }
}
