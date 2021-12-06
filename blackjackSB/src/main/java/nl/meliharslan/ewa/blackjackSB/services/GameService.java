package nl.meliharslan.ewa.blackjackSB.services;

import nl.meliharslan.ewa.blackjackSB.models.*;
import nl.meliharslan.ewa.blackjackSB.repositories.DealerRepository;
import nl.meliharslan.ewa.blackjackSB.repositories.PlayerRepository;
import nl.meliharslan.ewa.blackjackSB.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class GameService {
    private final TableRepository tableRepository;
    private final PlayerRepository playerRepository;
    private final DealerRepository dealerRepository;

    @Autowired
    public GameService(TableRepository tableRepository, PlayerRepository playerRepository, DealerRepository dealerRepository) {
        this.tableRepository = tableRepository;
        this.playerRepository = playerRepository;
        this.dealerRepository = dealerRepository;
    }

    // Deal card to a player
    public Hand dealCard(Long tableId, Long playerId) {
        // Searching for table by the id
        GameTable table = tableRepository.getById(tableId);
        // Getting the next card in the deck
        Card card = table.getDeck().getCards().iterator().next();

        // Checking if given ID belongs to a player or dealer
        try {
            // Searching for player by the id
            Player player = playerRepository.getById(playerId);
            player.getHand().addCard(card);
            // Saving the player (hand has been changed)
            playerRepository.save(player);
            // Removing the card from the deck
            table.getDeck().removeCard(card);
            // Saving the table (deck has been changed)
            tableRepository.save(table);
            return player.getHand();
        }
        catch (Exception e) {
            // Searching for dealer by id
            Dealer dealer = dealerRepository.getById(playerId);
            // Adding the card to the hand
            dealer.getHand().addCard(card);
            // Saving the dealer (hand has been changed)
            dealerRepository.save(dealer);
            // Removing the card from the deck
            table.getDeck().removeCard(card);
            // Saving the table (deck has been changed)
            tableRepository.save(table);
            return dealer.getHand();
        }

        // Have to check if player is attending to a table
    }
}
