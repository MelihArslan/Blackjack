package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Hand;
import nl.meliharslan.ewa.database.domein.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HandRepository extends JpaRepository<Hand,Long> {
    Optional<Hand> findOneById(long parseLong);
}
