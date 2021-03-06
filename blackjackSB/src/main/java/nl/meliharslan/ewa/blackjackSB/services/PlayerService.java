package nl.meliharslan.ewa.blackjackSB.services;

import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.models.Player;
import nl.meliharslan.ewa.blackjackSB.repositories.PlayerRepository;
import nl.meliharslan.ewa.blackjackSB.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final TableRepository tableRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository, TableRepository tableRepository) {
        this.playerRepository = playerRepository;
        this.tableRepository = tableRepository;
    }

    public GameTable joinTable(Long id) {
        Player player = this.playerRepository.getById(id);
        List<GameTable> allTables = this.tableRepository.findAll();
        GameTable table = player.joinTable(allTables);
        this.tableRepository.save(table);
        if (table == null) {
            // TODO Dynamisch een table laten maken en returnen
        }
        return table;
    }

    public Player addPlayer(Player player) {
        return this.playerRepository.save(player);
    }
}
