package nl.meliharslan.ewa.blackjackSB.repositories;

import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<GameTable, Long> {
}
