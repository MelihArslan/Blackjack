package nl.meliharslan.ewa.database.service.base;

import nl.meliharslan.ewa.database.domein.Hand;

import java.util.Map;

/**
 * Base methods for the Dealer Service.
 */
public interface DealerService {

    Map<String, Hand> deal();

    Hand hitDealer();
}
