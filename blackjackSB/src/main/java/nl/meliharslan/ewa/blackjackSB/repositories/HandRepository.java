package nl.meliharslan.ewa.blackjackSB.repositories;

import nl.meliharslan.ewa.blackjackSB.models.Hand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandRepository extends JpaRepository<Hand, Integer> {
}
