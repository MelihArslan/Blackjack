package nl.meliharslan.ewa.blackjackSB.services;

import nl.meliharslan.ewa.blackjackSB.models.Card;
import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.models.Hand;
import nl.meliharslan.ewa.blackjackSB.models.Player;
import nl.meliharslan.ewa.blackjackSB.repositories.PlayerRepository;
import nl.meliharslan.ewa.blackjackSB.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {
    private final TableRepository tableRepository;
    private final PlayerRepository playerRepository;

    @Autowired
    public GameService(TableRepository tableRepository, PlayerRepository playerRepository) {
        this.tableRepository = tableRepository;
        this.playerRepository = playerRepository;
    }

    // Deal card to a player
    public Hand dealCard(Long tableId, Long playerId) {
        // Searching for table by the id
        GameTable table = tableRepository.getById(tableId);
        // Searching for player by the id
        Player player = playerRepository.getById(playerId);
        // Getting the next card in the deck
        Card card = table.getDeck().getCards().iterator().next();

        // Adding the card to the hand
        player.getHand().addCard(card);
        // Removing the card from the deck
        table.getDeck().removeCard(card);
        // Saving the table (deck has been changed)
        tableRepository.save(table);
        // Saving the player (hand has been changed)
        playerRepository.save(player);
        return player.getHand();
    }
}
