package nl.meliharslan.ewa.database.domein;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Hand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // pass the strategy
    @Column(nullable = false, updatable = false) // column aanpassen of regels opstellen
    private Long id;
    @OneToOne
    private Player player;
    private int betAmount;
    private boolean finished = false;

    public Hand() {
    }

    public Hand(int betAmount) {
        this.betAmount = betAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

}
