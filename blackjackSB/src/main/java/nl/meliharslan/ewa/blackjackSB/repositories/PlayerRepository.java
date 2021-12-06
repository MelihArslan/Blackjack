package nl.meliharslan.ewa.blackjackSB.repositories;

import nl.meliharslan.ewa.blackjackSB.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
