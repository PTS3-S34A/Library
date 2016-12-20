package nl.soccar.library.enumeration;

/**
 * Enumeration of all available Car types in the game.
 *
 * @author PTS34
 */
public enum CarType {

    SPORTSCAR(0),
    PICKUP(1),
    CASUAL(2);

    private final int id;

    CarType(int id) {
        this.id = id;
    }

    public static CarType parse(int id) {
        if (id == SPORTSCAR.id) {
            return SPORTSCAR;
        }

        if (id == PICKUP.id) {
            return PICKUP;
        }

        if (id == CASUAL.id) {
            return CASUAL;
        }

        throw new IllegalArgumentException("Invalid id.");
    }

    public int getId() {
        return id;
    }
}
