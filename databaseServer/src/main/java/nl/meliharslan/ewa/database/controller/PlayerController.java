package nl.meliharslan.ewa.database.controller;

import nl.meliharslan.ewa.database.domein.Card;
import nl.meliharslan.ewa.database.domein.Deck;
import nl.meliharslan.ewa.database.domein.Hand;
import nl.meliharslan.ewa.database.domein.Player;
import nl.meliharslan.ewa.database.exception.NotAbleToJoinException;
import nl.meliharslan.ewa.database.service.BlckJGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("player")
public class PlayerController {
    private static final Logger logger = LoggerFactory.getLogger(BasicBlackJackController.class);

    @Autowired
    BlckJGameService blckJGameService;

    @RequestMapping("/{id}")
    public Player dealer(@PathVariable String id) {
        return blckJGameService.getPlayer(id);
    }
}