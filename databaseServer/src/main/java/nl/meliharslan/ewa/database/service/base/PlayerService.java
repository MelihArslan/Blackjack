package nl.meliharslan.ewa.database.service.base;


import nl.meliharslan.ewa.database.domein.Player;
import nl.meliharslan.ewa.database.domein.dto.PlayerDTO;

import java.util.List;

/**
 * Base methods for the Player Service.
 */
public interface PlayerService {

    Player createNewPlayer(PlayerDTO player);

    List<Player> getAllPlayers();

    Player placeBet(int playerId, double playerBet);

    Player addBalanceToPlayer(int playerId, int playerBalanceToAdd);

    Player seatPlayer(int playerId, int playerSeat);

    Player hit(int playerId, int handId);

    Player doubleDown(int playerId, int handId);

    Player stand(int playerId, int handId);

    Player split(int playerId, int handId);

    Player surrender(int playerId, int handId);

}
