package nl.meliharslan.ewa.database.service;

import nl.meliharslan.ewa.database.domein.Deck;
import nl.meliharslan.ewa.database.repo.DeckRepository;
import nl.meliharslan.ewa.database.repo.HandRepository;
import nl.meliharslan.ewa.database.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlckJGameService {
    DeckRepository deckRepository;
    HandRepository handRepository;
    PlayerRepository playerRepository;


    @Autowired
    public BlckJGameService(DeckRepository deckRepository, HandRepository handRepository, PlayerRepository playerRepository) {
        this.deckRepository = deckRepository;
        this.handRepository = handRepository;
        this.playerRepository = playerRepository;
    }


    public BlckJGameService(DeckRepository deckRepository) {
        this.deckRepository = deckRepository;
    }

    public BlckJGameService(DeckRepository deckRepository, HandRepository handRepository) {
        this.deckRepository = deckRepository;
        this.handRepository = handRepository;
    }

    public BlckJGameService() {
    }
    //list of Deck
    public List<Deck> findAllDeck(){
        return DeckRepository.findAllDeck();
    }
}
