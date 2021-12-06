package nl.meliharslan.ewa.blackjackSB.controllers;

import nl.meliharslan.ewa.blackjackSB.models.Card;
import nl.meliharslan.ewa.blackjackSB.models.Hand;
import nl.meliharslan.ewa.blackjackSB.models.Player;
import nl.meliharslan.ewa.blackjackSB.services.GameService;
import nl.meliharslan.ewa.blackjackSB.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/game")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @PostMapping("/dealcard/{tableId}/{playerId}")
    public ResponseEntity<Hand> dealCard(@PathVariable Long tableId, @PathVariable Long playerId) {
        Hand hand = gameService.dealCard(tableId, playerId);
        return new ResponseEntity<>(hand, HttpStatus.CREATED);
    }

}
