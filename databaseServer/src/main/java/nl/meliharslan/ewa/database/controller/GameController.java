package nl.meliharslan.ewa.database.controller;

import nl.meliharslan.ewa.database.domein.Card;
import nl.meliharslan.ewa.database.domein.Deck;
import nl.meliharslan.ewa.database.domein.Hand;
import nl.meliharslan.ewa.database.domein.Player;
import nl.meliharslan.ewa.database.exception.NotAbleToJoinException;
import nl.meliharslan.ewa.database.service.BlckJGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class GameController {

    @Autowired
    BlckJGameService blckJGameService;

    @RequestMapping(value = "/{id}")
    public Deck newGame(@PathVariable long id) {
        return blckJGameService.getDeck(id);
    }

    @RequestMapping(value = "/{id}/join-game", method = RequestMethod.POST)
    public Deck joinGame(@PathVariable long id, @RequestBody Player player) throws NotAbleToJoinException {
        blckJGameService.savePlayer(player);
        Deck deck = blckJGameService.getDeck(id);
        blckJGameService.addPlayer(deck, player);
        return deck;
    }

    @RequestMapping(value = "/{id}/deal-card/{handId}", method = RequestMethod.POST)
    public Card dealCard(@PathVariable long id, @PathVariable long handId) {
        Deck deck = blckJGameService.getDeck(id);
        Hand hand = blckJGameService.getHand(handId);
        return blckJGameService.dealCard(deck, hand);
    }
}
