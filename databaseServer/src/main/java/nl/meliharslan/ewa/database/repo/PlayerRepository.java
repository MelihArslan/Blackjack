package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
