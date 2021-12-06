package nl.meliharslan.ewa.blackjackSB.services;
import nl.meliharslan.ewa.blackjackSB.models.Deck;
import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.repositories.TableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TableService {
    private final TableRepository tableRepository;

    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    // Add table
    public GameTable addTable(GameTable gameTable) {
        gameTable.setDeck(new Deck());
        // Save table with JPA save method
        return tableRepository.save(gameTable);
    }

    // Gets a list of all tables
    public List<GameTable> findAllTables() {
        return tableRepository.findAll();
    }

    // Updates the given table
    @Transactional
    public GameTable updateTable(Long id, int totalPlayers) {
        GameTable table = tableRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Could not find table with following ID: " + id));
        table.setTotalPlayers(totalPlayers);
        return table;
    }

    // Finds a table by id
    public Optional<GameTable> findTableById(Long id) {
        // Check if ID with given table exists
        boolean exists = tableRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Could not find table with following ID: " + id);
        }
        return tableRepository.findById(id);
    }

    // Delete a table by id
    public void deleteTable(Long id) {
        // Check if ID with given table exists
        boolean exists = tableRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Could not find table with following ID: " + id);
        }
        tableRepository.deleteById(id);

    }

}
