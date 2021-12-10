package nl.meliharslan.ewa.blackjackSB.services;

import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.models.Player;
import nl.meliharslan.ewa.blackjackSB.repositories.PlayerRepository;
import nl.meliharslan.ewa.blackjackSB.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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
        boolean exists = this.playerRepository.existsById(id);
        if (!exists) {
            throw new EntityNotFoundException("Could not find player with following ID: " + id);
        }
        Player player = this.playerRepository.getById(id);
        List<GameTable> allTables = this.tableRepository.findAll();
        GameTable table = player.joinTable(allTables);
        this.tableRepository.save(table);
        return table;
    }

    public Player addPlayer(Player player) {
        return this.playerRepository.save(player);
    }

    public int getBalance(Long id) {
        return this.playerRepository.getById(id).getBalance();
    }

    public Optional<Player> findPlayerById(Long id) {
        playerRepository.checkIfExistById(id);
        return this.playerRepository.findById(id);
    }

    public int bet(Long id, int amount) {
        this.playerRepository.checkIfExistById(id);
        Player player = this.playerRepository.getById(id);
        // Set the bet amount of the player
        player.setBetAmount(amount);
        // Remove the bet amount from the balance
        player.setBalance(player.getBalance() - amount);
        // Save the player with the new bet amount
        this.playerRepository.save(player);
        return player.getBalance();
    }
}
