package nl.meliharslan.ewa.database.repo;

import nl.meliharslan.ewa.database.domein.TableRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TableRoomRepo extends JpaRepository<TableRoom, Long> {
    void deleteTableRoomById(Long id); // long is key

    Optional<TableRoom> findTableRoomById(Long id); // Query methode
}
