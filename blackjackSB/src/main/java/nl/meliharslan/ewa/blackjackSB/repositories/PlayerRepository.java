package nl.meliharslan.ewa.blackjackSB.repositories;

import nl.meliharslan.ewa.blackjackSB.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    // This method checks if a player exists by ID. If they don't, then an error is thrown
     default void checkIfExistById(Long id) {
        boolean exists = this.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Could not find table with following ID: " + id);
        }
    }
}
