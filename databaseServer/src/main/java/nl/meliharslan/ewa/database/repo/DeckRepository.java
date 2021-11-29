package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeckRepository extends JpaRepository<Deck, Long> {

}
