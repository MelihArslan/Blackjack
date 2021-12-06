package nl.meliharslan.ewa.blackjackSB.controllers;

import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.models.Player;
import nl.meliharslan.ewa.blackjackSB.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/add")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player player1 = playerService.addPlayer(player);
        return new ResponseEntity<>(player1, HttpStatus.CREATED);
    }

    @PostMapping("/join/{id}")
    public ResponseEntity<GameTable> joinTable(@PathVariable Long id) {
        GameTable gameTable1 = playerService.joinTable(id);
        return new ResponseEntity<>(gameTable1, HttpStatus.OK);
    }

    @GetMapping("/balance/{id}")
    public ResponseEntity<Integer> getBalance(@PathVariable Long id) {
        int balance = playerService.getBalance(id);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Player>> getPlayerById(@PathVariable("id") Long id) {
        Optional<Player> player = playerService.findPlayerById(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }
}
