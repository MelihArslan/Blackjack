package nl.meliharslan.ewa.database.domein;

import javax.persistence.Entity;

@Entity
public class Dealer extends Player {

    public Dealer() {
        super("Dealer");
        setDealer(true);
    }

    @Override
    public boolean equals(Object o) {
        // TESTING
        return true;
    }

    @Override
    public int hashCode() {
//        int result = getId() != null ? getId().hashCode() : 0;
//        result = 31 * result + getName().hashCode();

        // TESTING
        return getName().length();
    }
}
