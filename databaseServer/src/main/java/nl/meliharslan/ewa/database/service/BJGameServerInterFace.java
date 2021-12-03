package nl.meliharslan.ewa.database.service;

import nl.meliharslan.ewa.database.domein.*;
import nl.meliharslan.ewa.database.exception.NotAbleToJoinException;

import java.util.List;
import java.util.Set;

public interface BJGameServerInterFace {
    List<Deck> getDecks();

    Deck getDeck(long id);

    Deck newDeck();

    Player newPlayer(String name);

    Player getPlayer(String id);

    boolean addPlayer(Deck deck, Player player) throws NotAbleToJoinException;

    List<Card> shuffleCards(Deck deck);

    Hand dealerHand(Dealer dealer);

    Hand getHand(long id);

    Set<Hand> playerHands(Player player);

    Card dealCard(Deck deck, Hand hand);

    Hand splitHand(Player player, Hand hand);

    boolean isPlayerWin(Hand hand, Hand dealerHand);

    boolean isDealerWin(Hand hand, Hand playerHand);

    Player whoIsWin(Deck deck);

    Player whoHasHighScore(Deck deck);

    void saveDeck(Deck deck);

    void savePlayer(Player player);
}
