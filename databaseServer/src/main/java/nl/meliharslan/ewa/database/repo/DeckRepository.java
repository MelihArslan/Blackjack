package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Deck;
import nl.meliharslan.ewa.database.domein.Hand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DeckRepository extends JpaRepository<Deck, Long> {

    static List<Deck> findAllDeck(){return findAllDeck();};
    Optional<Hand> findOneById(long parseLong);
}
