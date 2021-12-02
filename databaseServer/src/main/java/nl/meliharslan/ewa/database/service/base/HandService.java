package nl.meliharslan.ewa.database.service.base;

import nl.meliharslan.ewa.database.domein.Player;

/**
 * Contains base methods for the hand service.
 */
public interface HandService {

    void hit(Player player, int handId);
    void doubleDown(Player player, int handId);
    void split(Player player, int handId);
    void surrender(Player player, int handId);
    void stand(Player player, int handId);

}
