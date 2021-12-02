package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Hand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class for all Hands.
 */
@Repository
public interface HandRepository extends JpaRepository<Hand, Integer> {
}