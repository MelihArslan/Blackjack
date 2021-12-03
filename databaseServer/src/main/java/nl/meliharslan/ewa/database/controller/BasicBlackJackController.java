package nl.meliharslan.ewa.database.controller;

import nl.meliharslan.ewa.database.domein.Deck;
import nl.meliharslan.ewa.database.service.BlckJGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicBlackJackController {
    private static final Logger logger = LoggerFactory.getLogger(BasicBlackJackController.class);

    @Autowired
    BlckJGameService blckJGameService;

    @RequestMapping(value = "/decks", produces = "application/json")
    public List<Deck> decks() {
        List<Deck> decks = blckJGameService.getDecks();
        decks.forEach(deck -> logger.info(deck.toString()));
        return decks;
    }

    @RequestMapping("/test")
    public String test() {
        List<Deck> decks = blckJGameService.getDecks();

        return decks.get(0).toString();
    }

    @RequestMapping(value = "/new-game", method = RequestMethod.POST)
    public ResponseEntity<?> newGame() {
        Deck deck = blckJGameService.newDeck();
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{deckId}")
                .buildAndExpand(deck.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}

