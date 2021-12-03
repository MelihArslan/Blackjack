package nl.meliharslan.ewa.database.service;

import nl.meliharslan.ewa.database.Constant.CONSTANT;
import nl.meliharslan.ewa.database.domein.*;
import nl.meliharslan.ewa.database.exception.NotAbleToJoinException;
import nl.meliharslan.ewa.database.exception.UserNotFoundException;
import nl.meliharslan.ewa.database.repo.DeckRepository;
import nl.meliharslan.ewa.database.repo.HandRepository;
import nl.meliharslan.ewa.database.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BlckJGameService implements BJGameServerInterFace {
    @Autowired
    DeckRepository deckRepository;
    @Autowired
    HandRepository handRepository;
    @Autowired
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

    @Override
    public List<Deck> getDecks() {
        return deckRepository.findAll();
    }

    @Override
    public Deck getDeck(long id) {
        return deckRepository.findById(id).orElseThrow(() -> new UserNotFoundException("hallo melih"));
    }

    @Override
    public Deck newDeck() {
        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        deck.addPlayer(dealer);
        saveDeck(deck);
        return deck;
    }

    @Override
    public Player newPlayer(String name) {
        Player player = new Player(name);
        playerRepository.save(player);
        return player;
    }

    @Override
    public Player getPlayer(String id) {
        return playerRepository.findOneById(Long.parseLong(id)).orElseThrow(() -> new UserNotFoundException("hallo melih"));
    }

    @Override
    public boolean addPlayer(Deck deck, Player player) throws NotAbleToJoinException {
        if (deck.getPlayerList().size() > CONSTANT.MAX_PLAYER_PER_DECK) {
            throw new NotAbleToJoinException();
        }
        deck.addPlayer(player);
        saveDeck(deck);
        playerRepository.save(player);
        return true;
    }

    @Override
    public List<Card> shuffleCards(Deck deck) {
        return deck.shuffle();
    }

    @Override
    public Hand dealerHand(Dealer dealer) {
        return dealer.getHands().iterator().next();
    }

    @Override
    public Hand getHand(long id) {
        return handRepository.findOneById((id)).orElseThrow(() -> new UserNotFoundException("hallo melih"));
    }

    @Override
    public Set<Hand> playerHands(Player player) {
        return player.getHands();
    }

    @Override
    public Card dealCard(Deck deck, Hand hand) {
        Card card = deck.getCards().iterator().next();
        if (card != null) {
            hand.addCard(card);
            deck.removeCard(card);
            saveDeck(deck);
            handRepository.save(hand);
        }
        return card;
    }

    @Override
    public Hand splitHand(Player player, Hand hand) {
        if (player.beenSplit())
            return null;
        Card splitCard = hand.getCards().remove(1);
        Hand handRight = new Hand(splitCard, hand.getBetAmount());
        handRepository.save(hand);
        handRepository.save(handRight);
        return handRight;
    }

    @Override
    public boolean isPlayerWin(Hand hand, Hand dealerHand) {
        return (!hand.isBusts() && hand.isBlackJack()) &&
                !(!dealerHand.isBusts() && dealerHand.isBlackJack()) &&
                hand.getScore() > dealerHand.getScore();
    }

    @Override
    public boolean isDealerWin(Hand hand, Hand playerHand) {
        return !isPlayerWin(playerHand, hand);
    }

    @Override
    public Player whoIsWin(Deck deck) {
        Set<Player> players = deck.getPlayerList();
        return players
                .stream()
                .flatMap(s -> s.getHands().stream())
                .filter(h -> !h.isBusts())
                .filter(h -> h.isBlackJack())
                .collect(Collectors.toSet())
                .stream()
                .map(Hand::getPlayer)
                .findFirst()
                .orElse(whoHasHighScore(deck));
    }

    @Override
    public Player whoHasHighScore(Deck deck) {
        Set<Player> players = deck.getPlayerList();
        return players
                .stream()
                .flatMap(s -> s.getHands().stream())
                .filter(h -> !h.isBusts())
                .filter(h -> h.isBlackJack())
                .max(Comparator.comparingInt(Hand::getScore))
                .map(hand -> hand.getPlayer())
                .get();
    }

    @Override
    public void saveDeck(Deck deck) {
        deckRepository.save(deck);
    }

    @Override
    public void savePlayer(Player player) {
        player.addHand(new Hand());
        playerRepository.save(player);
    }
}
