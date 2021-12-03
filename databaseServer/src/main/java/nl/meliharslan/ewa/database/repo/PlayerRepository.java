package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findOneById(long parseLong);
}
