package nl.meliharslan.ewa.blackjackSB.repositories;

import nl.meliharslan.ewa.blackjackSB.models.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
}
