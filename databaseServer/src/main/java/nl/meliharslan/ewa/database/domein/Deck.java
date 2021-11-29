package nl.meliharslan.ewa.database.domein;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Deck implements Serializable {
    @Id // give primaire key id zie logo bij id
    @GeneratedValue(strategy = GenerationType.AUTO) // pass the strategy
    @Column(nullable = false, updatable = false) // column aanpassen of regels opstellen
    private Long id;
    private Set<Player> playerSet = new LinkedHashSet<>();
    private Set<Card> cards = new HashSet<>();

}
