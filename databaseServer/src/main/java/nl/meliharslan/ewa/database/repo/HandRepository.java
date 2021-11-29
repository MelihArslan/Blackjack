package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.Hand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandRepository extends JpaRepository<Hand,Long> {
}
