package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for all Players.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
