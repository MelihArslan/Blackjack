package nl.meliharslan.ewa.database.service;

import nl.meliharslan.ewa.database.domein.*;
import nl.meliharslan.ewa.database.exception.NotAbleToJoinException;
import nl.meliharslan.ewa.database.repo.DeckRepository;
import nl.meliharslan.ewa.database.repo.HandRepository;
import nl.meliharslan.ewa.database.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BlckJGameService implements BJGameServerInterFace{
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

    @Override
    public List<Deck> getDecks() {
        return null;
    }

    @Override
    public Deck getDeck(long id) {
        return null;
    }

    @Override
    public Deck newDeck() {
        return null;
    }

    @Override
    public Player newPlayer(String name) {
        return null;
    }

    @Override
    public Player getPlayer(String id) {
        return null;
    }

    @Override
    public boolean addPlayer(Deck deck, Player player) throws NotAbleToJoinException {
        return false;
    }

    @Override
    public List<Card> shuffleCards(Deck deck) {
        return null;
    }

    @Override
    public Hand dealerHand(Dealer dealer) {
        return null;
    }

    @Override
    public Hand getHand(long id) {
        return null;
    }

    @Override
    public Set<Hand> playerHands(Player player) {
        return null;
    }

    @Override
    public Card dealCard(Deck deck, Hand hand) {
        return null;
    }

    @Override
    public Hand splitHand(Player player, Hand hand) {
        return null;
    }

    @Override
    public boolean isPlayerWin(Hand hand, Hand dealerHand) {
        return false;
    }

    @Override
    public boolean isDealerWin(Hand hand, Hand playerHand) {
        return false;
    }

    @Override
    public Player whoIsWin(Deck deck) {
        return null;
    }

    @Override
    public Player whoHasHighScore(Deck deck) {
        return null;
    }

    @Override
    public void saveDeck(Deck deck) {

    }

    @Override
    public void savePlayer(Player player) {

    }
}
